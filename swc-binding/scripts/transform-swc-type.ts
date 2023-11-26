import { ArrayTypeNode, BooleanLiteral, InterfaceDeclaration, LiteralLikeNode, LiteralTypeNode, ObjectFlags, Project, PropertySignature, Type, TypeFormatFlags, TypeNode, UnionTypeNode, ts } from 'ts-morph'
import fs from 'fs/promises';

const project = new Project({
  tsConfigFilePath: "./tsconfig.json"
})

const swcTypeFile = project.addSourceFileAtPath("./node_modules/@swc/types/index.d.ts");
// const swcTypeFile = project.addSourceFileAtPath("./test.ts");

const kotlinTypes = [
  'package dev.yidafu.swc',
  '',
  'import dev.yidafu.swc.types.Union',
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
  ["number", "Number"],
  ["boolean", "Boolean"],
  ["string", "String"],
  ["string[]", "Array<String>"]
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

const kotlinKeyword = ['object', 'inline', 'in',]

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
      const objectBody = types.map(t => {
        const value = t.getLiteralValue() ?? t.getText()
        if (t.isBooleanLiteral()) {
          return `  const val BOOL_${value.toString().toUpperCase()} = ${value}`
        } else if (t.isNumberLiteral()) {
          return `  const val NUMBER_${value} = ${value}`
        }

        const varName = Literal_Name_Map.has(value as any)
          ? Literal_Name_Map.get(value as any)
          : value?.toString().toUpperCase()

        return `  const val ${varName} = "${value}"`
      }).join('\n')

      LiteralObjects.push(typeAlias.getName())

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
          if (t.isNumber()) return 'Number'
          if (t.isString()) return 'String'
        })

      kotlinTypes.push(`typealias ${typeAlias.getName()} = Union.U${count.length}<${count.join(', ')}>`)
    } else if (isAllInterface) {

      const list = typeAlias.getTypeNode()?.forEachChildAsArray().map(t => t.print()) ?? []
      console.log(typeAlias.getName() as any, list)
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
    `class ${typeName} {`,
    ...Array.from(new Set(iList2)),
    '}',
  ]

  kotlinTypes.push(result.join('\n'))
}


function getType(typeNode: TypeNode<ts.TypeNode>): string {
  const typeName = typeNode?.getKindName();
  switch (typeName) {
    case "UnionType": {

      const lTypes = typeNode?.forEachChildAsArray().map(cNode => {
        var type = getType(cNode as TypeNode)

        return jsKotlinTypeMap.has(type) ? jsKotlinTypeMap.get(type) : type;
      });
      const uniqueTypes = Array.from(new Set(lTypes))
      if (uniqueTypes.length == 1) {
        return uniqueTypes[0] as string
      } else if (uniqueTypes.length > 1 && uniqueTypes.length < 5) {
        const isAllLiteral = typeNode?.forEachChildAsArray().every(cNode => cNode.getKindName() === 'LiteralType')
        if (isAllLiteral) {
          const comment = '/* ' + typeNode?.forEachChildAsArray().map(c => c.getText()).join(",") + ' */';
          const type = comment.includes('"') ? "String" : "Number"
          return `${comment}${type}`
        }
        return `Union.U${uniqueTypes.length}<${uniqueTypes.join(', ')}>`
      } else {
        return "Any"
      }
    }
    case "TypeReference": {
      const type = typeNode?.print()
      if (type == 'Record<string, string>') {
        return 'Map<String, String>'
      }
      return type
    }
    case "NumberKeyword": {
      return "Number"
    }
    case "StringKeyword": {
      return "String"
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
      const type = comment.includes('"') ? "String" : "Number"
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

    result.push(`  var ${typeName}: ${getType(p.getTypeNode()!!)}? ${(isI) ? '' : (value ? '= ' + value : '=  null')
      }`)
  });
  if (isClass || !isI) {
    const overrideList = pI
      .map(p => { return p.getTypeNodes().map(t => t.print()) })
      .flat()
      .filter(iName => KeepInterface.includes(iName))
      .map(iName => getInterfaceProperties(swcTypeFile.getInterface(iName)!!, isClass))
      .flat()
    const overrideProps = Array.from(new Set(overrideList))
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

    // result.push(...overrideProps)
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

  const ext = parents.length > 0 ? `: ${parents.join(', ')} ` : ''
  const modifier = KeepInterface.includes(interfaceName) ? 'interface' : 'open class';
  const result = [
    ...text,
    `${modifier} ${interfaceName} ${ext}{`,
  ]

  result.push(...getInterfaceProperties(i, !isI))

  result.push('}');
  result.push('')
  return result
}

const skipInterfaces = Array.from(mergeTypeMap.values()).flat()
for (const i of swcTypeFile.getInterfaces()) {
  const interfaceName = i.getName();
  if (skipInterfaces.includes(interfaceName)) continue;

  kotlinTypes.push(
    createInterface(i).join('\n'),
  )
}

fs.writeFile('../src/main/kotlin/dev/yidafu/swc/ast.kt', kotlinTypes.join('\n'));
// fs.writeFile('./ouptput.kt', kotlinTypes.join('\n'));

// swcTypeFile?.getInterfaces()?.forEach(i => {
//   console.log(i.getName())
// })
