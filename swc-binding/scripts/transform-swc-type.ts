import {
  ArrayTypeNode, BooleanLiteral, Identifier, IndexSignatureDeclaration, InterfaceDeclaration, IntersectionTypeNode, LiteralLikeNode, LiteralTypeNode, ObjectFlags, ParenthesizedTypeNode, Project, PropertySignature, StringLiteral, TupleTypeNode, Type, TypeAliasDeclaration, TypeFormatFlags, TypeLiteralNode, TypeNode, TypeReferenceNode, UnionTypeNode, ts, NumericLiteral
} from 'ts-morph'
import fs from 'fs/promises';
import { TrueLiteral } from 'ts-morph';
import { FalseLiteral } from 'ts-morph';

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
  '../src/main/kotlin/dev/yidafu/swc/types/NodeSerializer.kt',
  '../src/main/kotlin/dev/yidafu/swc/dsl/dsl.kt',
  "./test.ts",
  './ouptput.kt',
  './NodeSerializer.kt',
  './dsl.kt',
]
const swcTypeFile = project.addSourceFileAtPath(InputPath[0]);

/* ======================= 全局常量开始 ======================= */

const kotlinTypes = [
  'package dev.yidafu.swc.types',
  '',
  'import dev.yidafu.swc.types.Union',
  'import kotlinx.serialization.*',
  '',
  '@SwcDslMarker',
  'annotation class SwcDslMarker',
  'typealias Record<T, S> = Map<T, String>',
  '',
]

const kotlinDsl = [
  'package dev.yidafu.swc.dsl',
  '',
  'import dev.yidafu.swc.types.*',
  '',
]


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
const canMergeInterface = ['ModuleConfig', 'ParserConfig']

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
  // "Program",
  // "ModuleItem",
  // "ModuleDeclaration",
  // "Statement",
  // "Pattern",
]
const skipMergeClassProperties = ['ClassExpression']
const sealedInterface = ["Node"]

const kotlinKeyword = ['object', 'inline', 'in',]
const toSnakeCaseInterface = ['JsFormatOptions']

const propTypeRewrite = new Map<string, string>([
  ['global_defs', 'Map<String, String>'],
  ['top_retain', "Union.U2<String, Array<String>>"],
  ['sequences', 'Boolean'],
  ['pure_getters', "Union.U2<String, Boolean>"],
  ['toplevel', "Union.U2<String, Boolean>"],
  ['targets', "Union.U2<String, Map<String, String>>"]
])

const mayDuplicate = ['var type:', 'var syntax:']
/* ======================= 全局常量结束 ======================= */

/* ======================= 全局变量开始 ======================= */

const LiteralObjects = [];

const mergeTypeMap = new Map<string, string[]>()

const typeAliasMap = new Map<string, string>()


const refTypeAliasMappingList: Array<[/* 子类型 */string, /* 父类型 */string]> = []

const nodeExtendsList: string[][] = []

const classRefPropertiesMap = new Map<string, Set<string>>()
/* ======================= 全局变量结束 ======================= */

/* ======================= 工具函数开始 ======================= */

function toFunName(str: string) {
  return str[0].toLowerCase() + str.slice(1)
}
function filterByKey(key: string) {
  return refTypeAliasMappingList.filter(p => p[0] === key)
}
function filterByValue(value: string) {
  return refTypeAliasMappingList.filter(p => p[1] === value)
}
function literalUnionToObjectProps(u: UnionTypeNode) {
  return u.getTypeNodes().map(l => {
    if (l instanceof LiteralTypeNode) {
      const n = l.getLiteral()
      const value = l.getText()
      if (n instanceof StringLiteral) {
        const name = value.toUpperCase().replaceAll('"', '')
        return `  const val ${Literal_Name_Map.has(name) ? Literal_Name_Map.get(name) : name} = ${value}`
      } else if (n instanceof TrueLiteral || n instanceof FalseLiteral) {
        return `  const val BOOL_${value.toString().toUpperCase()} = ${value}`
      } else if (n instanceof NumericLiteral) {
        return `  const val NUMBER_${value.toString().toUpperCase()} = ${value}`
      }
      throw Error('不是级别的类型')
    }
    throw Error('不是字面量')
  })
}

function isInterface(interfaceName: string) {
  return !!swcTypeFile.getInterface(interfaceName)
}

function isInterfaceOrTypeAliasArray(interfaceName: string) {
  if (!interfaceName.includes('Array<')) return ''
  // const node = swcTypeFile(interfaceName)!!.getTypeNode()
  const name = interfaceName.match(/Array<(\w*)>/)?.[1]
  if(name && (isInterface(name) || isTypeAlias(name))) {
     return name
    }
  return ''
}
function isUnionType(typeName: string) {
  return swcTypeFile.getTypeAlias(typeName) instanceof UnionTypeNode
}

function isTypeAlias(typeName: string) {
  return !!swcTypeFile.getTypeAlias(typeName)
}

function unique(arr: string[]) {
  const uniqueMap = new Map<string, string>()
  arr.filter(s => s.length > 0 && !s.match(/^\s*$/))
    .forEach(s => {
        if (s.includes('fun')  || isComment(s)) {
        uniqueMap.set(s, s)
      } else {
        const key = s.slice(s.indexOf('var'), s.indexOf(':'))

        if (!uniqueMap.has(key)) {
          uniqueMap.set(key, s);
        }
      }
    })
  return Array.from(uniqueMap.values())
}


function removeComment(str: string) {
  return str.replace(/\/\*(.|\r\n|\n)*?\*\//, '')
}

function isComment(str: string) {
  return str.match(/^\s*\/\*/)
}

function getKey(str: string) {
  return str.slice(str.indexOf('var'), str.indexOf(':'))
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
    kotlinTypes.push([
      '/**',
      '  * ' + typeAlias.getTypeNode()?.print(),
      '  */',
      `object ${tName} {`,
      ...literalUnionToObjectProps(typeNode),
      `}`].join('\n'))
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
      kotlinTypes.push(`typealias ${tName
        } = Union.U${uniqueType.length}<${uniqueType.join(', ')}>`)
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
    // const t = typeAlias as IntersectionTypeNode
    const uType = typeAlias.getType()
    const typeNode = typeAlias.getTypeNode() as IntersectionTypeNode
    const kindName = typeNode?.getKindName()
    const tName = typeAlias.getName()
    const nodes = typeNode.getTypeNodes()
    if (nodes[0] instanceof TypeReferenceNode && nodes[1] instanceof TypeLiteralNode) {
      const p = nodes[0] as TypeReferenceNode
      const t = nodes[1] as TypeLiteralNode
      kotlinTypes.push([
        `@SwcDslMarker\n@Serializable`,
        `class ${tName} : ${p.getTypeName().print()}() {`,
        ...typeLiteralGetProps(t),
        `}`, ''
      ].join('\n'))
    }
  })


const interfaceExtraExtendMap = new Map<string, Set<string>>()
const typeAliasExtraExtendMap = new Map<string, Set<string>>()
const typeAliasExtensionFunMap = new Map<string, Set<string>>()
/*
处理 type T = S | E
*/
swcTypeFile.getTypeAliases()
  .filter(typeAlias => typeAlias.getTypeNode() instanceof UnionTypeNode)
  .filter(typeAlias => {
    const typeNode = typeAlias.getTypeNode() as UnionTypeNode
    const isAllRefType = typeNode?.forEachChildAsArray().every(cNode => cNode instanceof TypeReferenceNode)
    return isAllRefType
  }).forEach(typeAlias => {
    const tName = typeAlias.getName()
    const typeNode = typeAlias.getTypeNode() as UnionTypeNode
    const childTypes = typeNode.getTypeNodes().map(n => getType(n))

    if (canMergeInterface.includes(tName)) {
      const list = typeAlias.getTypeNode()?.forEachChildAsArray().map(t => t.print()) ?? []
      mergeTypeMap.set(tName as any, list);
    } else {
      typeAliasExtensionFunMap.set(tName, new Set(childTypes))

      childTypes
        .filter(n => isInterface(n))
        .forEach(n => {
          const extraExtend = interfaceExtraExtendMap.get(n)! ?? new Set()
          extraExtend.add(tName)
          interfaceExtraExtendMap.set(n, extraExtend)

      childTypes
        .filter(n => isTypeAlias(n))
        .forEach(n => {
          const extraExtend = typeAliasExtraExtendMap.get(n) ?? new Set()
          extraExtend.add(tName)
          typeAliasExtraExtendMap.set(n, extraExtend)
        })
      })
    }
  })

Array.from(typeAliasExtensionFunMap.keys()).forEach(n => {
  if (typeAliasExtraExtendMap.has(n)) {
    const pTypes = typeAliasExtraExtendMap.get(n)!!
    let comment = Array.from(pTypes).join('], [')
    comment = `/**\n  * sub types: [${comment}]\n  */`

    kotlinTypes.push(`${comment}\ninterface ${n} : ${Array.from(pTypes).join(',')}`)
  } else {
    kotlinTypes.push(`interface ${n} : Node`)
  }
})

/* ======================= 处理 type alias 结束 ======================= */

/* ======================= 处理 interface 开始 ======================= */

const skipInterfaces = Array.from(mergeTypeMap.values()).flat()
for (const [typeName, interfaces] of mergeTypeMap) {
  const iList = interfaces.map(iName => {
    const i = swcTypeFile.getInterface(iName)!!
    return createInterface(i)
  }).flat(2).filter(s => !s.includes('class') && !s.includes('}'))

  let iList2: string[] = iList.filter(s => !mayDuplicate.some(p => s.includes(p)))

  mayDuplicate.forEach(i => {
    iList2.push(
      `  ${i} String? = null`
    )
  })

  const result = [
    `@SwcDslMarker\n@Serializable\nopen class ${typeName} {`,
    ...unique(iList2),
    '}',
  ]

  kotlinTypes.push(result.join('\n').replaceAll(/\*\/\s+\/\*\*/g, ', '))
}

function typeLiteralGetProps(t: TypeLiteralNode) {
  return t.getMembers().map(m => {
    const p = m as PropertySignature
    return ` var ${p.getName()}: ${getType(p.getTypeNode()!!)}? = null`
  })
}

function getType(typeNode: TypeNode<ts.TypeNode>): string {
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
        `@SwcDslMarker\n@Serializable\nclass ${newTypeName} {`,
        ...typeLiteralGetProps(t),
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
      const comment = '/**\n   *literal is: ' + typeNode?.forEachChildAsArray().map(c => c.getText()).join(",") + '\n   */';
      const type = comment.includes('"') ? "String" : "Int"
      return `${comment}${type}`
      // return `String = ${typeNode.getChildAtIndex(0).getText()}`
    }
    default: return "Any"
  }
}

function getInterfaceProperties(i: InterfaceDeclaration, isClass: boolean = false) {
  if (!i) return []
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
    // if (isTypeAlias(type)) {
      // const typeExtSet = typeAliasExtensionFunMap.get(type) ?? new Set()
      // typeExtSet.add(type)
      // typeAliasExtensionFunMap.set(interfaceName, typeExtSet)

      // result.push(
      //   ...createExtensionFunList(type)
      // )
    // }
    if (type.match(/^\s*\/\*[^\/]+\*\//)) {
      Array.from(type.matchAll(/\/\*[^\/]+\*\//g)).forEach(m => {
        result.push(m[0])
      })
      type = type.replaceAll(/\/\*[^\/]+\*\//g, '')
    }
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
      .filter(iName => iName.match(/^\s*\/\*/) || KeepInterface.includes(iName))
      .map(iName => getInterfaceProperties(swcTypeFile.getInterface(iName)!!, isClass))
      .flat()
    overrideProps = Array.from(new Set(overrideList))
    // .filter(s => !s.includes('type:'))
    // .map(s => s.includes('override') ? s : s.replace('var', 'override var') + ' = null')
    const overrideKeys = overrideProps.map(p => getKey(p))
    result = result.map(s => {
      if (s.includes('/*')) return s
      if (s.includes('fun')) return s
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
        ...overrideProps.filter(s => s.match(/^\s*\/\*/) || !existKeys.includes(s)).map(s => {
          if (s.includes('/*')) return s
          if (s.includes('fun')) return s

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
  }
  if (!isI) {
    if (interfaceName == "Module") console.log(interfaceName, result, result
      .filter(s => s.includes('var '))
      .map(s => s.slice(s.indexOf(':'), s.indexOf('=')))
      .map(s => removeComment(s))//.map(s => isInterfaceOrTypeAliasArray(s))
      )
    result
      .filter(s => s.includes('var '))
      .map(s => s.slice(s.indexOf(':'), s.indexOf('=')))
      .map(s => removeComment(s))
      .filter(s => isInterface(s) || isTypeAlias(s) || isInterfaceOrTypeAliasArray(s))
      .forEach(s => {
        const props = classRefPropertiesMap.get(interfaceName) ?? new Set()
        s.startsWith('Array<') ? props.add(s) : props.add(isInterfaceOrTypeAliasArray(s))
        classRefPropertiesMap.set(interfaceName, props)
      })
    // classRefPropertiesMap
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
  const pair = Array.from(interfaceExtraExtendMap.get(interfaceName) ?? [])
  if (pair.length) {
    parents.push(...pair);
  }
  function addParent(name: string) {
    const iList = interfaceExtraExtendMap.get(name)
    iList?.forEach(iName => {
      if (isInterface(iName)) {
        parents.push(iName)
      } else if (isTypeAlias(iName)) {
        addParent(iName)
        // typeAliasExtraExtendMap.get(name)?.forEach(tName => {
        //   addParent(tName)
        // })
      }
    })

    // ?.forEach(iName => {
    //   if (isInterface(iName)) {
    //     parents.add(iName)
    //   }
    // })
  }
  addParent(interfaceName)
  nodeExtendsList.push(...Array.from(new Set(parents)).map(p => [p, interfaceName]));
  const ext = parents.length > 0 ? `: ${parents.join(', ')} ` : ''
  let modifier = isI ? 'interface' : '@SwcDslMarker\n@Serializable\nopen class';
  if (sealedInterface.includes(interfaceName)) {
    modifier = "@SwcDslMarker\n@Serializable(NodeSerializer::class)\nsealed " + modifier
  }

  const result = [
    ...text,
    `${modifier} ${interfaceName} ${ext}{`,
  ]

  result.push(...getInterfaceProperties(i, !isI))

  result.push('}');
  return result
}

// 遍历 interface
for (const i of swcTypeFile.getInterfaces()) {
  const interfaceName = i.getName();
  if (skipInterfaces.includes(interfaceName)) continue;

  kotlinTypes.push(
    createInterface(i).join('\n').replaceAll(/\*\/\s+\/\*\*/g, ', '),
  )
}

fs.writeFile(InputPath[1], kotlinTypes.join('\n\n'));

const classNameList: string[] = []
function filterChildren(key: string) {
  const child = Array.from(new Set(nodeExtendsList.filter(p => p[0] === key).map(p => p[1])))

  child.forEach(p => {
    const grand = nodeExtendsList.filter(c => c[0] === p).map(p => p[1])
    if (grand.length > 0) {
      filterChildren(p)
    } else {
      classNameList.push(p)
    }
  })
}

filterChildren('Node')



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



/* ======================= 处理 生成 dsl 开始 ======================= */
const extensionFunMap = new Map<string, Set<string>>()
function createExtensionFunList(key: string) {
  // const extensionFunSet = new Set<string>()
  const visitedSet = new Set<string>()
  function genDsl(oKey: string, key: string) {
    if (visitedSet.has(key)) {
      return
    }
    visitedSet.add(key)
    const iList = typeAliasExtensionFunMap.get(key) ?? []
    iList.forEach(iName => {
      if (oKey != iName) {
        if (isInterface(iName)) {
          if (!KeepInterface.includes(iName)) {
            const set = (extensionFunMap.get(oKey) ?? new Set())
            set.add(iName)
            extensionFunMap.set(oKey, set)
            // extensionFunMap.add([oKey, iName].join('#'))
          }
        } else if (isTypeAlias(iName)) {
          genDsl(oKey, iName)
        }
      }
    })
  }

  genDsl(key, key)

  // return
}

typeAliasExtensionFunMap.forEach((_, key) => {
  createExtensionFunList(key)
  // kotlinDsl.push(
  //   ...
  // )
})
classRefPropertiesMap.forEach((refProps, key) => {
  refProps.forEach(prop => {
    if (isInterface(prop)) {
      extensionFunMap.set(key, (extensionFunMap.get(key) ?? new Set()).add(prop))
    } else if (isTypeAlias(prop)) {
      const exts = extensionFunMap.get(prop)
      const oExts = extensionFunMap.get(key) ?? new Set()
      exts?.forEach(e => oExts.add(e))

      extensionFunMap.set(key, oExts)
    }
  })
  // if (isTypeAlias(key)) {
  //   refProps.forEach(p => {
  //     extensionFunMap.get(key)!!.add()
  //   })
  // }
})

// console.log(extensionFunMap.get("Module"))
extensionFunMap.forEach((iNameList, key) => {
  iNameList.forEach(iName => kotlinDsl.push([
    `fun ${key}.${toFunName(iName)}(block: ${iName}.() -> Unit): ${iName} {`,
    `  return ${iName}().apply(block)`,
    `}`,
  ].join('\n')))
}
)
/* ======================= 处理 生成 dsl 结束 ======================= */

fs.writeFile(InputPath[3], kotlinDsl.join('\n\n'));


