import { ArrayTypeNode, BooleanLiteral, IndexSignatureDeclaration, InterfaceDeclaration, IntersectionTypeNode, LiteralLikeNode, LiteralTypeNode, ObjectFlags, ParenthesizedTypeNode, Project, PropertySignature, TupleTypeNode, Type, TypeFormatFlags, TypeLiteralNode, TypeNode, TypeReferenceNode, UnionTypeNode, ts } from 'ts-morph'
import fs from 'fs/promises';

const project = new Project({
  tsConfigFilePath: "./tsconfig.json"
})

const InputPath = [
  "./node_modules/@swc/types/index.d.ts",
  '../src/main/kotlin/dev/yidafu/swc/types/types.kt',
  '../src/main/kotlin/dev/yidafu/swc/types/NodeSerializer.kt',
  // "./test.ts",
  // './ouptput.kt',
  // './NodeSerializer.kt',
]
const swcTypeFile = project.addSourceFileAtPath(InputPath[0]);
// const swcTypeFile = project.addSourceFileAtPath("./test.ts");

const kotlinTypes = [
  'package dev.yidafu.swc.types',
  '',
  'import dev.yidafu.swc.types.Union',
  'import kotlinx.serialization.*',
  '',
  'typealias Record<T, S> = Map<T, String>',
  '',
]


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

const Literal_Name_Map = new Map([
  ["+", "Addition"],
  ["+=", "AdditionAssignment"],
  ["=", "Assignment"],
  ["&", "BitwiseAND"],
  ["&=", "BitwiseANDAssignment"],
  ["~", "BitwiseNOT"],
  ["|", "BitwiseOR"],
  ["|=", "BitwiseORAssignment"],
  ["^", "BitwiseXOR"],
  ["^=", "BitwiseXORAssignment"],
  [",", "CommaOperator"],
  ["ternary", "Conditional"],
  ["--", "Decrement"],
  ["/", "Division"],
  ["/=", "DivisionAssignment"],
  ["==", "Equality"],
  ["**", "Exponentiation"],
  ["**=", "ExponentiationAssignment"],
  [">", "GreaterThan"],
  [">=", "GreaterThanOrEqual"],
  [" ", "GroupingOperator"],
  ["++", "Increment"],
  ["!=", "Inequality"],
  ["<<", "LeftShift"],
  ["<<=", "LeftShiftAssignment"],
  ["<", "LessThan"],
  ["<=", "LessThanOrEqual"],
  ["&&", "LogicalAND"],
  ["&&=", "LogicalANDAssignment"],
  ["!", "LogicalNOT"],
  ["||", "LogicalOR"],
  ["||=", "LogicalORAssignment"],
  ["*", "Multiplication"],
  ["*=", "MultiplicationAssignment"],
  ["??=", "NullishCoalescingAssignment"],
  ["??", "NullishCoalescingOperator"],
  ["?.", "OptionalChaining"],
  ["%", "Remainder"],
  ["%=", "RemainderAssignment"],
  [">>", "RightShift"],
  [">>=", "RightShiftAssignment"],
  ["...", "SpreadSyntax"],
  ["===", "StrictEquality"],
  ["!==", "StrictInequality"],
  ["-", "Subtraction"],
  ["-=", "SubtractionAssignment"],
  ["-", "UnaryNegation"],
  ["+", "UnaryPlus"],
  [">>>", "UnsignedRightShift"],
  [">>>=", "UnsignedRightShiftAssignment"]
])

const LiteralObjects = [];

const mergeTypeMap = new Map<string, string[]>()
const canMergeInterface = ['ParserConfig', 'ModuleConfig']

const jsKotlinTypeMap = new Map([
  ["number", "Int"],
  ["boolean", "Boolean"],
  ["string", "String"],
  ["string[]", "Array<String>"],
])

const KeepInterface = [
  'HasDecorator',
  'HasSpan',
  "Node",
  "Fn",
  "PropBase",
  "ExpressionBase",
  "ClassPropertyBase",
  "PatternBase",
  "ClassMethodBase"
]
const skipMergeClassProperties = ['ClassExpression']
const sealedInterface = ["Node"]

const kotlinKeyword = ['object', 'inline', 'in',]
const toSnakeCaseInterface = ['JsFormatOptions']
const typeAliasMap = new Map<string, string>()

const propTypeRewrite = new Map<string, string>([
  ['global_defs', 'Map<String, String>'],
  ['top_retain', "Union.U2<String, Array<String>>"],
  ['sequences', 'Boolean'],
  ['pure_getters', "Union.U2<String, Boolean>"],
  ['toplevel', "Union.U2<String, Boolean>"],
  ['targets', "Union.U2<String, Map<String, String>>"]
])


const nodeExtendsList: string[][] = []

for (const typeAlias of swcTypeFile.getTypeAliases()) {
  const uType = typeAlias.getType()
  const typeNode = typeAlias.getTypeNode()
  const typeName = typeNode?.getKindName()

  if (uType.isUnion()) {
    const types = uType.getUnionTypes()
    const isAllInterface = types.every(t => t.isInterface()) && canMergeInterface.includes(typeAlias.getName())
    const isAllLiteral = types.every(t => t.isLiteral())
    const onlyLiteralType = types.every(t => t.isLiteral() || t.isBoolean() || t.isString() || t.isNumber())
    if (isAllLiteral) {

      let primaryType = "String"
      const objectBody = types.map(t => {
        const value = t.getLiteralValue() ?? t.getText()
        if (t.isBooleanLiteral()) {
          primaryType = "Boolean";
          return `  const val BOOL_${value.toString().toUpperCase()} = ${value}`
        } else if (t.isNumberLiteral()) {
          primaryType = "Int";
          return `  const val NUMBER_${value} = ${value}`
        }

        const varName = Literal_Name_Map.has(value as any)
          ? Literal_Name_Map.get(value as any)
          : value?.toString().toUpperCase()

        return `  const val ${varName} = "${value}"`
      }).join('\n')
      LiteralObjects.push(typeAlias.getName())

      primaryType += `/* ${typeAlias.getTypeNode()?.print()} */`
      typeAliasMap.set(typeAlias.getName(), primaryType)
      kotlinTypes.push(`
        object ${typeAlias.getName()} {
        ${objectBody}
        }
      `.replaceAll('        ', ''))
    } else if (onlyLiteralType) {
      // console.log(typeAlias.getName(), types.length)
      // types.forEach(t => console.log(t.isString(), t.isBoolean(), t.isNumber()))
      const count = types
        .filter(t => !t.isLiteral())
        .map(t => {
          if (t.isBoolean()) return 'Boolean'
          if (t.isNumber()) return 'Int'
          if (t.isString()) return 'String'
        })

      kotlinTypes.push(`typealias ${typeAlias.getName()} = Union.U${count.length}<${count.join(', ')}>`)
    } else if (isAllInterface) {

      const list = typeAlias.getTypeNode()?.forEachChildAsArray().map(t => t.print()) ?? []
      // console.log(typeAlias.getName() as any, list)
      mergeTypeMap.set(typeAlias.getName() as any, list);
    } else {
      kotlinTypes.push(`typealias ${typeAlias.getName()} = ${getType(typeAlias.getTypeNode()!!).replace("Any", "Node")}`)
    }
  }
}

function unique(arr: string[]) {
  const uniqueMap = new Map<string, string>()
  arr.forEach(s => {
    const key = s.slice(s.indexOf('var'), s.indexOf(':'))

    if (!uniqueMap.has(key)) {
      uniqueMap.set(key, s);
    }
  })
  return Array.from(uniqueMap.values())
}
const mayDuplicate = ['var type:', 'var syntax:']
for (const [typeName, interfaces] of mergeTypeMap) {
  // merge interface
  // const oInterface = createInterface(i1)
  const iList = interfaces.map(iName => {
    const i = swcTypeFile.getInterface(iName)!!
    return createInterface(i)
  }).flat(2).filter(s => !s.includes('class') && !s.includes('}'))

  let iList2: string[] = iList.filter(s => !mayDuplicate.some(p => s.includes(p)))

  mayDuplicate.forEach(i => {
    // iList2 = iList.filter(i => !i.includes(i))
    const types = iList.filter(i => i.includes(i))
    const comments = "/**" + types.map(t => t.slice(t.indexOf('='))).join(', ') + '*/'
    iList2.push(
      comments,
      `  ${i} String? = null`
    )
  })

  const result = [
    `@Serializable\nclass ${typeName} {`,
    ...unique(iList2),
    '}',
  ]

  kotlinTypes.push(result.join('\n'))
}


function getType(typeNode: TypeNode<ts.TypeNode>): string {
  const typeName = typeNode?.getKindName();
  // console.log()
  // console.log(typeName)
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
          const comment = '/* ' + typeNode?.forEachChildAsArray().map(c => c.getText()).join(",") + ' */';
          const type = comment.includes('"') ? "String" : "Int"
          return `${comment}${type}`
        }
        return `Union.U${uniqueTypes.length}<${uniqueTypes.join(', ')}>`
      } else {
        return "Any"
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
        `@Serializable\nclass ${newTypeName} {`,
        ...t.getMembers().map(m => {

          const p = m as PropertySignature
          return ` var ${p.getName()}: ${getType(p.getTypeNode()!!)}? = null`
        }),
        '}'
      ].join('\n'))
      return newTypeName
    }

    case "TupleType": {
      if (typeNode instanceof TupleTypeNode) {
        const elements = typeNode.getElements()
        if (elements.length == 2) {
          return `Union.U2<${getType(elements[0])}, ${getType(elements[1])}>`
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
          if (typeAliasMap.has(type)) return typeAliasMap.get(type)!!
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
      const comment = '/* ' + typeNode?.forEachChildAsArray().map(c => c.getText()).join(",") + '*/';
      const type = comment.includes('"') ? "String" : "Int"
      return `${comment}${type}`
      // return `String = ${typeNode.getChildAtIndex(0).getText()}`
    }
    default: return "Any"
  }
}

function getKey(str: string) {
  return str.slice(str.indexOf('var'), str.indexOf(':'))
}
function getInterfaceProperties(i: InterfaceDeclaration, isClass: boolean = false) {
  const interfaceName = i.getName();

  const properties = i.getProperties()
  const isI = KeepInterface.includes(interfaceName)

  const pI = i.getHeritageClauses()

  let result: string[] = []
  properties.forEach(p => {
    result.push(
      ...p.getLeadingCommentRanges().map(c => c.getText()),
    )
    const typeName = kotlinKeyword.includes(p.getName()) ? '`' + p.getName() + '`' : p.getName()
    let value = p.getTypeNode()?.getText()
    value = value?.includes('"') && !value.includes('|') ? value : ""
    let type = getType(p.getTypeNode()!!)
    if (propTypeRewrite.has(typeName)) {
      type = propTypeRewrite.get(typeName)!!
    }
    result.push(`  var ${typeName}: ${type}? ${(isI) ? '' : (value ? '= ' + value : '=  null')
      }`)
  });

  if ((isClass || !isI)) {
    let overrideProps: string[] = []
    // 父类的属性
    const overrideList = pI
      .map(p => { return p.getTypeNodes().map(t => t.print()) })
      .flat()
      .filter(iName => KeepInterface.includes(iName))
      .map(iName => getInterfaceProperties(swcTypeFile.getInterface(iName)!!, isClass))
      .flat()
    overrideProps = Array.from(new Set(overrideList))
    // .filter(s => !s.includes('type:'))
    // .map(s => s.includes('override') ? s : s.replace('var', 'override var') + ' = null')
    const overrideKeys = overrideProps.map(p => getKey(p))
    result = result.map(s => {
      if (overrideKeys.includes(getKey(s))) {
        const s2 = s.replace('var', 'override var')
        if (s2.includes('=')) {
          return s2
        }
        return s2 + " = null"
      }
      return s
    })

    // 是否添加继承的属性
    if (!skipMergeClassProperties.includes(interfaceName)) {
      const existKeys = result.map(s => getKey(s))
      result.push(
        ...overrideProps.filter(s => !existKeys.includes(s)).map(s => {
          if (!s.includes('override')) {
            const s2 = s.replace('var', 'override var')
            if (s2.includes('=')) {
              return s2
            }
            return s2 + " = null"
          }
          return s
        })
      )
    }

    // result.push(...overrideProps)
  }
  if (toSnakeCaseInterface.includes(interfaceName)) {
    const snakeProps = result
      .map(s => [getKey(s), s])
      .filter(pair => pair[0].match(/[A-Z]/))
      .map(pair => {
        const snakeCase = pair[0].replaceAll(
          /([A-Z])/g, (_, p1) => `_${p1.toString().toLowerCase()}`
        )

        return pair[1].replace(pair[0], snakeCase);
      })
    result.push(...snakeProps)
  }
  return unique(result)
}


const skipInterfaces = Array.from(mergeTypeMap.values()).flat()

function createInterface(i: InterfaceDeclaration) {

  const interfaceName = i.getName();
  const isI = KeepInterface.includes(interfaceName)
  const comments = i.getLeadingCommentRanges()
  const text = comments.map(c => c.getText())
  const pI = i.getHeritageClauses()
  const parents = pI.map(p => {
    return p.getTypeNodes().map(t => t.print())
  }).flat().map(c => {
    if (KeepInterface.includes(c)) {
      return c
    } else {
      return `${c}()`
    }
  })

  nodeExtendsList.push(...parents.map(p => [p, interfaceName]));
  const ext = parents.length > 0 ? `: ${parents.join(', ')} ` : ''
  let modifier = KeepInterface.includes(interfaceName) ? 'interface' : '@Serializable\nopen class';
  if (sealedInterface.includes(interfaceName)) {
    modifier = "@Serializable(NodeSerializer::class)\nsealed " + modifier
  }

  const result = [
    ...text,
    `${modifier} ${interfaceName} ${ext}{`,
  ]

  result.push(...getInterfaceProperties(i, !isI))

  result.push('}');
  result.push('')
  return result
}
for (const i of swcTypeFile.getInterfaces()) {
  const interfaceName = i.getName();
  if (skipInterfaces.includes(interfaceName)) continue;

  kotlinTypes.push(
    createInterface(i).join('\n'),
  )
}

fs.writeFile(InputPath[1], kotlinTypes.join('\n'));

const classNameList: string[] = []
function filterParent(key: string) {
  const parent = Array.from(new Set(nodeExtendsList.filter(p => p[0] === key).map(p => p[1])))

  parent.forEach(p => {
    const grand = nodeExtendsList.filter(c => c[0] === p).map(p => p[1])
    if (grand.length > 0) {
      filterParent(p)
    } else {
      classNameList.push(p)
    }
  })
}

filterParent('Node')

const NodeNodeSerializer = `
package dev.yidafu.swc.types

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.*

object NodeSerializer : JsonContentPolymorphicSerializer<Node>(Node::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Node> {
        return when {
            "type" in element.jsonObject -> {
                val nodeType = element.jsonObject["type"]?.jsonPrimitive?.contentOrNull
                when (nodeType) {
                  ${classNameList.map(c => `
                    "${c}" -> ${c}.serializer()`).join('\n')}
                    else -> throw SerializationException("$nodeType Not Ast Node Type")
                }
            }
            else -> {
                throw SerializationException("Not Valid Tree Node")
            }
        }
    }
}`
fs.writeFile(InputPath[2], NodeNodeSerializer);


