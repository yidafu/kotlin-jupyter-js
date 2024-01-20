package dev.yidafu.jupyper.processor

/**
 * save variable name / it's json string value, declare by `@jupyter` virtual package.
 *
 * For performance reason, those variable will not pass to SWC
 *
 * At final step will transform to js variable declarations string. and concat with js code.
 */
class JavascriptProcessContext {
    private val importedVariables: MutableList<Pair<String, String>> = mutableListOf()

    fun addKotlinValue(pair: Pair<String, String>) {
        importedVariables.add(pair)
    }

    override fun toString(): String {
        return importedVariables.joinToString(";\n") {
            """const ${it.first} = ${it.second} """
        }
    }
}
