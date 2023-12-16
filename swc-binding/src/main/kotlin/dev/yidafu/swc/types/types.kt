package dev.yidafu.swc.types

import dev.yidafu.swc.booleanable.*
import kotlinx.serialization.*
import kotlinx.serialization.json.JsonClassDiscriminator

@SwcDslMarker
annotation class SwcDslMarker

typealias Record<T, S> = Map<T, String>

typealias TerserEcmaVersion = String

typealias JscTarget = String

typealias TruePlusMinus = BooleanableString

@SwcDslMarker
@Serializable
@SerialName("ExperimentalLiteral")
class ExperimentalLiteral {
    var optimizeHygiene: Boolean? = null
    var keepImportAttributes: Boolean? = null
    var emitAssertForImportAttributes: Boolean? = null
    var cacheRoot: String? = null
    var plugins: Array<Map<String, Record<String, Any>>>? = null
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
class Plugin

@SwcDslMarker
@Serializable
class JsMinifyOptions {
    @Serializable(BooleanableTerserCompressOptionsSerializer::class)
    var compress: BooleanableTerserCompressOptions? = null
    var format: JsFormatOptions? = null

    @Serializable(BooleanableTerserMangleOptionsSerializer::class)
    var mangle: BooleanableTerserMangleOptions? = null
    var ecma: TerserEcmaVersion? = null
    var keep_classnames: Boolean? = null
    var keep_fnames: Boolean? = null
    var module: Boolean? = null
    var safari10: Boolean? = null

    @Serializable(BooleanableStringSerializer::class)
    var toplevel: BooleanableString? = null
    var sourceMap: Boolean? = null
    var outputPath: String? = null
    var inlineSourcesContent: Boolean? = null
}

/**
 * These properties are mostly not implemented yet,
 * but it exists to support passing terser config to swc minify
 * without modification.
 */
@SwcDslMarker
@Serializable
class JsFormatOptions {
    var asciiOnly: Boolean? = null
    var beautify: Boolean? = null
    var braces: Boolean? = null
    var comments: String? = null
    var ecma: TerserEcmaVersion? = null
    var indentLevel: Int? = null
    var indentStart: Int? = null
    var inlineScript: Int? = null
    var keepNumbers: Int? = null
    var keepQuotedProps: Boolean? = null

    @Serializable(BooleanableIntSerializer::class)
    var maxLineLen: BooleanableInt? = null
    var preamble: String? = null
    var quoteKeys: Boolean? = null
    var quoteStyle: Boolean? = null
    var preserveAnnotations: Boolean? = null
    var safari10: Boolean? = null
    var semicolons: Boolean? = null
    var shebang: Boolean? = null
    var webkit: Boolean? = null
    var wrapIife: Boolean? = null
    var wrapFuncArgs: Boolean? = null
}

@SwcDslMarker
@Serializable
class TerserCompressOptions {
    var arguments: Boolean? = null
    var arrows: Boolean? = null
    var booleans: Boolean? = null
    var booleans_as_integers: Boolean? = null
    var collapse_vars: Boolean? = null
    var comparisons: Boolean? = null
    var computed_props: Boolean? = null
    var conditionals: Boolean? = null
    var dead_code: Boolean? = null
    var defaults: Boolean? = null
    var directives: Boolean? = null
    var drop_console: Boolean? = null
    var drop_debugger: Boolean? = null
    var ecma: TerserEcmaVersion? = null
    var evaluate: Boolean? = null
    var expression: Boolean? = null
    var global_defs: Map<String, String>? = null
    var hoist_funs: Boolean? = null
    var hoist_props: Boolean? = null
    var hoist_vars: Boolean? = null
    var ie8: Boolean? = null
    var if_return: Boolean? = null
    var jsInline: Int? = null
    var join_vars: Boolean? = null
    var keep_classnames: Boolean? = null
    var keep_fargs: Boolean? = null
    var keep_fnames: Boolean? = null
    var keep_infinity: Boolean? = null
    var loops: Boolean? = null
    var negate_iife: Boolean? = null
    var passes: Int? = null
    var properties: Boolean? = null

    @Serializable(BooleanableStringSerializer::class)
    var pure_getters: BooleanableString? = null
    var pure_funcs: Array<String>? = null
    var reduce_funcs: Boolean? = null
    var reduce_vars: Boolean? = null
    var sequences: Boolean? = null
    var side_effects: Boolean? = null
    var switches: Boolean? = null

    @Serializable(BooleanableStringSerializer::class)
    var top_retain: BooleanableString? = null

    @Serializable(BooleanableStringSerializer::class)
    var toplevel: BooleanableString? = null
    var typeofs: Boolean? = null
    var unsafe: Boolean? = null
    var unsafe_passes: Boolean? = null
    var unsafe_arrows: Boolean? = null
    var unsafe_comps: Boolean? = null
    var unsafe_function: Boolean? = null
    var unsafe_math: Boolean? = null
    var unsafe_symbols: Boolean? = null
    var unsafe_methods: Boolean? = null
    var unsafe_proto: Boolean? = null
    var unsafe_regexp: Boolean? = null
    var unsafe_undefined: Boolean? = null
    var unused: Boolean? = null
    var const_to_let: Boolean? = null
    var module: Boolean? = null
}

@SwcDslMarker
@Serializable
class TerserMangleOptions {
    var props: TerserManglePropertiesOptions? = null

    @Serializable(BooleanableStringSerializer::class)
    var toplevel: BooleanableString? = null
    var keep_classnames: Boolean? = null
    var keep_fnames: Boolean? = null
    var keep_private_props: Boolean? = null
    var ie8: Boolean? = null
    var safari10: Boolean? = null
    var reserved: Array<String>? = null
}

@SwcDslMarker
@Serializable
class TerserManglePropertiesOptions

/**
 * Programmatic options.
 */
@SwcDslMarker
@Serializable
class Options : Config {
    var script: Boolean? = null
    var cwd: String? = null
    var caller: CallerOptions? = null
    var filename: String? = null
    var root: String? = null
    var rootMode: String? = null
    var envName: String? = null

    @Serializable(BooleanableStringSerializer::class)
    var configFile: BooleanableString? = null
    var swcrc: Boolean? = null

    @Serializable(BooleanableArrayMatchPatternSerializer::class)
    var swcrcRoots: BooleanableArrayMatchPattern? = null

    @Serializable(BooleanableStringSerializer::class)
    var inputSourceMap: BooleanableString? = null
    var sourceFileName: String? = null
    var sourceRoot: String? = null
    var plugin: Plugin? = null

    @Serializable(BooleanableStringSerializer::class)
    var isModule: BooleanableString? = null
    var outputPath: String? = null
    override var test: Array<String>? = null
    override var exclude: Array<String>? = null
    override var env: EnvConfig? = null
    override var jsc: JscConfig? = null
    override var module: ModuleConfig? = null
    override var minify: Boolean? = null

    @Serializable(BooleanableStringSerializer::class)
    override var sourceMaps: BooleanableString? = null
    override var inlineSourcesContent: Boolean? = null
}

@SwcDslMarker
@Serializable
class CallerOptions {
    var name: String? = null
}

/**
 * Configuration ported from babel-preset-env
 */
@SwcDslMarker
@Serializable
class EnvConfig {
    var mode: String? = null
    var debug: Boolean? = null
    var dynamicImport: Boolean? = null
    var loose: Boolean? = null
    var skip: Array<String>? = null
    var include: Array<String>? = null
    var exclude: Array<String>? = null
    var coreJs: String? = null
    var targets: Map<String, String>? = null
    var path: String? = null
    var shippedProposals: Boolean? = null
    var forceAllTransforms: Boolean? = null
}

@SwcDslMarker
@Serializable
class JscConfig {
    var loose: Boolean? = null
    var parser: ParserConfig? = null
    var transform: TransformConfig? = null
    var externalHelpers: Boolean? = null
    var target: JscTarget? = null
    var keepClassNames: Boolean? = null
    var experimental: ExperimentalLiteral? = null
    var baseUrl: String? = null
    var paths: Map<String, Array<String>>? = null
    var minify: JsMinifyOptions? = null
    var preserveAllComments: Boolean? = null
}

@SwcDslMarker
@Serializable
@SerialName("typescript")
class TsParserConfig : ParserConfig {
//    var syntax: String? = null
    var tsx: Boolean? = null
    var decorators: Boolean? = null
    var dynamicImport: Boolean? = null
    override var comments: Boolean? = null
    override var script: Boolean? = null
    override var target: JscTarget? = null
}

@SwcDslMarker
@Serializable
@SerialName("ecmascript")
class EsParserConfig : ParserConfig {
//    var syntax: String? = null
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
    override var comments: Boolean? = null
    override var script: Boolean? = null
    override var target: JscTarget? = null
}

/**
 * Options for transform.
 */
@SwcDslMarker
@Serializable
class TransformConfig {
    var react: ReactConfig? = null
    var constModules: ConstModulesConfig? = null
    var optimizer: OptimizerConfig? = null
    var legacyDecorator: Boolean? = null
    var decoratorMetadata: Boolean? = null
    var treatConstEnumAsEnum: Boolean? = null
    var useDefineForClassFields: Boolean? = null
}

@SwcDslMarker
@Serializable
class ReactConfig {
    var pragma: String? = null
    var pragmaFrag: String? = null
    var throwIfNamespace: Boolean? = null
    var development: Boolean? = null
    var useBuiltins: Boolean? = null
    var refresh: Boolean? = null
    var runtime: String? = null
    var importSource: String? = null
}

/**
 *  - `import { DEBUG } from '@ember/env-flags';`
 *  - `import { FEATURE_A, FEATURE_B } from '@ember/features';`
 *
 * See: https://github.com/swc-project/swc/issues/18#issuecomment-466272558
 */
@SwcDslMarker
@Serializable
class ConstModulesConfig {
    var globals: Map<String, Map<String, String>>? = null
}

@SwcDslMarker
@Serializable
class OptimizerConfig {
    var simplify: Boolean? = null
    var globals: GlobalPassOption? = null
    var jsonify: JsonifyLiteral? = null
}

/**
 * Options for inline-global pass.
 */
@SwcDslMarker
@Serializable
class GlobalPassOption {
    var vars: Record<String, String>? = null
    var envs: Array<String>? = null
    var typeofs: Record<String, String>? = null
}

@SwcDslMarker
@Serializable
class Es6Config : BaseModuleConfig, ModuleConfig {
    // conflict with @SerialName
    //   var type : Int? = null
    override var strict: Boolean? = null
    override var strictMode: Boolean? = null

    @Serializable(BooleanableArrayStringSerializer::class)
    override var lazy: BooleanableArrayString? = null
    override var noInterop: Boolean? = null
    override var importInterop: String? = null
    override var exportInteropAnnotation: Boolean? = null
    override var ignoreDynamic: Boolean? = null
    override var allowTopLevelThis: Boolean? = null
    override var preserveImportMeta: Boolean? = null
}

@SwcDslMarker
@Serializable
class NodeNextConfig : BaseModuleConfig, ModuleConfig {
    // conflict with @SerialName
    //   var type : String? = null
    override var strict: Boolean? = null
    override var strictMode: Boolean? = null

    @Serializable(BooleanableArrayStringSerializer::class)
    override var lazy: BooleanableArrayString? = null
    override var noInterop: Boolean? = null
    override var importInterop: String? = null
    override var exportInteropAnnotation: Boolean? = null
    override var ignoreDynamic: Boolean? = null
    override var allowTopLevelThis: Boolean? = null
    override var preserveImportMeta: Boolean? = null
}

@SwcDslMarker
@Serializable
class CommonJsConfig : BaseModuleConfig, ModuleConfig {
    // conflict with @SerialName
    //   var type : String? = null
    override var strict: Boolean? = null
    override var strictMode: Boolean? = null

    @Serializable(BooleanableArrayStringSerializer::class)
    override var lazy: BooleanableArrayString? = null
    override var noInterop: Boolean? = null
    override var importInterop: String? = null
    override var exportInteropAnnotation: Boolean? = null
    override var ignoreDynamic: Boolean? = null
    override var allowTopLevelThis: Boolean? = null
    override var preserveImportMeta: Boolean? = null
}

@SwcDslMarker
@Serializable
class UmdConfig : BaseModuleConfig, ModuleConfig {
    // conflict with @SerialName
    //   var type : String? = null
    var globals: Map<String, String>? = null
    override var strict: Boolean? = null
    override var strictMode: Boolean? = null

    @Serializable(BooleanableArrayStringSerializer::class)
    override var lazy: BooleanableArrayString? = null
    override var noInterop: Boolean? = null
    override var importInterop: String? = null
    override var exportInteropAnnotation: Boolean? = null
    override var ignoreDynamic: Boolean? = null
    override var allowTopLevelThis: Boolean? = null
    override var preserveImportMeta: Boolean? = null
}

@SwcDslMarker
@Serializable
class AmdConfig : BaseModuleConfig, ModuleConfig {
    // conflict with @SerialName
    //   var type : String? = null
    var moduleId: String? = null
    override var strict: Boolean? = null
    override var strictMode: Boolean? = null

    @Serializable(BooleanableArrayStringSerializer::class)
    override var lazy: BooleanableArrayString? = null
    override var noInterop: Boolean? = null
    override var importInterop: String? = null
    override var exportInteropAnnotation: Boolean? = null
    override var ignoreDynamic: Boolean? = null
    override var allowTopLevelThis: Boolean? = null
    override var preserveImportMeta: Boolean? = null
}

@SwcDslMarker
@Serializable
class SystemjsConfig : ModuleConfig {
    // conflict with @SerialName
    //   var type : String? = null
    var allowTopLevelThis: Boolean? = null
}

@SwcDslMarker
@Serializable
class Output {
    var code: String? = null
    var map: String? = null
}

@SwcDslMarker
@Serializable
class MatchPattern

@SwcDslMarker
@Serializable
class Span {
    var start: Int? = null
    var end: Int? = null
    var ctxt: Int? = null
}

@SwcDslMarker
@Serializable
class ExprOrSpread {
    var spread: Span? = null
    var expression: Expression? = null
}

@SwcDslMarker
@Serializable
class Argument {
    var spread: Span? = null
    var expression: Expression? = null
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
    var target: JscTarget?
}

@SwcDslMarker
@Serializable
open class ParseOptions : ParserConfig, BaseParseOptions {
    override var comments: Boolean? = null
    override var script: Boolean? = null
    override var target: JscTarget? = null
}

/**
 * subtypes: [BaseParseOptions]
 */
@SwcDslMarker
interface ParserConfig : BaseParseOptions {
    override var comments: Boolean?
    override var script: Boolean?
    override var target: JscTarget?
}

/**
 * subtypes: []
 */
@SwcDslMarker
interface ModuleConfig

/**
 * subtypes: []
 */
@SwcDslMarker
interface ClassMember

/**
 * subtypes: [Statement]
 */
@SwcDslMarker
interface Declaration : Statement

/**
 * subtypes: [JSXExpression], [Pattern]
 */
@SwcDslMarker
interface Expression : JSXExpression, Pattern

/**
 * subtypes: []
 */
@SwcDslMarker
interface JSXObject

/**
 * subtypes: []
 */
@SwcDslMarker
interface JSXExpression

/**
 * subtypes: []
 */
@SwcDslMarker
interface JSXElementName

/**
 * subtypes: []
 */
@SwcDslMarker
interface JSXAttributeOrSpread

/**
 * subtypes: []
 */
@SwcDslMarker
interface JSXAttributeName

/**
 * subtypes: []
 */
@SwcDslMarker
interface JSXAttrValue

/**
 * subtypes: []
 */
@SwcDslMarker
interface JSXElementChild

/**
 * subtypes: [Expression], [JSXAttrValue]
 */
@SwcDslMarker
interface Literal : Expression, JSXAttrValue

/**
 * subtypes: [ModuleItem]
 */
@SwcDslMarker
interface ModuleDeclaration : ModuleItem

/**
 * subtypes: []
 */
@SwcDslMarker
interface DefaultDecl

/**
 * subtypes: []
 */
@SwcDslMarker
interface ImportSpecifier

/**
 * subtypes: []
 */
@SwcDslMarker
interface ModuleExportName

/**
 * subtypes: []
 */
@SwcDslMarker
interface ExportSpecifier

/**
 * subtypes: []
 */
@SwcDslMarker
interface Program

/**
 * subtypes: []
 */
@SwcDslMarker
interface ModuleItem

/**
 * subtypes: []
 */
@SwcDslMarker
interface Pattern

/**
 * subtypes: []
 */
@SwcDslMarker
interface ObjectPatternProperty

/**
 * subtypes: []
 */
@SwcDslMarker
interface Property

/**
 * subtypes: []
 */
@SwcDslMarker
interface PropertyName

/**
 * subtypes: [ModuleItem]
 */
@SwcDslMarker
interface Statement : ModuleItem

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsParameterPropertyParameter

/**
 * subtypes: [TsTypeQueryExpr], [TsModuleReference]
 */
@SwcDslMarker
interface TsEntityName : TsTypeQueryExpr, TsModuleReference

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsTypeElement

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsType

/**
 * subtypes: [TsType]
 */
@SwcDslMarker
interface TsFnOrConstructorType : TsType

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsFnParameter

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsThisTypeOrIdent

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsTypeQueryExpr

/**
 * subtypes: [TsType]
 */
@SwcDslMarker
interface TsUnionOrIntersectionType : TsType

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsLiteral

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsEnumMemberId

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsNamespaceBody

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsModuleName

/**
 * subtypes: []
 */
@SwcDslMarker
interface TsModuleReference

/**
 * .swcrc
 */
@SwcDslMarker
interface Config {
/**
     * Note: The type is string because it follows rust's regex syntax.
     */
    var test: Array<String>?

/**
     * Note: The type is string because it follows rust's regex syntax.
     */
    var exclude: Array<String>?
    var env: EnvConfig?
    var jsc: JscConfig?
    var module: ModuleConfig?
    var minify: Boolean?

/**
     * - true to generate a sourcemap for the code and include it in the result object.
     * - "inline" to generate a sourcemap and append it as a data URL to the end of the code, but not include it in the result object.
     *
     * `swc-cli` overloads some of these to also affect how maps are written to disk:
     *
     * - true will write the map to a .map file on disk
     * - "inline" will write the file directly, so it will have a data: containing the map
     * - Note: These options are bit weird, so it may make the most sense to just use true
     *  and handle the rest in your own code, depending on your use case.
     */
    @Serializable(BooleanableStringSerializer::class)
    var sourceMaps: BooleanableString?
    var inlineSourcesContent: Boolean?
}

/**
 * .swcrc
 */
@OptIn(ExperimentalSerializationApi::class)
@SwcDslMarker
@Serializable
@JsonClassDiscriminator("source")
@SerialName("Config")
class ConfigImpl : Config {
    override var test: Array<String>? = null
    override var exclude: Array<String>? = null
    override var env: EnvConfig? = null
    override var jsc: JscConfig? = null
    override var module: ModuleConfig? = null
    override var minify: Boolean? = null

    @Serializable(BooleanableStringSerializer::class)
    override var sourceMaps: BooleanableString? = null
    override var inlineSourcesContent: Boolean? = null
}

@SwcDslMarker
interface BaseModuleConfig {
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
    var strict: Boolean?

/**
     * Emits 'use strict' directive.
     *
     * Defaults to `true`.
     */
    var strictMode: Boolean?

/**
     * Changes Babel's compiled import statements to be lazily evaluated when their imported bindings are used for the first time.
     *
     * This can improve initial load time of your module because evaluating dependencies up
     *  front is sometimes entirely un-necessary. This is especially the case when implementing
     *  a library module.
     *
     *
     * The value of `lazy` has a few possible effects:
     *
     *  - `false` - No lazy initialization of any imported module.
     *  - `true` - Do not lazy-initialize local `./foo` imports, but lazy-init `foo` dependencies.
     *
     * Local paths are much more likely to have circular dependencies, which may break if loaded lazily,
     * so they are not lazy by default, whereas dependencies between independent modules are rarely cyclical.
     *
     *  - `Array<string>` - Lazy-initialize all imports with source matching one of the given strings.
     *
     * -----
     *
     * The two cases where imports can never be lazy are:
     *
     *  - `import "foo";`
     *
     * Side-effect imports are automatically non-lazy since their very existence means
     *  that there is no binding to later kick off initialization.
     *
     *  - `export * from "foo"`
     *
     * Re-exporting all names requires up-front execution because otherwise there is no
     * way to know what names need to be exported.
     *
     * Defaults to `false`.
     */
    @Serializable(BooleanableArrayStringSerializer::class)
    var lazy: BooleanableArrayString?

/**
     * @deprecated Use the `importInterop` option instead.
     *
     * By default, when using exports with swc a non-enumerable __esModule property is exported.
     * This property is then used to determine if the import is the default export or if
     *  it contains the default export.
     *
     * In cases where the auto-unwrapping of default is not needed, you can set the noInterop option
     *  to true to avoid the usage of the interopRequireDefault helper (shown in inline form above).
     *
     * Defaults to `false`.
     */
    var noInterop: Boolean?

/**
     * Defaults to `swc`.
     *
     * CommonJS modules and ECMAScript modules are not fully compatible.
     * However, compilers, bundlers and JavaScript runtimes developed different strategies
     * to make them work together as well as possible.
     *
     * - `swc` (alias: `babel`)
     *
     * When using exports with `swc` a non-enumerable `__esModule` property is exported
     * This property is then used to determine if the import is the default export
     * or if it contains the default export.
     *
     * ```javascript
     * import foo from "foo";
     * import { bar } from "bar";
     * foo;
     * bar;
     *
     * // Is compiled to ...
     *
     * "use strict";
     *
     * function _interop_require_default(obj) {
     *   return obj && obj.__esModule ? obj : { default: obj };
     * }
     *
     * var _foo = _interop_require_default(require("foo"));
     * var _bar = require("bar");
     *
     * _foo.default;
     * _bar.bar;
     * ```
     *
     * When this import interop is used, if both the imported and the importer module are compiled
     * with swc they behave as if none of them was compiled.
     *
     * This is the default behavior.
     *
     * - `node`
     *
     * When importing CommonJS files (either directly written in CommonJS, or generated with a compiler)
     * Node.js always binds the `default` export to the value of `module.exports`.
     *
     * ```javascript
     * import foo from "foo";
     * import { bar } from "bar";
     * foo;
     * bar;
     *
     * // Is compiled to ...
     *
     * "use strict";
     *
     * var _foo = require("foo");
     * var _bar = require("bar");
     *
     * _foo;
     * _bar.bar;
     * ```
     * This is not exactly the same as what Node.js does since swc allows accessing any property of `module.exports`
     * as a named export, while Node.js only allows importing statically analyzable properties of `module.exports`.
     * However, any import working in Node.js will also work when compiled with swc using `importInterop: "node"`.
     *
     * - `none`
     *
     * If you know that the imported file has been transformed with a compiler that stores the `default` export on
     * `exports.default` (such as swc or Babel), you can safely omit the `_interop_require_default` helper.
     *
     * ```javascript
     * import foo from "foo";
     * import { bar } from "bar";
     * foo;
     * bar;
     *
     * // Is compiled to ...
     *
     * "use strict";
     *
     * var _foo = require("foo");
     * var _bar = require("bar");
     *
     * _foo.default;
     * _bar.bar;
     * ```
     */
    var importInterop: String?

/**
     * Emits `cjs-module-lexer` annotation
     * `cjs-module-lexer` is used in Node.js core for detecting the named exports available when importing a CJS module into ESM.
     * swc will emit `cjs-module-lexer` detectable annotation with this option enabled.
     *
     * Defaults to `true` if import_interop is Node, else `false`
     */
    var exportInteropAnnotation: Boolean?

/**
     * If set to true, dynamic imports will be preserved.
     */
    var ignoreDynamic: Boolean?
    var allowTopLevelThis: Boolean?
    var preserveImportMeta: Boolean?
}

@SwcDslMarker
// @Serializable(NodeSerializer::class)
sealed interface Node {
    // conflict with @SerialName
    //  var type: String?
}

@SwcDslMarker
interface HasSpan {
    var span: Span?
}

@SwcDslMarker
interface HasDecorator {
    var decorators: Array<Decorator>?
}

@SwcDslMarker
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

@SwcDslMarker
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
    // override  var type: String?
    override var span: Span?
    override var decorators: Array<Decorator>?
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface Constructor : Node, HasSpan, ClassMember {
    // conflict with @SerialName
    //  var type: String?
    var key: PropertyName?
    var params: Array<HasDecorator>?
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
    override var params: Array<HasDecorator>? = null
    override var body: BlockStatement? = null
    override var accessibility: String? = null
    override var isOptional: Boolean? = null
    override var span: Span? = null
}

@SwcDslMarker
interface ClassMethodBase : Node, HasSpan {
    var function: Fn?
    var kind: String?
    var isStatic: Boolean?
    var accessibility: String?
    var isAbstract: Boolean?
    var isOptional: Boolean?
    var isOverride: Boolean?

    // conflict with @SerialName
    // override  var type: String?
    override var span: Span?
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface ExpressionBase : Node, HasSpan {
    // conflict with @SerialName
    // override  var type: String?
    override var span: Span?
}

@SwcDslMarker
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

@SwcDslMarker
interface OptionalChainingExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var questionDotToken: Span?

/**
     * Call expression or member expression.
     */
    var base: Expression?
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
    override var base: Expression? = null
    override var span: Span? = null
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface ObjectExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var properties: Array<Property>?
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
    override var properties: Array<Property>? = null
    override var span: Span? = null
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface AssignmentExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var operator: String?
    var left: Pattern?
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
    override var left: Pattern? = null
    override var right: Expression? = null
    override var span: Span? = null
}

@SwcDslMarker
interface MemberExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var jsObject: Expression?
    var property: TsModuleName?
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
    override var property: TsModuleName? = null
    override var span: Span? = null
}

@SwcDslMarker
interface SuperPropExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var obj: Super?
    var property: TsModuleName?
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
    override var property: TsModuleName? = null
    override var span: Span? = null
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface CallExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var callee: Pattern?
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
    override var callee: Pattern? = null
    override var arguments: Array<Argument>? = null
    override var typeArguments: TsTypeParameterInstantiation? = null
    override var span: Span? = null
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface ArrowFunctionExpression : ExpressionBase, Expression {
    // conflict with @SerialName
    //  var type: String?
    var params: Array<Pattern>?
    var body: Pattern?
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
    override var body: Pattern? = null
    override var async: Boolean? = null
    override var generator: Boolean? = null
    override var typeParameters: TsTypeParameterDeclaration? = null
    override var returnType: TsTypeAnnotation? = null
    override var span: Span? = null
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface PatternBase : Node, HasSpan {
    var typeAnnotation: TsTypeAnnotation?

    // conflict with @SerialName
    // override  var type: String?
    override var span: Span?
}

@SwcDslMarker
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

@SwcDslMarker
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
@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface NumericLiteral : Node, HasSpan, Literal, PropertyName, TsLiteral {
    // conflict with @SerialName
    //  var type: String?
    var value: Float?
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
    override var value: Float? = null
    override var raw: String? = null
    override var span: Span? = null
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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
@SwcDslMarker
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

@SwcDslMarker
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
@SwcDslMarker
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
@SwcDslMarker
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
@SwcDslMarker
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
@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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
@SwcDslMarker
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
@SwcDslMarker
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

@SwcDslMarker
interface PropBase : Node {
    var key: PropertyName?
    // conflict with @SerialName
    // override  var type: String?
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
@JsonClassDiscriminator("type")
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface WithStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    @SerialName("object")
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
    @SerialName("object")
    override var jsObject: Expression? = null
    override var body: Statement? = null
    override var span: Span? = null
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface ForStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var init: Pattern?
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
    override var init: Pattern? = null
    override var test: Expression? = null
    override var update: Expression? = null
    override var body: Statement? = null
    override var span: Span? = null
}

@SwcDslMarker
interface ForInStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
    var left: Pattern?
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
    override var left: Pattern? = null
    override var right: Expression? = null
    override var body: Statement? = null
    override var span: Span? = null
}

@SwcDslMarker
interface ForOfStatement : Node, HasSpan, Statement {
    // conflict with @SerialName
    //  var type: String?
/**
     *  Span of the await token.
     *
     *  es2018 for-await-of statements, e.g., `for await (const x of xs) {`
     */
    var await: Span?
    var left: Pattern?
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
    override var left: Pattern? = null
    override var right: Expression? = null
    override var body: Statement? = null
    override var span: Span? = null
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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
@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
interface TsMappedType : Node, HasSpan, TsType {
    // conflict with @SerialName
    //  var type: String?
    @Serializable(BooleanableStringSerializer::class)
    var readonly: TruePlusMinus?
    var typeParam: TsTypeParameter?
    var nameType: TsType?

    @Serializable(BooleanableStringSerializer::class)
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
    @Serializable(BooleanableStringSerializer::class)
    override var readonly: TruePlusMinus? = null
    override var typeParam: TsTypeParameter? = null
    override var nameType: TsType? = null

    @Serializable(BooleanableStringSerializer::class)
    override var optional: TruePlusMinus? = null
    override var typeAnnotation: TsType? = null
    override var span: Span? = null
}

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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

@SwcDslMarker
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
