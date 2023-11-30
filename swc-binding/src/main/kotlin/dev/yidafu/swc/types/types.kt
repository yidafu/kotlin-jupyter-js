package dev.yidafu.swc.types



import dev.yidafu.swc.types.Union

import kotlinx.serialization.*



@SwcDslMarker

annotation class SwcDslMarker

typealias Record<T, S> = Map<T, String>



/**
  * "es3" | "es5" | "es2015" | "es2016" | "es2017" | "es2018" | "es2019" | "es2020" | "es2021" | "es2022" | "esnext"
  */
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

/**
  * "method" | "getter" | "setter"
  */
object MethodKind {
  const val METHOD = "method"
  const val GETTER = "getter"
  const val SETTER = "setter"
}

/**
  * "var" | "let" | "const"
  */
object VariableDeclarationKind {
  const val VAR = "var"
  const val LET = "let"
  const val CONST = "const"
}

/**
  * "==" | "!=" | "===" | "!==" | "<" | "<=" | ">" | ">=" | "<<" | ">>" | ">>>" | "+" | "-" | "*" | "/" | "%" | "|" | "^" | "&" | "||" | "&&" | "in" | "instanceof" | "**" | "??"
  */
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

/**
  * "=" | "+=" | "-=" | "*=" | "/=" | "%=" | "<<=" | ">>=" | ">>>=" | "|=" | "^=" | "&=" | "**=" | "&&=" | "||=" | "??="
  */
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

/**
  * "++" | "--"
  */
object UpdateOperator {
  const val Increment = "++"
  const val Decrement = "--"
}

/**
  * "-" | "+" | "!" | "~" | "typeof" | "void" | "delete"
  */
object UnaryOperator {
  const val UnaryNegation = "-"
  const val UnaryPlus = "+"
  const val LogicalNOT = "!"
  const val BitwiseNOT = "~"
  const val TYPEOF = "typeof"
  const val VOID = "void"
  const val DELETE = "delete"
}

/**
  * "any" | "unknown" | "number" | "object" | "boolean" | "bigint" | "string" | "symbol" | "void" | "undefined" | "null" | "never" | "intrinsic"
  */
object TsKeywordTypeKind {
  const val ANY = "any"
  const val UNKNOWN = "unknown"
  const val NUMBER = "number"
  const val OBJECT = "object"
  const val BOOLEAN = "boolean"
  const val BIGINT = "bigint"
  const val STRING = "string"
  const val SYMBOL = "symbol"
  const val VOID = "void"
  const val UNDEFINED = "undefined"
  const val NULL = "null"
  const val NEVER = "never"
  const val INTRINSIC = "intrinsic"
}

/**
  * "keyof" | "unique" | "readonly"
  */
object TsTypeOperatorOp {
  const val KEYOF = "keyof"
  const val UNIQUE = "unique"
  const val READONLY = "readonly"
}

/**
  * "public" | "protected" | "private"
  */
object Accessibility {
  const val PUBLIC = "public"
  const val PROTECTED = "protected"
  const val PRIVATE = "private"
}

typealias TerserEcmaVersion = Union.U2<Int, String>

typealias TruePlusMinus = Union.U2<Int, String>

@SwcDslMarker
@Serializable
class ParseOptions : ParserConfig() {
 var comments: Boolean? = null
 var script: Boolean? = null
 var target: 	/**
  * [JscTarget]
 */String? = null
}


interface ClassMember : Node

/**
  * sub types: [Statement]
  */
interface Declaration : Statement

/**
  * sub types: [JSXExpression], [Pattern]
  */
interface Expression : JSXExpression,Pattern

interface JSXObject : Node

interface JSXExpression : Node

interface JSXElementName : Node

interface JSXAttributeOrSpread : Node

interface JSXAttributeName : Node

interface JSXAttrValue : Node

interface JSXElementChild : Node

/**
  * sub types: [Expression], [JSXAttrValue]
  */
interface Literal : Expression,JSXAttrValue

interface ModuleDeclaration : Node

interface DefaultDecl : Node

interface ImportSpecifier : Node

interface ModuleExportName : Node

interface ExportSpecifier : Node

interface Program : Node

interface ModuleItem : Node

interface Pattern : Node

interface ObjectPatternProperty : Node

interface Property : Node

interface PropertyName : Node

interface Statement : Node

interface TsParameterPropertyParameter : Node

/**
  * sub types: [TsTypeQueryExpr], [TsModuleReference]
  */
interface TsEntityName : TsTypeQueryExpr,TsModuleReference

interface TsTypeElement : Node

interface TsType : Node

/**
  * sub types: [TsType]
  */
interface TsFnOrConstructorType : TsType

interface TsFnParameter : Node

interface TsThisTypeOrIdent : Node

interface TsTypeQueryExpr : Node

/**
  * sub types: [TsType]
  */
interface TsUnionOrIntersectionType : TsType

interface TsLiteral : Node

interface TsEnumMemberId : Node

interface TsNamespaceBody : Node

interface TsModuleName : Node

interface TsModuleReference : Node

@SwcDslMarker
@Serializable
open class ParserConfig {
/**
   *literal is: "typescript"
   , 
     * Defaults to `false`.
     */
  var tsx: Boolean? =  null
  var decorators: Boolean? =  null
/**
     * Defaults to `false`
     */
  var dynamicImport: Boolean? =  null
/**
   *literal is: "ecmascript"
   , 
     * Defaults to false.
     */
  var jsx: Boolean? =  null
/**
     * @deprecated Always true because it's in ecmascript spec.
     */
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
  var type: String? = null
  var syntax: String? = null
}

@SwcDslMarker
@Serializable
open class ModuleConfig {
/**
   *literal is: "es6"
   , 
   *literal is: "commonjs"
   , 
   *literal is: "umd"
   */
  var globals: Map<String, String>? =  null
/**
   *literal is: "amd"
   */
  var moduleId: String? =  null
/**
   *literal is: "nodenext"
   , 
   *literal is: "systemjs"
   */
  var allowTopLevelThis: Boolean? =  null
  var type: String? = null
  var syntax: String? = null
}

@SwcDslMarker
@Serializable
open class Plugin {
}

@SwcDslMarker
@Serializable
open class JsMinifyOptions {
  var compress: Union.U2<TerserCompressOptions, Boolean>? =  null
  var format: JsFormatOptions? =  null
  var mangle: Union.U2<TerserMangleOptions, Boolean>? =  null
  var ecma: TerserEcmaVersion? =  null
  var keep_classnames: Boolean? =  null
  var keep_fnames: Boolean? =  null
  var module: Boolean? =  null
  var safari10: Boolean? =  null
  var toplevel: Union.U2<String, Boolean>? =  null
  var sourceMap: Boolean? =  null
  var outputPath: String? =  null
  var inlineSourcesContent: Boolean? =  null
}

/**
 * These properties are mostly not implemented yet,
 * but it exists to support passing terser config to swc minify
 * without modification.
 */
@SwcDslMarker
@Serializable
open class JsFormatOptions {
/**
     * Currently noop.
     * @default false
     * @alias ascii_only
     */
  var asciiOnly: Boolean? =  null
/**
     * Currently noop.
     * @default false
     */
  var beautify: Boolean? =  null
  var braces: Boolean? =  null
/**
     * - `false`: removes all comments
     * - `'some'`: preserves some comments
     * - `'all'`: preserves all comments
     * @default false
     ,  literal is: false,"some","all" */
  var comments:   String? =  null
/**
     * Currently noop.
     * @default 5
     */
  var ecma: TerserEcmaVersion? =  null
/**
     * Currently noop.
     * @alias indent_level
     */
  var indentLevel: Int? =  null
/**
     * Currently noop.
     * @alias indent_start
     */
  var indentStart: Int? =  null
/**
     * Currently noop.
     * @alias inline_script
     */
  var inlineScript: Int? =  null
/**
     * Currently noop.
     * @alias keep_numbers
     */
  var keepNumbers: Int? =  null
/**
     * Currently noop.
     * @alias keep_quoted_props
     */
  var keepQuotedProps: Boolean? =  null
/**
     * Currently noop.
     * @alias max_line_len
     */
  var maxLineLen: Union.U2<Int, /**
   *literal is: false
   */Int>? =  null
/**
     * Currently noop.
     */
  var preamble: String? =  null
/**
     * Currently noop.
     * @alias quote_keys
     */
  var quoteKeys: Boolean? =  null
/**
     * Currently noop.
     * @alias quote_style
     */
  var quoteStyle: Boolean? =  null
/**
     * Currently noop.
     * @alias preserve_annotations
     */
  var preserveAnnotations: Boolean? =  null
  var safari10: Boolean? =  null
  var semicolons: Boolean? =  null
  var shebang: Boolean? =  null
  var webkit: Boolean? =  null
/**
     * Currently noop.
     * @alias wrap_iife
     */
  var wrapIife: Boolean? =  null
/**
     * Currently noop.
     * @alias wrap_func_args
     */
  var wrapFuncArgs: Boolean? =  null
  var ascii_only: Boolean? =  null
  var indent_level: Int? =  null
  var indent_start: Int? =  null
  var inline_script: Int? =  null
  var keep_numbers: Int? =  null
  var keep_quoted_props: Boolean? =  null
  var max_line_len: Union.U2<Int, /**
   *literal is: false
   */Int>? =  null
  var quote_keys: Boolean? =  null
  var quote_style: Boolean? =  null
  var preserve_annotations: Boolean? =  null
  var wrap_iife: Boolean? =  null
  var wrap_func_args: Boolean? =  null
}

@SwcDslMarker
@Serializable
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
  var global_defs: Map<String, String>? =  null
  var hoist_funs: Boolean? =  null
  var hoist_props: Boolean? =  null
  var hoist_vars: Boolean? =  null
  var ie8: Boolean? =  null
  var if_return: Boolean? =  null
/** literal is: 0,1,2,3 */
  var `inline`:   Int? =  null
  var join_vars: Boolean? =  null
  var keep_classnames: Boolean? =  null
  var keep_fargs: Boolean? =  null
  var keep_fnames: Boolean? =  null
  var keep_infinity: Boolean? =  null
  var loops: Boolean? =  null
  var negate_iife: Boolean? =  null
  var passes: Int? =  null
  var properties: Boolean? =  null
  var pure_getters: Union.U2<String, Boolean>? =  null
  var pure_funcs: Array<String>? =  null
  var reduce_funcs: Boolean? =  null
  var reduce_vars: Boolean? =  null
  var sequences: Boolean? =  null
  var side_effects: Boolean? =  null
  var switches: Boolean? =  null
  var top_retain: Union.U2<String, Array<String>>? =  null
  var toplevel: Union.U2<String, Boolean>? =  null
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

@SwcDslMarker
@Serializable
open class TerserMangleOptions {
  var props: TerserManglePropertiesOptions? =  null
  var toplevel: Union.U2<String, Boolean>? =  null
  var keep_classnames: Boolean? =  null
  var keep_fnames: Boolean? =  null
  var keep_private_props: Boolean? =  null
  var ie8: Boolean? =  null
  var safari10: Boolean? =  null
  var reserved: Array<String>? =  null
}

@SwcDslMarker
@Serializable
open class TerserManglePropertiesOptions {
}

/**
 * Programmatic options.
 */
@SwcDslMarker
@Serializable
open class Options : Config() {
/**
     * If true, a file is parsed as a script instead of module.
     */
  var script: Boolean? =  null
/**
     * The working directory that all paths in the programmatic
     * options will be resolved relative to.
     *
     * Defaults to `process.cwd()`.
     */
  var cwd: String? =  null
  var caller: CallerOptions? =  null
/** The filename associated with the code currently being compiled,
     * if there is one. The filename is optional, but not all of Swc's
     * functionality is available when the filename is unknown, because a
     * subset of options rely on the filename for their functionality.
     *
     * The three primary cases users could run into are:
     *
     * - The filename is exposed to plugins. Some plugins may require the
     * presence of the filename.
     * - Options like "test", "exclude", and "ignore" require the filename
     * for string/RegExp matching.
     * - .swcrc files are loaded relative to the file being compiled.
     * If this option is omitted, Swc will behave as if swcrc: false has been set.
     */
  var filename: String? =  null
/**
     * The initial path that will be processed based on the "rootMode" to
     * determine the conceptual root folder for the current Swc project.
     * This is used in two primary cases:
     *
     * - The base directory when checking for the default "configFile" value
     * - The default value for "swcrcRoots".
     *
     * Defaults to `opts.cwd`
     */
  var root: String? =  null
/**
     * This option, combined with the "root" value, defines how Swc chooses
     * its project root. The different modes define different ways that Swc
     * can process the "root" value to get the final project root.
     *
     * "root" - Passes the "root" value through as unchanged.
     * "upward" - Walks upward from the "root" directory, looking for a directory
     * containing a swc.config.js file, and throws an error if a swc.config.js
     * is not found.
     * "upward-optional" - Walk upward from the "root" directory, looking for
     * a directory containing a swc.config.js file, and falls back to "root"
     *  if a swc.config.js is not found.
     *
     *
     * "root" is the default mode because it avoids the risk that Swc
     * will accidentally load a swc.config.js that is entirely outside
     * of the current project folder. If you use "upward-optional",
     * be aware that it will walk up the directory structure all the
     * way to the filesystem root, and it is always possible that someone
     * will have a forgotten swc.config.js in their home directory,
     * which could cause unexpected errors in your builds.
     *
     *
     * Users with monorepo project structures that run builds/tests on a
     * per-package basis may well want to use "upward" since monorepos
     * often have a swc.config.js in the project root. Running Swc
     * in a monorepo subdirectory without "upward", will cause Swc
     * to skip loading any swc.config.js files in the project root,
     * which can lead to unexpected errors and compilation failure.
     ,  literal is: "root","upward","upward-optional" */
  var rootMode:   String? =  null
/**
     * The current active environment used during configuration loading.
     * This value is used as the key when resolving "env" configs,
     * and is also available inside configuration functions, plugins,
     * and presets, via the api.env() function.
     *
     * Defaults to `process.env.SWC_ENV || process.env.NODE_ENV || "development"`
     */
  var envName: String? =  null
/**
     * Defaults to searching for a default `.swcrc` file, but can
     * be passed the path of any JS or JSON5 config file.
     *
     *
     * NOTE: This option does not affect loading of .swcrc files,
     * so while it may be tempting to do configFile: "./foo/.swcrc",
     * it is not recommended. If the given .swcrc is loaded via the
     * standard file-relative logic, you'll end up loading the same
     * config file twice, merging it with itself. If you are linking
     * a specific config file, it is recommended to stick with a
     * naming scheme that is independent of the "swcrc" name.
     *
     * Defaults to `path.resolve(opts.root, ".swcrc")`
     */
  var configFile: Union.U2<String, Boolean>? =  null
/**
     * true will enable searching for configuration files relative to the "filename" provided to Swc.
     *
     * A swcrc value passed in the programmatic options will override one set within a configuration file.
     *
     * Note: .swcrc files are only loaded if the current "filename" is inside of
     *  a package that matches one of the "swcrcRoots" packages.
     *
     *
     * Defaults to true as long as the filename option has been specified
     */
  var swcrc: Boolean? =  null
/**
     * By default, Babel will only search for .babelrc files within the "root" package
     *  because otherwise Babel cannot know if a given .babelrc is meant to be loaded,
     *  or if it's "plugins" and "presets" have even been installed, since the file
     *  being compiled could be inside node_modules, or have been symlinked into the project.
     *
     *
     * This option allows users to provide a list of other packages that should be
     * considered "root" packages when considering whether to load .babelrc files.
     *
     *
     * For example, a monorepo setup that wishes to allow individual packages
     * to have their own configs might want to do
     *
     *
     *
     * Defaults to `opts.root`
     */
  var swcrcRoots: Union.U3<Boolean, MatchPattern, Array<MatchPattern>>? =  null
/**
     * `true` will attempt to load an input sourcemap from the file itself, if it
     * contains a //# sourceMappingURL=... comment. If no map is found, or the
     * map fails to load and parse, it will be silently discarded.
     *
     *  If an object is provided, it will be treated as the source map object itself.
     *
     * Defaults to `true`.
     */
  var inputSourceMap: Union.U2<Boolean, String>? =  null
/**
     * The name to use for the file inside the source map object.
     *
     * Defaults to `path.basename(opts.filenameRelative)` when available, or `"unknown"`.
     */
  var sourceFileName: String? =  null
/**
     * The sourceRoot fields to set in the generated source map, if one is desired.
     */
  var sourceRoot: String? =  null
  var plugin: Plugin? =  null
  var isModule: Union.U2<Boolean, /**
   *literal is: "unknown"
   */String>? =  null
/**
     * Destination path. Note that this value is used only to fix source path
     * of source map files and swc does not write output to this path.
     */
  var outputPath: String? =  null
}

@SwcDslMarker
@Serializable
open class CallerOptions {
  var name: String? =  null
}

/**
 * .swcrc
 */
@SwcDslMarker
@Serializable
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
  var sourceMaps: Union.U2<Boolean, /**
   *literal is: "inline"
   */String>? =  null
  var inlineSourcesContent: Boolean? =  null
}

/**
 * Configuration ported from babel-preset-env
 */
@SwcDslMarker
@Serializable
open class EnvConfig {
/** literal is: "usage","entry" */
  var mode:   String? =  null
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
  var targets: Union.U2<String, Map<String, String>>? =  null
  var path: String? =  null
  var shippedProposals: Boolean? =  null
/**
     * Enable all transforms
     */
  var forceAllTransforms: Boolean? =  null
}

@SwcDslMarker
@Serializable
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
open class JscConfig {
  var loose: Boolean? =  null
/**
     * Defaults to EsParserConfig
     */
  var parser: ParserConfig? =  null
  var transform: TransformConfig? =  null
/**
     * Use `@swc/helpers` instead of inline helpers.
     */
  var externalHelpers: Boolean? =  null
/**
     * Defaults to `es3` (which enabled **all** pass).
     , 
  * [JscTarget]
 */
  var target: 	String? =  null
/**
     * Keep class names.
     */
  var keepClassNames: Boolean? =  null
/**
     * This is experimental, and can be removed without a major version bump.
     */
  var experimental: ExperimentalLiteral? =  null
  var baseUrl: String? =  null
  var paths: Map<String, Array<String>>? =  null
  var minify: JsMinifyOptions? =  null
  var preserveAllComments: Boolean? =  null
}

/**
 * Options for transform.
 */
@SwcDslMarker
@Serializable
open class TransformConfig {
/**
     * Effective only if `syntax` supports ƒ.
     */
  var react: ReactConfig? =  null
  var constModules: ConstModulesConfig? =  null
/**
     * Defaults to null, which skips optimizer pass.
     */
  var optimizer: OptimizerConfig? =  null
/**
     * https://swc.rs/docs/configuring-swc.html#jsctransformlegacydecorator
     */
  var legacyDecorator: Boolean? =  null
/**
     * https://swc.rs/docs/configuring-swc.html#jsctransformdecoratormetadata
     */
  var decoratorMetadata: Boolean? =  null
  var treatConstEnumAsEnum: Boolean? =  null
  var useDefineForClassFields: Boolean? =  null
}

@SwcDslMarker
@Serializable
open class ReactConfig {
/**
     * Replace the function used when compiling JSX expressions.
     *
     * Defaults to `React.createElement`.
     */
  var pragma: String? =  null
/**
     * Replace the component used when compiling JSX fragments.
     *
     * Defaults to `React.Fragment`
     */
  var pragmaFrag: String? =  null
/**
     * Toggles whether or not to throw an error if a XML namespaced tag name is used. For example:
     * `<f:image />`
     *
     * Though the JSX spec allows this, it is disabled by default since React's
     * JSX does not currently have support for it.
     *
     */
  var throwIfNamespace: Boolean? =  null
/**
     * Toggles plugins that aid in development, such as @swc/plugin-transform-react-jsx-self
     * and @swc/plugin-transform-react-jsx-source.
     *
     * Defaults to `false`,
     *
     */
  var development: Boolean? =  null
/**
     * Use `Object.assign()` instead of `_extends`. Defaults to false.
     * @deprecated
     */
  var useBuiltins: Boolean? =  null
/**
     * Enable fast refresh feature for React app
     */
  var refresh: Boolean? =  null
/**
     * jsx runtime
     ,  literal is: "automatic","classic" */
  var runtime:   String? =  null
/**
     * Declares the module specifier to be used for importing the `jsx` and `jsxs` factory functions when using `runtime` 'automatic'
     */
  var importSource: String? =  null
}

/**
 *  - `import { DEBUG } from '@ember/env-flags';`
 *  - `import { FEATURE_A, FEATURE_B } from '@ember/features';`
 *
 * See: https://github.com/swc-project/swc/issues/18#issuecomment-466272558
 */
@SwcDslMarker
@Serializable
open class ConstModulesConfig {
  var globals: Map<String, Map<String, String>>? =  null
}

@SwcDslMarker
@Serializable
class JsonifyLiteral {
 var minCost: Int? = null
}

@SwcDslMarker
@Serializable
open class OptimizerConfig {
  var simplify: Boolean? =  null
  var globals: GlobalPassOption? =  null
  var jsonify: JsonifyLiteral? =  null
}

/**
 * Options for inline-global pass.
 */
@SwcDslMarker
@Serializable
open class GlobalPassOption {
/**
     * Global variables that should be inlined with passed value.
     *
     * e.g. `{ __DEBUG__: true }`
     */
  var vars: Record<String, String>? =  null
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
  var typeofs: Record<String, String>? =  null
}

@SwcDslMarker
@Serializable
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
/**
     * Emits 'use strict' directive.
     *
     * Defaults to `true`.
     */
  var strictMode: Boolean? =  null
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
  var lazy: Union.U2<Boolean, Array<String>>? =  null
/**
     * @deprecated  Use the `importInterop` option instead.
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
  var noInterop: Boolean? =  null
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
     ,  literal is: "swc","babel","node","none" */
  var importInterop:   String? =  null
/**
     * Emits `cjs-module-lexer` annotation
     * `cjs-module-lexer` is used in Node.js core for detecting the named exports available when importing a CJS module into ESM.
     * swc will emit `cjs-module-lexer` detectable annotation with this option enabled.
     *
     * Defaults to `true` if import_interop is Node, else `false`
     */
  var exportInteropAnnotation: Boolean? =  null
/**
     * If set to true, dynamic imports will be preserved.
     */
  var ignoreDynamic: Boolean? =  null
  var allowTopLevelThis: Boolean? =  null
  var preserveImportMeta: Boolean? =  null
}

@SwcDslMarker
@Serializable
open class Output {
/**
     * Transformed code
     */
  var code: String? =  null
/**
     * Sourcemap (**not** base64 encoded)
     */
  var map: String? =  null
}

@SwcDslMarker
@Serializable
open class MatchPattern {
}

@SwcDslMarker
@Serializable
open class Span {
  var start: Int? =  null
  var end: Int? =  null
  var ctxt: Int? =  null
}

@SwcDslMarker
@Serializable(NodeSerializer::class)
sealed interface Node {
  var type: String? 
}

interface HasSpan {
  var span: Span? 
}

interface HasDecorator {
  var decorators: Array<Decorator>? 
}

@SwcDslMarker
@Serializable
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
/**
  * [Accessibility]
 */
  var accessibility: 	String? 
  var isOptional: Boolean? 
  var isOverride: Boolean? 
  var readonly: Boolean? 
  var definite: Boolean? 
}

@SwcDslMarker
@Serializable
open class ClassProperty : ClassPropertyBase, ClassMember {
/**
   *literal is: "ClassProperty"
   */
  override var type: String? = "ClassProperty"
  var key: PropertyName? =  null
  var isAbstract: Boolean? =  null
  var declare: Boolean? =  null
  override var value: Expression?  = null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var isStatic: Boolean?  = null
/**
  * [Accessibility]
 */
  override var accessibility: 	String?  = null
  override var isOptional: Boolean?  = null
  override var isOverride: Boolean?  = null
  override var readonly: Boolean?  = null
  override var definite: Boolean?  = null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

@SwcDslMarker
@Serializable
open class PrivateProperty : ClassPropertyBase, ClassMember {
/**
   *literal is: "PrivateProperty"
   */
  override var type: String? = "PrivateProperty"
  var key: PrivateName? =  null
  override var value: Expression?  = null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var isStatic: Boolean?  = null
/**
  * [Accessibility]
 */
  override var accessibility: 	String?  = null
  override var isOptional: Boolean?  = null
  override var isOverride: Boolean?  = null
  override var readonly: Boolean?  = null
  override var definite: Boolean?  = null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

@SwcDslMarker
@Serializable
open class Param : Node, HasSpan, HasDecorator {
/**
   *literal is: "Parameter"
   */
  override var type: String? = "Parameter"
  var pat: Pattern? =  null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

@SwcDslMarker
@Serializable
open class Constructor : Node, HasSpan, ClassMember {
/**
   *literal is: "Constructor"
   */
  override var type: String? = "Constructor"
  var key: PropertyName? =  null
  var params: Array<Union.U2<TsParameterProperty, Param>>? =  null
  var body: BlockStatement? =  null
/**
  * [Accessibility]
 */
  var accessibility: 	String? =  null
  var isOptional: Boolean? =  null
  override var span: Span?  = null
}

interface ClassMethodBase : Node, HasSpan {
  var function: Fn? 
/**
  * [MethodKind]
 */
  var kind: 	String? 
  var isStatic: Boolean? 
/**
  * [Accessibility]
 */
  var accessibility: 	String? 
  var isAbstract: Boolean? 
  var isOptional: Boolean? 
  var isOverride: Boolean? 
}

@SwcDslMarker
@Serializable
open class ClassMethod : ClassMethodBase, ClassMember {
/**
   *literal is: "ClassMethod"
   */
  override var type: String? = "ClassMethod"
  var key: PropertyName? =  null
  var function: Fn? = null

  /**
  * [MethodKind]
 */
  override var kind: 	String?  = null
  override var isStatic: Boolean?  = null
/**
  * [Accessibility]
 */
  override var accessibility: 	String?  = null
  override var isAbstract: Boolean?  = null
  override var isOptional: Boolean?  = null
  override var isOverride: Boolean?  = null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class PrivateMethod : ClassMethodBase, ClassMember {
/**
   *literal is: "PrivateMethod"
   */
  override var type: String? = "PrivateMethod"
  var key: PrivateName? =  null
  override var function: Fn? = null

  /**
  * [MethodKind]
 */
  override var kind: 	String?  = null
  override var isStatic: Boolean?  = null
/**
  * [Accessibility]
 */
  override var accessibility: 	String?  = null
  override var isAbstract: Boolean?  = null
  override var isOptional: Boolean?  = null
  override var isOverride: Boolean?  = null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class StaticBlock : Node, HasSpan, ClassMember {
/**
   *literal is: "StaticBlock"
   */
  override var type: String? = "StaticBlock"
  var body: BlockStatement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class Decorator : Node, HasSpan {
/**
   *literal is: "Decorator"
   */
  override var type: String? = "Decorator"
  var expression: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class FunctionDeclaration : Fn, Declaration {
/**
   *literal is: "FunctionDeclaration"
   */
override var type: String? = "FunctionDeclaration"
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

@SwcDslMarker
@Serializable
open class ClassDeclaration : Class(), Node, Declaration {
/**
   *literal is: "ClassDeclaration"
   */
  override var type: String? = "ClassDeclaration"
  var identifier: Identifier? =  null
  var declare: Boolean? =  null
}

@SwcDslMarker
@Serializable
open class VariableDeclaration : Node, HasSpan, Declaration {
/**
   *literal is: "VariableDeclaration"
   */
  override var type: String? = "VariableDeclaration"
/**
  * [VariableDeclarationKind]
 */
  var kind: 	String? =  null
  var declare: Boolean? =  null
  var declarations: Array<VariableDeclarator>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class VariableDeclarator : Node, HasSpan {
/**
   *literal is: "VariableDeclarator"
   */
  override var type: String? = "VariableDeclarator"
  var id: Pattern? =  null
  var init: Expression? =  null
  var definite: Boolean? =  null
  override var span: Span?  = null
}

interface ExpressionBase : Node, HasSpan {
}

@SwcDslMarker
@Serializable
open class Identifier : ExpressionBase, Expression, JSXObject, JSXElementName, JSXAttributeName, ModuleExportName, Property, PropertyName, TsEntityName, TsThisTypeOrIdent, TsEnumMemberId, TsModuleName {
/**
   *literal is: "Identifier"
   */
  override var type: String? = "Identifier"
  var value: String? =  null
  var optional: Boolean? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class OptionalChainingExpression : ExpressionBase, Expression {
/**
   *literal is: "OptionalChainingExpression"
   */
  override var type: String? = "OptionalChainingExpression"
  var questionDotToken: Span? =  null
/**
     * Call expression or member expression.
     */
  var base: Union.U2<MemberExpression, OptionalChainingCall>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class OptionalChainingCall : ExpressionBase {
/**
   *literal is: "CallExpression"
   */
  override var type: String? = "CallExpression"
  var callee: Expression? =  null
  var arguments: Array<ExprOrSpread>? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ThisExpression : ExpressionBase, Expression {
/**
   *literal is: "ThisExpression"
   */
  override var type: String? = "ThisExpression"
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ArrayExpression : ExpressionBase, Expression {
/**
   *literal is: "ArrayExpression"
   */
  override var type: String? = "ArrayExpression"
  var elements: Array<ExprOrSpread>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ExprOrSpread {
  var spread: Span? =  null
  var expression: Expression? =  null
}

@SwcDslMarker
@Serializable
open class ObjectExpression : ExpressionBase, Expression {
/**
   *literal is: "ObjectExpression"
   */
  override var type: String? = "ObjectExpression"
  var properties: Array<Union.U2<SpreadElement, Property>>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class Argument {
  var spread: Span? =  null
  var expression: Expression? =  null
}

@SwcDslMarker
@Serializable
open class SpreadElement : Node, JSXAttributeOrSpread {
/**
   *literal is: "SpreadElement"
   */
  override var type: String? = "SpreadElement"
  var spread: Span? =  null
  var arguments: Expression? =  null
}

@SwcDslMarker
@Serializable
open class UnaryExpression : ExpressionBase, Expression {
/**
   *literal is: "UnaryExpression"
   */
  override var type: String? = "UnaryExpression"
/**
  * [UnaryOperator]
 */
  var operator: 	String? =  null
  var argument: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class UpdateExpression : ExpressionBase, Expression {
/**
   *literal is: "UpdateExpression"
   */
  override var type: String? = "UpdateExpression"
/**
  * [UpdateOperator]
 */
  var operator: 	String? =  null
  var prefix: Boolean? =  null
  var argument: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class BinaryExpression : ExpressionBase, Expression {
/**
   *literal is: "BinaryExpression"
   */
  override var type: String? = "BinaryExpression"
/**
  * [BinaryOperator]
 */
  var operator: 	String? =  null
  var left: Expression? =  null
  var right: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class FunctionExpression : Fn, ExpressionBase, Expression, DefaultDecl {
/**
   *literal is: "FunctionExpression"
   */
  override var type: String? = "FunctionExpression"
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

@SwcDslMarker
@Serializable
open class ClassExpression : Class(), ExpressionBase, Expression, DefaultDecl {
/**
   *literal is: "ClassExpression"
   */
  override var type: String? = "ClassExpression"
  var identifier: Identifier? =  null
}

@SwcDslMarker
@Serializable
open class AssignmentExpression : ExpressionBase, Expression {
/**
   *literal is: "AssignmentExpression"
   */
  override var type: String? = "AssignmentExpression"
/**
  * [AssignmentOperator]
 */
  var operator: 	String? =  null
  var left: Union.U2<Expression, Pattern>? =  null
  var right: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class MemberExpression : ExpressionBase, Expression {
/**
   *literal is: "MemberExpression"
   */
  override var type: String? = "MemberExpression"
  var `object`: Expression? =  null
  var property: Union.U3<Identifier, PrivateName, ComputedPropName>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class SuperPropExpression : ExpressionBase, Expression {
/**
   *literal is: "SuperPropExpression"
   */
  override var type: String? = "SuperPropExpression"
  var obj: Super? =  null
  var property: Union.U2<Identifier, ComputedPropName>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ConditionalExpression : ExpressionBase, Expression {
/**
   *literal is: "ConditionalExpression"
   */
  override var type: String? = "ConditionalExpression"
  var test: Expression? =  null
  var consequent: Expression? =  null
  var alternate: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class Super : Node, HasSpan {
/**
   *literal is: "Super"
   */
  override var type: String? = "Super"
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class Import : Node, HasSpan {
/**
   *literal is: "Import"
   */
  override var type: String? = "Import"
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class CallExpression : ExpressionBase, Expression {
/**
   *literal is: "CallExpression"
   */
  override var type: String? = "CallExpression"
  var callee: Union.U3<Super, Import, Expression>? =  null
  var arguments: Array<Argument>? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class NewExpression : ExpressionBase, Expression {
/**
   *literal is: "NewExpression"
   */
  override var type: String? = "NewExpression"
  var callee: Expression? =  null
  var arguments: Array<Argument>? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class SequenceExpression : ExpressionBase, Expression {
/**
   *literal is: "SequenceExpression"
   */
  override var type: String? = "SequenceExpression"
  var expressions: Array<Expression>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ArrowFunctionExpression : ExpressionBase, Expression {
/**
   *literal is: "ArrowFunctionExpression"
   */
  override var type: String? = "ArrowFunctionExpression"
  var params: Array<Pattern>? =  null
  var body: Union.U2<BlockStatement, Expression>? =  null
  var async: Boolean? =  null
  var generator: Boolean? =  null
  var typeParameters: TsTypeParameterDeclaration? =  null
  var returnType: TsTypeAnnotation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class YieldExpression : ExpressionBase, Expression {
/**
   *literal is: "YieldExpression"
   */
  override var type: String? = "YieldExpression"
  var argument: Expression? =  null
  var delegate: Boolean? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class MetaProperty : Node, HasSpan, Expression {
/**
   *literal is: "MetaProperty"
   */
  override var type: String? = "MetaProperty"
/** literal is: "new.target","import.meta" */
  var kind:   String? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class AwaitExpression : ExpressionBase, Expression {
/**
   *literal is: "AwaitExpression"
   */
  override var type: String? = "AwaitExpression"
  var argument: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TemplateLiteral : ExpressionBase, Expression {
/**
   *literal is: "TemplateLiteral"
   */
  override var type: String? = "TemplateLiteral"
  var expressions: Array<Expression>? =  null
  var quasis: Array<TemplateElement>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TaggedTemplateExpression : ExpressionBase, Expression {
/**
   *literal is: "TaggedTemplateExpression"
   */
  override var type: String? = "TaggedTemplateExpression"
  var tag: Expression? =  null
  var typeParameters: TsTypeParameterInstantiation? =  null
  var template: TemplateLiteral? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TemplateElement : ExpressionBase {
/**
   *literal is: "TemplateElement"
   */
  override var type: String? = "TemplateElement"
  var tail: Boolean? =  null
  var cooked: String? =  null
  var raw: String? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ParenthesisExpression : ExpressionBase, Expression {
/**
   *literal is: "ParenthesisExpression"
   */
  override var type: String? = "ParenthesisExpression"
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

@SwcDslMarker
@Serializable
open class PrivateName : ExpressionBase, Expression {
/**
   *literal is: "PrivateName"
   */
  override var type: String? = "PrivateName"
  var id: Identifier? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXMemberExpression : Node, Expression, JSXObject, JSXElementName {
/**
   *literal is: "JSXMemberExpression"
   */
  override var type: String? = "JSXMemberExpression"
  var `object`: JSXObject? =  null
  var property: Identifier? =  null
}

/**
 * XML-based namespace syntax:
 */
@SwcDslMarker
@Serializable
open class JSXNamespacedName : Node, Expression, JSXElementName, JSXAttributeName {
/**
   *literal is: "JSXNamespacedName"
   */
  override var type: String? = "JSXNamespacedName"
  var namespace: Identifier? =  null
  var name: Identifier? =  null
}

@SwcDslMarker
@Serializable
open class JSXEmptyExpression : Node, HasSpan, Expression, JSXExpression {
/**
   *literal is: "JSXEmptyExpression"
   */
  override var type: String? = "JSXEmptyExpression"
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXExpressionContainer : Node, HasSpan, JSXAttrValue, JSXElementChild {
/**
   *literal is: "JSXExpressionContainer"
   */
  override var type: String? = "JSXExpressionContainer"
  var expression: JSXExpression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXSpreadChild : Node, HasSpan, JSXElementChild {
/**
   *literal is: "JSXSpreadChild"
   */
  override var type: String? = "JSXSpreadChild"
  var expression: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXOpeningElement : Node, HasSpan {
/**
   *literal is: "JSXOpeningElement"
   */
  override var type: String? = "JSXOpeningElement"
  var name: JSXElementName? =  null
  var attributes: Array<JSXAttributeOrSpread>? =  null
  var selfClosing: Boolean? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXClosingElement : Node, HasSpan {
/**
   *literal is: "JSXClosingElement"
   */
  override var type: String? = "JSXClosingElement"
  var name: JSXElementName? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXAttribute : Node, HasSpan, JSXAttributeOrSpread {
/**
   *literal is: "JSXAttribute"
   */
  override var type: String? = "JSXAttribute"
  var name: JSXAttributeName? =  null
  var value: JSXAttrValue? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXText : Node, HasSpan, JSXElementChild, Literal {
/**
   *literal is: "JSXText"
   */
  override var type: String? = "JSXText"
  var value: String? =  null
  var raw: String? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXElement : Node, HasSpan, Expression, JSXAttrValue, JSXElementChild {
/**
   *literal is: "JSXElement"
   */
  override var type: String? = "JSXElement"
  var opening: JSXOpeningElement? =  null
  var children: Array<JSXElementChild>? =  null
  var closing: JSXClosingElement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXFragment : Node, HasSpan, Expression, JSXAttrValue, JSXElementChild {
/**
   *literal is: "JSXFragment"
   */
  override var type: String? = "JSXFragment"
  var opening: JSXOpeningFragment? =  null
  var children: Array<JSXElementChild>? =  null
  var closing: JSXClosingFragment? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXOpeningFragment : Node, HasSpan {
/**
   *literal is: "JSXOpeningFragment"
   */
  override var type: String? = "JSXOpeningFragment"
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class JSXClosingFragment : Node, HasSpan {
/**
   *literal is: "JSXClosingFragment"
   */
  override var type: String? = "JSXClosingFragment"
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class StringLiteral : Node, HasSpan, Literal, ModuleExportName, PropertyName, TsLiteral, TsEnumMemberId, TsModuleName {
/**
   *literal is: "StringLiteral"
   */
  override var type: String? = "StringLiteral"
  var value: String? =  null
  var raw: String? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class BooleanLiteral : Node, HasSpan, Literal, TsLiteral {
/**
   *literal is: "BooleanLiteral"
   */
  override var type: String? = "BooleanLiteral"
  var value: Boolean? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class NullLiteral : Node, HasSpan, Literal {
/**
   *literal is: "NullLiteral"
   */
  override var type: String? = "NullLiteral"
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class RegExpLiteral : Node, HasSpan, Literal {
/**
   *literal is: "RegExpLiteral"
   */
  override var type: String? = "RegExpLiteral"
  var pattern: String? =  null
  var flags: String? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class NumericLiteral : Node, HasSpan, Literal, PropertyName, TsLiteral {
/**
   *literal is: "NumericLiteral"
   */
  override var type: String? = "NumericLiteral"
  var value: Int? =  null
  var raw: String? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class BigIntLiteral : Node, HasSpan, Literal, PropertyName, TsLiteral {
/**
   *literal is: "BigIntLiteral"
   */
  override var type: String? = "BigIntLiteral"
  var value: Long? =  null
  var raw: String? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ExportDefaultExpression : Node, HasSpan, ModuleDeclaration {
/**
   *literal is: "ExportDefaultExpression"
   */
  override var type: String? = "ExportDefaultExpression"
  var expression: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ExportDeclaration : Node, HasSpan, ModuleDeclaration {
/**
   *literal is: "ExportDeclaration"
   */
  override var type: String? = "ExportDeclaration"
  var declaration: Declaration? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ImportDeclaration : Node, HasSpan, ModuleDeclaration {
/**
   *literal is: "ImportDeclaration"
   */
  override var type: String? = "ImportDeclaration"
  var specifiers: Array<ImportSpecifier>? =  null
  var source: StringLiteral? =  null
  var typeOnly: Boolean? =  null
  var asserts: ObjectExpression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ExportAllDeclaration : Node, HasSpan, ModuleDeclaration {
/**
   *literal is: "ExportAllDeclaration"
   */
  override var type: String? = "ExportAllDeclaration"
  var source: StringLiteral? =  null
  var asserts: ObjectExpression? =  null
  override var span: Span?  = null
}

/**
 * - `export { foo } from 'mod'`
 * - `export { foo as bar } from 'mod'`
 */
@SwcDslMarker
@Serializable
open class ExportNamedDeclaration : Node, HasSpan, ModuleDeclaration {
/**
   *literal is: "ExportNamedDeclaration"
   */
  override var type: String? = "ExportNamedDeclaration"
  var specifiers: Array<ExportSpecifier>? =  null
  var source: StringLiteral? =  null
  var typeOnly: Boolean? =  null
  var asserts: ObjectExpression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ExportDefaultDeclaration : Node, HasSpan, ModuleDeclaration {
/**
   *literal is: "ExportDefaultDeclaration"
   */
  override var type: String? = "ExportDefaultDeclaration"
  var decl: DefaultDecl? =  null
  override var span: Span?  = null
}

/**
 * e.g. `import foo from 'mod.js'`
 */
@SwcDslMarker
@Serializable
open class ImportDefaultSpecifier : Node, HasSpan, ImportSpecifier {
/**
   *literal is: "ImportDefaultSpecifier"
   */
  override var type: String? = "ImportDefaultSpecifier"
  var local: Identifier? =  null
  override var span: Span?  = null
}

/**
 * e.g. `import * as foo from 'mod.js'`.
 */
@SwcDslMarker
@Serializable
open class ImportNamespaceSpecifier : Node, HasSpan, ImportSpecifier {
/**
   *literal is: "ImportNamespaceSpecifier"
   */
  override var type: String? = "ImportNamespaceSpecifier"
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
@SwcDslMarker
@Serializable
open class NamedImportSpecifier : Node, HasSpan, ImportSpecifier {
/**
   *literal is: "ImportSpecifier"
   */
  override var type: String? = "ImportSpecifier"
  var local: Identifier? =  null
  var imported: ModuleExportName? =  null
  var isTypeOnly: Boolean? =  null
  override var span: Span?  = null
}

/**
 * `export * as foo from 'src';`
 */
@SwcDslMarker
@Serializable
open class ExportNamespaceSpecifier : Node, HasSpan, ExportSpecifier {
/**
   *literal is: "ExportNamespaceSpecifier"
   */
  override var type: String? = "ExportNamespaceSpecifier"
  var name: ModuleExportName? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ExportDefaultSpecifier : Node, HasSpan, ExportSpecifier {
/**
   *literal is: "ExportDefaultSpecifier"
   */
  override var type: String? = "ExportDefaultSpecifier"
  var exported: Identifier? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class NamedExportSpecifier : Node, HasSpan, ExportSpecifier {
/**
   *literal is: "ExportSpecifier"
   */
  override var type: String? = "ExportSpecifier"
  var orig: ModuleExportName? =  null
/**
     * `Some(bar)` in `export { foo as bar }`
     */
  var exported: ModuleExportName? =  null
  var isTypeOnly: Boolean? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class HasInterpreter {
/**
     * e.g. `/usr/bin/node` for `#!/usr/bin/node`
     */
  var interpreter: String? =  null
}

@SwcDslMarker
@Serializable
open class Module : Node, HasSpan, HasInterpreter(), Program {
/**
   *literal is: "Module"
   */
  override var type: String? = "Module"
  var body: Array<ModuleItem>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class Script : Node, HasSpan, HasInterpreter(), Program {
/**
   *literal is: "Script"
   */
  override var type: String? = "Script"
  var body: Array<Statement>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class BindingIdentifier : PatternBase, Pattern, TsParameterPropertyParameter, TsFnParameter {
/**
   *literal is: "Identifier"
   */
  override var type: String? = "Identifier"
  var value: String? =  null
  var optional: Boolean? =  null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ArrayPattern : PatternBase, Pattern, TsFnParameter {
/**
   *literal is: "ArrayPattern"
   */
  override var type: String? = "ArrayPattern"
  var elements: Array<Pattern>? =  null
  var optional: Boolean? =  null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ObjectPattern : PatternBase, Pattern, TsFnParameter {
/**
   *literal is: "ObjectPattern"
   */
  override var type: String? = "ObjectPattern"
  var properties: Array<ObjectPatternProperty>? =  null
  var optional: Boolean? =  null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class AssignmentPattern : PatternBase, Pattern, TsParameterPropertyParameter {
/**
   *literal is: "AssignmentPattern"
   */
  override var type: String? = "AssignmentPattern"
  var left: Pattern? =  null
  var right: Expression? =  null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class RestElement : PatternBase, Pattern, ObjectPatternProperty, TsFnParameter {
/**
   *literal is: "RestElement"
   */
  override var type: String? = "RestElement"
  var rest: Span? =  null
  var argument: Pattern? =  null
  override var typeAnnotation: TsTypeAnnotation?  = null
  override var span: Span?  = null
}

/**
 * `{key: value}`
 */
@SwcDslMarker
@Serializable
open class KeyValuePatternProperty : Node, ObjectPatternProperty {
/**
   *literal is: "KeyValuePatternProperty"
   */
  override var type: String? = "KeyValuePatternProperty"
  var key: PropertyName? =  null
  var value: Pattern? =  null
}

/**
 * `{key}` or `{key = value}`
 */
@SwcDslMarker
@Serializable
open class AssignmentPatternProperty : Node, HasSpan, ObjectPatternProperty {
/**
   *literal is: "AssignmentPatternProperty"
   */
  override var type: String? = "AssignmentPatternProperty"
  var key: Identifier? =  null
  var value: Expression? =  null
  override var span: Span?  = null
}

interface PropBase : Node {
  var key: PropertyName? 
}

@SwcDslMarker
@Serializable
open class KeyValueProperty : PropBase, Property {
/**
   *literal is: "KeyValueProperty"
   */
  override var type: String? = "KeyValueProperty"
  var value: Expression? =  null
  override var key: PropertyName?  = null
}

@SwcDslMarker
@Serializable
open class AssignmentProperty : Node, Property {
/**
   *literal is: "AssignmentProperty"
   */
  override var type: String? = "AssignmentProperty"
  var key: Identifier? =  null
  var value: Expression? =  null
}

@SwcDslMarker
@Serializable
open class GetterProperty : PropBase, HasSpan, Property {
/**
   *literal is: "GetterProperty"
   */
  override var type: String? = "GetterProperty"
  var typeAnnotation: TsTypeAnnotation? =  null
  var body: BlockStatement? =  null
  override var key: PropertyName?  = null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class SetterProperty : PropBase, HasSpan, Property {
/**
   *literal is: "SetterProperty"
   */
  override var type: String? = "SetterProperty"
  var param: Pattern? =  null
  var body: BlockStatement? =  null
  override var key: PropertyName?  = null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class MethodProperty : PropBase, Fn, Property {
/**
   *literal is: "MethodProperty"
   */
  override var type: String? = "MethodProperty"
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

@SwcDslMarker
@Serializable
open class ComputedPropName : Node, HasSpan, PropertyName {
/**
   *literal is: "Computed"
   */
  override var type: String? = "Computed"
  var expression: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class BlockStatement : Node, HasSpan, Statement {
/**
   *literal is: "BlockStatement"
   */
  override var type: String? = "BlockStatement"
  var stmts: Array<Statement>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ExpressionStatement : Node, HasSpan, Statement {
/**
   *literal is: "ExpressionStatement"
   */
  override var type: String? = "ExpressionStatement"
  var expression: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class EmptyStatement : Node, HasSpan, ClassMember, Statement {
/**
   *literal is: "EmptyStatement"
   */
  override var type: String? = "EmptyStatement"
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class DebuggerStatement : Node, HasSpan, Statement {
/**
   *literal is: "DebuggerStatement"
   */
  override var type: String? = "DebuggerStatement"
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class WithStatement : Node, HasSpan, Statement {
/**
   *literal is: "WithStatement"
   */
  override var type: String? = "WithStatement"
  var `object`: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ReturnStatement : Node, HasSpan, Statement {
/**
   *literal is: "ReturnStatement"
   */
  override var type: String? = "ReturnStatement"
  var argument: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class LabeledStatement : Node, HasSpan, Statement {
/**
   *literal is: "LabeledStatement"
   */
  override var type: String? = "LabeledStatement"
  var label: Identifier? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class BreakStatement : Node, HasSpan, Statement {
/**
   *literal is: "BreakStatement"
   */
  override var type: String? = "BreakStatement"
  var label: Identifier? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ContinueStatement : Node, HasSpan, Statement {
/**
   *literal is: "ContinueStatement"
   */
  override var type: String? = "ContinueStatement"
  var label: Identifier? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class IfStatement : Node, HasSpan, Statement {
/**
   *literal is: "IfStatement"
   */
  override var type: String? = "IfStatement"
  var test: Expression? =  null
  var consequent: Statement? =  null
  var alternate: Statement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class SwitchStatement : Node, HasSpan, Statement {
/**
   *literal is: "SwitchStatement"
   */
  override var type: String? = "SwitchStatement"
  var discriminant: Expression? =  null
  var cases: Array<SwitchCase>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ThrowStatement : Node, HasSpan, Statement {
/**
   *literal is: "ThrowStatement"
   */
  override var type: String? = "ThrowStatement"
  var argument: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TryStatement : Node, HasSpan, Statement {
/**
   *literal is: "TryStatement"
   */
  override var type: String? = "TryStatement"
  var block: BlockStatement? =  null
  var handler: CatchClause? =  null
  var finalizer: BlockStatement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class WhileStatement : Node, HasSpan, Statement {
/**
   *literal is: "WhileStatement"
   */
  override var type: String? = "WhileStatement"
  var test: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class DoWhileStatement : Node, HasSpan, Statement {
/**
   *literal is: "DoWhileStatement"
   */
  override var type: String? = "DoWhileStatement"
  var test: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ForStatement : Node, HasSpan, Statement {
/**
   *literal is: "ForStatement"
   */
  override var type: String? = "ForStatement"
  var init: Union.U2<VariableDeclaration, Expression>? =  null
  var test: Expression? =  null
  var update: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ForInStatement : Node, HasSpan, Statement {
/**
   *literal is: "ForInStatement"
   */
  override var type: String? = "ForInStatement"
  var left: Union.U2<VariableDeclaration, Pattern>? =  null
  var right: Expression? =  null
  var body: Statement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class ForOfStatement : Node, HasSpan, Statement {
/**
   *literal is: "ForOfStatement"
   */
  override var type: String? = "ForOfStatement"
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

@SwcDslMarker
@Serializable
open class SwitchCase : Node, HasSpan {
/**
   *literal is: "SwitchCase"
   */
  override var type: String? = "SwitchCase"
/**
     * Undefined for default case
     */
  var test: Expression? =  null
  var consequent: Array<Statement>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class CatchClause : Node, HasSpan {
/**
   *literal is: "CatchClause"
   */
  override var type: String? = "CatchClause"
/**
     * The param is `undefined` if the catch binding is omitted. E.g., `try { foo() } catch {}`
     */
  var param: Pattern? =  null
  var body: BlockStatement? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTypeAnnotation : Node, HasSpan {
/**
   *literal is: "TsTypeAnnotation"
   */
  override var type: String? = "TsTypeAnnotation"
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTypeParameterDeclaration : Node, HasSpan {
/**
   *literal is: "TsTypeParameterDeclaration"
   */
  override var type: String? = "TsTypeParameterDeclaration"
  var parameters: Array<TsTypeParameter>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTypeParameter : Node, HasSpan {
/**
   *literal is: "TsTypeParameter"
   */
  override var type: String? = "TsTypeParameter"
  var name: Identifier? =  null
  var `in`: Boolean? =  null
  var out: Boolean? =  null
  var constraint: TsType? =  null
  var default: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTypeParameterInstantiation : Node, HasSpan {
/**
   *literal is: "TsTypeParameterInstantiation"
   */
  override var type: String? = "TsTypeParameterInstantiation"
  var params: Array<TsType>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsParameterProperty : Node, HasSpan, HasDecorator {
/**
   *literal is: "TsParameterProperty"
   */
  override var type: String? = "TsParameterProperty"
/**
  * [Accessibility]
 */
  var accessibility: 	String? =  null
  var override: Boolean? =  null
  var readonly: Boolean? =  null
  var param: TsParameterPropertyParameter? =  null
  override var span: Span?  = null
  override var decorators: Array<Decorator>?  = null
}

@SwcDslMarker
@Serializable
open class TsQualifiedName : Node, TsEntityName {
/**
   *literal is: "TsQualifiedName"
   */
  override var type: String? = "TsQualifiedName"
  var left: TsEntityName? =  null
  var right: Identifier? =  null
}

@SwcDslMarker
@Serializable
open class TsCallSignatureDeclaration : Node, HasSpan, TsTypeElement {
/**
   *literal is: "TsCallSignatureDeclaration"
   */
  override var type: String? = "TsCallSignatureDeclaration"
  var params: Array<TsFnParameter>? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsConstructSignatureDeclaration : Node, HasSpan, TsTypeElement {
/**
   *literal is: "TsConstructSignatureDeclaration"
   */
  override var type: String? = "TsConstructSignatureDeclaration"
  var params: Array<TsFnParameter>? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsPropertySignature : Node, HasSpan, TsTypeElement {
/**
   *literal is: "TsPropertySignature"
   */
  override var type: String? = "TsPropertySignature"
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

@SwcDslMarker
@Serializable
open class TsGetterSignature : Node, HasSpan, TsTypeElement {
/**
   *literal is: "TsGetterSignature"
   */
  override var type: String? = "TsGetterSignature"
  var readonly: Boolean? =  null
  var key: Expression? =  null
  var computed: Boolean? =  null
  var optional: Boolean? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsSetterSignature : Node, HasSpan, TsTypeElement {
/**
   *literal is: "TsSetterSignature"
   */
  override var type: String? = "TsSetterSignature"
  var readonly: Boolean? =  null
  var key: Expression? =  null
  var computed: Boolean? =  null
  var optional: Boolean? =  null
  var param: TsFnParameter? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsMethodSignature : Node, HasSpan, TsTypeElement {
/**
   *literal is: "TsMethodSignature"
   */
  override var type: String? = "TsMethodSignature"
  var readonly: Boolean? =  null
  var key: Expression? =  null
  var computed: Boolean? =  null
  var optional: Boolean? =  null
  var params: Array<TsFnParameter>? =  null
  var typeAnn: TsTypeAnnotation? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsIndexSignature : Node, HasSpan, ClassMember, TsTypeElement {
/**
   *literal is: "TsIndexSignature"
   */
  override var type: String? = "TsIndexSignature"
  var params: Array<TsFnParameter>? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  var readonly: Boolean? =  null
  var static: Boolean? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsKeywordType : Node, HasSpan, TsType {
/**
   *literal is: "TsKeywordType"
   */
  override var type: String? = "TsKeywordType"
/**
  * [TsKeywordTypeKind]
 */
  var kind: 	String? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsThisType : Node, HasSpan, TsType, TsThisTypeOrIdent {
/**
   *literal is: "TsThisType"
   */
  override var type: String? = "TsThisType"
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsFunctionType : Node, HasSpan, TsFnOrConstructorType {
/**
   *literal is: "TsFunctionType"
   */
  override var type: String? = "TsFunctionType"
  var params: Array<TsFnParameter>? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsConstructorType : Node, HasSpan, TsFnOrConstructorType {
/**
   *literal is: "TsConstructorType"
   */
  override var type: String? = "TsConstructorType"
  var params: Array<TsFnParameter>? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  var isAbstract: Boolean? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTypeReference : Node, HasSpan, TsType {
/**
   *literal is: "TsTypeReference"
   */
  override var type: String? = "TsTypeReference"
  var typeName: TsEntityName? =  null
  var typeParams: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTypePredicate : Node, HasSpan, TsType {
/**
   *literal is: "TsTypePredicate"
   */
  override var type: String? = "TsTypePredicate"
  var asserts: Boolean? =  null
  var paramName: TsThisTypeOrIdent? =  null
  var typeAnnotation: TsTypeAnnotation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsImportType : Node, HasSpan, TsType, TsTypeQueryExpr {
/**
   *literal is: "TsImportType"
   */
  override var type: String? = "TsImportType"
  var argument: StringLiteral? =  null
  var qualifier: TsEntityName? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

/**
 * `typeof` operator
 */
@SwcDslMarker
@Serializable
open class TsTypeQuery : Node, HasSpan, TsType {
/**
   *literal is: "TsTypeQuery"
   */
  override var type: String? = "TsTypeQuery"
  var exprName: TsTypeQueryExpr? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTypeLiteral : Node, HasSpan, TsType {
/**
   *literal is: "TsTypeLiteral"
   */
  override var type: String? = "TsTypeLiteral"
  var members: Array<TsTypeElement>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsArrayType : Node, HasSpan, TsType {
/**
   *literal is: "TsArrayType"
   */
  override var type: String? = "TsArrayType"
  var elemType: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTupleType : Node, HasSpan, TsType {
/**
   *literal is: "TsTupleType"
   */
  override var type: String? = "TsTupleType"
  var elemTypes: Array<TsTupleElement>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTupleElement : Node, HasSpan {
/**
   *literal is: "TsTupleElement"
   */
  override var type: String? = "TsTupleElement"
  var label: Pattern? =  null
  var ty: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsOptionalType : Node, HasSpan, TsType {
/**
   *literal is: "TsOptionalType"
   */
  override var type: String? = "TsOptionalType"
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsRestType : Node, HasSpan, TsType {
/**
   *literal is: "TsRestType"
   */
  override var type: String? = "TsRestType"
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsUnionType : Node, HasSpan, TsUnionOrIntersectionType {
/**
   *literal is: "TsUnionType"
   */
  override var type: String? = "TsUnionType"
  var types: Array<TsType>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsIntersectionType : Node, HasSpan, TsUnionOrIntersectionType {
/**
   *literal is: "TsIntersectionType"
   */
  override var type: String? = "TsIntersectionType"
  var types: Array<TsType>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsConditionalType : Node, HasSpan, TsType {
/**
   *literal is: "TsConditionalType"
   */
  override var type: String? = "TsConditionalType"
  var checkType: TsType? =  null
  var extendsType: TsType? =  null
  var trueType: TsType? =  null
  var falseType: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsInferType : Node, HasSpan, TsType {
/**
   *literal is: "TsInferType"
   */
  override var type: String? = "TsInferType"
  var typeParam: TsTypeParameter? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsParenthesizedType : Node, HasSpan, TsType {
/**
   *literal is: "TsParenthesizedType"
   */
  override var type: String? = "TsParenthesizedType"
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTypeOperator : Node, HasSpan, TsType {
/**
   *literal is: "TsTypeOperator"
   */
  override var type: String? = "TsTypeOperator"
/**
  * [TsTypeOperatorOp]
 */
  var op: 	String? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsIndexedAccessType : Node, HasSpan, TsType {
/**
   *literal is: "TsIndexedAccessType"
   */
  override var type: String? = "TsIndexedAccessType"
  var readonly: Boolean? =  null
  var objectType: TsType? =  null
  var indexType: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsMappedType : Node, HasSpan, TsType {
/**
   *literal is: "TsMappedType"
   */
  override var type: String? = "TsMappedType"
  var readonly: TruePlusMinus? =  null
  var typeParam: TsTypeParameter? =  null
  var nameType: TsType? =  null
  var optional: TruePlusMinus? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsLiteralType : Node, HasSpan, TsType {
/**
   *literal is: "TsLiteralType"
   */
  override var type: String? = "TsLiteralType"
  var literal: TsLiteral? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTemplateLiteralType : Node, HasSpan, TsLiteral {
/**
   *literal is: "TemplateLiteral"
   */
  override var type: String? = "TemplateLiteral"
  var types: Array<TsType>? =  null
  var quasis: Array<TemplateElement>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsInterfaceDeclaration : Node, HasSpan, Declaration, DefaultDecl {
/**
   *literal is: "TsInterfaceDeclaration"
   */
  override var type: String? = "TsInterfaceDeclaration"
  var id: Identifier? =  null
  var declare: Boolean? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  var extends: Array<TsExpressionWithTypeArguments>? =  null
  var body: TsInterfaceBody? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsInterfaceBody : Node, HasSpan {
/**
   *literal is: "TsInterfaceBody"
   */
  override var type: String? = "TsInterfaceBody"
  var body: Array<TsTypeElement>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsExpressionWithTypeArguments : Node, HasSpan {
/**
   *literal is: "TsExpressionWithTypeArguments"
   */
  override var type: String? = "TsExpressionWithTypeArguments"
  var expression: Expression? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTypeAliasDeclaration : Node, HasSpan, Declaration {
/**
   *literal is: "TsTypeAliasDeclaration"
   */
  override var type: String? = "TsTypeAliasDeclaration"
  var declare: Boolean? =  null
  var id: Identifier? =  null
  var typeParams: TsTypeParameterDeclaration? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsEnumDeclaration : Node, HasSpan, Declaration {
/**
   *literal is: "TsEnumDeclaration"
   */
  override var type: String? = "TsEnumDeclaration"
  var declare: Boolean? =  null
  var isConst: Boolean? =  null
  var id: Identifier? =  null
  var members: Array<TsEnumMember>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsEnumMember : Node, HasSpan {
/**
   *literal is: "TsEnumMember"
   */
  override var type: String? = "TsEnumMember"
  var id: TsEnumMemberId? =  null
  var init: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsModuleDeclaration : Node, HasSpan, Declaration {
/**
   *literal is: "TsModuleDeclaration"
   */
  override var type: String? = "TsModuleDeclaration"
  var declare: Boolean? =  null
  var global: Boolean? =  null
  var id: TsModuleName? =  null
  var body: TsNamespaceBody? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsModuleBlock : Node, HasSpan, TsNamespaceBody {
/**
   *literal is: "TsModuleBlock"
   */
  override var type: String? = "TsModuleBlock"
  var body: Array<ModuleItem>? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsNamespaceDeclaration : Node, HasSpan, TsNamespaceBody {
/**
   *literal is: "TsNamespaceDeclaration"
   */
  override var type: String? = "TsNamespaceDeclaration"
  var declare: Boolean? =  null
  var global: Boolean? =  null
  var id: Identifier? =  null
  var body: TsNamespaceBody? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsImportEqualsDeclaration : Node, HasSpan, ModuleDeclaration {
/**
   *literal is: "TsImportEqualsDeclaration"
   */
  override var type: String? = "TsImportEqualsDeclaration"
  var declare: Boolean? =  null
  var isExport: Boolean? =  null
  var isTypeOnly: Boolean? =  null
  var id: Identifier? =  null
  var moduleRef: TsModuleReference? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsExternalModuleReference : Node, HasSpan, TsModuleReference {
/**
   *literal is: "TsExternalModuleReference"
   */
  override var type: String? = "TsExternalModuleReference"
  var expression: StringLiteral? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsExportAssignment : Node, HasSpan, ModuleDeclaration {
/**
   *literal is: "TsExportAssignment"
   */
  override var type: String? = "TsExportAssignment"
  var expression: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsNamespaceExportDeclaration : Node, HasSpan, ModuleDeclaration {
/**
   *literal is: "TsNamespaceExportDeclaration"
   */
  override var type: String? = "TsNamespaceExportDeclaration"
  var id: Identifier? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsAsExpression : ExpressionBase, Expression {
/**
   *literal is: "TsAsExpression"
   */
  override var type: String? = "TsAsExpression"
  var expression: Expression? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsSatisfiesExpression : ExpressionBase, Expression {
/**
   *literal is: "TsSatisfiesExpression"
   */
  override var type: String? = "TsSatisfiesExpression"
  var expression: Expression? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsInstantiation : Node, HasSpan, Expression {
/**
   *literal is: "TsInstantiation"
   */
  override var type: String? = "TsInstantiation"
  var expression: Expression? =  null
  var typeArguments: TsTypeParameterInstantiation? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsTypeAssertion : ExpressionBase, Expression {
/**
   *literal is: "TsTypeAssertion"
   */
  override var type: String? = "TsTypeAssertion"
  var expression: Expression? =  null
  var typeAnnotation: TsType? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsConstAssertion : ExpressionBase, Expression {
/**
   *literal is: "TsConstAssertion"
   */
  override var type: String? = "TsConstAssertion"
  var expression: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class TsNonNullExpression : ExpressionBase, Expression {
/**
   *literal is: "TsNonNullExpression"
   */
  override var type: String? = "TsNonNullExpression"
  var expression: Expression? =  null
  override var span: Span?  = null
}

@SwcDslMarker
@Serializable
open class Invalid : Node, HasSpan, Expression, Pattern {
/**
   *literal is: "Invalid"
   */
  override var type: String? = "Invalid"
  override var span: Span?  = null
}