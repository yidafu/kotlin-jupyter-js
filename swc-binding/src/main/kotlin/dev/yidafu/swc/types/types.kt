package dev.yidafu.swc.types

import kotlinx.serialization.*
import kotlinx.serialization.json.JsonClassDiscriminator

@SwcDslMarker

annotation class SwcDslMarker

typealias Record<T, S> = Map<T, String>

typealias TerserEcmaVersion = Union.U2<Int, String>

typealias TruePlusMinus = Union.U2<Int, String>

@SwcDslMarker
@Serializable
@SerialName("ExperimentalLiteral")
class ExperimentalLiteral {
    var optimizeHygiene: Boolean? = null
    var keepImportAttributes: Boolean? = null
    var emitAssertForImportAttributes: Boolean? = null
    var cacheRoot: String? = null
    var plugins: Array<Union.U2<String, Record<String, Any>>>? = null
    var disableBuiltinTransformsForInternalTesting: Boolean? = null
}

@SwcDslMarker
@Serializable
@SerialName("JsonifyLiteral")
class JsonifyLiteral {
    var minCost: Int? = null
}

@SwcDslMarker
@Serializable
open class ParseOptions : ParserConfig(), BaseParseOptions {
//    override var comments: Boolean? = null
//    override var script: Boolean? = null

    /**
     * [JscTarget]
     */
//    override var target: String? = null
}

/**
 * subtypes: [BaseParseOptions]
 */
@Serializable
open class ParserConfig : BaseParseOptions {
    override var comments: Boolean? = null
    override var script: Boolean? = null

    /**
     * [JscTarget]
     */
    override var target: String? = null
}

/**
 * Programmatic options.
 */
@Serializable
open class Options : Config() {
    var script: Boolean? = null
    var cwd: String? = null
    var caller: CallerOptions? = null
    var filename: String? = null
    var root: String? = null
    var rootMode: String? = null
    var envName: String? = null
    var configFile: Union.U2<String, Boolean>? = null
    var swcrc: Boolean? = null
    var swcrcRoots: Union.U3<Boolean, MatchPattern, Array<MatchPattern>>? = null
    var inputSourceMap: Union.U2<Boolean, String>? = null
    var sourceFileName: String? = null
    var sourceRoot: String? = null
    var plugin: Plugin? = null
    var isModule: Union.U2<Boolean, /**
         *literal is: "unknown"
         */String>? = null
    var outputPath: String? = null
}

/**
 * .swcrc
 */
@Serializable
open class Config {
    var test: Union.U2<String, Array<String>>? = null
    var exclude: Union.U2<String, Array<String>>? = null
    var env: EnvConfig? = null
    var jsc: JscConfig? = null
    var module: ModuleConfig? = null
    var minify: Boolean? = null
    var sourceMaps: Union.U2<Boolean, /**
         *literal is: "inline"
         */String>? = null
    var inlineSourcesContent: Boolean? = null
}

@Serializable
open class JscConfig {
    var loose: Boolean? = null
    var parser: TsParserConfig? = null
    var transform: TransformConfig? = null
    var externalHelpers: Boolean? = null
    var target: String? = null
    var keepClassNames: Boolean? = null
    var experimental: ExperimentalLiteral? = null
    var baseUrl: String? = null
    var paths: Map<String, Array<String>>? = null
    var minify: JsMinifyOptions? = null
    var preserveAllComments: Boolean? = null
}

@Serializable
open class TsParserConfig : ParserConfig() {
    // conflict with @SerialName
    var syntax: String? = "typescript"
    var tsx: Boolean? = null
    var decorators: Boolean? = null
    var dynamicImport: Boolean? = null
}

open class EsParserConfig : ParserConfig() {
    // conflict with @SerialName
    var syntax: String? = "ecmascript"
    var jsx: Boolean? = null
    var numericSeparator: Boolean? = null
    var classPrivateProperty: Boolean? = null
    var privateMethod: Boolean? = null
    var classProperty: Boolean? = null
    var functionBind: Boolean? = null
    var decorators: Boolean? = null
    var decoratorsBeforeExport: Boolean? = null
    var exportDefaultFrom: Boolean? = null
    var exportNamespaceFrom: Boolean? = null
    var dynamicImport: Boolean? = null
    var nullishCoalescing: Boolean? = null
    var optionalChaining: Boolean? = null
    var importMeta: Boolean? = null
    var topLevelAwait: Boolean? = null
    var importAssertions: Boolean? = null
}

open class BaseModuleConfig {
    var strict: Boolean? = null
    var strictMode: Boolean? = null
    var lazy: Union.U2<Boolean, Array<String>>? = null
    var noInterop: Boolean? = null
    var importInterop: String? = null
    var exportInteropAnnotation: Boolean? = null
    var ignoreDynamic: Boolean? = null
    var allowTopLevelThis: Boolean? = null
    var preserveImportMeta: Boolean? = null
}

open class Es6Config : BaseModuleConfig(), ModuleConfig {
    // conflict with @SerialName
    //   var type : String? = null
}

open class NodeNextConfig : BaseModuleConfig(), ModuleConfig {
    // conflict with @SerialName
    //   var type : String? = null
}

open class CommonJsConfig : BaseModuleConfig(), ModuleConfig {
    // conflict with @SerialName
    //   var type : String? = null
}

open class UmdConfig : BaseModuleConfig(), ModuleConfig {
    // conflict with @SerialName
    //   var type : String? = null
    var globals: Map<String, String>? = null
}

open class AmdConfig : BaseModuleConfig(), ModuleConfig {
    // conflict with @SerialName
    //   var type : String? = null
    var moduleId: String? = null
}

/**
 * "es3" | "es5" | "es2015" | "es2016" | "es2017" | "es2018" | "es2019" | "es2020" | "es2021" | "es2022" | "esnext"
 */
object JscTarget {
    var ES3 = "es3"
    var ES5 = "es5"
    var ES2015 = "es2015"
    var ES2016 = "es2016"
    var ES2017 = "es2017"
    var ES2018 = "es2018"
    var ES2019 = "es2019"
    var ES2020 = "es2020"
    var ES2021 = "es2021"
    var ES2022 = "es2022"
    var ESNEXT = "esnext"
}

/**
 * "method" | "getter" | "setter"
 */
object MethodKind {
    var METHOD = "method"
    var GETTER = "getter"
    var SETTER = "setter"
}

/**
 * "var" | "let" | "const"
 */
object VariableDeclarationKind {
    var VAR = "var"
    var LET = "let"
    var CONST = "const"
}

/**
 * "==" | "!=" | "===" | "!==" | "<" | "<=" | ">" | ">=" | "<<" | ">>" | ">>>" | "+" | "-" | "*" | "/" | "%" | "|" | "^" | "&" | "||" | "&&" | "in" | "instanceof" | "**" | "??"
 */
object BinaryOperator {
    var Equality = "=="
    var Inequality = "!="
    var StrictEquality = "==="
    var StrictInequality = "!=="
    var LessThan = "<"
    var LessThanOrEqual = "<="
    var GreaterThan = ">"
    var GreaterThanOrEqual = ">="
    var LeftShift = "<<"
    var RightShift = ">>"
    var UnsignedRightShift = ">>>"
    var UnaryPlus = "+"
    var UnaryNegation = "-"
    var Multiplication = "*"
    var Division = "/"
    var Remainder = "%"
    var BitwiseOR = "|"
    var BitwiseXOR = "^"
    var BitwiseAND = "&"
    var LogicalOR = "||"
    var LogicalAND = "&&"
    var IN = "in"
    var INSTANCEOF = "instanceof"
    var Exponentiation = "**"
    var NullishCoalescingOperator = "??"
}

/**
 * "=" | "+=" | "-=" | "*=" | "/=" | "%=" | "<<=" | ">>=" | ">>>=" | "|=" | "^=" | "&=" | "**=" | "&&=" | "||=" | "??="
 */
object AssignmentOperator {
    var Assignment = "="
    var AdditionAssignment = "+="
    var SubtractionAssignment = "-="
    var MultiplicationAssignment = "*="
    var DivisionAssignment = "/="
    var RemainderAssignment = "%="
    var LeftShiftAssignment = "<<="
    var RightShiftAssignment = ">>="
    var UnsignedRightShiftAssignment = ">>>="
    var BitwiseORAssignment = "|="
    var BitwiseXORAssignment = "^="
    var BitwiseANDAssignment = "&="
    var ExponentiationAssignment = "**="
    var LogicalANDAssignment = "&&="
    var LogicalORAssignment = "||="
    var NullishCoalescingAssignment = "??="
}

/**
 * "++" | "--"
 */
object UpdateOperator {
    var Increment = "++"
    var Decrement = "--"
}

/**
 * "-" | "+" | "!" | "~" | "typeof" | "void" | "delete"
 */
object UnaryOperator {
    var UnaryNegation = "-"
    var UnaryPlus = "+"
    var LogicalNOT = "!"
    var BitwiseNOT = "~"
    var TYPEOF = "typeof"
    var VOID = "void"
    var DELETE = "delete"
}

/**
 * "any" | "unknown" | "number" | "object" | "boolean" | "bigint" | "string" | "symbol" | "void" | "undefined" | "null" | "never" | "intrinsic"
 */
object TsKeywordTypeKind {
    var ANY = "any"
    var UNKNOWN = "unknown"
    var NUMBER = "number"
    var OBJECT = "object"
    var BOOLEAN = "boolean"
    var BIGINT = "bigint"
    var STRING = "string"
    var SYMBOL = "symbol"
    var VOID = "void"
    var UNDEFINED = "undefined"
    var NULL = "null"
    var NEVER = "never"
    var INTRINSIC = "intrinsic"
}

/**
 * "keyof" | "unique" | "readonly"
 */
object TsTypeOperatorOp {
    var KEYOF = "keyof"
    var UNIQUE = "unique"
    var READONLY = "readonly"
}

/**
 * "public" | "protected" | "private"
 */
object Accessibility {
    var PUBLIC = "public"
    var PROTECTED = "protected"
    var PRIVATE = "private"
}

@SwcDslMarker
@Serializable
sealed interface BaseParseOptions {
    var comments: Boolean?
    var script: Boolean?
    var target: /**
     * [JscTarget]
     */String?
}

@SwcDslMarker
@Serializable
sealed interface ModuleConfig

@SwcDslMarker
@Serializable
sealed interface ClassMember

/**
 * subtypes: [Statement]
 */
interface Declaration : Statement

/**
 * subtypes: [JSXExpression], [Pattern]
 */
interface Expression : JSXExpression, Pattern

@SwcDslMarker
@Serializable
sealed interface JSXObject

@SwcDslMarker
@Serializable
sealed interface JSXExpression

@SwcDslMarker
@Serializable
sealed interface JSXElementName

@SwcDslMarker
@Serializable
sealed interface JSXAttributeOrSpread

@SwcDslMarker
@Serializable
sealed interface JSXAttributeName

@SwcDslMarker
@Serializable
sealed interface JSXAttrValue

@SwcDslMarker
@Serializable
sealed interface JSXElementChild

/**
 * subtypes: [Expression], [JSXAttrValue]
 */
interface Literal : Expression, JSXAttrValue

/**
 * subtypes: [ModuleItem]
 */
interface ModuleDeclaration : ModuleItem

@SwcDslMarker
@Serializable
sealed interface DefaultDecl

@SwcDslMarker
@Serializable
sealed interface ImportSpecifier

@SwcDslMarker
@Serializable
sealed interface ModuleExportName

@SwcDslMarker
@Serializable
sealed interface ExportSpecifier

@SwcDslMarker
@Serializable
sealed interface Program

@SwcDslMarker
@Serializable
sealed interface ModuleItem

@SwcDslMarker
@Serializable
sealed interface Pattern

@SwcDslMarker
@Serializable
sealed interface ObjectPatternProperty

@SwcDslMarker
@Serializable
sealed interface Property

@SwcDslMarker
@Serializable
sealed interface PropertyName

/**
 * subtypes: [ModuleItem]
 */
interface Statement : ModuleItem

@SwcDslMarker
@Serializable
sealed interface TsParameterPropertyParameter

/**
 * subtypes: [TsTypeQueryExpr], [TsModuleReference]
 */
interface TsEntityName : TsTypeQueryExpr, TsModuleReference

@SwcDslMarker
@Serializable
sealed interface TsTypeElement

@SwcDslMarker
@Serializable
sealed interface TsType

/**
 * subtypes: [TsType]
 */
interface TsFnOrConstructorType : TsType

@SwcDslMarker
@Serializable
sealed interface TsFnParameter

@SwcDslMarker
@Serializable
sealed interface TsThisTypeOrIdent

@SwcDslMarker
@Serializable
sealed interface TsTypeQueryExpr

/**
 * subtypes: [TsType]
 */
interface TsUnionOrIntersectionType : TsType

@SwcDslMarker
@Serializable
sealed interface TsLiteral

@SwcDslMarker
@Serializable
sealed interface TsEnumMemberId

@SwcDslMarker
@Serializable
sealed interface TsNamespaceBody

@SwcDslMarker
@Serializable
sealed interface TsModuleName

@SwcDslMarker
@Serializable
sealed interface TsModuleReference

interface Plugin

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Plugin")
class PluginImpl : Plugin

interface JsMinifyOptions {
    var compress: Union.U2<TerserCompressOptions, Boolean>?
    var format: JsFormatOptions?
    var mangle: Union.U2<TerserMangleOptions, Boolean>?
    var ecma: TerserEcmaVersion?
    var keep_classnames: Boolean?
    var keep_fnames: Boolean?
    var module: Boolean?
    var safari10: Boolean?
    var toplevel: Union.U2<String, Boolean>?
    var sourceMap: Boolean?
    var outputPath: String?
    var inlineSourcesContent: Boolean?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JsMinifyOptions")
class JsMinifyOptionsImpl : JsMinifyOptions {
    override var compress: Union.U2<TerserCompressOptions, Boolean>? = null
    override var format: JsFormatOptions? = null
    override var mangle: Union.U2<TerserMangleOptions, Boolean>? = null
    override var ecma: TerserEcmaVersion? = null
    override var keep_classnames: Boolean? = null
    override var keep_fnames: Boolean? = null
    override var module: Boolean? = null
    override var safari10: Boolean? = null
    override var toplevel: Union.U2<String, Boolean>? = null
    override var sourceMap: Boolean? = null
    override var outputPath: String? = null
    override var inlineSourcesContent: Boolean? = null
}

/**
 * These properties are mostly not implemented yet,
 * but it exists to support passing terser config to swc minify
 * without modification.
 */
interface JsFormatOptions {
/**
     * Currently noop.
     * @default false
     * @alias ascii_only
     */
    var asciiOnly: Boolean?

/**
     * Currently noop.
     * @default false
     */
    var beautify: Boolean?

/**
     * Currently noop.
     * @default false
     */
    var braces: Boolean?

/**
     * - `false`: removes all comments
     * - `'some'`: preserves some comments
     * - `'all'`: preserves all comments
     * @default false
     */
    var comments: String?

/**
     * Currently noop.
     * @default 5
     */
    var ecma: TerserEcmaVersion?

/**
     * Currently noop.
     * @alias indent_level
     */
    var indentLevel: Int?

/**
     * Currently noop.
     * @alias indent_start
     */
    var indentStart: Int?

/**
     * Currently noop.
     * @alias inline_script
     */
    var inlineScript: Int?

/**
     * Currently noop.
     * @alias keep_numbers
     */
    var keepNumbers: Int?

/**
     * Currently noop.
     * @alias keep_quoted_props
     */
    var keepQuotedProps: Boolean?

/**
     * Currently noop.
     * @alias max_line_len
     */
    var maxLineLen: Union.U2<Int, /**
         *literal is: false
         */Int>?

/**
     * Currently noop.
     */
    var preamble: String?

/**
     * Currently noop.
     * @alias quote_keys
     */
    var quoteKeys: Boolean?

/**
     * Currently noop.
     * @alias quote_style
     */
    var quoteStyle: Boolean?

/**
     * Currently noop.
     * @alias preserve_annotations
     */
    var preserveAnnotations: Boolean?

/**
     * Currently noop.
     */
    var safari10: Boolean?

/**
     * Currently noop.
     */
    var semicolons: Boolean?

/**
     * Currently noop.
     */
    var shebang: Boolean?

/**
     * Currently noop.
     */
    var webkit: Boolean?

/**
     * Currently noop.
     * @alias wrap_iife
     */
    var wrapIife: Boolean?

/**
     * Currently noop.
     * @alias wrap_func_args
     */
    var wrapFuncArgs: Boolean?
}

/**
 * These properties are mostly not implemented yet,
 * but it exists to support passing terser config to swc minify
 * without modification.
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JsFormatOptions")
class JsFormatOptionsImpl : JsFormatOptions {
    override var asciiOnly: Boolean? = null
    override var beautify: Boolean? = null
    override var braces: Boolean? = null
    override var comments: String? = null
    override var ecma: TerserEcmaVersion? = null
    override var indentLevel: Int? = null
    override var indentStart: Int? = null
    override var inlineScript: Int? = null
    override var keepNumbers: Int? = null
    override var keepQuotedProps: Boolean? = null
    override var maxLineLen: Union.U2<Int, /**
         *literal is: false
         */Int>? = null
    override var preamble: String? = null
    override var quoteKeys: Boolean? = null
    override var quoteStyle: Boolean? = null
    override var preserveAnnotations: Boolean? = null
    override var safari10: Boolean? = null
    override var semicolons: Boolean? = null
    override var shebang: Boolean? = null
    override var webkit: Boolean? = null
    override var wrapIife: Boolean? = null
    override var wrapFuncArgs: Boolean? = null
}

interface TerserCompressOptions {
    var arguments: Boolean?
    var arrows: Boolean?
    var booleans: Boolean?
    var booleans_as_integers: Boolean?
    var collapse_vars: Boolean?
    var comparisons: Boolean?
    var computed_props: Boolean?
    var conditionals: Boolean?
    var dead_code: Boolean?
    var defaults: Boolean?
    var directives: Boolean?
    var drop_console: Boolean?
    var drop_debugger: Boolean?
    var ecma: TerserEcmaVersion?
    var evaluate: Boolean?
    var expression: Boolean?
    var global_defs: Map<String, String>?
    var hoist_funs: Boolean?
    var hoist_props: Boolean?
    var hoist_vars: Boolean?
    var ie8: Boolean?
    var if_return: Boolean?
    var jsInline: Int?
    var join_vars: Boolean?
    var keep_classnames: Boolean?
    var keep_fargs: Boolean?
    var keep_fnames: Boolean?
    var keep_infinity: Boolean?
    var loops: Boolean?
    var negate_iife: Boolean?
    var passes: Int?
    var properties: Boolean?
    var pure_getters: Union.U2<String, Boolean>?
    var pure_funcs: Array<String>?
    var reduce_funcs: Boolean?
    var reduce_vars: Boolean?
    var sequences: Boolean?
    var side_effects: Boolean?
    var switches: Boolean?
    var top_retain: Union.U2<String, Array<String>>?
    var toplevel: Union.U2<String, Boolean>?
    var typeofs: Boolean?
    var unsafe: Boolean?
    var unsafe_passes: Boolean?
    var unsafe_arrows: Boolean?
    var unsafe_comps: Boolean?
    var unsafe_function: Boolean?
    var unsafe_math: Boolean?
    var unsafe_symbols: Boolean?
    var unsafe_methods: Boolean?
    var unsafe_proto: Boolean?
    var unsafe_regexp: Boolean?
    var unsafe_undefined: Boolean?
    var unused: Boolean?
    var const_to_let: Boolean?
    var module: Boolean?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TerserCompressOptions")
class TerserCompressOptionsImpl : TerserCompressOptions {
    override var arguments: Boolean? = null
    override var arrows: Boolean? = null
    override var booleans: Boolean? = null
    override var booleans_as_integers: Boolean? = null
    override var collapse_vars: Boolean? = null
    override var comparisons: Boolean? = null
    override var computed_props: Boolean? = null
    override var conditionals: Boolean? = null
    override var dead_code: Boolean? = null
    override var defaults: Boolean? = null
    override var directives: Boolean? = null
    override var drop_console: Boolean? = null
    override var drop_debugger: Boolean? = null
    override var ecma: TerserEcmaVersion? = null
    override var evaluate: Boolean? = null
    override var expression: Boolean? = null
    override var global_defs: Map<String, String>? = null
    override var hoist_funs: Boolean? = null
    override var hoist_props: Boolean? = null
    override var hoist_vars: Boolean? = null
    override var ie8: Boolean? = null
    override var if_return: Boolean? = null
    override var jsInline: Int? = null
    override var join_vars: Boolean? = null
    override var keep_classnames: Boolean? = null
    override var keep_fargs: Boolean? = null
    override var keep_fnames: Boolean? = null
    override var keep_infinity: Boolean? = null
    override var loops: Boolean? = null
    override var negate_iife: Boolean? = null
    override var passes: Int? = null
    override var properties: Boolean? = null
    override var pure_getters: Union.U2<String, Boolean>? = null
    override var pure_funcs: Array<String>? = null
    override var reduce_funcs: Boolean? = null
    override var reduce_vars: Boolean? = null
    override var sequences: Boolean? = null
    override var side_effects: Boolean? = null
    override var switches: Boolean? = null
    override var top_retain: Union.U2<String, Array<String>>? = null
    override var toplevel: Union.U2<String, Boolean>? = null
    override var typeofs: Boolean? = null
    override var unsafe: Boolean? = null
    override var unsafe_passes: Boolean? = null
    override var unsafe_arrows: Boolean? = null
    override var unsafe_comps: Boolean? = null
    override var unsafe_function: Boolean? = null
    override var unsafe_math: Boolean? = null
    override var unsafe_symbols: Boolean? = null
    override var unsafe_methods: Boolean? = null
    override var unsafe_proto: Boolean? = null
    override var unsafe_regexp: Boolean? = null
    override var unsafe_undefined: Boolean? = null
    override var unused: Boolean? = null
    override var const_to_let: Boolean? = null
    override var module: Boolean? = null
}

interface TerserMangleOptions {
    var props: TerserManglePropertiesOptions?
    var toplevel: Union.U2<String, Boolean>?
    var keep_classnames: Boolean?
    var keep_fnames: Boolean?
    var keep_private_props: Boolean?
    var ie8: Boolean?
    var safari10: Boolean?
    var reserved: Array<String>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TerserMangleOptions")
class TerserMangleOptionsImpl : TerserMangleOptions {
    override var props: TerserManglePropertiesOptions? = null
    override var toplevel: Union.U2<String, Boolean>? = null
    override var keep_classnames: Boolean? = null
    override var keep_fnames: Boolean? = null
    override var keep_private_props: Boolean? = null
    override var ie8: Boolean? = null
    override var safari10: Boolean? = null
    override var reserved: Array<String>? = null
}

interface TerserManglePropertiesOptions

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TerserManglePropertiesOptions")
class TerserManglePropertiesOptionsImpl : TerserManglePropertiesOptions

interface CallerOptions {
    var name: String?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("CallerOptions")
class CallerOptionsImpl : CallerOptions {
    override var name: String? = null
}

/**
 * Configuration ported from babel-preset-env
 */
interface EnvConfig {
    var mode: String?
    var debug: Boolean?
    var dynamicImport: Boolean?
    var loose: Boolean?
    var skip: Array<String>?
    var include: Array<String>?
    var exclude: Array<String>?

/**
     * The version of the used core js.
     *
     */
    var coreJs: String?
    var targets: Union.U2<String, Map<String, String>>?
    var path: String?
    var shippedProposals: Boolean?

/**
     * Enable all transforms
     */
    var forceAllTransforms: Boolean?
}

/**
 * Configuration ported from babel-preset-env
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("EnvConfig")
class EnvConfigImpl : EnvConfig {
    override var mode: String? = null
    override var debug: Boolean? = null
    override var dynamicImport: Boolean? = null
    override var loose: Boolean? = null
    override var skip: Array<String>? = null
    override var include: Array<String>? = null
    override var exclude: Array<String>? = null
    override var coreJs: String? = null
    override var targets: Union.U2<String, Map<String, String>>? = null
    override var path: String? = null
    override var shippedProposals: Boolean? = null
    override var forceAllTransforms: Boolean? = null
}

/**
 * Options for transform.
 */
interface TransformConfig {
/**
     * Effective only if `syntax` supports ƒ.
     */
    var react: ReactConfig?
    var constModules: ConstModulesConfig?

/**
     * Defaults to null, which skips optimizer pass.
     */
    var optimizer: OptimizerConfig?

/**
     * https://swc.rs/docs/configuring-swc.html#jsctransformlegacydecorator
     */
    var legacyDecorator: Boolean?

/**
     * https://swc.rs/docs/configuring-swc.html#jsctransformdecoratormetadata
     */
    var decoratorMetadata: Boolean?
    var treatConstEnumAsEnum: Boolean?
    var useDefineForClassFields: Boolean?
}

/**
 * Options for transform.
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TransformConfig")
class TransformConfigImpl : TransformConfig {
    override var react: ReactConfig? = null
    override var constModules: ConstModulesConfig? = null
    override var optimizer: OptimizerConfig? = null
    override var legacyDecorator: Boolean? = null
    override var decoratorMetadata: Boolean? = null
    override var treatConstEnumAsEnum: Boolean? = null
    override var useDefineForClassFields: Boolean? = null
}

interface ReactConfig {
/**
     * Replace the function used when compiling JSX expressions.
     *
     * Defaults to `React.createElement`.
     */
    var pragma: String?

/**
     * Replace the component used when compiling JSX fragments.
     *
     * Defaults to `React.Fragment`
     */
    var pragmaFrag: String?

/**
     * Toggles whether or not to throw an error if a XML namespaced tag name is used. For example:
     * `<f:image />`
     *
     * Though the JSX spec allows this, it is disabled by default since React's
     * JSX does not currently have support for it.
     *
     */
    var throwIfNamespace: Boolean?

/**
     * Toggles plugins that aid in development, such as @swc/plugin-transform-react-jsx-self
     * and @swc/plugin-transform-react-jsx-source.
     *
     * Defaults to `false`,
     *
     */
    var development: Boolean?

/**
     * Use `Object.assign()` instead of `_extends`. Defaults to false.
     * @deprecated
     */
    var useBuiltins: Boolean?

/**
     * Enable fast refresh feature for React app
     */
    var refresh: Boolean?

/**
     * jsx runtime
     */
    var runtime: String?

/**
     * Declares the module specifier to be used for importing the `jsx` and `jsxs` factory functions when using `runtime` 'automatic'
     */
    var importSource: String?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ReactConfig")
class ReactConfigImpl : ReactConfig {
    override var pragma: String? = null
    override var pragmaFrag: String? = null
    override var throwIfNamespace: Boolean? = null
    override var development: Boolean? = null
    override var useBuiltins: Boolean? = null
    override var refresh: Boolean? = null
    override var runtime: String? = null
    override var importSource: String? = null
}

/**
 *  - `import { DEBUG } from '@ember/env-flags';`
 *  - `import { FEATURE_A, FEATURE_B } from '@ember/features';`
 *
 * See: https://github.com/swc-project/swc/issues/18#issuecomment-466272558
 */
interface ConstModulesConfig {
    var globals: Map<String, Map<String, String>>?
}

/**
 *  - `import { DEBUG } from '@ember/env-flags';`
 *  - `import { FEATURE_A, FEATURE_B } from '@ember/features';`
 *
 * See: https://github.com/swc-project/swc/issues/18#issuecomment-466272558
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ConstModulesConfig")
class ConstModulesConfigImpl : ConstModulesConfig {
    override var globals: Map<String, Map<String, String>>? = null
}

interface OptimizerConfig {
    var simplify: Boolean?
    var globals: GlobalPassOption?
    var jsonify: JsonifyLiteral?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("OptimizerConfig")
class OptimizerConfigImpl : OptimizerConfig {
    override var simplify: Boolean? = null
    override var globals: GlobalPassOption? = null
    override var jsonify: JsonifyLiteral? = null
}

/**
 * Options for inline-global pass.
 */
interface GlobalPassOption {
/**
     * Global variables that should be inlined with passed value.
     *
     * e.g. `{ __DEBUG__: true }`
     */
    var vars: Record<String, String>?

/**
     * Names of environment variables that should be inlined with the value of corresponding env during build.
     *
     * Defaults to `["NODE_ENV", "SWC_ENV"]`
     */
    var envs: Array<String>?

/**
     * Replaces typeof calls for passed variables with corresponding value
     *
     * e.g. `{ window: 'object' }`
     */
    var typeofs: Record<String, String>?
}

/**
 * Options for inline-global pass.
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("GlobalPassOption")
class GlobalPassOptionImpl : GlobalPassOption {
    override var vars: Record<String, String>? = null
    override var envs: Array<String>? = null
    override var typeofs: Record<String, String>? = null
}

interface SystemjsConfig : ModuleConfig {
    // conflict with @SerialName
    //  var type: String?
    var allowTopLevelThis: Boolean?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("systemjs")
class SystemjsConfigImpl : SystemjsConfig {
    // conflict with @SerialName
    //  override var type : String? = "systemjs"
    override var allowTopLevelThis: Boolean? = null
}

interface Output {
/**
     * Transformed code
     */
    var code: String?

/**
     * Sourcemap (**not** base64 encoded)
     */
    var map: String?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Output")
class OutputImpl : Output {
    override var code: String? = null
    override var map: String? = null
}

interface MatchPattern

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("MatchPattern")
class MatchPatternImpl : MatchPattern

@SwcDslMarker
@Serializable
@SerialName("Span")
class Span {
    var start: Int? = null
    var end: Int? = null
    var ctxt: Int? = null
}

sealed interface Node {
    // conflict with @SerialName
    //  var type: String?
}

interface HasSpan {
    var span: Span?
}

interface HasDecorator {
    var decorators: Array<Decorator>?
}

interface Class : HasSpan, HasDecorator {
    var body: Array<ClassMember>?
    var superClass: Expression?
    var isAbstract: Boolean?
    var typeParams: TsTypeParameterDeclaration?
    var superTypeParams: TsTypeParameterInstantiation?
    var implements: Array<TsExpressionWithTypeArguments>?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Class")
class ClassImpl : Class {
    override var body: Array<ClassMember>? = null
    override var superClass: Expression? = null
    override var isAbstract: Boolean? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var superTypeParams: TsTypeParameterInstantiation? = null
    override var implements: Array<TsExpressionWithTypeArguments>? = null
    override var span: Span? = null
    override var decorators: Array<Decorator>? = null
}

interface ClassPropertyBase : Node, HasSpan, HasDecorator {
    var value: Expression?
    var typeAnnotation: TsTypeAnnotation?
    var isStatic: Boolean?
    var accessibility: String?
    var isOptional: Boolean?
    var isOverride: Boolean?
    var readonly: Boolean?
    var definite: Boolean?

    // conflict with @SerialName
    //  override var type: String?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

interface ClassProperty : ClassPropertyBase, ClassMember {
    // conflict with @SerialName
    //  var type: String?
    var key: PropertyName?
    var isAbstract: Boolean?
    var declare: Boolean?
    override var value: Expression?
    override var typeAnnotation: TsTypeAnnotation?
    override var isStatic: Boolean?
    override var accessibility: String?
    override var isOptional: Boolean?
    override var isOverride: Boolean?
    override var readonly: Boolean?
    override var definite: Boolean?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ClassProperty")
class ClassPropertyImpl : ClassProperty {
    // conflict with @SerialName
    //  override var type : String? = "ClassProperty"
    override var key: PropertyName? = null
    override var isAbstract: Boolean? = null
    override var declare: Boolean? = null
    override var value: Expression? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var isStatic: Boolean? = null
    override var accessibility: String? = null
    override var isOptional: Boolean? = null
    override var isOverride: Boolean? = null
    override var readonly: Boolean? = null
    override var definite: Boolean? = null
    override var span: Span? = null
    override var decorators: Array<Decorator>? = null
}

interface PrivateProperty : ClassPropertyBase, ClassMember {
    // conflict with @SerialName
    //  var type: String?
    var key: PrivateName?
    override var value: Expression?
    override var typeAnnotation: TsTypeAnnotation?
    override var isStatic: Boolean?
    override var accessibility: String?
    override var isOptional: Boolean?
    override var isOverride: Boolean?
    override var readonly: Boolean?
    override var definite: Boolean?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("PrivateProperty")
class PrivatePropertyImpl : PrivateProperty {
    // conflict with @SerialName
    //  override var type : String? = "PrivateProperty"
    override var key: PrivateName? = null
    override var value: Expression? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var isStatic: Boolean? = null
    override var accessibility: String? = null
    override var isOptional: Boolean? = null
    override var isOverride: Boolean? = null
    override var readonly: Boolean? = null
    override var definite: Boolean? = null
    override var span: Span? = null
    override var decorators: Array<Decorator>? = null
}

interface Param : Node, HasSpan, HasDecorator {
    // conflict with @SerialName
    //  var type: String?
    var pat: Pattern?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Parameter")
class ParamImpl : Param {
    // conflict with @SerialName
    //  override var type : String? = "Parameter"
    override var pat: Pattern? = null
    override var span: Span? = null
    override var decorators: Array<Decorator>? = null
}

interface Constructor : Node, HasSpan, ClassMember {
    // conflict with @SerialName
    //  var type: String?
    var key: PropertyName?
    var params: Array<Union.U2<TsParameterProperty, Param>>?
    var body: BlockStatement?
    var accessibility: String?
    var isOptional: Boolean?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Constructor")
class ConstructorImpl : Constructor {
    // conflict with @SerialName
    //  override var type : String? = "Constructor"
    override var key: PropertyName? = null
    override var params: Array<Union.U2<TsParameterProperty, Param>>? = null
    override var body: BlockStatement? = null
    override var accessibility: String? = null
    override var isOptional: Boolean? = null
    override var span: Span? = null
}

interface ClassMethodBase : Node, HasSpan {
    var function: Fn?
    var kind: String?
    var isStatic: Boolean?
    var accessibility: String?
    var isAbstract: Boolean?
    var isOptional: Boolean?
    var isOverride: Boolean?

    // conflict with @SerialName
    //  override var type: String?
    override var span: Span?
}

interface ClassMethod : ClassMethodBase, ClassMember {
    // conflict with @SerialName
    //  var type: String?
    var key: PropertyName?
    override var function: Fn?
    override var kind: String?
    override var isStatic: Boolean?
    override var accessibility: String?
    override var isAbstract: Boolean?
    override var isOptional: Boolean?
    override var isOverride: Boolean?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ClassMethod")
class ClassMethodImpl : ClassMethod {
    // conflict with @SerialName
    //  override var type : String? = "ClassMethod"
    override var key: PropertyName? = null
    override var function: Fn? = null
    override var kind: String? = null
    override var isStatic: Boolean? = null
    override var accessibility: String? = null
    override var isAbstract: Boolean? = null
    override var isOptional: Boolean? = null
    override var isOverride: Boolean? = null
    override var span: Span? = null
}

interface PrivateMethod : ClassMethodBase, ClassMember {
    // conflict with @SerialName
    //  var type: String?
    var key: PrivateName?
    override var function: Fn?
    override var kind: String?
    override var isStatic: Boolean?
    override var accessibility: String?
    override var isAbstract: Boolean?
    override var isOptional: Boolean?
    override var isOverride: Boolean?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("PrivateMethod")
class PrivateMethodImpl : PrivateMethod {
    // conflict with @SerialName
    //  override var type : String? = "PrivateMethod"
    override var key: PrivateName? = null
    override var function: Fn? = null
    override var kind: String? = null
    override var isStatic: Boolean? = null
    override var accessibility: String? = null
    override var isAbstract: Boolean? = null
    override var isOptional: Boolean? = null
    override var isOverride: Boolean? = null
    override var span: Span? = null
}

interface StaticBlock : Node, HasSpan, ClassMember {
    // conflict with @SerialName
    //  var type: String?
    var body: BlockStatement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("StaticBlock")
class StaticBlockImpl : StaticBlock {
    // conflict with @SerialName
    //  override var type : String? = "StaticBlock"
    override var body: BlockStatement? = null
    override var span: Span? = null
}

interface Decorator : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Decorator")
class DecoratorImpl : Decorator {
    // conflict with @SerialName
    //  override var type : String? = "Decorator"
    override var expression: Expression? = null
    override var span: Span? = null
}

interface FunctionDeclaration : Fn, Declaration {
    // conflict with @SerialName
    //  var type: String?
    var identifier: Identifier?
    var declare: Boolean?
    override var params: Array<Param>?
    override var body: BlockStatement?
    override var generator: Boolean?
    override var async: Boolean?
    override var typeParameters: TsTypeParameterDeclaration?
    override var returnType: TsTypeAnnotation?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("FunctionDeclaration")
class FunctionDeclarationImpl : FunctionDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "FunctionDeclaration"
    override var identifier: Identifier? = null
    override var declare: Boolean? = null
    override var params: Array<Param>? = null
    override var body: BlockStatement? = null
    override var generator: Boolean? = null
    override var async: Boolean? = null
    override var typeParameters: TsTypeParameterDeclaration? = null
    override var returnType: TsTypeAnnotation? = null
    override var span: Span? = null
    override var decorators: Array<Decorator>? = null
}

interface ClassDeclaration : Class, Node, Declaration {
    // conflict with @SerialName
    //  var type: String?
    var identifier: Identifier?
    var declare: Boolean?
    override var body: Array<ClassMember>?
    override var superClass: Expression?
    override var isAbstract: Boolean?
    override var typeParams: TsTypeParameterDeclaration?
    override var superTypeParams: TsTypeParameterInstantiation?
    override var implements: Array<TsExpressionWithTypeArguments>?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ClassDeclaration")
class ClassDeclarationImpl : ClassDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "ClassDeclaration"
    override var identifier: Identifier? = null
    override var declare: Boolean? = null
    override var body: Array<ClassMember>? = null
    override var superClass: Expression? = null
    override var isAbstract: Boolean? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var superTypeParams: TsTypeParameterInstantiation? = null
    override var implements: Array<TsExpressionWithTypeArguments>? = null
    override var span: Span? = null
    override var decorators: Array<Decorator>? = null
}

interface VariableDeclaration : Node, HasSpan, Declaration {
    // conflict with @SerialName
    //  var type: String?
    var kind: String?
    var declare: Boolean?
    var declarations: Array<VariableDeclarator>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("VariableDeclaration")
class VariableDeclarationImpl : VariableDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "VariableDeclaration"
    override var kind: String? = null
    override var declare: Boolean? = null
    override var declarations: Array<VariableDeclarator>? = null
    override var span: Span? = null
}

interface VariableDeclarator : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var id: Pattern?
    var init: Expression?
    var definite: Boolean?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("VariableDeclarator")
class VariableDeclaratorImpl : VariableDeclarator {
    // conflict with @SerialName
    //  override var type : String? = "VariableDeclarator"
    override var id: Pattern? = null
    override var init: Expression? = null
    override var definite: Boolean? = null
    override var span: Span? = null
}

interface ExpressionBase : Node, HasSpan {
    // conflict with @SerialName
    //  override var type: String?
    override var span: Span?
}

interface Identifier : ExpressionBase, Expression, JSXObject, JSXElementName, JSXAttributeName, ModuleExportName, Property, PropertyName, TsEntityName, TsThisTypeOrIdent, TsEnumMemberId, TsModuleName {
    // conflict with @SerialName
    //  var type: String?
    var value: String?
    var optional: Boolean?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Identifier")
class IdentifierImpl : Identifier {
    // conflict with @SerialName
    //  override var type : String? = "Identifier"
    override var value: String? = null
    override var optional: Boolean? = null
    override var span: Span? = null
}

interface OptionalChainingExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var questionDotToken: Span?

/**
     * Call expression or member expression.
     */
    var base: Union.U2<MemberExpression, OptionalChainingCall>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("OptionalChainingExpression")
class OptionalChainingExpressionImpl : OptionalChainingExpression {
    // conflict with @SerialName
    //  override var type : String? = "OptionalChainingExpression"
    override var questionDotToken: Span? = null
    override var base: Union.U2<MemberExpression, OptionalChainingCall>? = null
    override var span: Span? = null
}

interface OptionalChainingCall : ExpressionBase {
    // conflict with @SerialName
    //  var type: String?
    var callee: Expression?
    var arguments: Array<ExprOrSpread>?
    var typeArguments: TsTypeParameterInstantiation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("OptionalChainingCall")
class OptionalChainingCallImpl : OptionalChainingCall {
    // conflict with @SerialName
    //  override var type : String? = "CallExpression"
    override var callee: Expression? = null
    override var arguments: Array<ExprOrSpread>? = null
    override var typeArguments: TsTypeParameterInstantiation? = null
    override var span: Span? = null
}

interface ThisExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ThisExpression")
class ThisExpressionImpl : ThisExpression {
    // conflict with @SerialName
    //  override var type : String? = "ThisExpression"
    override var span: Span? = null
}

interface ArrayExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var elements: Array<ExprOrSpread>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ArrayExpression")
class ArrayExpressionImpl : ArrayExpression {
    // conflict with @SerialName
    //  override var type : String? = "ArrayExpression"
    override var elements: Array<ExprOrSpread>? = null
    override var span: Span? = null
}

interface ExprOrSpread {
    var spread: Span?
    var expression: Expression?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ExprOrSpread")
class ExprOrSpreadImpl : ExprOrSpread {
    override var spread: Span? = null
    override var expression: Expression? = null
}

interface ObjectExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var properties: Array<Union.U2<SpreadElement, Property>>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ObjectExpression")
class ObjectExpressionImpl : ObjectExpression {
    // conflict with @SerialName
    //  override var type : String? = "ObjectExpression"
    override var properties: Array<Union.U2<SpreadElement, Property>>? = null
    override var span: Span? = null
}

interface Argument {
    var spread: Span?
    var expression: Expression?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Argument")
class ArgumentImpl : Argument {
    override var spread: Span? = null
    override var expression: Expression? = null
}

interface SpreadElement : Node, JSXAttributeOrSpread {
    // conflict with @SerialName
    //  var type: String?
    var spread: Span?
    var arguments: Expression?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("SpreadElement")
class SpreadElementImpl : SpreadElement {
    // conflict with @SerialName
    //  override var type : String? = "SpreadElement"
    override var spread: Span? = null
    override var arguments: Expression? = null
}

interface UnaryExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var operator: String?
    var argument: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("UnaryExpression")
class UnaryExpressionImpl : UnaryExpression {
    // conflict with @SerialName
    //  override var type : String? = "UnaryExpression"
    override var operator: String? = null
    override var argument: Expression? = null
    override var span: Span? = null
}

interface UpdateExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var operator: String?
    var prefix: Boolean?
    var argument: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("UpdateExpression")
class UpdateExpressionImpl : UpdateExpression {
    // conflict with @SerialName
    //  override var type : String? = "UpdateExpression"
    override var operator: String? = null
    override var prefix: Boolean? = null
    override var argument: Expression? = null
    override var span: Span? = null
}

interface BinaryExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var operator: String?
    var left: Expression?
    var right: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("BinaryExpression")
class BinaryExpressionImpl : BinaryExpression {
    // conflict with @SerialName
    //  override var type : String? = "BinaryExpression"
    override var operator: String? = null
    override var left: Expression? = null
    override var right: Expression? = null
    override var span: Span? = null
}

interface FunctionExpression : Fn, ExpressionBase, Expression, DefaultDecl {
    // conflict with @SerialName
    //  var type: String?
    var identifier: Identifier?
    override var params: Array<Param>?
    override var body: BlockStatement?
    override var generator: Boolean?
    override var async: Boolean?
    override var typeParameters: TsTypeParameterDeclaration?
    override var returnType: TsTypeAnnotation?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("FunctionExpression")
class FunctionExpressionImpl : FunctionExpression {
    // conflict with @SerialName
    //  override var type : String? = "FunctionExpression"
    override var identifier: Identifier? = null
    override var params: Array<Param>? = null
    override var body: BlockStatement? = null
    override var generator: Boolean? = null
    override var async: Boolean? = null
    override var typeParameters: TsTypeParameterDeclaration? = null
    override var returnType: TsTypeAnnotation? = null
    override var span: Span? = null
    override var decorators: Array<Decorator>? = null
}

interface ClassExpression : Class, ExpressionBase, Expression, DefaultDecl {
    // conflict with @SerialName
    //  var type: String?
    var identifier: Identifier?
    override var body: Array<ClassMember>?
    override var superClass: Expression?
    override var isAbstract: Boolean?
    override var typeParams: TsTypeParameterDeclaration?
    override var superTypeParams: TsTypeParameterInstantiation?
    override var implements: Array<TsExpressionWithTypeArguments>?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ClassExpression")
class ClassExpressionImpl : ClassExpression {
    // conflict with @SerialName
    //  override var type : String? = "ClassExpression"
    override var identifier: Identifier? = null
    override var body: Array<ClassMember>? = null
    override var superClass: Expression? = null
    override var isAbstract: Boolean? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var superTypeParams: TsTypeParameterInstantiation? = null
    override var implements: Array<TsExpressionWithTypeArguments>? = null
    override var span: Span? = null
    override var decorators: Array<Decorator>? = null
}

interface AssignmentExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var operator: String?
    var left: Union.U2<Expression, Pattern>?
    var right: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("AssignmentExpression")
class AssignmentExpressionImpl : AssignmentExpression {
    // conflict with @SerialName
    //  override var type : String? = "AssignmentExpression"
    override var operator: String? = null
    override var left: Union.U2<Expression, Pattern>? = null
    override var right: Expression? = null
    override var span: Span? = null
}

interface MemberExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var jsObject: Expression?
    var property: Union.U3<Identifier, PrivateName, ComputedPropName>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("MemberExpression")
class MemberExpressionImpl : MemberExpression {
    // conflict with @SerialName
    //  override var type : String? = "MemberExpression"
    override var jsObject: Expression? = null
    override var property: Union.U3<Identifier, PrivateName, ComputedPropName>? = null
    override var span: Span? = null
}

interface SuperPropExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var obj: Super?
    var property: Union.U2<Identifier, ComputedPropName>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("SuperPropExpression")
class SuperPropExpressionImpl : SuperPropExpression {
    // conflict with @SerialName
    //  override var type : String? = "SuperPropExpression"
    override var obj: Super? = null
    override var property: Union.U2<Identifier, ComputedPropName>? = null
    override var span: Span? = null
}

interface ConditionalExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var test: Expression?
    var consequent: Expression?
    var alternate: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ConditionalExpression")
class ConditionalExpressionImpl : ConditionalExpression {
    // conflict with @SerialName
    //  override var type : String? = "ConditionalExpression"
    override var test: Expression? = null
    override var consequent: Expression? = null
    override var alternate: Expression? = null
    override var span: Span? = null
}

interface Super : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Super")
class SuperImpl : Super {
    // conflict with @SerialName
    //  override var type : String? = "Super"
    override var span: Span? = null
}

interface Import : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Import")
class ImportImpl : Import {
    // conflict with @SerialName
    //  override var type : String? = "Import"
    override var span: Span? = null
}

interface CallExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var callee: Union.U3<Super, Import, Expression>?
    var arguments: Array<Argument>?
    var typeArguments: TsTypeParameterInstantiation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("CallExpression")
class CallExpressionImpl : CallExpression {
    // conflict with @SerialName
    //  override var type : String? = "CallExpression"
    override var callee: Union.U3<Super, Import, Expression>? = null
    override var arguments: Array<Argument>? = null
    override var typeArguments: TsTypeParameterInstantiation? = null
    override var span: Span? = null
}

interface NewExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var callee: Expression?
    var arguments: Array<Argument>?
    var typeArguments: TsTypeParameterInstantiation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("NewExpression")
class NewExpressionImpl : NewExpression {
    // conflict with @SerialName
    //  override var type : String? = "NewExpression"
    override var callee: Expression? = null
    override var arguments: Array<Argument>? = null
    override var typeArguments: TsTypeParameterInstantiation? = null
    override var span: Span? = null
}

interface SequenceExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var expressions: Array<Expression>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("SequenceExpression")
class SequenceExpressionImpl : SequenceExpression {
    // conflict with @SerialName
    //  override var type : String? = "SequenceExpression"
    override var expressions: Array<Expression>? = null
    override var span: Span? = null
}

interface ArrowFunctionExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var params: Array<Pattern>?
    var body: Union.U2<BlockStatement, Expression>?
    var async: Boolean?
    var generator: Boolean?
    var typeParameters: TsTypeParameterDeclaration?
    var returnType: TsTypeAnnotation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ArrowFunctionExpression")
class ArrowFunctionExpressionImpl : ArrowFunctionExpression {
    // conflict with @SerialName
    //  override var type : String? = "ArrowFunctionExpression"
    override var params: Array<Pattern>? = null
    override var body: Union.U2<BlockStatement, Expression>? = null
    override var async: Boolean? = null
    override var generator: Boolean? = null
    override var typeParameters: TsTypeParameterDeclaration? = null
    override var returnType: TsTypeAnnotation? = null
    override var span: Span? = null
}

interface YieldExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var argument: Expression?
    var delegate: Boolean?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("YieldExpression")
class YieldExpressionImpl : YieldExpression {
    // conflict with @SerialName
    //  override var type : String? = "YieldExpression"
    override var argument: Expression? = null
    override var delegate: Boolean? = null
    override var span: Span? = null
}

interface MetaProperty : Node, HasSpan, Expression {
    // conflict with @SerialName
    //  var type: String?
    var kind: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("MetaProperty")
class MetaPropertyImpl : MetaProperty {
    // conflict with @SerialName
    //  override var type : String? = "MetaProperty"
    override var kind: String? = null
    override var span: Span? = null
}

interface AwaitExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var argument: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("AwaitExpression")
class AwaitExpressionImpl : AwaitExpression {
    // conflict with @SerialName
    //  override var type : String? = "AwaitExpression"
    override var argument: Expression? = null
    override var span: Span? = null
}

interface TemplateLiteral : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var expressions: Array<Expression>?
    var quasis: Array<TemplateElement>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TemplateLiteral")
class TemplateLiteralImpl : TemplateLiteral {
    // conflict with @SerialName
    //  override var type : String? = "TemplateLiteral"
    override var expressions: Array<Expression>? = null
    override var quasis: Array<TemplateElement>? = null
    override var span: Span? = null
}

interface TaggedTemplateExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var tag: Expression?
    var typeParameters: TsTypeParameterInstantiation?
    var template: TemplateLiteral?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TaggedTemplateExpression")
class TaggedTemplateExpressionImpl : TaggedTemplateExpression {
    // conflict with @SerialName
    //  override var type : String? = "TaggedTemplateExpression"
    override var tag: Expression? = null
    override var typeParameters: TsTypeParameterInstantiation? = null
    override var template: TemplateLiteral? = null
    override var span: Span? = null
}

interface TemplateElement : ExpressionBase {
    // conflict with @SerialName
    //  var type: String?
    var tail: Boolean?
    var cooked: String?
    var raw: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TemplateElement")
class TemplateElementImpl : TemplateElement {
    // conflict with @SerialName
    //  override var type : String? = "TemplateElement"
    override var tail: Boolean? = null
    override var cooked: String? = null
    override var raw: String? = null
    override var span: Span? = null
}

interface ParenthesisExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ParenthesisExpression")
class ParenthesisExpressionImpl : ParenthesisExpression {
    // conflict with @SerialName
    //  override var type : String? = "ParenthesisExpression"
    override var expression: Expression? = null
    override var span: Span? = null
}

interface Fn : HasSpan, HasDecorator {
    var params: Array<Param>?
    var body: BlockStatement?
    var generator: Boolean?
    var async: Boolean?
    var typeParameters: TsTypeParameterDeclaration?
    var returnType: TsTypeAnnotation?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

interface PatternBase : Node, HasSpan {
    var typeAnnotation: TsTypeAnnotation?

    // conflict with @SerialName
    //  override var type: String?
    override var span: Span?
}

interface PrivateName : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var id: Identifier?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("PrivateName")
class PrivateNameImpl : PrivateName {
    // conflict with @SerialName
    //  override var type : String? = "PrivateName"
    override var id: Identifier? = null
    override var span: Span? = null
}

interface JSXMemberExpression : Node, Expression, JSXObject, JSXElementName {
    // conflict with @SerialName
    //  var type: String?
    var jsObject: JSXObject?
    var property: Identifier?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXMemberExpression")
class JSXMemberExpressionImpl : JSXMemberExpression {
    // conflict with @SerialName
    //  override var type : String? = "JSXMemberExpression"
    override var jsObject: JSXObject? = null
    override var property: Identifier? = null
}

/**
 * XML-based namespace syntax:
 */
interface JSXNamespacedName : Node, Expression, JSXElementName, JSXAttributeName {
    // conflict with @SerialName
    //  var type: String?
    var namespace: Identifier?
    var name: Identifier?
}

/**
 * XML-based namespace syntax:
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXNamespacedName")
class JSXNamespacedNameImpl : JSXNamespacedName {
    // conflict with @SerialName
    //  override var type : String? = "JSXNamespacedName"
    override var namespace: Identifier? = null
    override var name: Identifier? = null
}

interface JSXEmptyExpression : Node, HasSpan, Expression, JSXExpression {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXEmptyExpression")
class JSXEmptyExpressionImpl : JSXEmptyExpression {
    // conflict with @SerialName
    //  override var type : String? = "JSXEmptyExpression"
    override var span: Span? = null
}

interface JSXExpressionContainer : Node, HasSpan, JSXAttrValue, JSXElementChild {
    // conflict with @SerialName
    //  var type: String?
    var expression: JSXExpression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXExpressionContainer")
class JSXExpressionContainerImpl : JSXExpressionContainer {
    // conflict with @SerialName
    //  override var type : String? = "JSXExpressionContainer"
    override var expression: JSXExpression? = null
    override var span: Span? = null
}

interface JSXSpreadChild : Node, HasSpan, JSXElementChild {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXSpreadChild")
class JSXSpreadChildImpl : JSXSpreadChild {
    // conflict with @SerialName
    //  override var type : String? = "JSXSpreadChild"
    override var expression: Expression? = null
    override var span: Span? = null
}

interface JSXOpeningElement : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var name: JSXElementName?
    var attributes: Array<JSXAttributeOrSpread>?
    var selfClosing: Boolean?
    var typeArguments: TsTypeParameterInstantiation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXOpeningElement")
class JSXOpeningElementImpl : JSXOpeningElement {
    // conflict with @SerialName
    //  override var type : String? = "JSXOpeningElement"
    override var name: JSXElementName? = null
    override var attributes: Array<JSXAttributeOrSpread>? = null
    override var selfClosing: Boolean? = null
    override var typeArguments: TsTypeParameterInstantiation? = null
    override var span: Span? = null
}

interface JSXClosingElement : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var name: JSXElementName?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXClosingElement")
class JSXClosingElementImpl : JSXClosingElement {
    // conflict with @SerialName
    //  override var type : String? = "JSXClosingElement"
    override var name: JSXElementName? = null
    override var span: Span? = null
}

interface JSXAttribute : Node, HasSpan, JSXAttributeOrSpread {
    // conflict with @SerialName
    //  var type: String?
    var name: JSXAttributeName?
    var value: JSXAttrValue?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXAttribute")
class JSXAttributeImpl : JSXAttribute {
    // conflict with @SerialName
    //  override var type : String? = "JSXAttribute"
    override var name: JSXAttributeName? = null
    override var value: JSXAttrValue? = null
    override var span: Span? = null
}

interface JSXText : Node, HasSpan, JSXElementChild, Literal {
    // conflict with @SerialName
    //  var type: String?
    var value: String?
    var raw: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXText")
class JSXTextImpl : JSXText {
    // conflict with @SerialName
    //  override var type : String? = "JSXText"
    override var value: String? = null
    override var raw: String? = null
    override var span: Span? = null
}

interface JSXElement : Node, HasSpan, Expression, JSXAttrValue, JSXElementChild {
    // conflict with @SerialName
    //  var type: String?
    var opening: JSXOpeningElement?
    var children: Array<JSXElementChild>?
    var closing: JSXClosingElement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXElement")
class JSXElementImpl : JSXElement {
    // conflict with @SerialName
    //  override var type : String? = "JSXElement"
    override var opening: JSXOpeningElement? = null
    override var children: Array<JSXElementChild>? = null
    override var closing: JSXClosingElement? = null
    override var span: Span? = null
}

interface JSXFragment : Node, HasSpan, Expression, JSXAttrValue, JSXElementChild {
    // conflict with @SerialName
    //  var type: String?
    var opening: JSXOpeningFragment?
    var children: Array<JSXElementChild>?
    var closing: JSXClosingFragment?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXFragment")
class JSXFragmentImpl : JSXFragment {
    // conflict with @SerialName
    //  override var type : String? = "JSXFragment"
    override var opening: JSXOpeningFragment? = null
    override var children: Array<JSXElementChild>? = null
    override var closing: JSXClosingFragment? = null
    override var span: Span? = null
}

interface JSXOpeningFragment : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXOpeningFragment")
class JSXOpeningFragmentImpl : JSXOpeningFragment {
    // conflict with @SerialName
    //  override var type : String? = "JSXOpeningFragment"
    override var span: Span? = null
}

interface JSXClosingFragment : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("JSXClosingFragment")
class JSXClosingFragmentImpl : JSXClosingFragment {
    // conflict with @SerialName
    //  override var type : String? = "JSXClosingFragment"
    override var span: Span? = null
}

interface StringLiteral : Node, HasSpan, Literal, ModuleExportName, PropertyName, TsLiteral, TsEnumMemberId, TsModuleName {
    // conflict with @SerialName
    //  var type: String?
    var value: String?
    var raw: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("StringLiteral")
class StringLiteralImpl : StringLiteral {
    // conflict with @SerialName
    //  override var type : String? = "StringLiteral"
    override var value: String? = null
    override var raw: String? = null
    override var span: Span? = null
}

interface BooleanLiteral : Node, HasSpan, Literal, TsLiteral {
    // conflict with @SerialName
    //  var type: String?
    var value: Boolean?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("BooleanLiteral")
class BooleanLiteralImpl : BooleanLiteral {
    // conflict with @SerialName
    //  override var type : String? = "BooleanLiteral"
    override var value: Boolean? = null
    override var span: Span? = null
}

interface NullLiteral : Node, HasSpan, Literal {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("NullLiteral")
class NullLiteralImpl : NullLiteral {
    // conflict with @SerialName
    //  override var type : String? = "NullLiteral"
    override var span: Span? = null
}

interface RegExpLiteral : Node, HasSpan, Literal {
    // conflict with @SerialName
    //  var type: String?
    var pattern: String?
    var flags: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("RegExpLiteral")
class RegExpLiteralImpl : RegExpLiteral {
    // conflict with @SerialName
    //  override var type : String? = "RegExpLiteral"
    override var pattern: String? = null
    override var flags: String? = null
    override var span: Span? = null
}

interface NumericLiteral : Node, HasSpan, Literal, PropertyName, TsLiteral {
    // conflict with @SerialName
    //  var type: String?
    var value: Int?
    var raw: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("NumericLiteral")
class NumericLiteralImpl : NumericLiteral {
    // conflict with @SerialName
    //  override var type : String? = "NumericLiteral"
    override var value: Int? = null
    override var raw: String? = null
    override var span: Span? = null
}

interface BigIntLiteral : Node, HasSpan, Literal, PropertyName, TsLiteral {
    // conflict with @SerialName
    //  var type: String?
    var value: Long?
    var raw: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("BigIntLiteral")
class BigIntLiteralImpl : BigIntLiteral {
    // conflict with @SerialName
    //  override var type : String? = "BigIntLiteral"
    override var value: Long? = null
    override var raw: String? = null
    override var span: Span? = null
}

interface ExportDefaultExpression : Node, HasSpan, ModuleDeclaration {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ExportDefaultExpression")
class ExportDefaultExpressionImpl : ExportDefaultExpression {
    // conflict with @SerialName
    //  override var type : String? = "ExportDefaultExpression"
    override var expression: Expression? = null
    override var span: Span? = null
}

interface ExportDeclaration : Node, HasSpan, ModuleDeclaration {
    // conflict with @SerialName
    //  var type: String?
    var declaration: Declaration?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ExportDeclaration")
class ExportDeclarationImpl : ExportDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "ExportDeclaration"
    override var declaration: Declaration? = null
    override var span: Span? = null
}

interface ImportDeclaration : Node, HasSpan, ModuleDeclaration {
    // conflict with @SerialName
    //  var type: String?
    var specifiers: Array<ImportSpecifier>?
    var source: StringLiteral?
    var typeOnly: Boolean?
    var asserts: ObjectExpression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ImportDeclaration")
class ImportDeclarationImpl : ImportDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "ImportDeclaration"
    override var specifiers: Array<ImportSpecifier>? = null
    override var source: StringLiteral? = null
    override var typeOnly: Boolean? = null
    override var asserts: ObjectExpression? = null
    override var span: Span? = null
}

interface ExportAllDeclaration : Node, HasSpan, ModuleDeclaration {
    // conflict with @SerialName
    //  var type: String?
    var source: StringLiteral?
    var asserts: ObjectExpression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ExportAllDeclaration")
class ExportAllDeclarationImpl : ExportAllDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "ExportAllDeclaration"
    override var source: StringLiteral? = null
    override var asserts: ObjectExpression? = null
    override var span: Span? = null
}

/**
 * - `export { foo } from 'mod'`
 * - `export { foo as bar } from 'mod'`
 */
interface ExportNamedDeclaration : Node, HasSpan, ModuleDeclaration {
    // conflict with @SerialName
    //  var type: String?
    var specifiers: Array<ExportSpecifier>?
    var source: StringLiteral?
    var typeOnly: Boolean?
    var asserts: ObjectExpression?
    override var span: Span?
}

/**
 * - `export { foo } from 'mod'`
 * - `export { foo as bar } from 'mod'`
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ExportNamedDeclaration")
class ExportNamedDeclarationImpl : ExportNamedDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "ExportNamedDeclaration"
    override var specifiers: Array<ExportSpecifier>? = null
    override var source: StringLiteral? = null
    override var typeOnly: Boolean? = null
    override var asserts: ObjectExpression? = null
    override var span: Span? = null
}

interface ExportDefaultDeclaration : Node, HasSpan, ModuleDeclaration {
    // conflict with @SerialName
    //  var type: String?
    var decl: DefaultDecl?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ExportDefaultDeclaration")
class ExportDefaultDeclarationImpl : ExportDefaultDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "ExportDefaultDeclaration"
    override var decl: DefaultDecl? = null
    override var span: Span? = null
}

/**
 * e.g. `import foo from 'mod.js'`
 */
interface ImportDefaultSpecifier : Node, HasSpan, ImportSpecifier {
    // conflict with @SerialName
    //  var type: String?
    var local: Identifier?
    override var span: Span?
}

/**
 * e.g. `import foo from 'mod.js'`
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ImportDefaultSpecifier")
class ImportDefaultSpecifierImpl : ImportDefaultSpecifier {
    // conflict with @SerialName
    //  override var type : String? = "ImportDefaultSpecifier"
    override var local: Identifier? = null
    override var span: Span? = null
}

/**
 * e.g. `import * as foo from 'mod.js'`.
 */
interface ImportNamespaceSpecifier : Node, HasSpan, ImportSpecifier {
    // conflict with @SerialName
    //  var type: String?
    var local: Identifier?
    override var span: Span?
}

/**
 * e.g. `import * as foo from 'mod.js'`.
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ImportNamespaceSpecifier")
class ImportNamespaceSpecifierImpl : ImportNamespaceSpecifier {
    // conflict with @SerialName
    //  override var type : String? = "ImportNamespaceSpecifier"
    override var local: Identifier? = null
    override var span: Span? = null
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
interface NamedImportSpecifier : Node, HasSpan, ImportSpecifier {
    // conflict with @SerialName
    //  var type: String?
    var local: Identifier?
    var imported: ModuleExportName?
    var isTypeOnly: Boolean?
    override var span: Span?
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
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ImportSpecifier")
class NamedImportSpecifierImpl : NamedImportSpecifier {
    // conflict with @SerialName
    //  override var type : String? = "ImportSpecifier"
    override var local: Identifier? = null
    override var imported: ModuleExportName? = null
    override var isTypeOnly: Boolean? = null
    override var span: Span? = null
}

/**
 * `export * as foo from 'src';`
 */
interface ExportNamespaceSpecifier : Node, HasSpan, ExportSpecifier {
    // conflict with @SerialName
    //  var type: String?
    var name: ModuleExportName?
    override var span: Span?
}

/**
 * `export * as foo from 'src';`
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ExportNamespaceSpecifier")
class ExportNamespaceSpecifierImpl : ExportNamespaceSpecifier {
    // conflict with @SerialName
    //  override var type : String? = "ExportNamespaceSpecifier"
    override var name: ModuleExportName? = null
    override var span: Span? = null
}

interface ExportDefaultSpecifier : Node, HasSpan, ExportSpecifier {
    // conflict with @SerialName
    //  var type: String?
    var exported: Identifier?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ExportDefaultSpecifier")
class ExportDefaultSpecifierImpl : ExportDefaultSpecifier {
    // conflict with @SerialName
    //  override var type : String? = "ExportDefaultSpecifier"
    override var exported: Identifier? = null
    override var span: Span? = null
}

interface NamedExportSpecifier : Node, HasSpan, ExportSpecifier {
    // conflict with @SerialName
    //  var type: String?
    var orig: ModuleExportName?

/**
     * `Some(bar)` in `export { foo as bar }`
     */
    var exported: ModuleExportName?
    var isTypeOnly: Boolean?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ExportSpecifier")
class NamedExportSpecifierImpl : NamedExportSpecifier {
    // conflict with @SerialName
    //  override var type : String? = "ExportSpecifier"
    override var orig: ModuleExportName? = null
    override var exported: ModuleExportName? = null
    override var isTypeOnly: Boolean? = null
    override var span: Span? = null
}

interface HasInterpreter {
/**
     * e.g. `/usr/bin/node` for `#!/usr/bin/node`
     */
    var interpreter: String?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("HasInterpreter")
class HasInterpreterImpl : HasInterpreter {
    override var interpreter: String? = null
}

interface Module : Node, HasSpan, HasInterpreter, Program {
    // conflict with @SerialName
    //  var type: String?
    var body: Array<ModuleItem>?
    override var span: Span?

/**
     * e.g. `/usr/bin/node` for `#!/usr/bin/node`
     */
    override var interpreter: String?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Module")
class ModuleImpl : Module {
    // conflict with @SerialName
    //  override var type : String? = "Module"
    override var body: Array<ModuleItem>? = null
    override var span: Span? = null
    override var interpreter: String? = null
}

interface Script : Node, HasSpan, HasInterpreter, Program {
    // conflict with @SerialName
    //  var type: String?
    var body: Array<Statement>?
    override var span: Span?

/**
     * e.g. `/usr/bin/node` for `#!/usr/bin/node`
     */
    override var interpreter: String?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Script")
class ScriptImpl : Script {
    // conflict with @SerialName
    //  override var type : String? = "Script"
    override var body: Array<Statement>? = null
    override var span: Span? = null
    override var interpreter: String? = null
}

interface BindingIdentifier : PatternBase, Pattern, TsParameterPropertyParameter, TsFnParameter {
    // conflict with @SerialName
    //  var type: String?
    var value: String?
    var optional: Boolean?
    override var typeAnnotation: TsTypeAnnotation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("BindingIdentifier")
class BindingIdentifierImpl : BindingIdentifier {
    // conflict with @SerialName
    //  override var type : String? = "Identifier"
    override var value: String? = null
    override var optional: Boolean? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var span: Span? = null
}

interface ArrayPattern : PatternBase, Pattern, TsFnParameter {
    // conflict with @SerialName
    //  var type: String?
    var elements: Array<Pattern>?
    var optional: Boolean?
    override var typeAnnotation: TsTypeAnnotation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ArrayPattern")
class ArrayPatternImpl : ArrayPattern {
    // conflict with @SerialName
    //  override var type : String? = "ArrayPattern"
    override var elements: Array<Pattern>? = null
    override var optional: Boolean? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var span: Span? = null
}

interface ObjectPattern : PatternBase, Pattern, TsFnParameter {
    // conflict with @SerialName
    //  var type: String?
    var properties: Array<ObjectPatternProperty>?
    var optional: Boolean?
    override var typeAnnotation: TsTypeAnnotation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ObjectPattern")
class ObjectPatternImpl : ObjectPattern {
    // conflict with @SerialName
    //  override var type : String? = "ObjectPattern"
    override var properties: Array<ObjectPatternProperty>? = null
    override var optional: Boolean? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var span: Span? = null
}

interface AssignmentPattern : PatternBase, Pattern, TsParameterPropertyParameter {
    // conflict with @SerialName
    //  var type: String?
    var left: Pattern?
    var right: Expression?
    override var typeAnnotation: TsTypeAnnotation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("AssignmentPattern")
class AssignmentPatternImpl : AssignmentPattern {
    // conflict with @SerialName
    //  override var type : String? = "AssignmentPattern"
    override var left: Pattern? = null
    override var right: Expression? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var span: Span? = null
}

interface RestElement : PatternBase, Pattern, ObjectPatternProperty, TsFnParameter {
    // conflict with @SerialName
    //  var type: String?
    var rest: Span?
    var argument: Pattern?
    override var typeAnnotation: TsTypeAnnotation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("RestElement")
class RestElementImpl : RestElement {
    // conflict with @SerialName
    //  override var type : String? = "RestElement"
    override var rest: Span? = null
    override var argument: Pattern? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var span: Span? = null
}

/**
 * `{key: value}`
 */
interface KeyValuePatternProperty : Node, ObjectPatternProperty {
    // conflict with @SerialName
    //  var type: String?
    var key: PropertyName?
    var value: Pattern?
}

/**
 * `{key: value}`
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("KeyValuePatternProperty")
class KeyValuePatternPropertyImpl : KeyValuePatternProperty {
    // conflict with @SerialName
    //  override var type : String? = "KeyValuePatternProperty"
    override var key: PropertyName? = null
    override var value: Pattern? = null
}

/**
 * `{key}` or `{key = value}`
 */
interface AssignmentPatternProperty : Node, HasSpan, ObjectPatternProperty {
    // conflict with @SerialName
    //  var type: String?
    var key: Identifier?
    var value: Expression?
    override var span: Span?
}

/**
 * `{key}` or `{key = value}`
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("AssignmentPatternProperty")
class AssignmentPatternPropertyImpl : AssignmentPatternProperty {
    // conflict with @SerialName
    //  override var type : String? = "AssignmentPatternProperty"
    override var key: Identifier? = null
    override var value: Expression? = null
    override var span: Span? = null
}

interface PropBase : Node {
    var key: PropertyName?
    // conflict with @SerialName
    //  override var type: String?
}

interface KeyValueProperty : PropBase, Property {
    // conflict with @SerialName
    //  var type: String?
    var value: Expression?
    override var key: PropertyName?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("KeyValueProperty")
class KeyValuePropertyImpl : KeyValueProperty {
    // conflict with @SerialName
    //  override var type : String? = "KeyValueProperty"
    override var value: Expression? = null
    override var key: PropertyName? = null
}

interface AssignmentProperty : Node, Property {
    // conflict with @SerialName
    //  var type: String?
    var key: Identifier?
    var value: Expression?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("AssignmentProperty")
class AssignmentPropertyImpl : AssignmentProperty {
    // conflict with @SerialName
    //  override var type : String? = "AssignmentProperty"
    override var key: Identifier? = null
    override var value: Expression? = null
}

interface GetterProperty : PropBase, HasSpan, Property {
    // conflict with @SerialName
    //  var type: String?
    var typeAnnotation: TsTypeAnnotation?
    var body: BlockStatement?
    override var key: PropertyName?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("GetterProperty")
class GetterPropertyImpl : GetterProperty {
    // conflict with @SerialName
    //  override var type : String? = "GetterProperty"
    override var typeAnnotation: TsTypeAnnotation? = null
    override var body: BlockStatement? = null
    override var key: PropertyName? = null
    override var span: Span? = null
}

interface SetterProperty : PropBase, HasSpan, Property {
    // conflict with @SerialName
    //  var type: String?
    var param: Pattern?
    var body: BlockStatement?
    override var key: PropertyName?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("SetterProperty")
class SetterPropertyImpl : SetterProperty {
    // conflict with @SerialName
    //  override var type : String? = "SetterProperty"
    override var param: Pattern? = null
    override var body: BlockStatement? = null
    override var key: PropertyName? = null
    override var span: Span? = null
}

interface MethodProperty : PropBase, Fn, Property {
    // conflict with @SerialName
    //  var type: String?
    override var key: PropertyName?
    override var params: Array<Param>?
    override var body: BlockStatement?
    override var generator: Boolean?
    override var async: Boolean?
    override var typeParameters: TsTypeParameterDeclaration?
    override var returnType: TsTypeAnnotation?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("MethodProperty")
class MethodPropertyImpl : MethodProperty {
    // conflict with @SerialName
    //  override var type : String? = "MethodProperty"
    override var key: PropertyName? = null
    override var params: Array<Param>? = null
    override var body: BlockStatement? = null
    override var generator: Boolean? = null
    override var async: Boolean? = null
    override var typeParameters: TsTypeParameterDeclaration? = null
    override var returnType: TsTypeAnnotation? = null
    override var span: Span? = null
    override var decorators: Array<Decorator>? = null
}

interface ComputedPropName : Node, HasSpan, PropertyName {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Computed")
class ComputedPropNameImpl : ComputedPropName {
    // conflict with @SerialName
    //  override var type : String? = "Computed"
    override var expression: Expression? = null
    override var span: Span? = null
}

interface BlockStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var stmts: Array<Statement>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("BlockStatement")
class BlockStatementImpl : BlockStatement {
    // conflict with @SerialName
    //  override var type : String? = "BlockStatement"
    override var stmts: Array<Statement>? = null
    override var span: Span? = null
}

interface ExpressionStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ExpressionStatement")
class ExpressionStatementImpl : ExpressionStatement {
    // conflict with @SerialName
    //  override var type : String? = "ExpressionStatement"
    override var expression: Expression? = null
    override var span: Span? = null
}

interface EmptyStatement : Node, HasSpan, ClassMember, Statement {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("EmptyStatement")
class EmptyStatementImpl : EmptyStatement {
    // conflict with @SerialName
    //  override var type : String? = "EmptyStatement"
    override var span: Span? = null
}

interface DebuggerStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("DebuggerStatement")
class DebuggerStatementImpl : DebuggerStatement {
    // conflict with @SerialName
    //  override var type : String? = "DebuggerStatement"
    override var span: Span? = null
}

interface WithStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var jsObject: Expression?
    var body: Statement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("WithStatement")
class WithStatementImpl : WithStatement {
    // conflict with @SerialName
    //  override var type : String? = "WithStatement"
    override var jsObject: Expression? = null
    override var body: Statement? = null
    override var span: Span? = null
}

interface ReturnStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var argument: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ReturnStatement")
class ReturnStatementImpl : ReturnStatement {
    // conflict with @SerialName
    //  override var type : String? = "ReturnStatement"
    override var argument: Expression? = null
    override var span: Span? = null
}

interface LabeledStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var label: Identifier?
    var body: Statement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("LabeledStatement")
class LabeledStatementImpl : LabeledStatement {
    // conflict with @SerialName
    //  override var type : String? = "LabeledStatement"
    override var label: Identifier? = null
    override var body: Statement? = null
    override var span: Span? = null
}

interface BreakStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var label: Identifier?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("BreakStatement")
class BreakStatementImpl : BreakStatement {
    // conflict with @SerialName
    //  override var type : String? = "BreakStatement"
    override var label: Identifier? = null
    override var span: Span? = null
}

interface ContinueStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var label: Identifier?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ContinueStatement")
class ContinueStatementImpl : ContinueStatement {
    // conflict with @SerialName
    //  override var type : String? = "ContinueStatement"
    override var label: Identifier? = null
    override var span: Span? = null
}

interface IfStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var test: Expression?
    var consequent: Statement?
    var alternate: Statement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("IfStatement")
class IfStatementImpl : IfStatement {
    // conflict with @SerialName
    //  override var type : String? = "IfStatement"
    override var test: Expression? = null
    override var consequent: Statement? = null
    override var alternate: Statement? = null
    override var span: Span? = null
}

interface SwitchStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var discriminant: Expression?
    var cases: Array<SwitchCase>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("SwitchStatement")
class SwitchStatementImpl : SwitchStatement {
    // conflict with @SerialName
    //  override var type : String? = "SwitchStatement"
    override var discriminant: Expression? = null
    override var cases: Array<SwitchCase>? = null
    override var span: Span? = null
}

interface ThrowStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var argument: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ThrowStatement")
class ThrowStatementImpl : ThrowStatement {
    // conflict with @SerialName
    //  override var type : String? = "ThrowStatement"
    override var argument: Expression? = null
    override var span: Span? = null
}

interface TryStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var block: BlockStatement?
    var handler: CatchClause?
    var finalizer: BlockStatement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TryStatement")
class TryStatementImpl : TryStatement {
    // conflict with @SerialName
    //  override var type : String? = "TryStatement"
    override var block: BlockStatement? = null
    override var handler: CatchClause? = null
    override var finalizer: BlockStatement? = null
    override var span: Span? = null
}

interface WhileStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var test: Expression?
    var body: Statement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("WhileStatement")
class WhileStatementImpl : WhileStatement {
    // conflict with @SerialName
    //  override var type : String? = "WhileStatement"
    override var test: Expression? = null
    override var body: Statement? = null
    override var span: Span? = null
}

interface DoWhileStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var test: Expression?
    var body: Statement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("DoWhileStatement")
class DoWhileStatementImpl : DoWhileStatement {
    // conflict with @SerialName
    //  override var type : String? = "DoWhileStatement"
    override var test: Expression? = null
    override var body: Statement? = null
    override var span: Span? = null
}

interface ForStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var init: Union.U2<VariableDeclaration, Expression>?
    var test: Expression?
    var update: Expression?
    var body: Statement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ForStatement")
class ForStatementImpl : ForStatement {
    // conflict with @SerialName
    //  override var type : String? = "ForStatement"
    override var init: Union.U2<VariableDeclaration, Expression>? = null
    override var test: Expression? = null
    override var update: Expression? = null
    override var body: Statement? = null
    override var span: Span? = null
}

interface ForInStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var left: Union.U2<VariableDeclaration, Pattern>?
    var right: Expression?
    var body: Statement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ForInStatement")
class ForInStatementImpl : ForInStatement {
    // conflict with @SerialName
    //  override var type : String? = "ForInStatement"
    override var left: Union.U2<VariableDeclaration, Pattern>? = null
    override var right: Expression? = null
    override var body: Statement? = null
    override var span: Span? = null
}

interface ForOfStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
/**
     *  Span of the await token.
     *
     *  es2018 for-await-of statements, e.g., `for await (const x of xs) {`
     */
    var await: Span?
    var left: Union.U2<VariableDeclaration, Pattern>?
    var right: Expression?
    var body: Statement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("ForOfStatement")
class ForOfStatementImpl : ForOfStatement {
    // conflict with @SerialName
    //  override var type : String? = "ForOfStatement"
    override var await: Span? = null
    override var left: Union.U2<VariableDeclaration, Pattern>? = null
    override var right: Expression? = null
    override var body: Statement? = null
    override var span: Span? = null
}

interface SwitchCase : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
/**
     * Undefined for default case
     */
    var test: Expression?
    var consequent: Array<Statement>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("SwitchCase")
class SwitchCaseImpl : SwitchCase {
    // conflict with @SerialName
    //  override var type : String? = "SwitchCase"
    override var test: Expression? = null
    override var consequent: Array<Statement>? = null
    override var span: Span? = null
}

interface CatchClause : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
/**
     * The param is `undefined` if the catch binding is omitted. E.g., `try { foo() } catch {}`
     */
    var param: Pattern?
    var body: BlockStatement?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("CatchClause")
class CatchClauseImpl : CatchClause {
    // conflict with @SerialName
    //  override var type : String? = "CatchClause"
    override var param: Pattern? = null
    override var body: BlockStatement? = null
    override var span: Span? = null
}

interface TsTypeAnnotation : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var typeAnnotation: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypeAnnotation")
class TsTypeAnnotationImpl : TsTypeAnnotation {
    // conflict with @SerialName
    //  override var type : String? = "TsTypeAnnotation"
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

interface TsTypeParameterDeclaration : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var parameters: Array<TsTypeParameter>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypeParameterDeclaration")
class TsTypeParameterDeclarationImpl : TsTypeParameterDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "TsTypeParameterDeclaration"
    override var parameters: Array<TsTypeParameter>? = null
    override var span: Span? = null
}

interface TsTypeParameter : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var name: Identifier?
    var jsIn: Boolean?
    var out: Boolean?
    var constraint: TsType?
    var default: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypeParameter")
class TsTypeParameterImpl : TsTypeParameter {
    // conflict with @SerialName
    //  override var type : String? = "TsTypeParameter"
    override var name: Identifier? = null
    override var jsIn: Boolean? = null
    override var out: Boolean? = null
    override var constraint: TsType? = null
    override var default: TsType? = null
    override var span: Span? = null
}

interface TsTypeParameterInstantiation : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var params: Array<TsType>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypeParameterInstantiation")
class TsTypeParameterInstantiationImpl : TsTypeParameterInstantiation {
    // conflict with @SerialName
    //  override var type : String? = "TsTypeParameterInstantiation"
    override var params: Array<TsType>? = null
    override var span: Span? = null
}

interface TsParameterProperty : Node, HasSpan, HasDecorator {
    // conflict with @SerialName
    //  var type: String?
    var accessibility: String?
    var override: Boolean?
    var readonly: Boolean?
    var param: TsParameterPropertyParameter?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsParameterProperty")
class TsParameterPropertyImpl : TsParameterProperty {
    // conflict with @SerialName
    //  override var type : String? = "TsParameterProperty"
    override var accessibility: String? = null
    override var override: Boolean? = null
    override var readonly: Boolean? = null
    override var param: TsParameterPropertyParameter? = null
    override var span: Span? = null
    override var decorators: Array<Decorator>? = null
}

interface TsQualifiedName : Node, TsEntityName {
    // conflict with @SerialName
    //  var type: String?
    var left: TsEntityName?
    var right: Identifier?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsQualifiedName")
class TsQualifiedNameImpl : TsQualifiedName {
    // conflict with @SerialName
    //  override var type : String? = "TsQualifiedName"
    override var left: TsEntityName? = null
    override var right: Identifier? = null
}

interface TsCallSignatureDeclaration : Node, HasSpan, TsTypeElement {
    // conflict with @SerialName
    //  var type: String?
    var params: Array<TsFnParameter>?
    var typeAnnotation: TsTypeAnnotation?
    var typeParams: TsTypeParameterDeclaration?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsCallSignatureDeclaration")
class TsCallSignatureDeclarationImpl : TsCallSignatureDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "TsCallSignatureDeclaration"
    override var params: Array<TsFnParameter>? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var span: Span? = null
}

interface TsConstructSignatureDeclaration : Node, HasSpan, TsTypeElement {
    // conflict with @SerialName
    //  var type: String?
    var params: Array<TsFnParameter>?
    var typeAnnotation: TsTypeAnnotation?
    var typeParams: TsTypeParameterDeclaration?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsConstructSignatureDeclaration")
class TsConstructSignatureDeclarationImpl : TsConstructSignatureDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "TsConstructSignatureDeclaration"
    override var params: Array<TsFnParameter>? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var span: Span? = null
}

interface TsPropertySignature : Node, HasSpan, TsTypeElement {
    // conflict with @SerialName
    //  var type: String?
    var readonly: Boolean?
    var key: Expression?
    var computed: Boolean?
    var optional: Boolean?
    var init: Expression?
    var params: Array<TsFnParameter>?
    var typeAnnotation: TsTypeAnnotation?
    var typeParams: TsTypeParameterDeclaration?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsPropertySignature")
class TsPropertySignatureImpl : TsPropertySignature {
    // conflict with @SerialName
    //  override var type : String? = "TsPropertySignature"
    override var readonly: Boolean? = null
    override var key: Expression? = null
    override var computed: Boolean? = null
    override var optional: Boolean? = null
    override var init: Expression? = null
    override var params: Array<TsFnParameter>? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var span: Span? = null
}

interface TsGetterSignature : Node, HasSpan, TsTypeElement {
    // conflict with @SerialName
    //  var type: String?
    var readonly: Boolean?
    var key: Expression?
    var computed: Boolean?
    var optional: Boolean?
    var typeAnnotation: TsTypeAnnotation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsGetterSignature")
class TsGetterSignatureImpl : TsGetterSignature {
    // conflict with @SerialName
    //  override var type : String? = "TsGetterSignature"
    override var readonly: Boolean? = null
    override var key: Expression? = null
    override var computed: Boolean? = null
    override var optional: Boolean? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var span: Span? = null
}

interface TsSetterSignature : Node, HasSpan, TsTypeElement {
    // conflict with @SerialName
    //  var type: String?
    var readonly: Boolean?
    var key: Expression?
    var computed: Boolean?
    var optional: Boolean?
    var param: TsFnParameter?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsSetterSignature")
class TsSetterSignatureImpl : TsSetterSignature {
    // conflict with @SerialName
    //  override var type : String? = "TsSetterSignature"
    override var readonly: Boolean? = null
    override var key: Expression? = null
    override var computed: Boolean? = null
    override var optional: Boolean? = null
    override var param: TsFnParameter? = null
    override var span: Span? = null
}

interface TsMethodSignature : Node, HasSpan, TsTypeElement {
    // conflict with @SerialName
    //  var type: String?
    var readonly: Boolean?
    var key: Expression?
    var computed: Boolean?
    var optional: Boolean?
    var params: Array<TsFnParameter>?
    var typeAnn: TsTypeAnnotation?
    var typeParams: TsTypeParameterDeclaration?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsMethodSignature")
class TsMethodSignatureImpl : TsMethodSignature {
    // conflict with @SerialName
    //  override var type : String? = "TsMethodSignature"
    override var readonly: Boolean? = null
    override var key: Expression? = null
    override var computed: Boolean? = null
    override var optional: Boolean? = null
    override var params: Array<TsFnParameter>? = null
    override var typeAnn: TsTypeAnnotation? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var span: Span? = null
}

interface TsIndexSignature : Node, HasSpan, ClassMember, TsTypeElement {
    // conflict with @SerialName
    //  var type: String?
    var params: Array<TsFnParameter>?
    var typeAnnotation: TsTypeAnnotation?
    var readonly: Boolean?
    var static: Boolean?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsIndexSignature")
class TsIndexSignatureImpl : TsIndexSignature {
    // conflict with @SerialName
    //  override var type : String? = "TsIndexSignature"
    override var params: Array<TsFnParameter>? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var readonly: Boolean? = null
    override var static: Boolean? = null
    override var span: Span? = null
}

interface TsKeywordType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var kind: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsKeywordType")
class TsKeywordTypeImpl : TsKeywordType {
    // conflict with @SerialName
    //  override var type : String? = "TsKeywordType"
    override var kind: String? = null
    override var span: Span? = null
}

interface TsThisType : Node, HasSpan, TsType, TsThisTypeOrIdent {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsThisType")
class TsThisTypeImpl : TsThisType {
    // conflict with @SerialName
    //  override var type : String? = "TsThisType"
    override var span: Span? = null
}

interface TsFunctionType : Node, HasSpan, TsFnOrConstructorType {
    // conflict with @SerialName
    //  var type: String?
    var params: Array<TsFnParameter>?
    var typeParams: TsTypeParameterDeclaration?
    var typeAnnotation: TsTypeAnnotation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsFunctionType")
class TsFunctionTypeImpl : TsFunctionType {
    // conflict with @SerialName
    //  override var type : String? = "TsFunctionType"
    override var params: Array<TsFnParameter>? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var span: Span? = null
}

interface TsConstructorType : Node, HasSpan, TsFnOrConstructorType {
    // conflict with @SerialName
    //  var type: String?
    var params: Array<TsFnParameter>?
    var typeParams: TsTypeParameterDeclaration?
    var typeAnnotation: TsTypeAnnotation?
    var isAbstract: Boolean?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsConstructorType")
class TsConstructorTypeImpl : TsConstructorType {
    // conflict with @SerialName
    //  override var type : String? = "TsConstructorType"
    override var params: Array<TsFnParameter>? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var isAbstract: Boolean? = null
    override var span: Span? = null
}

interface TsTypeReference : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var typeName: TsEntityName?
    var typeParams: TsTypeParameterInstantiation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypeReference")
class TsTypeReferenceImpl : TsTypeReference {
    // conflict with @SerialName
    //  override var type : String? = "TsTypeReference"
    override var typeName: TsEntityName? = null
    override var typeParams: TsTypeParameterInstantiation? = null
    override var span: Span? = null
}

interface TsTypePredicate : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var asserts: Boolean?
    var paramName: TsThisTypeOrIdent?
    var typeAnnotation: TsTypeAnnotation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypePredicate")
class TsTypePredicateImpl : TsTypePredicate {
    // conflict with @SerialName
    //  override var type : String? = "TsTypePredicate"
    override var asserts: Boolean? = null
    override var paramName: TsThisTypeOrIdent? = null
    override var typeAnnotation: TsTypeAnnotation? = null
    override var span: Span? = null
}

interface TsImportType : Node, HasSpan, TsType, TsTypeQueryExpr {
    // conflict with @SerialName
    //  var type: String?
    var argument: StringLiteral?
    var qualifier: TsEntityName?
    var typeArguments: TsTypeParameterInstantiation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsImportType")
class TsImportTypeImpl : TsImportType {
    // conflict with @SerialName
    //  override var type : String? = "TsImportType"
    override var argument: StringLiteral? = null
    override var qualifier: TsEntityName? = null
    override var typeArguments: TsTypeParameterInstantiation? = null
    override var span: Span? = null
}

/**
 * `typeof` operator
 */
interface TsTypeQuery : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var exprName: TsTypeQueryExpr?
    var typeArguments: TsTypeParameterInstantiation?
    override var span: Span?
}

/**
 * `typeof` operator
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypeQuery")
class TsTypeQueryImpl : TsTypeQuery {
    // conflict with @SerialName
    //  override var type : String? = "TsTypeQuery"
    override var exprName: TsTypeQueryExpr? = null
    override var typeArguments: TsTypeParameterInstantiation? = null
    override var span: Span? = null
}

interface TsTypeLiteral : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var members: Array<TsTypeElement>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypeLiteral")
class TsTypeLiteralImpl : TsTypeLiteral {
    // conflict with @SerialName
    //  override var type : String? = "TsTypeLiteral"
    override var members: Array<TsTypeElement>? = null
    override var span: Span? = null
}

interface TsArrayType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var elemType: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsArrayType")
class TsArrayTypeImpl : TsArrayType {
    // conflict with @SerialName
    //  override var type : String? = "TsArrayType"
    override var elemType: TsType? = null
    override var span: Span? = null
}

interface TsTupleType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var elemTypes: Array<TsTupleElement>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTupleType")
class TsTupleTypeImpl : TsTupleType {
    // conflict with @SerialName
    //  override var type : String? = "TsTupleType"
    override var elemTypes: Array<TsTupleElement>? = null
    override var span: Span? = null
}

interface TsTupleElement : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var label: Pattern?
    var ty: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTupleElement")
class TsTupleElementImpl : TsTupleElement {
    // conflict with @SerialName
    //  override var type : String? = "TsTupleElement"
    override var label: Pattern? = null
    override var ty: TsType? = null
    override var span: Span? = null
}

interface TsOptionalType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var typeAnnotation: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsOptionalType")
class TsOptionalTypeImpl : TsOptionalType {
    // conflict with @SerialName
    //  override var type : String? = "TsOptionalType"
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

interface TsRestType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var typeAnnotation: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsRestType")
class TsRestTypeImpl : TsRestType {
    // conflict with @SerialName
    //  override var type : String? = "TsRestType"
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

interface TsUnionType : Node, HasSpan, TsUnionOrIntersectionType {
    // conflict with @SerialName
    //  var type: String?
    var types: Array<TsType>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsUnionType")
class TsUnionTypeImpl : TsUnionType {
    // conflict with @SerialName
    //  override var type : String? = "TsUnionType"
    override var types: Array<TsType>? = null
    override var span: Span? = null
}

interface TsIntersectionType : Node, HasSpan, TsUnionOrIntersectionType {
    // conflict with @SerialName
    //  var type: String?
    var types: Array<TsType>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsIntersectionType")
class TsIntersectionTypeImpl : TsIntersectionType {
    // conflict with @SerialName
    //  override var type : String? = "TsIntersectionType"
    override var types: Array<TsType>? = null
    override var span: Span? = null
}

interface TsConditionalType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var checkType: TsType?
    var extendsType: TsType?
    var trueType: TsType?
    var falseType: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsConditionalType")
class TsConditionalTypeImpl : TsConditionalType {
    // conflict with @SerialName
    //  override var type : String? = "TsConditionalType"
    override var checkType: TsType? = null
    override var extendsType: TsType? = null
    override var trueType: TsType? = null
    override var falseType: TsType? = null
    override var span: Span? = null
}

interface TsInferType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var typeParam: TsTypeParameter?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsInferType")
class TsInferTypeImpl : TsInferType {
    // conflict with @SerialName
    //  override var type : String? = "TsInferType"
    override var typeParam: TsTypeParameter? = null
    override var span: Span? = null
}

interface TsParenthesizedType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var typeAnnotation: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsParenthesizedType")
class TsParenthesizedTypeImpl : TsParenthesizedType {
    // conflict with @SerialName
    //  override var type : String? = "TsParenthesizedType"
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

interface TsTypeOperator : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var op: String?
    var typeAnnotation: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypeOperator")
class TsTypeOperatorImpl : TsTypeOperator {
    // conflict with @SerialName
    //  override var type : String? = "TsTypeOperator"
    override var op: String? = null
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

interface TsIndexedAccessType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var readonly: Boolean?
    var objectType: TsType?
    var indexType: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsIndexedAccessType")
class TsIndexedAccessTypeImpl : TsIndexedAccessType {
    // conflict with @SerialName
    //  override var type : String? = "TsIndexedAccessType"
    override var readonly: Boolean? = null
    override var objectType: TsType? = null
    override var indexType: TsType? = null
    override var span: Span? = null
}

interface TsMappedType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var readonly: TruePlusMinus?
    var typeParam: TsTypeParameter?
    var nameType: TsType?
    var optional: TruePlusMinus?
    var typeAnnotation: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsMappedType")
class TsMappedTypeImpl : TsMappedType {
    // conflict with @SerialName
    //  override var type : String? = "TsMappedType"
    override var readonly: TruePlusMinus? = null
    override var typeParam: TsTypeParameter? = null
    override var nameType: TsType? = null
    override var optional: TruePlusMinus? = null
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

interface TsLiteralType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    var literal: TsLiteral?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsLiteralType")
class TsLiteralTypeImpl : TsLiteralType {
    // conflict with @SerialName
    //  override var type : String? = "TsLiteralType"
    override var literal: TsLiteral? = null
    override var span: Span? = null
}

interface TsTemplateLiteralType : Node, HasSpan, TsLiteral {
    // conflict with @SerialName
    //  var type: String?
    var types: Array<TsType>?
    var quasis: Array<TemplateElement>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTemplateLiteralType")
class TsTemplateLiteralTypeImpl : TsTemplateLiteralType {
    // conflict with @SerialName
    //  override var type : String? = "TemplateLiteral"
    override var types: Array<TsType>? = null
    override var quasis: Array<TemplateElement>? = null
    override var span: Span? = null
}

interface TsInterfaceDeclaration : Node, HasSpan, Declaration, DefaultDecl {
    // conflict with @SerialName
    //  var type: String?
    var id: Identifier?
    var declare: Boolean?
    var typeParams: TsTypeParameterDeclaration?
    var extends: Array<TsExpressionWithTypeArguments>?
    var body: TsInterfaceBody?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsInterfaceDeclaration")
class TsInterfaceDeclarationImpl : TsInterfaceDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "TsInterfaceDeclaration"
    override var id: Identifier? = null
    override var declare: Boolean? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var extends: Array<TsExpressionWithTypeArguments>? = null
    override var body: TsInterfaceBody? = null
    override var span: Span? = null
}

interface TsInterfaceBody : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var body: Array<TsTypeElement>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsInterfaceBody")
class TsInterfaceBodyImpl : TsInterfaceBody {
    // conflict with @SerialName
    //  override var type : String? = "TsInterfaceBody"
    override var body: Array<TsTypeElement>? = null
    override var span: Span? = null
}

interface TsExpressionWithTypeArguments : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    var typeArguments: TsTypeParameterInstantiation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsExpressionWithTypeArguments")
class TsExpressionWithTypeArgumentsImpl : TsExpressionWithTypeArguments {
    // conflict with @SerialName
    //  override var type : String? = "TsExpressionWithTypeArguments"
    override var expression: Expression? = null
    override var typeArguments: TsTypeParameterInstantiation? = null
    override var span: Span? = null
}

interface TsTypeAliasDeclaration : Node, HasSpan, Declaration {
    // conflict with @SerialName
    //  var type: String?
    var declare: Boolean?
    var id: Identifier?
    var typeParams: TsTypeParameterDeclaration?
    var typeAnnotation: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypeAliasDeclaration")
class TsTypeAliasDeclarationImpl : TsTypeAliasDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "TsTypeAliasDeclaration"
    override var declare: Boolean? = null
    override var id: Identifier? = null
    override var typeParams: TsTypeParameterDeclaration? = null
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

interface TsEnumDeclaration : Node, HasSpan, Declaration {
    // conflict with @SerialName
    //  var type: String?
    var declare: Boolean?
    var isConst: Boolean?
    var id: Identifier?
    var members: Array<TsEnumMember>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsEnumDeclaration")
class TsEnumDeclarationImpl : TsEnumDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "TsEnumDeclaration"
    override var declare: Boolean? = null
    override var isConst: Boolean? = null
    override var id: Identifier? = null
    override var members: Array<TsEnumMember>? = null
    override var span: Span? = null
}

interface TsEnumMember : Node, HasSpan {
    // conflict with @SerialName
    //  var type: String?
    var id: TsEnumMemberId?
    var init: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsEnumMember")
class TsEnumMemberImpl : TsEnumMember {
    // conflict with @SerialName
    //  override var type : String? = "TsEnumMember"
    override var id: TsEnumMemberId? = null
    override var init: Expression? = null
    override var span: Span? = null
}

interface TsModuleDeclaration : Node, HasSpan, Declaration {
    // conflict with @SerialName
    //  var type: String?
    var declare: Boolean?
    var global: Boolean?
    var id: TsModuleName?
    var body: TsNamespaceBody?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsModuleDeclaration")
class TsModuleDeclarationImpl : TsModuleDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "TsModuleDeclaration"
    override var declare: Boolean? = null
    override var global: Boolean? = null
    override var id: TsModuleName? = null
    override var body: TsNamespaceBody? = null
    override var span: Span? = null
}

interface TsModuleBlock : Node, HasSpan, TsNamespaceBody {
    // conflict with @SerialName
    //  var type: String?
    var body: Array<ModuleItem>?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsModuleBlock")
class TsModuleBlockImpl : TsModuleBlock {
    // conflict with @SerialName
    //  override var type : String? = "TsModuleBlock"
    override var body: Array<ModuleItem>? = null
    override var span: Span? = null
}

interface TsNamespaceDeclaration : Node, HasSpan, TsNamespaceBody {
    // conflict with @SerialName
    //  var type: String?
    var declare: Boolean?
    var global: Boolean?
    var id: Identifier?
    var body: TsNamespaceBody?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsNamespaceDeclaration")
class TsNamespaceDeclarationImpl : TsNamespaceDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "TsNamespaceDeclaration"
    override var declare: Boolean? = null
    override var global: Boolean? = null
    override var id: Identifier? = null
    override var body: TsNamespaceBody? = null
    override var span: Span? = null
}

interface TsImportEqualsDeclaration : Node, HasSpan, ModuleDeclaration {
    // conflict with @SerialName
    //  var type: String?
    var declare: Boolean?
    var isExport: Boolean?
    var isTypeOnly: Boolean?
    var id: Identifier?
    var moduleRef: TsModuleReference?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsImportEqualsDeclaration")
class TsImportEqualsDeclarationImpl : TsImportEqualsDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "TsImportEqualsDeclaration"
    override var declare: Boolean? = null
    override var isExport: Boolean? = null
    override var isTypeOnly: Boolean? = null
    override var id: Identifier? = null
    override var moduleRef: TsModuleReference? = null
    override var span: Span? = null
}

interface TsExternalModuleReference : Node, HasSpan, TsModuleReference {
    // conflict with @SerialName
    //  var type: String?
    var expression: StringLiteral?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsExternalModuleReference")
class TsExternalModuleReferenceImpl : TsExternalModuleReference {
    // conflict with @SerialName
    //  override var type : String? = "TsExternalModuleReference"
    override var expression: StringLiteral? = null
    override var span: Span? = null
}

interface TsExportAssignment : Node, HasSpan, ModuleDeclaration {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsExportAssignment")
class TsExportAssignmentImpl : TsExportAssignment {
    // conflict with @SerialName
    //  override var type : String? = "TsExportAssignment"
    override var expression: Expression? = null
    override var span: Span? = null
}

interface TsNamespaceExportDeclaration : Node, HasSpan, ModuleDeclaration {
    // conflict with @SerialName
    //  var type: String?
    var id: Identifier?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsNamespaceExportDeclaration")
class TsNamespaceExportDeclarationImpl : TsNamespaceExportDeclaration {
    // conflict with @SerialName
    //  override var type : String? = "TsNamespaceExportDeclaration"
    override var id: Identifier? = null
    override var span: Span? = null
}

interface TsAsExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    var typeAnnotation: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsAsExpression")
class TsAsExpressionImpl : TsAsExpression {
    // conflict with @SerialName
    //  override var type : String? = "TsAsExpression"
    override var expression: Expression? = null
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

interface TsSatisfiesExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    var typeAnnotation: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsSatisfiesExpression")
class TsSatisfiesExpressionImpl : TsSatisfiesExpression {
    // conflict with @SerialName
    //  override var type : String? = "TsSatisfiesExpression"
    override var expression: Expression? = null
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

interface TsInstantiation : Node, HasSpan, Expression {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    var typeArguments: TsTypeParameterInstantiation?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsInstantiation")
class TsInstantiationImpl : TsInstantiation {
    // conflict with @SerialName
    //  override var type : String? = "TsInstantiation"
    override var expression: Expression? = null
    override var typeArguments: TsTypeParameterInstantiation? = null
    override var span: Span? = null
}

interface TsTypeAssertion : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    var typeAnnotation: TsType?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsTypeAssertion")
class TsTypeAssertionImpl : TsTypeAssertion {
    // conflict with @SerialName
    //  override var type : String? = "TsTypeAssertion"
    override var expression: Expression? = null
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

interface TsConstAssertion : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsConstAssertion")
class TsConstAssertionImpl : TsConstAssertion {
    // conflict with @SerialName
    //  override var type : String? = "TsConstAssertion"
    override var expression: Expression? = null
    override var span: Span? = null
}

interface TsNonNullExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var expression: Expression?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("TsNonNullExpression")
class TsNonNullExpressionImpl : TsNonNullExpression {
    // conflict with @SerialName
    //  override var type : String? = "TsNonNullExpression"
    override var expression: Expression? = null
    override var span: Span? = null
}

interface Invalid : Node, HasSpan, Expression, Pattern {
    // conflict with @SerialName
    //  var type: String?
    override var span: Span?
}

@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("type")
@SerialName("Invalid")
class InvalidImpl : Invalid {
    // conflict with @SerialName
    //  override var type : String? = "Invalid"
    override var span: Span? = null
}
