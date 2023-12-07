export const ToKotlinClass = ['Span']

export const kotlinKeywordMap = new Map<string, string>([
    ['object', 'jsObject'],
    ['inline', 'jsInline'],
    ['in', 'jsIn'],
    ['super', 'jsSuper'],
    ['class', 'jsClass']
])


export const Literal_Name_Map = new Map([
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

export  const KeepInterface = [
        'HasDecorator',
        'HasSpan',
        "Node",
        "Fn",
        "PropBase",
        "ExpressionBase",
        "ClassPropertyBase",
        "PatternBase",
        "ClassMethodBase",
        'BaseModuleConfig'
        // "Program",
        // "ModuleItem",
        // "ModuleDeclaration",
        // "Statement",
        // "Pattern",
    ]

export const propTypeRewrite = new Map<string, string>([
    ['global_defs', 'Map<String, String>'],
    ['top_retain', "Union.U2<String, Array<String>>"],
    ['sequences', 'Boolean'],
    ['pure_getters', "Union.U2<String, Boolean>"],
    ['toplevel', "Union.U2<String, Boolean>"],
    ['targets', "Union.U2<String, Map<String, String>>"]
])

export const noImplRootList: string[] = [
   'ParserConfig',
   'Config',
   'JscConfig',
//    'ModuleConfig',
   'BaseModuleConfig',
]