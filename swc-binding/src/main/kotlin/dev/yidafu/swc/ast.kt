package dev.yidafu.swc

import dev.yidafu.swc.types.Union

typealias ParseOptions = Node
typealias TerserEcmaVersion = Union.U2<String, Number>
typealias Swcrc = Union.U2<Config, Array<Config>>

object JscTarget {
  const val ES3 = "es3"
  const val ES5 = "es5"
  const val ES2015 = "es2015"
  const val ES2016 = "es2016"
  const val ES2017 = "es2017"
  const val ES2018 = "es2018"
  const val ES2019 = "es2019"
  const val ES2020 = "es2020"
  const val ES2021 = "es2021"
  const val ES2022 = "es2022"
  const val ESNEXT = "esnext"
}
      
typealias ClassMember = Node

object MethodKind {
  const val METHOD = "method"
  const val GETTER = "getter"
  const val SETTER = "setter"
}
      
typealias Declaration = Node

object VariableDeclarationKind {
  const val VAR = "var"
  const val LET = "let"
  const val CONST = "const"
}
      
typealias Expression = Node
typealias JSXObject = Union.U2<JSXMemberExpression, Identifier>
typealias JSXExpression = Union.U2<JSXEmptyExpression, Expression>
typealias JSXElementName = Union.U3<Identifier, JSXMemberExpression, JSXNamespacedName>
typealias JSXAttributeOrSpread = Union.U2<JSXAttribute, SpreadElement>
typealias JSXAttributeName = Union.U2<Identifier, JSXNamespacedName>
typealias JSXAttrValue = Union.U4<Literal, JSXExpressionContainer, JSXElement, JSXFragment>
typealias JSXElementChild = Node
typealias Literal = Node
typealias ModuleDeclaration = Node
typealias DefaultDecl = Union.U3<ClassExpression, FunctionExpression, TsInterfaceDeclaration>
typealias ImportSpecifier = Union.U3<NamedImportSpecifier, ImportDefaultSpecifier, ImportNamespaceSpecifier>
typealias ModuleExportName = Union.U2<Identifier, StringLiteral>
typealias ExportSpecifier = Union.U3<ExportNamespaceSpecifier, ExportDefaultSpecifier, NamedExportSpecifier>
typealias Program = Union.U2<Module, Script>
typealias ModuleItem = Union.U2<ModuleDeclaration, Statement>

object BinaryOperator {
  const val Equality = "=="
  const val Inequality = "!="
  const val StrictEquality = "==="
  const val StrictInequality = "!=="
  const val LessThan = "<"
  const val LessThanOrEqual = "<="
  const val GreaterThan = ">"
  const val GreaterThanOrEqual = ">="
  const val LeftShift = "<<"
  const val RightShift = ">>"
  const val UnsignedRightShift = ">>>"
  const val UnaryPlus = "+"
  const val UnaryNegation = "-"
  const val Multiplication = "*"
  const val Division = "/"
  const val Remainder = "%"
  const val BitwiseOR = "|"
  const val BitwiseXOR = "^"
  const val BitwiseAND = "&"
  const val LogicalOR = "||"
  const val LogicalAND = "&&"
  const val IN = "in"
  const val INSTANCEOF = "instanceof"
  const val Exponentiation = "**"
  const val NullishCoalescingOperator = "??"
}
      

object AssignmentOperator {
  const val Assignment = "="
  const val AdditionAssignment = "+="
  const val SubtractionAssignment = "-="
  const val MultiplicationAssignment = "*="
  const val DivisionAssignment = "/="
  const val RemainderAssignment = "%="
  const val LeftShiftAssignment = "<<="
  const val RightShiftAssignment = ">>="
  const val UnsignedRightShiftAssignment = ">>>="
  const val BitwiseORAssignment = "|="
  const val BitwiseXORAssignment = "^="
  const val BitwiseANDAssignment = "&="
  const val ExponentiationAssignment = "**="
  const val LogicalANDAssignment = "&&="
  const val LogicalORAssignment = "||="
  const val NullishCoalescingAssignment = "??="
}
      

object UpdateOperator {
  const val Increment = "++"
  const val Decrement = "--"
}
      

object UnaryOperator {
  const val UnaryPlus = "+"
  const val UnaryNegation = "-"
  const val LogicalNOT = "!"
  const val BitwiseNOT = "~"
  const val TYPEOF = "typeof"
  const val VOID = "void"
  const val DELETE = "delete"
}
      
typealias Pattern = Node
typealias ObjectPatternProperty = Union.U3<KeyValuePatternProperty, AssignmentPatternProperty, RestElement>
typealias Property = Node
typealias PropertyName = Node
typealias Statement = Node
typealias TsParameterPropertyParameter = Union.U2<BindingIdentifier, AssignmentPattern>
typealias TsEntityName = Union.U2<TsQualifiedName, Identifier>
typealias TsTypeElement = Node
typealias TsType = Node
typealias TsFnOrConstructorType = Union.U2<TsFunctionType, TsConstructorType>

object TsKeywordTypeKind {
  const val STRING = "string"
  const val NUMBER = "number"
  const val BIGINT = "bigint"
  const val BOOLEAN = "boolean"
  const val SYMBOL = "symbol"
  const val UNDEFINED = "undefined"
  const val OBJECT = "object"
  const val VOID = "void"
  const val ANY = "any"
  const val UNKNOWN = "unknown"
  const val NULL = "null"
  const val NEVER = "never"
  const val INTRINSIC = "intrinsic"
}
      
typealias TsFnParameter = Union.U4<BindingIdentifier, ArrayPattern, RestElement, ObjectPattern>
typealias TsThisTypeOrIdent = Union.U2<TsThisType, Identifier>
typealias TsTypeQueryExpr = Union.U2<TsEntityName, TsImportType>
typealias TsUnionOrIntersectionType = Union.U2<TsUnionType, TsIntersectionType>

object TsTypeOperatorOp {
  const val KEYOF = "keyof"
  const val UNIQUE = "unique"
  const val READONLY = "readonly"
}
      

object TruePlusMinus {
  const val BOOL_TRUE = true
  const val UnaryPlus = "+"
  const val UnaryNegation = "-"
}
      
typealias TsLiteral = Node
typealias TsEnumMemberId = Union.U2<Identifier, StringLiteral>
typealias TsNamespaceBody = Union.U2<TsModuleBlock, TsNamespaceDeclaration>
typealias TsModuleName = Union.U2<Identifier, StringLiteral>
typealias TsModuleReference = Union.U2<TsEntityName, TsExternalModuleReference>

object Accessibility {
  const val PUBLIC = "public"
  const val PROTECTED = "protected"
  const val PRIVATE = "private"
}
      
class ParserConfig {
/**
     * Defaults to `false`.
     */
  var tsx: Boolean? =  null
  var decorators: Boolean? =  null
  var dynamicImport: Boolean? =  null

/**
     * Defaults to false.
     */
  var jsx: Boolean? =  null
  var numericSeparator: Boolean? =  null
  var privateMethod: Boolean? =  null
  var functionBind: Boolean? =  null
  var decoratorsBeforeExport: Boolean? =  null
  var exportDefaultFrom: Boolean? =  null
  var exportNamespaceFrom: Boolean? =  null
  var nullishCoalescing: Boolean? =  null
  var optionalChaining: Boolean? =  null
  var importMeta: Boolean? =  null
  var topLevelAwait: Boolean? =  null
  var importAssertions: Boolean? =  null
/**= "typescript", /, =  null, =  null, =  null, , = "ecmascript", /, =  null, =  null, =  null, =  null, =  null, =  null, =  null, =  null, =  null, =  null, =  null, =  null, =  null, =  null, */
  var type: String? = null
  var syntax: String? = null
}
class ModuleConfig {

  var globals: Any? =  null
  var moduleId: String? =  null
  var allowTopLevelThis: Boolean? =  null
/**= "es6", , = "commonjs", , = "umd", =  null, , = "amd", =  null, , = "nodenext", , = "systemjs", =  null, */
  var type: String? = null
  var syntax: String? = null
}
open class Plugin {
}

open class JsMinifyOptions {
  var compress: Union.U2<TerserCompressOptions, Boolean>? =  null
  var format: Any? =  null
  var mangle: Union.U2<TerserMangleOptions, Boolean>? =  null
  var ecma: TerserEcmaVersion? =  null
  var keep_classnames: Boolean? =  null
  var keep_fnames: Boolean? =  null
  var module: Boolean? =  null
  var safari10: Boolean? =  null
  var toplevel: Boolean? =  null
  var sourceMap: Boolean? =  null
  var outputPath: String? =  null
  var inlineSourcesContent: Boolean? =  null
}

/**
 * These properties are mostly not implemented yet,
 * but it exists to support passing terser config to swc minify
 * without modification.
 */
open class JsFormatOptions {
/**
     * Currently noop.
     * @default false
     * @alias ascii_only
     */
  var asciiOnly: Boolean? =  null
  var beautify: Boolean? =  null
  var braces: Boolean? =  null
  var comments: /* false,"some","all" */String? =  null
  var ecma: TerserEcmaVersion? =  null
  var indentLevel: Number? =  null
  var indentStart: Number? =  null
  var inlineScript: Number? =  null
  var keepNumbers: Number? =  null
  var keepQuotedProps: Boolean? =  null
  var maxLineLen: Union.U2<Number, /* false*/Number>? =  null
  var preamble: String? =  null
  var quoteKeys: Boolean? =  null
  var quoteStyle: Boolean? =  null
  var preserveAnnotations: Boolean? =  null
  var safari10: Boolean? =  null
  var semicolons: Boolean? =  null
  var shebang: Boolean? =  null
  var webkit: Boolean? =  null
  var wrapIife: Boolean? =  null
  var wrapFuncArgs: Boolean? =  null
}

open class TerserCompressOptions {
  var arguments: Boolean? =  null
  var arrows: Boolean? =  null
  var booleans: Boolean? =  null
  var booleans_as_integers: Boolean? =  null
  var collapse_vars: Boolean? =  null
  var comparisons: Boolean? =  null
  var computed_props: Boolean? =  null
  var conditionals: Boolean? =  null
  var dead_code: Boolean? =  null
  var defaults: Boolean? =  null
  var directives: Boolean? =  null
  var drop_console: Boolean? =  null
  var drop_debugger: Boolean? =  null
  var ecma: TerserEcmaVersion? =  null
  var evaluate: Boolean? =  null
  var expression: Boolean? =  null
  var global_defs: Any? =  null
  var hoist_funs: Boolean? =  null
  var hoist_props: Boolean? =  null
  var hoist_vars: Boolean? =  null
  var ie8: Boolean? =  null
  var if_return: Boolean? =  null
  var `inline`: /* 0,1,2,3 */Number? =  null
  var join_vars: Boolean? =  null
  var keep_classnames: Boolean? =  null
  var keep_fargs: Boolean? =  null
  var keep_fnames: Boolean? =  null
  var keep_infinity: Boolean? =  null
  var loops: Boolean? =  null
  var negate_iife: Boolean? =  null
  var passes: Number? =  null
  var properties: Boolean? =  null
  var pure_getters: Any? =  null
  var pure_funcs: Array<String>? =  null
  var reduce_funcs: Boolean? =  null
  var reduce_vars: Boolean? =  null
  var sequences: Any? =  null
  var side_effects: Boolean? =  null
  var switches: Boolean? =  null
  var top_retain: Any? =  null
  var toplevel: Any? =  null
  var typeofs: Boolean? =  null
  var unsafe: Boolean? =  null
  var unsafe_passes: Boolean? =  null
  var unsafe_arrows: Boolean? =  null
  var unsafe_comps: Boolean? =  null
  var unsafe_function: Boolean? =  null
  var unsafe_math: Boolean? =  null
  var unsafe_symbols: Boolean? =  null
  var unsafe_methods: Boolean? =  null
  var unsafe_proto: Boolean? =  null
  var unsafe_regexp: Boolean? =  null
  var unsafe_undefined: Boolean? =  null
  var unused: Boolean? =  null
  var const_to_let: Boolean? =  null
  var module: Boolean? =  null
}

open class TerserMangleOptions {
  var props: TerserManglePropertiesOptions? =  null
  var toplevel: Boolean? =  null
  var keep_classnames: Boolean? =  null
  var keep_fnames: Boolean? =  null
  var keep_private_props: Boolean? =  null
  var ie8: Boolean? =  null
  var safari10: Boolean? =  null
  var reserved: Array<String>? =  null
}

open class TerserManglePropertiesOptions {
}

/**
 * Programmatic options.
 */
open class Options : Config() {
/**
     * If true, a file is parsed as a script instead of module.
     */
  var script: Boolean? =  null
  var cwd: String? =  null
  var caller: CallerOptions? =  null
  var filename: String? =  null
  var root: String? =  null
  var rootMode: /* "root","upward","upward-optional" */String? =  null
  var envName: String? =  null
  var configFile: Union.U2<String, Boolean>? =  null
  var swcrc: Boolean? =  null
  var swcrcRoots: Union.U3<Boolean, MatchPattern, Array<MatchPattern>>? =  null
  var inputSourceMap: Union.U2<Boolean, String>? =  null
  var sourceFileName: String? =  null
  var sourceRoot: String? =  null
  var plugin: Plugin? =  null
  var isModule: Union.U2<Boolean, /* "unknown"*/String>? =  null
  var outputPath: String? =  null
}

open class CallerOptions {
  var name: String? =  null
}

/**
 * .swcrc
 */
open class Config {
/**
     * Note: The type is string because it follows rust's regex syntax.
     */
  var test: Union.U2<String, Array<String>>? =  null
  var exclude: Union.U2<String, Array<String>>? =  null
  var env: EnvConfig? =  null
  var jsc: JscConfig? =  null
  var module: ModuleConfig? =  null
  var minify: Boolean? =  null
  var sourceMaps: Union.U2<Boolean, /* "inline"*/String>? =  null
  var inlineSourcesContent: Boolean? =  null
}

/**
 * Configuration ported from babel-preset-env
 */
open class EnvConfig {
  var mode: /* "usage","entry" */String? =  null
  var debug: Boolean? =  null
  var dynamicImport: Boolean? =  null
  var loose: Boolean? =  null
  var skip: Array<String>? =  null
  var include: Array<String>? =  null
  var exclude: Array<String>? =  null
/**
     * The version of the used core js.
     *
     */
  var coreJs: String? =  null
  var targets: Any? =  null
  var path: String? =  null
  var shippedProposals: Boolean? =  null
  var forceAllTransforms: Boolean? =  null
}

open class JscConfig {
  var loose: Boolean? =  null
/**
     * Defaults to EsParserConfig
     */
  var parser: ParserConfig? =  null
  var transform: TransformConfig? =  null
  var externalHelpers: Boolean? =  null
  var target: JscTarget? =  null
  var keepClassNames: Boolean? =  null
  var experimental: Any? =  null
  var baseUrl: String? =  null
  var paths: Any? =  null
  var minify: JsMinifyOptions? =  null
  var preserveAllComments: Boolean? =  null
}

/**
 * Options for transform.
 */
open class TransformConfig {
/**
     * Effective only if `syntax` supports ƒ.
     */
  var react: ReactConfig? =  null
  var constModules: ConstModulesConfig? =  null
  var optimizer: OptimizerConfig? =  null
  var legacyDecorator: Boolean? =  null
  var decoratorMetadata: Boolean? =  null
  var treatConstEnumAsEnum: Boolean? =  null
  var useDefineForClassFields: Boolean? =  null
}

open class ReactConfig {
/**
     * Replace the function used when compiling JSX expressions.
     *
     * Defaults to `React.createElement`.
     */
  var pragma: String? =  null
  var pragmaFrag: String? =  null
  var throwIfNamespace: Boolean? =  null
  var development: Boolean? =  null
  var useBuiltins: Boolean? =  null
  var refresh: Boolean? =  null
  var runtime: /* "automatic","classic" */String? =  null
  var importSource: String? =  null
}

/**
 *  - `import { DEBUG } from '@ember/env-flags';`
 *  - `import { FEATURE_A, FEATURE_B } from '@ember/features';`
 *
 * See: https://github.com/swc-project/swc/issues/18#issuecomment-466272558
 */
open class ConstModulesConfig {
  var globals: Any? =  null
}

open class OptimizerConfig {
  var simplify: Boolean? =  null
  var globals: GlobalPassOption? =  null
  var jsonify: Any? =  null
}

/**
 * Options for inline-global pass.
 */
open class GlobalPassOption {
/**
     * Global variables that should be inlined with passed value.
     *
     * e.g. `{ __DEBUG__: true }`
     */
  var vars: Map<String, String>? =  null
/**
     * Names of environment variables that should be inlined with the value of corresponding env during build.
     *
     * Defaults to `["NODE_ENV", "SWC_ENV"]`
     */
  var envs: Array<String>? =  null
/**
     * Replaces typeof calls for passed variables with corresponding value
     *
     * e.g. `{ window: 'object' }`
     */
  var typeofs: Map<String, String>? =  null
}

open class BaseModuleConfig {
/**
     * By default, when using exports with babel a non-enumerable `__esModule`
     * property is exported. In some cases this property is used to determine
     * if the import is the default export or if it contains the default export.
     *
     * In order to prevent the __esModule property from being exported, you
     *  can set the strict option to true.
     *
     * Defaults to `false`.
     */
  var strict: Boolean? =  null
  var strictMode: Boolean? =  null
  var lazy: Union.U2<Boolean, Array<String>>? =  null
  var noInterop: Boolean? =  null
  var importInterop: /* "swc","babel","node","none" */String? =  null
  var exportInteropAnnotation: Boolean? =  null
  var ignoreDynamic: Boolean? =  null
  var allowTopLevelThis: Boolean? =  null
  var preserveImportMeta: Boolean? =  null
}

open class Output {
/**
     * Transformed code
     */
  var code: String? =  null
  var map: String? =  null
}

open class MatchPattern {
}

open class Span {
  var start: Number? =  null
  var end: Number? =  null
  var ctxt: Number? =  null
}

interface Node {
  var type: String? 
}

interface HasSpan {
  var span: Span? 
}

interface HasDecorator {
  var decorators: Array<Decorator>? 
}

open class Class : HasSpan, HasDecorator {
  var body: Array<ClassMember>? =  null
  var superClass: Expression? =  null
  var isAbstract: Boolean? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  var superTypeParams: TsTypeParameterInstantiation? =  null
  var implements: Array<TsExpressionWithTypeArguments>? =  null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

interface ClassPropertyBase : Node, HasSpan, HasDecorator {
  var value: Expression? 
  var typeAnnotation: TsTypeAnnotation? 
  var isStatic: Boolean? 
  var accessibility: Accessibility? 
  var isOptional: Boolean? 
  var isOverride: Boolean? 
  var readonly: Boolean? 
  var definite: Boolean? 
}

open class ClassProperty : ClassPropertyBase {
  override var type: /* "ClassProperty"*/String? = "ClassProperty"
  var key: PropertyName? =  null
  var isAbstract: Boolean? =  null
  var declare: Boolean? =  null
  override var value: Expression?  = null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var isStatic: Boolean?  = null
  override var accessibility: Accessibility?  = null
  override var isOptional: Boolean?  = null
  override var isOverride: Boolean?  = null
  override var readonly: Boolean?  = null
  override var definite: Boolean?  = null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

open class PrivateProperty : ClassPropertyBase {
  override var type: /* "PrivateProperty"*/String? = "PrivateProperty"
  var key: PrivateName? =  null
  override var value: Expression?  = null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var isStatic: Boolean?  = null
  override var accessibility: Accessibility?  = null
  override var isOptional: Boolean?  = null
  override var isOverride: Boolean?  = null
  override var readonly: Boolean?  = null
  override var definite: Boolean?  = null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

open class Param : Node, HasSpan, HasDecorator {
  override var type: /* "Parameter"*/String? = "Parameter"
  var pat: Pattern? =  null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

open class Constructor : Node, HasSpan {
  override var type: /* "Constructor"*/String? = "Constructor"
  var key: PropertyName? =  null
  var params: Array<Any>? =  null
  var body: BlockStatement? =  null
  var accessibility: Accessibility? =  null
  var isOptional: Boolean? =  null
  override var span: Span?  = null
}

interface ClassMethodBase : Node, HasSpan {
  var function: Fn? 
  var kind: MethodKind? 
  var isStatic: Boolean? 
  var accessibility: Accessibility? 
  var isAbstract: Boolean? 
  var isOptional: Boolean? 
  var isOverride: Boolean? 
}

open class ClassMethod : ClassMethodBase {
  override var type: /* "ClassMethod"*/String? = "ClassMethod"
  var key: PropertyName? =  null
  override var function: Fn?  = null
  override var kind: MethodKind?  = null
  override var isStatic: Boolean?  = null
  override var accessibility: Accessibility?  = null
  override var isAbstract: Boolean?  = null
  override var isOptional: Boolean?  = null
  override var isOverride: Boolean?  = null
  override var span: Span?  = null
}

open class PrivateMethod : ClassMethodBase {
  override var type: /* "PrivateMethod"*/String? = "PrivateMethod"
  var key: PrivateName? =  null
  override var function: Fn?  = null
  override var kind: MethodKind?  = null
  override var isStatic: Boolean?  = null
  override var accessibility: Accessibility?  = null
  override var isAbstract: Boolean?  = null
  override var isOptional: Boolean?  = null
  override var isOverride: Boolean?  = null
  override var span: Span?  = null
}

open class StaticBlock : Node, HasSpan {
  override var type: /* "StaticBlock"*/String? = "StaticBlock"
  var body: BlockStatement? =  null
  override var span: Span?  = null
}

open class Decorator : Node, HasSpan {
  override var type: /* "Decorator"*/String? = "Decorator"
  var expression: Expression? =  null
  override var span: Span?  = null
}

open class FunctionDeclaration : Fn {
  var type: /* "FunctionDeclaration"*/String? = "FunctionDeclaration"
  var identifier: Identifier? =  null
  var declare: Boolean? =  null
  override var params: Array<Param>?  = null
  override var body: BlockStatement?  = null
  override var generator: Boolean?  = null
  override var async: Boolean?  = null
  override var typeParameters: TsTypeParameterDeclaration?  = null
  override var returnType: TsTypeAnnotation?  = null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

open class ClassDeclaration : Class(), Node {
  override var type: /* "ClassDeclaration"*/String? = "ClassDeclaration"
  var identifier: Identifier? =  null
  var declare: Boolean? =  null
}

open class VariableDeclaration : Node, HasSpan {
  override var type: /* "VariableDeclaration"*/String? = "VariableDeclaration"
  var kind: VariableDeclarationKind? =  null
  var declare: Boolean? =  null
  var declarations: Array<VariableDeclarator>? =  null
  override var span: Span?  = null
}

open class VariableDeclarator : Node, HasSpan {
  override var type: /* "VariableDeclarator"*/String? = "VariableDeclarator"
  var id: Pattern? =  null
  var init: Expression? =  null
  var definite: Boolean? =  null
  override var span: Span?  = null
}

interface ExpressionBase : Node, HasSpan {
}

open class Identifier : ExpressionBase {
  override var type: /* "Identifier"*/String? = "Identifier"
  var value: String? =  null
  var optional: Boolean? =  null
  override var span: Span?  = null
}

open class OptionalChainingExpression : ExpressionBase {
  override var type: /* "OptionalChainingExpression"*/String? = "OptionalChainingExpression"
  var questionDotToken: Span? =  null
/**
     * Call expression or member expression.
     */
  var base: Union.U2<MemberExpression, OptionalChainingCall>? =  null
  override var span: Span?  = null
}

open class OptionalChainingCall : ExpressionBase {
  override var type: /* "CallExpression"*/String? = "CallExpression"
  var callee: Expression? =  null
  var arguments: Array<ExprOrSpread>? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

open class ThisExpression : ExpressionBase {
  override var type: /* "ThisExpression"*/String? = "ThisExpression"
  override var span: Span?  = null
}

open class ArrayExpression : ExpressionBase {
  override var type: /* "ArrayExpression"*/String? = "ArrayExpression"
  var elements: Array<Any>? =  null
  override var span: Span?  = null
}

open class ExprOrSpread {
  var spread: Span? =  null
  var expression: Expression? =  null
}

open class ObjectExpression : ExpressionBase {
  override var type: /* "ObjectExpression"*/String? = "ObjectExpression"
  var properties: Array<Any>? =  null
  override var span: Span?  = null
}

open class Argument {
  var spread: Span? =  null
  var expression: Expression? =  null
}

open class SpreadElement : Node {
  override var type: /* "SpreadElement"*/String? = "SpreadElement"
  var spread: Span? =  null
  var arguments: Expression? =  null
}

open class UnaryExpression : ExpressionBase {
  override var type: /* "UnaryExpression"*/String? = "UnaryExpression"
  var operator: UnaryOperator? =  null
  var argument: Expression? =  null
  override var span: Span?  = null
}

open class UpdateExpression : ExpressionBase {
  override var type: /* "UpdateExpression"*/String? = "UpdateExpression"
  var operator: UpdateOperator? =  null
  var prefix: Boolean? =  null
  var argument: Expression? =  null
  override var span: Span?  = null
}

open class BinaryExpression : ExpressionBase {
  override var type: /* "BinaryExpression"*/String? = "BinaryExpression"
  var operator: BinaryOperator? =  null
  var left: Expression? =  null
  var right: Expression? =  null
  override var span: Span?  = null
}

open class FunctionExpression : Fn, ExpressionBase {
  override var type: /* "FunctionExpression"*/String? = "FunctionExpression"
  var identifier: Identifier? =  null
  override var params: Array<Param>?  = null
  override var body: BlockStatement?  = null
  override var generator: Boolean?  = null
  override var async: Boolean?  = null
  override var typeParameters: TsTypeParameterDeclaration?  = null
  override var returnType: TsTypeAnnotation?  = null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

open class ClassExpression : Class(), ExpressionBase {
  override var type: /* "ClassExpression"*/String? = "ClassExpression"
  var identifier: Identifier? =  null
  override var span: Span?  = null
}

open class AssignmentExpression : ExpressionBase {
  override var type: /* "AssignmentExpression"*/String? = "AssignmentExpression"
  var operator: AssignmentOperator? =  null
  var left: Union.U2<Expression, Pattern>? =  null
  var right: Expression? =  null
  override var span: Span?  = null
}

open class MemberExpression : ExpressionBase {
  override var type: /* "MemberExpression"*/String? = "MemberExpression"
  var `object`: Expression? =  null
  var property: Union.U3<Identifier, PrivateName, ComputedPropName>? =  null
  override var span: Span?  = null
}

open class SuperPropExpression : ExpressionBase {
  override var type: /* "SuperPropExpression"*/String? = "SuperPropExpression"
  var obj: Super? =  null
  var property: Union.U2<Identifier, ComputedPropName>? =  null
  override var span: Span?  = null
}

open class ConditionalExpression : ExpressionBase {
  override var type: /* "ConditionalExpression"*/String? = "ConditionalExpression"
  var test: Expression? =  null
  var consequent: Expression? =  null
  var alternate: Expression? =  null
  override var span: Span?  = null
}

open class Super : Node, HasSpan {
  override var type: /* "Super"*/String? = "Super"
  override var span: Span?  = null
}

open class Import : Node, HasSpan {
  override var type: /* "Import"*/String? = "Import"
  override var span: Span?  = null
}

open class CallExpression : ExpressionBase {
  override var type: /* "CallExpression"*/String? = "CallExpression"
  var callee: Union.U3<Super, Import, Expression>? =  null
  var arguments: Array<Argument>? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

open class NewExpression : ExpressionBase {
  override var type: /* "NewExpression"*/String? = "NewExpression"
  var callee: Expression? =  null
  var arguments: Array<Argument>? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

open class SequenceExpression : ExpressionBase {
  override var type: /* "SequenceExpression"*/String? = "SequenceExpression"
  var expressions: Array<Expression>? =  null
  override var span: Span?  = null
}

open class ArrowFunctionExpression : ExpressionBase {
  override var type: /* "ArrowFunctionExpression"*/String? = "ArrowFunctionExpression"
  var params: Array<Pattern>? =  null
  var body: Union.U2<BlockStatement, Expression>? =  null
  var async: Boolean? =  null
  var generator: Boolean? =  null
  var typeParameters: TsTypeParameterDeclaration? =  null
  var returnType: TsTypeAnnotation? =  null
  override var span: Span?  = null
}

open class YieldExpression : ExpressionBase {
  override var type: /* "YieldExpression"*/String? = "YieldExpression"
  var argument: Expression? =  null
  var delegate: Boolean? =  null
  override var span: Span?  = null
}

open class MetaProperty : Node, HasSpan {
  override var type: /* "MetaProperty"*/String? = "MetaProperty"
  var kind: /* "new.target","import.meta" */String? =  null
  override var span: Span?  = null
}

open class AwaitExpression : ExpressionBase {
  override var type: /* "AwaitExpression"*/String? = "AwaitExpression"
  var argument: Expression? =  null
  override var span: Span?  = null
}

open class TemplateLiteral : ExpressionBase {
  override var type: /* "TemplateLiteral"*/String? = "TemplateLiteral"
  var expressions: Array<Expression>? =  null
  var quasis: Array<TemplateElement>? =  null
  override var span: Span?  = null
}

open class TaggedTemplateExpression : ExpressionBase {
  override var type: /* "TaggedTemplateExpression"*/String? = "TaggedTemplateExpression"
  var tag: Expression? =  null
  var typeParameters: TsTypeParameterInstantiation? =  null
  var template: TemplateLiteral? =  null
  override var span: Span?  = null
}

open class TemplateElement : ExpressionBase {
  override var type: /* "TemplateElement"*/String? = "TemplateElement"
  var tail: Boolean? =  null
  var cooked: String? =  null
  var raw: String? =  null
  override var span: Span?  = null
}

open class ParenthesisExpression : ExpressionBase {
  override var type: /* "ParenthesisExpression"*/String? = "ParenthesisExpression"
  var expression: Expression? =  null
  override var span: Span?  = null
}

interface Fn : HasSpan, HasDecorator {
  var params: Array<Param>? 
  var body: BlockStatement? 
  var generator: Boolean? 
  var async: Boolean? 
  var typeParameters: TsTypeParameterDeclaration? 
  var returnType: TsTypeAnnotation? 
}

interface PatternBase : Node, HasSpan {
  var typeAnnotation: TsTypeAnnotation? 
}

open class PrivateName : ExpressionBase {
  override var type: /* "PrivateName"*/String? = "PrivateName"
  var id: Identifier? =  null
  override var span: Span?  = null
}

open class JSXMemberExpression : Node {
  override var type: /* "JSXMemberExpression"*/String? = "JSXMemberExpression"
  var `object`: JSXObject? =  null
  var property: Identifier? =  null
}

/**
 * XML-based namespace syntax:
 */
open class JSXNamespacedName : Node {
  override var type: /* "JSXNamespacedName"*/String? = "JSXNamespacedName"
  var namespace: Identifier? =  null
  var name: Identifier? =  null
}

open class JSXEmptyExpression : Node, HasSpan {
  override var type: /* "JSXEmptyExpression"*/String? = "JSXEmptyExpression"
  override var span: Span?  = null
}

open class JSXExpressionContainer : Node, HasSpan {
  override var type: /* "JSXExpressionContainer"*/String? = "JSXExpressionContainer"
  var expression: JSXExpression? =  null
  override var span: Span?  = null
}

open class JSXSpreadChild : Node, HasSpan {
  override var type: /* "JSXSpreadChild"*/String? = "JSXSpreadChild"
  var expression: Expression? =  null
  override var span: Span?  = null
}

open class JSXOpeningElement : Node, HasSpan {
  override var type: /* "JSXOpeningElement"*/String? = "JSXOpeningElement"
  var name: JSXElementName? =  null
  var attributes: Array<JSXAttributeOrSpread>? =  null
  var selfClosing: Boolean? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

open class JSXClosingElement : Node, HasSpan {
  override var type: /* "JSXClosingElement"*/String? = "JSXClosingElement"
  var name: JSXElementName? =  null
  override var span: Span?  = null
}

open class JSXAttribute : Node, HasSpan {
  override var type: /* "JSXAttribute"*/String? = "JSXAttribute"
  var name: JSXAttributeName? =  null
  var value: JSXAttrValue? =  null
  override var span: Span?  = null
}

open class JSXText : Node, HasSpan {
  override var type: /* "JSXText"*/String? = "JSXText"
  var value: String? =  null
  var raw: String? =  null
  override var span: Span?  = null
}

open class JSXElement : Node, HasSpan {
  override var type: /* "JSXElement"*/String? = "JSXElement"
  var opening: JSXOpeningElement? =  null
  var children: Array<JSXElementChild>? =  null
  var closing: JSXClosingElement? =  null
  override var span: Span?  = null
}

open class JSXFragment : Node, HasSpan {
  override var type: /* "JSXFragment"*/String? = "JSXFragment"
  var opening: JSXOpeningFragment? =  null
  var children: Array<JSXElementChild>? =  null
  var closing: JSXClosingFragment? =  null
  override var span: Span?  = null
}

open class JSXOpeningFragment : Node, HasSpan {
  override var type: /* "JSXOpeningFragment"*/String? = "JSXOpeningFragment"
  override var span: Span?  = null
}

open class JSXClosingFragment : Node, HasSpan {
  override var type: /* "JSXClosingFragment"*/String? = "JSXClosingFragment"
  override var span: Span?  = null
}

open class StringLiteral : Node, HasSpan {
  override var type: /* "StringLiteral"*/String? = "StringLiteral"
  var value: String? =  null
  var raw: String? =  null
  override var span: Span?  = null
}

open class BooleanLiteral : Node, HasSpan {
  override var type: /* "BooleanLiteral"*/String? = "BooleanLiteral"
  var value: Boolean? =  null
  override var span: Span?  = null
}

open class NullLiteral : Node, HasSpan {
  override var type: /* "NullLiteral"*/String? = "NullLiteral"
  override var span: Span?  = null
}

open class RegExpLiteral : Node, HasSpan {
  override var type: /* "RegExpLiteral"*/String? = "RegExpLiteral"
  var pattern: String? =  null
  var flags: String? =  null
  override var span: Span?  = null
}

open class NumericLiteral : Node, HasSpan {
  override var type: /* "NumericLiteral"*/String? = "NumericLiteral"
  var value: Number? =  null
  var raw: String? =  null
  override var span: Span?  = null
}

open class BigIntLiteral : Node, HasSpan {
  override var type: /* "BigIntLiteral"*/String? = "BigIntLiteral"
  var value: Any? =  null
  var raw: String? =  null
  override var span: Span?  = null
}

open class ExportDefaultExpression : Node, HasSpan {
  override var type: /* "ExportDefaultExpression"*/String? = "ExportDefaultExpression"
  var expression: Expression? =  null
  override var span: Span?  = null
}

open class ExportDeclaration : Node, HasSpan {
  override var type: /* "ExportDeclaration"*/String? = "ExportDeclaration"
  var declaration: Declaration? =  null
  override var span: Span?  = null
}

open class ImportDeclaration : Node, HasSpan {
  override var type: /* "ImportDeclaration"*/String? = "ImportDeclaration"
  var specifiers: Array<ImportSpecifier>? =  null
  var source: StringLiteral? =  null
  var typeOnly: Boolean? =  null
  var asserts: ObjectExpression? =  null
  override var span: Span?  = null
}

open class ExportAllDeclaration : Node, HasSpan {
  override var type: /* "ExportAllDeclaration"*/String? = "ExportAllDeclaration"
  var source: StringLiteral? =  null
  var asserts: ObjectExpression? =  null
  override var span: Span?  = null
}

/**
 * - `export { foo } from 'mod'`
 * - `export { foo as bar } from 'mod'`
 */
open class ExportNamedDeclaration : Node, HasSpan {
  override var type: /* "ExportNamedDeclaration"*/String? = "ExportNamedDeclaration"
  var specifiers: Array<ExportSpecifier>? =  null
  var source: StringLiteral? =  null
  var typeOnly: Boolean? =  null
  var asserts: ObjectExpression? =  null
  override var span: Span?  = null
}

open class ExportDefaultDeclaration : Node, HasSpan {
  override var type: /* "ExportDefaultDeclaration"*/String? = "ExportDefaultDeclaration"
  var decl: DefaultDecl? =  null
  override var span: Span?  = null
}

/**
 * e.g. `import foo from 'mod.js'`
 */
open class ImportDefaultSpecifier : Node, HasSpan {
  override var type: /* "ImportDefaultSpecifier"*/String? = "ImportDefaultSpecifier"
  var local: Identifier? =  null
  override var span: Span?  = null
}

/**
 * e.g. `import * as foo from 'mod.js'`.
 */
open class ImportNamespaceSpecifier : Node, HasSpan {
  override var type: /* "ImportNamespaceSpecifier"*/String? = "ImportNamespaceSpecifier"
  var local: Identifier? =  null
  override var span: Span?  = null
}

/**
 * e.g. - `import { foo } from 'mod.js'`
 *
 * local = foo, imported = None
 *
 * e.g. `import { foo as bar } from 'mod.js'`
 *
 * local = bar, imported = Some(foo) for
 */
open class NamedImportSpecifier : Node, HasSpan {
  override var type: /* "ImportSpecifier"*/String? = "ImportSpecifier"
  var local: Identifier? =  null
  var imported: ModuleExportName? =  null
  var isTypeOnly: Boolean? =  null
  override var span: Span?  = null
}

/**
 * `export * as foo from 'src';`
 */
open class ExportNamespaceSpecifier : Node, HasSpan {
  override var type: /* "ExportNamespaceSpecifier"*/String? = "ExportNamespaceSpecifier"
  var name: ModuleExportName? =  null
  override var span: Span?  = null
}

open class ExportDefaultSpecifier : Node, HasSpan {
  override var type: /* "ExportDefaultSpecifier"*/String? = "ExportDefaultSpecifier"
  var exported: Identifier? =  null
  override var span: Span?  = null
}

open class NamedExportSpecifier : Node, HasSpan {
  override var type: /* "ExportSpecifier"*/String? = "ExportSpecifier"
  var orig: ModuleExportName? =  null
/**
     * `Some(bar)` in `export { foo as bar }`
     */
  var exported: ModuleExportName? =  null
  var isTypeOnly: Boolean? =  null
  override var span: Span?  = null
}

open class HasInterpreter {
/**
     * e.g. `/usr/bin/node` for `#!/usr/bin/node`
     */
  var interpreter: String? =  null
}

open class Module : Node, HasSpan, HasInterpreter() {
  override var type: /* "Module"*/String? = "Module"
  var body: Array<ModuleItem>? =  null
  override var span: Span?  = null
}

open class Script : Node, HasSpan, HasInterpreter() {
  override var type: /* "Script"*/String? = "Script"
  var body: Array<Statement>? =  null
  override var span: Span?  = null
}

open class BindingIdentifier : PatternBase {
  override var type: /* "Identifier"*/String? = "Identifier"
  var value: String? =  null
  var optional: Boolean? =  null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var span: Span?  = null
}

open class ArrayPattern : PatternBase {
  override var type: /* "ArrayPattern"*/String? = "ArrayPattern"
  var elements: Array<Any>? =  null
  var optional: Boolean? =  null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var span: Span?  = null
}

open class ObjectPattern : PatternBase {
  override var type: /* "ObjectPattern"*/String? = "ObjectPattern"
  var properties: Array<ObjectPatternProperty>? =  null
  var optional: Boolean? =  null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var span: Span?  = null
}

open class AssignmentPattern : PatternBase {
  override var type: /* "AssignmentPattern"*/String? = "AssignmentPattern"
  var left: Pattern? =  null
  var right: Expression? =  null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var span: Span?  = null
}

open class RestElement : PatternBase {
  override var type: /* "RestElement"*/String? = "RestElement"
  var rest: Span? =  null
  var argument: Pattern? =  null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var span: Span?  = null
}

/**
 * `{key: value}`
 */
open class KeyValuePatternProperty : Node {
  override var type: /* "KeyValuePatternProperty"*/String? = "KeyValuePatternProperty"
  var key: PropertyName? =  null
  var value: Pattern? =  null
}

/**
 * `{key}` or `{key = value}`
 */
open class AssignmentPatternProperty : Node, HasSpan {
  override var type: /* "AssignmentPatternProperty"*/String? = "AssignmentPatternProperty"
  var key: Identifier? =  null
  var value: Expression? =  null
  override var span: Span?  = null
}

interface PropBase : Node {
  var key: PropertyName? 
}

open class KeyValueProperty : PropBase {
  override var type: /* "KeyValueProperty"*/String? = "KeyValueProperty"
  var value: Expression? =  null
  override var key: PropertyName?  = null
}

open class AssignmentProperty : Node {
  override var type: /* "AssignmentProperty"*/String? = "AssignmentProperty"
  var key: Identifier? =  null
  var value: Expression? =  null
}

open class GetterProperty : PropBase, HasSpan {
  override var type: /* "GetterProperty"*/String? = "GetterProperty"
  var typeAnnotation: TsTypeAnnotation? =  null
  var body: BlockStatement? =  null
  override var key: PropertyName?  = null
  override var span: Span?  = null
}

open class SetterProperty : PropBase, HasSpan {
  override var type: /* "SetterProperty"*/String? = "SetterProperty"
  var param: Pattern? =  null
  var body: BlockStatement? =  null
  override var key: PropertyName?  = null
  override var span: Span?  = null
}

open class MethodProperty : PropBase, Fn {
  override var type: /* "MethodProperty"*/String? = "MethodProperty"
  override var key: PropertyName?  = null
  override var params: Array<Param>?  = null
  override var body: BlockStatement?  = null
  override var generator: Boolean?  = null
  override var async: Boolean?  = null
  override var typeParameters: TsTypeParameterDeclaration?  = null
  override var returnType: TsTypeAnnotation?  = null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

open class ComputedPropName : Node, HasSpan {
  override var type: /* "Computed"*/String? = "Computed"
  var expression: Expression? =  null
  override var span: Span?  = null
}

open class BlockStatement : Node, HasSpan {
  override var type: /* "BlockStatement"*/String? = "BlockStatement"
  var stmts: Array<Statement>? =  null
  override var span: Span?  = null
}

open class ExpressionStatement : Node, HasSpan {
  override var type: /* "ExpressionStatement"*/String? = "ExpressionStatement"
  var expression: Expression? =  null
  override var span: Span?  = null
}

open class EmptyStatement : Node, HasSpan {
  override var type: /* "EmptyStatement"*/String? = "EmptyStatement"
  override var span: Span?  = null
}

open class DebuggerStatement : Node, HasSpan {
  override var type: /* "DebuggerStatement"*/String? = "DebuggerStatement"
  override var span: Span?  = null
}

open class WithStatement : Node, HasSpan {
  override var type: /* "WithStatement"*/String? = "WithStatement"
  var `object`: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

open class ReturnStatement : Node, HasSpan {
  override var type: /* "ReturnStatement"*/String? = "ReturnStatement"
  var argument: Expression? =  null
  override var span: Span?  = null
}

open class LabeledStatement : Node, HasSpan {
  override var type: /* "LabeledStatement"*/String? = "LabeledStatement"
  var label: Identifier? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

open class BreakStatement : Node, HasSpan {
  override var type: /* "BreakStatement"*/String? = "BreakStatement"
  var label: Identifier? =  null
  override var span: Span?  = null
}

open class ContinueStatement : Node, HasSpan {
  override var type: /* "ContinueStatement"*/String? = "ContinueStatement"
  var label: Identifier? =  null
  override var span: Span?  = null
}

open class IfStatement : Node, HasSpan {
  override var type: /* "IfStatement"*/String? = "IfStatement"
  var test: Expression? =  null
  var consequent: Statement? =  null
  var alternate: Statement? =  null
  override var span: Span?  = null
}

open class SwitchStatement : Node, HasSpan {
  override var type: /* "SwitchStatement"*/String? = "SwitchStatement"
  var discriminant: Expression? =  null
  var cases: Array<SwitchCase>? =  null
  override var span: Span?  = null
}

open class ThrowStatement : Node, HasSpan {
  override var type: /* "ThrowStatement"*/String? = "ThrowStatement"
  var argument: Expression? =  null
  override var span: Span?  = null
}

open class TryStatement : Node, HasSpan {
  override var type: /* "TryStatement"*/String? = "TryStatement"
  var block: BlockStatement? =  null
  var handler: CatchClause? =  null
  var finalizer: BlockStatement? =  null
  override var span: Span?  = null
}

open class WhileStatement : Node, HasSpan {
  override var type: /* "WhileStatement"*/String? = "WhileStatement"
  var test: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

open class DoWhileStatement : Node, HasSpan {
  override var type: /* "DoWhileStatement"*/String? = "DoWhileStatement"
  var test: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

open class ForStatement : Node, HasSpan {
  override var type: /* "ForStatement"*/String? = "ForStatement"
  var init: Union.U2<VariableDeclaration, Expression>? =  null
  var test: Expression? =  null
  var update: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

open class ForInStatement : Node, HasSpan {
  override var type: /* "ForInStatement"*/String? = "ForInStatement"
  var left: Union.U2<VariableDeclaration, Pattern>? =  null
  var right: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

open class ForOfStatement : Node, HasSpan {
  override var type: /* "ForOfStatement"*/String? = "ForOfStatement"
/**
     *  Span of the await token.
     *
     *  es2018 for-await-of statements, e.g., `for await (const x of xs) {`
     */
  var await: Span? =  null
  var left: Union.U2<VariableDeclaration, Pattern>? =  null
  var right: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

open class SwitchCase : Node, HasSpan {
  override var type: /* "SwitchCase"*/String? = "SwitchCase"
/**
     * Undefined for default case
     */
  var test: Expression? =  null
  var consequent: Array<Statement>? =  null
  override var span: Span?  = null
}

open class CatchClause : Node, HasSpan {
  override var type: /* "CatchClause"*/String? = "CatchClause"
/**
     * The param is `undefined` if the catch binding is omitted. E.g., `try { foo() } catch {}`
     */
  var param: Pattern? =  null
  var body: BlockStatement? =  null
  override var span: Span?  = null
}

open class TsTypeAnnotation : Node, HasSpan {
  override var type: /* "TsTypeAnnotation"*/String? = "TsTypeAnnotation"
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

open class TsTypeParameterDeclaration : Node, HasSpan {
  override var type: /* "TsTypeParameterDeclaration"*/String? = "TsTypeParameterDeclaration"
  var parameters: Array<TsTypeParameter>? =  null
  override var span: Span?  = null
}

open class TsTypeParameter : Node, HasSpan {
  override var type: /* "TsTypeParameter"*/String? = "TsTypeParameter"
  var name: Identifier? =  null
  var `in`: Boolean? =  null
  var out: Boolean? =  null
  var constraint: TsType? =  null
  var default: TsType? =  null
  override var span: Span?  = null
}

open class TsTypeParameterInstantiation : Node, HasSpan {
  override var type: /* "TsTypeParameterInstantiation"*/String? = "TsTypeParameterInstantiation"
  var params: Array<TsType>? =  null
  override var span: Span?  = null
}

open class TsParameterProperty : Node, HasSpan, HasDecorator {
  override var type: /* "TsParameterProperty"*/String? = "TsParameterProperty"
  var accessibility: Accessibility? =  null
  var override: Boolean? =  null
  var readonly: Boolean? =  null
  var param: TsParameterPropertyParameter? =  null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

open class TsQualifiedName : Node {
  override var type: /* "TsQualifiedName"*/String? = "TsQualifiedName"
  var left: TsEntityName? =  null
  var right: Identifier? =  null
}

open class TsCallSignatureDeclaration : Node, HasSpan {
  override var type: /* "TsCallSignatureDeclaration"*/String? = "TsCallSignatureDeclaration"
  var params: Array<TsFnParameter>? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  override var span: Span?  = null
}

open class TsConstructSignatureDeclaration : Node, HasSpan {
  override var type: /* "TsConstructSignatureDeclaration"*/String? = "TsConstructSignatureDeclaration"
  var params: Array<TsFnParameter>? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  override var span: Span?  = null
}

open class TsPropertySignature : Node, HasSpan {
  override var type: /* "TsPropertySignature"*/String? = "TsPropertySignature"
  var readonly: Boolean? =  null
  var key: Expression? =  null
  var computed: Boolean? =  null
  var optional: Boolean? =  null
  var init: Expression? =  null
  var params: Array<TsFnParameter>? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  override var span: Span?  = null
}

open class TsGetterSignature : Node, HasSpan {
  override var type: /* "TsGetterSignature"*/String? = "TsGetterSignature"
  var readonly: Boolean? =  null
  var key: Expression? =  null
  var computed: Boolean? =  null
  var optional: Boolean? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  override var span: Span?  = null
}

open class TsSetterSignature : Node, HasSpan {
  override var type: /* "TsSetterSignature"*/String? = "TsSetterSignature"
  var readonly: Boolean? =  null
  var key: Expression? =  null
  var computed: Boolean? =  null
  var optional: Boolean? =  null
  var param: TsFnParameter? =  null
  override var span: Span?  = null
}

open class TsMethodSignature : Node, HasSpan {
  override var type: /* "TsMethodSignature"*/String? = "TsMethodSignature"
  var readonly: Boolean? =  null
  var key: Expression? =  null
  var computed: Boolean? =  null
  var optional: Boolean? =  null
  var params: Array<TsFnParameter>? =  null
  var typeAnn: TsTypeAnnotation? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  override var span: Span?  = null
}

open class TsIndexSignature : Node, HasSpan {
  override var type: /* "TsIndexSignature"*/String? = "TsIndexSignature"
  var params: Array<TsFnParameter>? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  var readonly: Boolean? =  null
  var static: Boolean? =  null
  override var span: Span?  = null
}

open class TsKeywordType : Node, HasSpan {
  override var type: /* "TsKeywordType"*/String? = "TsKeywordType"
  var kind: TsKeywordTypeKind? =  null
  override var span: Span?  = null
}

open class TsThisType : Node, HasSpan {
  override var type: /* "TsThisType"*/String? = "TsThisType"
  override var span: Span?  = null
}

open class TsFunctionType : Node, HasSpan {
  override var type: /* "TsFunctionType"*/String? = "TsFunctionType"
  var params: Array<TsFnParameter>? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  override var span: Span?  = null
}

open class TsConstructorType : Node, HasSpan {
  override var type: /* "TsConstructorType"*/String? = "TsConstructorType"
  var params: Array<TsFnParameter>? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  var isAbstract: Boolean? =  null
  override var span: Span?  = null
}

open class TsTypeReference : Node, HasSpan {
  override var type: /* "TsTypeReference"*/String? = "TsTypeReference"
  var typeName: TsEntityName? =  null
  var typeParams: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

open class TsTypePredicate : Node, HasSpan {
  override var type: /* "TsTypePredicate"*/String? = "TsTypePredicate"
  var asserts: Boolean? =  null
  var paramName: TsThisTypeOrIdent? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  override var span: Span?  = null
}

open class TsImportType : Node, HasSpan {
  override var type: /* "TsImportType"*/String? = "TsImportType"
  var argument: StringLiteral? =  null
  var qualifier: TsEntityName? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

/**
 * `typeof` operator
 */
open class TsTypeQuery : Node, HasSpan {
  override var type: /* "TsTypeQuery"*/String? = "TsTypeQuery"
  var exprName: TsTypeQueryExpr? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

open class TsTypeLiteral : Node, HasSpan {
  override var type: /* "TsTypeLiteral"*/String? = "TsTypeLiteral"
  var members: Array<TsTypeElement>? =  null
  override var span: Span?  = null
}

open class TsArrayType : Node, HasSpan {
  override var type: /* "TsArrayType"*/String? = "TsArrayType"
  var elemType: TsType? =  null
  override var span: Span?  = null
}

open class TsTupleType : Node, HasSpan {
  override var type: /* "TsTupleType"*/String? = "TsTupleType"
  var elemTypes: Array<TsTupleElement>? =  null
  override var span: Span?  = null
}

open class TsTupleElement : Node, HasSpan {
  override var type: /* "TsTupleElement"*/String? = "TsTupleElement"
  var label: Pattern? =  null
  var ty: TsType? =  null
  override var span: Span?  = null
}

open class TsOptionalType : Node, HasSpan {
  override var type: /* "TsOptionalType"*/String? = "TsOptionalType"
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

open class TsRestType : Node, HasSpan {
  override var type: /* "TsRestType"*/String? = "TsRestType"
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

open class TsUnionType : Node, HasSpan {
  override var type: /* "TsUnionType"*/String? = "TsUnionType"
  var types: Array<TsType>? =  null
  override var span: Span?  = null
}

open class TsIntersectionType : Node, HasSpan {
  override var type: /* "TsIntersectionType"*/String? = "TsIntersectionType"
  var types: Array<TsType>? =  null
  override var span: Span?  = null
}

open class TsConditionalType : Node, HasSpan {
  override var type: /* "TsConditionalType"*/String? = "TsConditionalType"
  var checkType: TsType? =  null
  var extendsType: TsType? =  null
  var trueType: TsType? =  null
  var falseType: TsType? =  null
  override var span: Span?  = null
}

open class TsInferType : Node, HasSpan {
  override var type: /* "TsInferType"*/String? = "TsInferType"
  var typeParam: TsTypeParameter? =  null
  override var span: Span?  = null
}

open class TsParenthesizedType : Node, HasSpan {
  override var type: /* "TsParenthesizedType"*/String? = "TsParenthesizedType"
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

open class TsTypeOperator : Node, HasSpan {
  override var type: /* "TsTypeOperator"*/String? = "TsTypeOperator"
  var op: TsTypeOperatorOp? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

open class TsIndexedAccessType : Node, HasSpan {
  override var type: /* "TsIndexedAccessType"*/String? = "TsIndexedAccessType"
  var readonly: Boolean? =  null
  var objectType: TsType? =  null
  var indexType: TsType? =  null
  override var span: Span?  = null
}

open class TsMappedType : Node, HasSpan {
  override var type: /* "TsMappedType"*/String? = "TsMappedType"
  var readonly: TruePlusMinus? =  null
  var typeParam: TsTypeParameter? =  null
  var nameType: TsType? =  null
  var optional: TruePlusMinus? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

open class TsLiteralType : Node, HasSpan {
  override var type: /* "TsLiteralType"*/String? = "TsLiteralType"
  var literal: TsLiteral? =  null
  override var span: Span?  = null
}

open class TsTemplateLiteralType : Node, HasSpan {
  override var type: /* "TemplateLiteral"*/String? = "TemplateLiteral"
  var types: Array<TsType>? =  null
  var quasis: Array<TemplateElement>? =  null
  override var span: Span?  = null
}

open class TsInterfaceDeclaration : Node, HasSpan {
  override var type: /* "TsInterfaceDeclaration"*/String? = "TsInterfaceDeclaration"
  var id: Identifier? =  null
  var declare: Boolean? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  var extends: Array<TsExpressionWithTypeArguments>? =  null
  var body: TsInterfaceBody? =  null
  override var span: Span?  = null
}

open class TsInterfaceBody : Node, HasSpan {
  override var type: /* "TsInterfaceBody"*/String? = "TsInterfaceBody"
  var body: Array<TsTypeElement>? =  null
  override var span: Span?  = null
}

open class TsExpressionWithTypeArguments : Node, HasSpan {
  override var type: /* "TsExpressionWithTypeArguments"*/String? = "TsExpressionWithTypeArguments"
  var expression: Expression? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

open class TsTypeAliasDeclaration : Node, HasSpan {
  override var type: /* "TsTypeAliasDeclaration"*/String? = "TsTypeAliasDeclaration"
  var declare: Boolean? =  null
  var id: Identifier? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

open class TsEnumDeclaration : Node, HasSpan {
  override var type: /* "TsEnumDeclaration"*/String? = "TsEnumDeclaration"
  var declare: Boolean? =  null
  var isConst: Boolean? =  null
  var id: Identifier? =  null
  var members: Array<TsEnumMember>? =  null
  override var span: Span?  = null
}

open class TsEnumMember : Node, HasSpan {
  override var type: /* "TsEnumMember"*/String? = "TsEnumMember"
  var id: TsEnumMemberId? =  null
  var init: Expression? =  null
  override var span: Span?  = null
}

open class TsModuleDeclaration : Node, HasSpan {
  override var type: /* "TsModuleDeclaration"*/String? = "TsModuleDeclaration"
  var declare: Boolean? =  null
  var global: Boolean? =  null
  var id: TsModuleName? =  null
  var body: TsNamespaceBody? =  null
  override var span: Span?  = null
}

open class TsModuleBlock : Node, HasSpan {
  override var type: /* "TsModuleBlock"*/String? = "TsModuleBlock"
  var body: Array<ModuleItem>? =  null
  override var span: Span?  = null
}

open class TsNamespaceDeclaration : Node, HasSpan {
  override var type: /* "TsNamespaceDeclaration"*/String? = "TsNamespaceDeclaration"
  var declare: Boolean? =  null
  var global: Boolean? =  null
  var id: Identifier? =  null
  var body: TsNamespaceBody? =  null
  override var span: Span?  = null
}

open class TsImportEqualsDeclaration : Node, HasSpan {
  override var type: /* "TsImportEqualsDeclaration"*/String? = "TsImportEqualsDeclaration"
  var declare: Boolean? =  null
  var isExport: Boolean? =  null
  var isTypeOnly: Boolean? =  null
  var id: Identifier? =  null
  var moduleRef: TsModuleReference? =  null
  override var span: Span?  = null
}

open class TsExternalModuleReference : Node, HasSpan {
  override var type: /* "TsExternalModuleReference"*/String? = "TsExternalModuleReference"
  var expression: StringLiteral? =  null
  override var span: Span?  = null
}

open class TsExportAssignment : Node, HasSpan {
  override var type: /* "TsExportAssignment"*/String? = "TsExportAssignment"
  var expression: Expression? =  null
  override var span: Span?  = null
}

open class TsNamespaceExportDeclaration : Node, HasSpan {
  override var type: /* "TsNamespaceExportDeclaration"*/String? = "TsNamespaceExportDeclaration"
  var id: Identifier? =  null
  override var span: Span?  = null
}

open class TsAsExpression : ExpressionBase {
  override var type: /* "TsAsExpression"*/String? = "TsAsExpression"
  var expression: Expression? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

open class TsSatisfiesExpression : ExpressionBase {
  override var type: /* "TsSatisfiesExpression"*/String? = "TsSatisfiesExpression"
  var expression: Expression? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

open class TsInstantiation : Node, HasSpan {
  override var type: /* "TsInstantiation"*/String? = "TsInstantiation"
  var expression: Expression? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

open class TsTypeAssertion : ExpressionBase {
  override var type: /* "TsTypeAssertion"*/String? = "TsTypeAssertion"
  var expression: Expression? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

open class TsConstAssertion : ExpressionBase {
  override var type: /* "TsConstAssertion"*/String? = "TsConstAssertion"
  var expression: Expression? =  null
  override var span: Span?  = null
}

open class TsNonNullExpression : ExpressionBase {
  override var type: /* "TsNonNullExpression"*/String? = "TsNonNullExpression"
  var expression: Expression? =  null
  override var span: Span?  = null
}

open class Invalid : Node, HasSpan {
  override var type: /* "Invalid"*/String? = "Invalid"
  override var span: Span?  = null
}
