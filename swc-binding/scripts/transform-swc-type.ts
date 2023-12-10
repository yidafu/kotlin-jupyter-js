import {
    InterfaceDeclaration, IntersectionTypeNode, LiteralTypeNode, Project, StringLiteral, TypeLiteralNode, TypeReferenceNode, UnionTypeNode, NumericLiteral, TrueLiteral,
    FalseLiteral,
} from 'ts-morph'
import fs from 'fs';
import debug from 'debug';
import { getType, kotlinTypes, transformTupleType, typeAliasMap, typeLiteralGetProps } from './get-type';

import { KotlinClass, KotlinClassProperty, KotlinExtensionFun, addExtensionFun, getAllExtensionFun, kotlinPropertiesAddOverride, mergeKotlinProperties } from './kotlin-class';

import { ToKotlinClass, kotlinKeywordMap, Literal_Name_Map, KeepInterface, propTypeRewrite } from './constant';

import { addRelation, findAllChildrenByParent, findAllGrandChildren, getAll, getAllParents, findParentsByChild, isGrandChild, findAllRelativeByName, findAllDirectChildren } from './extend-relationship';
import _ from 'lodash'
import { removeComment } from './utils';

const t = debug('swc:typealias')
const i = debug('swc:interface')
const k = debug('swc:kotlin')
const d = debug('swc:dsl')
/**
 * https://www.javatpoint.com/typescript-operators
 * execute below code in console
 */
// Array.from(document.querySelector("#sidebar-quicklinks > nav > div > div.sidebar-body > ol > li:nth-child(9) > details > ol").childNodes)
//   .map(t => t.innerText)
//   .filter(t => t.match(/\(.+\)/))
//   .map(t => {
//     const operator = t.match(/\((.+)\)/)?.[1]
//     const name = t.slice(0, t.indexOf('(')).replaceAll(/\s(\w)/g, (_, w) => w.toUpperCase()).trim()
//     return `["${operator}", "${name}"]`
//   }).join(',\n')

const project = new Project({
    tsConfigFilePath: "./tsconfig.json"
})

const InputPath = [
    "./node_modules/@swc/types/index.d.ts",
    '../src/main/kotlin/dev/yidafu/swc/types/types.kt',
    '../src/main/kotlin/dev/yidafu/swc/types/serializer.kt',
    '../src/main/kotlin/dev/yidafu/swc/dsl/',
    "./test.ts",
    './ouptput.kt',
    './serializer.kt',
    './dsl',
]
const swcTypeFile = project.addSourceFileAtPath(InputPath[0]);

/* ======================= 全局常量开始 ======================= */

function createKotlinDslHeader() {
    const kotlinDsl = [
        'package dev.yidafu.swc.dsl',
        '',
        'import dev.yidafu.swc.types.*',
        '',
    ]
    return kotlinDsl
}


// const canMergeInterface: string[] = []



const sealedInterface = ["Node"]


const propsToSnakeCase = ['JsFormatOptions']


// const propTypeRewrite = new Map<string, string>([
//     ['global_defs', 'Map<String, String>'],
//     ['top_retain', "Union.U2<String, Array<String>>"],
//     ['sequences', 'Boolean'],
//     ['pure_getters', "Union.U2<String, Boolean>"],
//     ['toplevel', "Union.U2<String, Boolean>"],
//     ['targets', "Union.U2<String, Map<String, String>>"]
// ])

/* ======================= 全局常量结束 ======================= */

/* ======================= 全局变量开始 ======================= */

const LiteralObjects = [];

// const mergeTypeMap = new Map<string, string[]>()

const classPropertiesMap = new Map<string, KotlinClassProperty[]>();

const classAllPropertiesMap = new Map<string, KotlinClassProperty[]>();

// const KotlinTypeList: KotlinClass[] = []
const kotlinClassMap = new Map<string, KotlinClass>();
function addKotlinClass(kotlinClass: KotlinClass) {
    k('add kotlin class %s', kotlinClass.klassName)
    kotlinClassMap.set(kotlinClass.klassName, kotlinClass)
}
function getAllKotlinClasses() {
    return Array.from(kotlinClassMap.values())
}
/* ======================= 全局变量结束 ======================= */

/* ======================= 工具函数开始 ======================= */


function literalUnionToObjectProps(u: UnionTypeNode): KotlinClassProperty[] {
    return u.getTypeNodes().map(l => {
        const prop = new KotlinClassProperty()
        prop.modifier = 'const val'
        if (l instanceof LiteralTypeNode) {
            const n = l.getLiteral()
            const value = l.getText()
            prop.defaultValue = value;
            if (n instanceof StringLiteral) {
                const name = value.toUpperCase()?.replaceAll('"', '')
                prop.name = Literal_Name_Map.has(name) ? Literal_Name_Map.get(name)!! : name
                return prop
            } else if (n instanceof TrueLiteral || n instanceof FalseLiteral) {
                prop.name = `BOOL_${value.toString().toUpperCase()}`
                return prop
            } else if (n instanceof NumericLiteral) {
                prop.name = `NUMBER_${value.toString().toUpperCase()}`

                return prop
            }
            throw Error('不是级别的类型')
        }
        throw Error('不是字面量')
    })
}

function isInterface(interfaceName: string) {
    return !!swcTypeFile.getInterface(interfaceName)
}

function isTypeAlias(typeName: string) {
    return !!swcTypeFile.getTypeAlias(typeName)
}

function isRefUnionType(typeName: string) {
    const typeAlias = swcTypeFile.getTypeAlias(typeName)
    if (typeAlias) {
        const typeNode = typeAlias.getTypeNode();
        return typeNode instanceof UnionTypeNode && typeNode?.forEachChildAsArray().every(cNode => cNode instanceof TypeReferenceNode)
    }
    return false;
}


/* ======================= 工具函数结束 ======================= */


/* ======================= 处理 type alias 开始 ======================= */

/*
  处理 type T = "foo" | "bar"
*/
swcTypeFile.getTypeAliases()
    .filter(typeAlias => typeAlias.getTypeNode() instanceof UnionTypeNode)
    .filter(typeAlias =>
        typeAlias.getType().getUnionTypes().every(t =>
            t.isLiteral() // || t.isBoolean() || t.isString() || t.isNumber()
        )
    )
    .filter(typeAlias => {
        const typeNode = typeAlias.getTypeNode() as UnionTypeNode
        const childTypes = typeNode.getTypeNodes().map(n => getType(n))
        const firstType = removeComment(childTypes[0])
        const isAllChildTypeTheSame = childTypes.every(t => removeComment(t) === firstType)
        return isAllChildTypeTheSame
    })
    .forEach(typeAlias => {
        const tName = typeAlias.getName()

        const typeNode = typeAlias.getTypeNode() as UnionTypeNode
        const childTypes = typeNode.getTypeNodes().map(n => getType(n))

        const firstType = removeComment(childTypes[0])
        let primaryType = firstType
        LiteralObjects.push(tName)
        typeAliasMap.set(tName, primaryType)
        const kotlinKlass = new KotlinClass()
        kotlinKlass.headerComment = ['/**',
            '  * ' + typeAlias.getTypeNode()?.print(),
            '  */',].join('\n')
        kotlinKlass.modifier = 'object'
        kotlinKlass.klassName = tName
        kotlinKlass.properties = literalUnionToObjectProps(typeNode)
        addKotlinClass(kotlinKlass)
    })

/*
  处理 type T = 1234 | 'str' | number | string
*/
swcTypeFile.getTypeAliases()
    .filter(typeAlias => typeAlias.getTypeNode() instanceof UnionTypeNode)
    .filter(typeAlias =>
        typeAlias.getType().getUnionTypes().every(t =>
            t.isLiteral() || t.isBoolean() || t.isString() || t.isNumber()
        )
    )
    .filter(typeAlias => {
        const typeNode = typeAlias.getTypeNode() as UnionTypeNode
        const childTypes = typeNode.getTypeNodes().map(n => getType(n))
        const firstType = removeComment(childTypes[0])
        const notAllChildTypeTheSame = childTypes.some(t => removeComment(t) !== firstType)
        return notAllChildTypeTheSame
    })
    .forEach(typeAlias => {
        const tName = typeAlias.getName()
        const typeNode = typeAlias.getTypeNode() as UnionTypeNode
        const childTypes = typeNode.getTypeNodes().map(n => getType(n))

        const uniqueType = Array.from(new Set(childTypes.map(t => removeComment(t))))

        if (uniqueType.length > 0) {
            if (uniqueType.length == 2) {
                kotlinTypes.push(`typealias ${tName} = ${transformTupleType(uniqueType)}`)
            } else {
                kotlinTypes.push(`typealias ${tName
                    } = Union.U${uniqueType.length}<${uniqueType.join(', ')}>`)
            }
        } else {
            kotlinTypes.push(`typealias ${tName} = ${uniqueType[0]}`)
        }
    })

/*
处理 type T = S & { foo: string }
*/
swcTypeFile.getTypeAliases()
    .filter(typeAlias => typeAlias.getTypeNode() instanceof IntersectionTypeNode)
    .forEach((typeAlias) => {
        const typeNode = typeAlias.getTypeNode() as IntersectionTypeNode
        const tName = typeAlias.getName()
        t('IntersectionType %s', tName)
        const nodes = typeNode.getTypeNodes()
        if (nodes[0] instanceof TypeReferenceNode && nodes[1] instanceof TypeLiteralNode) {
            const p = nodes[0] as TypeReferenceNode
            const tNode = nodes[1] as TypeLiteralNode
            const pInterface = p.getTypeName().print()
            addRelation(`Base${tName}`, tName)
            // console.log('union 3 ', tName, pInterface)
            t('IntersectionType push to mapping %s => %s', pInterface, tName)

            addRelation(pInterface, tName)
            addRelation(`Base${tName}`, pInterface)
            // classPropertiesMap.set(`Base${tName}`, removePropertiesValue(typeLiteralGetProps(t)))
            const kotlinClass = new KotlinClass()
            kotlinClass.annotations.push('@SwcDslMarker', '@Serializable')
            kotlinClass.modifier = 'sealed interface'
            kotlinClass.klassName = `Base${tName}`
            kotlinClass.properties = typeLiteralGetProps(tNode).map(p => (p.defaultValue = '', p))
            addKotlinClass(kotlinClass)

            classPropertiesMap.set(`Base${tName}`, kotlinClass.properties.map(p => p.clone()))
            classAllPropertiesMap.set(`Base${tName}`, kotlinClass.properties.map(p => p.clone()))
            const parseOptionKlass = new KotlinClass()
            parseOptionKlass.klassName = tName
            parseOptionKlass.annotations.push('@SwcDslMarker', '@Serializable')
            parseOptionKlass.modifier = 'open class'
            parseOptionKlass.parents.push(pInterface, `Base${tName}`)

            parseOptionKlass.properties = [
                ...getInterfaceProperties(swcTypeFile.getInterface(pInterface)!!),
                ...typeLiteralGetProps(tNode).map(p => (p.isOverride = true, p))
            ]
            addKotlinClass(parseOptionKlass)

        }
    })

/*
处理 type T = S | E
*/
swcTypeFile.getTypeAliases()
    .filter(typeAlias => isRefUnionType(typeAlias.getName()))
    .forEach(typeAlias => {
        const tName = typeAlias.getName()
        const typeNode = typeAlias.getTypeNode() as UnionTypeNode
        const childTypes = typeNode.getTypeNodes().map(n => getType(n))
        t('Union Type %s  children: %s', tName, childTypes)
        const kotlinClass = new KotlinClass()
        kotlinClass.annotations.push('@SwcDslMarker', '@Serializable')
        kotlinClass.modifier = 'sealed interface'
        kotlinClass.klassName = tName
        kotlinClass.properties = []
        addKotlinClass(kotlinClass)
        new Set(childTypes).forEach(t => {
            // console.log('union 4', tName, t)
            addRelation(tName, t)
        })
    })

// there is only type alias in 'extend-relationship`
getAll()
    .filter(n => isRefUnionType(n))
    .forEach(n => {
        const pTypes = findParentsByChild(n)
        i('create type alias %s to interface', n, pTypes)
        let comment = Array.from(pTypes).join('], [')
        comment = `/**\n  * subtypes: [${comment}]\n  */`
        const kotlinClass = new KotlinClass()
        kotlinClass.headerComment = comment
        kotlinClass.modifier = 'interface'
        kotlinClass.annotations.push('@SwcDslMarker')
        kotlinClass.klassName = n;
        kotlinClass.parents = Array.from(new Set(pTypes))
        kotlinClass.properties = pTypes
            .map(pType => classAllPropertiesMap.get(pType) ?? [])
            .flat()
            .map(p => (p.isOverride = true, p))
        classAllPropertiesMap.set(n, kotlinClass.properties.map(p => p.clone()))
        classPropertiesMap.set(n, kotlinClass.properties.map(p => p.clone()))
        t('%s has parent types %s', n, pTypes)
        addKotlinClass(kotlinClass)
        // addKotlinClass(kotlinClass.toImplClass())
        // addRelation(n, `${n}Impl`)
        if (isTypeAlias(n)) {

        } else {
            // if (notExtendNode.includes(n)) {
            //     i('create %s to sealed interface', n)
            //     // if (n !== 'ParserConfig') {
            //     // }
            //     const kotlinClass = new KotlinClass();
            //     kotlinClass.annotations.push('@Serializable')
            //     kotlinClass.modifier = 'sealed interface'
            //     kotlinClass.klassName = n;
            //     KotlinTypeList.push(kotlinClass)
            //     // addRelation(n )
            // } else {
            //     i('create %s to interface extends Node', n)

            //     addRelation("Node", n)
            //     const kotlinClass = new KotlinClass();
            //     kotlinClass.annotations.push('@Serializable')
            //     kotlinClass.modifier = 'sealed interface'
            //     kotlinClass.klassName = n;
            //     kotlinClass.parents.push('Node')
            //     KotlinTypeList.push(kotlinClass)
            // }
        }
    })

/* ======================= 处理 type alias 结束 ======================= */

/* ======================= 处理 interface 开始 ======================= */

// const skipInterfaces = Array.from(mergeTypeMap.values()).flat()


function getClassOrInterfaceProps(typeName: string) {
    i('get cached type props %s', typeName)
    if (classPropertiesMap.has(typeName)) {
        return classPropertiesMap.get(typeName) ?? []
    }
    const iDeclaration = swcTypeFile.getInterface(typeName)
    if (!iDeclaration) return []
    const interfaceName = iDeclaration.getName();


    const properties = iDeclaration.getProperties()

    const kotlinProps = properties.map(p => {
        const kotlinProp = new KotlinClassProperty()
        const propName = p.getName()
        let kotlinType = getType(p.getTypeNode()!!)

        // remove comment
        if (kotlinType.match(/^\s*\/\*[^\/]+\*\//)) {
            Array.from(kotlinType.matchAll(/\/\*[^\/]+\*\//g)).forEach(m => {
                // result.push(m[0])
            })
            kotlinType = kotlinType.replaceAll(/\/\*[^\/]+\*\//g, '')
        }

        const typeName = kotlinKeywordMap.has(propName) ? kotlinKeywordMap.get(propName)! : propName
        if (propTypeRewrite.has(typeName)) {
            kotlinType = propTypeRewrite.get(typeName)!!
        }

        kotlinProp.name = propName

        // add comments
        kotlinProp.comment = p.getLeadingCommentRanges().map(c => c.getText()).join('\n')

        let jsValue = p.getTypeNode()?.getText()
        jsValue = jsValue?.includes('"') && !jsValue.includes('|') ? jsValue : ""
        kotlinProp.defaultValue = jsValue

        kotlinProp.type = kotlinType

        return kotlinProp
    })

    classPropertiesMap.set(interfaceName, kotlinProps)
    i('interface %s owned properties count: %s', interfaceName, kotlinProps.length)
    return kotlinProps
}


function getInterfaceProperties(iDeclaration: InterfaceDeclaration) {
    if (!iDeclaration) return []
    const interfaceName = iDeclaration.getName();
    if (classAllPropertiesMap.has(interfaceName)) {
        return classAllPropertiesMap.get(interfaceName) ?? []
    }
    const props = getClassOrInterfaceProps(interfaceName)

    function recursiveGetProps(key: string) {
        findParentsByChild(key)
            .forEach(pTypeName => {
                if (isInterface(pTypeName)) {
                    const pProps = getClassOrInterfaceProps(pTypeName)
                    mergeKotlinProperties(props, kotlinPropertiesAddOverride(pProps))
                    i('interface(%s) parent type %s prop count', interfaceName, pTypeName, pProps.length)
                    recursiveGetProps(pTypeName)
                } else {
                    i('%s is type alias', pTypeName)
                    const pProps = getClassOrInterfaceProps(pTypeName)
                    mergeKotlinProperties(props, kotlinPropertiesAddOverride(pProps))
                    i('interface(%s) parent type %s prop count', interfaceName, pTypeName, pProps.length)
                }
            })

    }
    recursiveGetProps(interfaceName)
    i('%s interface all properties count: %s', interfaceName, props.length)

    classAllPropertiesMap.set(interfaceName, props)
    props.forEach(p => {

        i('\t%s interface prop: %s', interfaceName, p.toStringWithValue())
    })
    return props
}

function createInterface(iDeclaration: InterfaceDeclaration) {
    const kotlinClass = new KotlinClass()
    const interfaceName = iDeclaration.getName();
    i("")
    i("")
    i('create interface %s', interfaceName)
    kotlinClass.klassName = interfaceName

    const comments = iDeclaration.getLeadingCommentRanges()
    const text = comments.map(c => c.getText())
    kotlinClass.headerComment = text.join('\n')

    const pI = iDeclaration.getHeritageClauses()
    const pList = findParentsByChild(interfaceName)
    const parents = pI.map(p => {
        return p.getTypeNodes().map(t => t.print())
    }).flat()
    const directParents = Array.from(new Set([...parents, ...pList]))
    i('%s direct parent list => %s', interfaceName, directParents)
    // Array.from(new Set(parents)).forEach(p => {
    //     i('createInterface %s => %s', interfaceName, p)
    //     // addRelation(interfaceName, p]);
    // })

    kotlinClass.parents = directParents
    kotlinClass.properties = getInterfaceProperties(iDeclaration)

    kotlinClass.modifier = 'interface'

    if (sealedInterface.includes(interfaceName)) {
        kotlinClass.modifier = 'sealed interface'
        kotlinClass.annotations.push(
            '@SwcDslMarker',
            '@Serializable(NodeSerializer::class)',
        )
    } else if (ToKotlinClass.includes(interfaceName)) {
        kotlinClass.modifier = 'class'
        
        kotlinClass.annotations.push(
            '@SwcDslMarker',
            '@Serializable',
            `@SerialName("${interfaceName}")`
        )
    }

    if (ToKotlinClass.includes(interfaceName)) {
        addKotlinClass(kotlinClass.toClass())
    } else {
        addKotlinClass(kotlinClass.toInterface())
    }
    if (!KeepInterface.includes(interfaceName)) {
        addRelation(interfaceName, `${interfaceName}Impl`)
        addKotlinClass(kotlinClass.toImplClass())
    }
}

// 先遍历，构建继承关系
for (const iDeclaration of swcTypeFile.getInterfaces()) {
    const interfaceName = iDeclaration.getName();
    const pI = iDeclaration.getHeritageClauses()
    const parents = pI.map(p => {
        return p.getTypeNodes().map(t => t.print())
    }).flat()
    Array.from(new Set(parents)).forEach(p => {
        i('createInterface %s => %s', p, interfaceName)
        addRelation(p, interfaceName);
    })
}

// 遍历 interface
for (const i of swcTypeFile.getInterfaces()) {
    createInterface(i)
}


const astNodeList = Array.from(new Set([
    ...findAllRelativeByName('Node'),
    ...findAllRelativeByName('HasSpan')
]))

const generatedKotlinClassList: KotlinClass[] = []

const notImplClassList = getAllKotlinClasses()
    .filter(k => !astNodeList.includes(k.klassName))
    .filter(k => {
        const children = findAllChildrenByParent(k.klassName)

        return children.length == 1 && children[0] == (k.klassName + 'Impl')
    })
    .map(k => {
        const kClass = k.clone()
        kClass.modifier = 'class'
        kClass.annotations = [
            '@SwcDslMarker',
            '@Serializable',
        ]
        generatedKotlinClassList.push(kClass)
        return [k.klassName, k.klassName + 'Impl']
    }).flat()

getAllKotlinClasses()
    // .filter(k => !astNodeList.includes(k.klassName))
    .filter(k => !notImplClassList.includes(k.klassName))
    .forEach(k => {
        generatedKotlinClassList.push(k)
    })

generatedKotlinClassList.forEach(k => {
    kotlinTypes.push(k.toString())
})

fs.writeFileSync(InputPath[1], kotlinTypes.join('\n\n'));


const classNameList = findAllGrandChildren('Node')

const polymorphicMap = new Map<string, string[]>();

astNodeList
    .forEach(key => {
        const ps = findAllGrandChildren(key).filter(p => p !== key)
        if (ps.length > 0) {
            polymorphicMap.set(key, ps)
        }
    })


const NodeNodeSerializer = `
package dev.yidafu.swc.types

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerializationException
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import kotlinx.serialization.modules.SerializersModule

object NodeSerializer : JsonContentPolymorphicSerializer<Node>(Node::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Node> {
        return when {
            "type" in element.jsonObject -> {
                val nodeType = element.jsonObject["type"]?.jsonPrimitive?.contentOrNull
                when (nodeType) {
                  ${classNameList.map(c =>
    `\n\t\t\t\t\t"${c.replace('Impl', '')}" -> ${c}.serializer()`
).join('\n')}
                    else -> throw SerializationException("$nodeType Not Ast Node Type")
                }
            }
            else -> {
                throw SerializationException("Not Valid Tree Node")
            }
        }
    }
}
val swcSerializersModule = SerializersModule {
  ${Array.from(polymorphicMap).map(([p, list]) => `
    polymorphic(${p}::class) {
${Array.from(list).map(i => `\t    subclass(${i}::class)`).join('\n')}
    }`).join('\n')}
}`
fs.writeFileSync(InputPath[2], NodeNodeSerializer);



/* ======================= 处理 生成 dsl 开始 ======================= */

const generatedClassNameList = generatedKotlinClassList.map(k => k.klassName)
const needGenerateDslClassList = generatedKotlinClassList
    .filter(k => findAllChildrenByParent(k.klassName).length > 0)
    .map(k => k.klassName)

function addExtensionFunWrapper(extFun: KotlinExtensionFun) {
    if (['HasSpan', 'HasDecorator'].includes(extFun.receiver)) return;
    
    if (extFun.receiver === extFun.funName.replace('Impl', '')) return

    if (extFun.funName.endsWith('Impl')) {

        if (generatedClassNameList.includes(extFun.funName)) {
            addExtensionFun(extFun)
        } else {
            addExtensionFun(new KotlinExtensionFun(extFun.receiver, extFun.funName.replace('Impl', '')))
        }
    } else {
        if (isInterface(extFun.funName) || isRefUnionType(extFun.funName)) {
            addExtensionFun(extFun)
        }
    }
}

function createExtensionFunList(key: string) {
    findAllGrandChildren(key)
        .forEach(c => {
            // d('create extension function for %s, %s is interface: %s, is ref union: %',key, c, isInterface(c), isRefUnionType(c))
            addExtensionFunWrapper(new KotlinExtensionFun(key, c, [
                '/**',
                `  * subtype of ${key}`,
                '  */',
            ].join('\n')))
        })
}

needGenerateDslClassList.forEach((key) => {
    createExtensionFunList(key)
})

needGenerateDslClassList
    .map(klass => [klass, classAllPropertiesMap.get(klass)] as [string, KotlinClassProperty[]])
    // Array.from(classPropertiesMap)
    .forEach(([klass, props]) => {
        props.forEach(p => {
            d('create dsl type: %s is union?', p.getType())
            // if (isInterface(p.type) || isRefUnionType(p.type) || isTypeAlias(p.type)) {
            const actualType = p.getActualType()
            p.getType().forEach(type => {
                findAllGrandChildren(type).forEach(c => {
                    addExtensionFunWrapper(new KotlinExtensionFun(klass, c, [
                        '/**',
                        `  * ${klass}#${p.name}: ${p.type}`,
                        `  * extension function for create ${p.type} -> ${c}`,
                        '  */',
                    ].join('\n')))
                })
            })

            // }
        })

    })


// getAllExtensionFun()
//     .forEach(extFun => {
//         kotlinDsl.push(extFun.toString())
//     })
const groups =  _.groupBy(getAllExtensionFun(), 'receiver')

if (fs.existsSync(InputPath[3])) {
    fs.rmdirSync(InputPath[3], { recursive: true })
}
fs.mkdirSync(InputPath[3], { recursive: true })
Object.entries(groups).forEach(([receiver, list]) => {
    const kotlinDsl = createKotlinDslHeader()
    list.forEach(k => kotlinDsl.push(k.toString()))
    fs.writeFileSync(`${InputPath[3]}/${receiver}.kt`, kotlinDsl.join('\n\n'));
})

/* ======================= 处理 生成 dsl 结束 ======================= */

