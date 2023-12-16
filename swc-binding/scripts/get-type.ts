import { removeComment } from './utils'
import { KotlinClassProperty } from './kotlin-class'
import {
    ArrayTypeNode, BooleanLiteral, Identifier, IndexSignatureDeclaration, InterfaceDeclaration, IntersectionTypeNode, LiteralLikeNode, LiteralTypeNode, ObjectFlags, ParenthesizedTypeNode, Project, PropertySignature, StringLiteral, TupleTypeNode, Type, TypeAliasDeclaration, TypeFormatFlags, TypeLiteralNode, TypeNode, TypeReferenceNode, UnionTypeNode, ts, NumericLiteral
} from 'ts-morph'
const jsKotlinTypeMap = new Map([
    ["number", "Int"],
    ["boolean", "Boolean"],
    ["string", "String"],
    ["string[]", "Array<String>"],
])

export const kotlinTypes = [
    'package dev.yidafu.swc.types',
    '',
    'import dev.yidafu.swc.booleanable.*',
    'import kotlinx.serialization.*',
    'import kotlinx.serialization.json.JsonClassDiscriminator',
    '',
    '@SwcDslMarker',
    'annotation class SwcDslMarker',
    'typealias Record<T, S> = Map<T, String>',
    '',
]

export const typeAliasMap = new Map<string, string>()

export function typeLiteralGetProps(t: TypeLiteralNode) {
    return t.getMembers().map(m => {
        const p = m as PropertySignature
        const prop = new KotlinClassProperty()
        prop.name = p.getName()
        prop.type = getType(p.getTypeNode()!!)
        prop.defaultValue = 'null'
        return prop
    })
}

export function transformTupleType(list: string[]) {
    const types = list.map(s => removeComment(s))
    if (types.includes('Boolean')) {
        let anotherType = types.find(t => t !== 'Boolean') ?? 'ErrorType'
        anotherType = anotherType.replace('<', '').replace('>', '')
        return `Booleanable${anotherType}`
    }
    if (types?.includes('Float') && types.includes('String')) {
        return "String"
    }
    return `Union.U2<${list[0]}, ${list[1]}>`
}

export function getType(typeNode: TypeNode<ts.TypeNode>): string {
    const typeName = typeNode?.getKindName();
    switch (typeName) {
        case "UnionType": {

            const lTypes = typeNode?.forEachChildAsArray().map(cNode => {
                var type = getType(cNode as TypeNode)

                return jsKotlinTypeMap.has(type) ? jsKotlinTypeMap.get(type) : type;
            });
            const uniqueTypes = Array.from(new Set(lTypes)).filter(t => t != 'null')
            if (uniqueTypes.length == 1) {
                return uniqueTypes[0] as string
            } else if (uniqueTypes.length > 1 && uniqueTypes.length < 5) {
                const isAllLiteral = typeNode?.forEachChildAsArray().every(cNode => cNode.getKindName() === 'LiteralType')
                if (isAllLiteral) {
                    const comment = '  /** literal is: ' + typeNode?.forEachChildAsArray().map(c => c.getText()).join(",") + ' */';
                    const type = comment.includes('"') ? "String" : "Int"
                    return `${comment}${type}`
                }
                if (uniqueTypes.length == 2) {
                    if (`Array<${uniqueTypes[0]}>` === uniqueTypes[1]) {
                        return uniqueTypes[1]
                    }
                    const types = uniqueTypes.map(t => removeComment(t!!))
                    if (types.includes('Boolean')) {
                        return transformTupleType(types)
                    }
                }
                return `Union.U${uniqueTypes.length}<${uniqueTypes.join(', ')}>`
            } else {
                const tName = (typeNode.getParent() as TypeAliasDeclaration).getName()
                console.log(tName)
                throw new Error('不支持获取的类型')
            }
        }

        case "IntersectionType": {

            const t = typeNode as IntersectionTypeNode
            return getType(t.getTypeNodes()[0])
        }
        case "TypeLiteral": {
            const t = typeNode as TypeLiteralNode
            if (t.getMembers()[0] instanceof IndexSignatureDeclaration) {
                const indexType = t.getMembers()[0] as IndexSignatureDeclaration

                return `Map<${getType(indexType.getKeyTypeNode())}, ${getType(indexType.getReturnTypeNode()!!)}>`
            }
            let pName = (t.getParent() as PropertySignature).print()
            if (pName.includes('*/')) {
                pName = pName.split('*/\n')[1]
            }
            const newTypeName = `${pName.slice(0, pName.indexOf('?')).replace(/^\w/, (m) => m.toUpperCase())}Literal`
            kotlinTypes.push([
                '@SwcDslMarker',
                '@Serializable',
                `@SerialName("${newTypeName}")`,
                `class ${newTypeName} {`,
                ...typeLiteralGetProps(t).map(p => p.toStringWithValue()),
                '}'
            ].join('\n'))
            return newTypeName
        }

        case "TupleType": {
            if (typeNode instanceof TupleTypeNode) {
                const elements = typeNode.getElements()
                if (elements.length == 2) {
                    const type1 = getType(elements[0])
                    const type2 = getType(elements[1])
                    const list = [type1, type2].map(t => removeComment(t))
                    return transformTupleType(list)
                }
            }
            return 'TODO'
        }
        case "ParenthesizedType": {
            const t = typeNode as ParenthesizedTypeNode
            return getType(t.getTypeNode())
        }
        case "TypeReference": {
            if (typeNode instanceof TypeReferenceNode) {
                if (typeNode.getTypeArguments().length > 0) {
                    return `${typeNode.getTypeName().print()}<${typeNode.getTypeArguments().map(t => getType(t)).join(', ')}>`
                } else {
                    const type = typeNode?.print()
                    if (type == 'Record<string, string>') {
                        return 'Map<String, String>'
                    }
                    if (typeAliasMap.has(type)) return `\t/**\n  * [${type}]\n */` + typeAliasMap.get(type)!!
                    return type
                }
            }

        }
        case "NumberKeyword": {
            return "Int"
        }
        case "StringKeyword": {
            return "String"
        }
        case "UndefinedKeyword": {
            return "null"
        }
        case "BigIntKeyword": {
            return "Long"
        }
        case "BooleanKeyword": {
            return "Boolean"
        }
        case "ArrayType": {
            const arrNode = typeNode as ArrayTypeNode
            // arrNode.getElementTypeNode()
            return `Array<${getType(arrNode.getElementTypeNode())}>`
        }
        case "LiteralType": {
            const values = typeNode?.forEachChildAsArray().map(c => c.getText())
            const comment = '/* literal is: ' + values.join(",") + ' */';
            let type = "Float"
            // console.log("literal value  ", values)
            if (values[0].startsWith('"')) type = "String"
            if (values[0] === 'false' || values[0] === 'true') type = "Boolean"
            if (/\d+/.test(values[0])) type = "Float"
            // const type = comment.includes('"') ? "String" : "Int"
            return `${comment}${type}`
            // return `String = ${typeNode.getChildAtIndex(0).getText()}`
        }
        default: return "Any"
    }
}