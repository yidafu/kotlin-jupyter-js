package dev.yidafu.jupyper.processor

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
