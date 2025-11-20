package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.CircularDependencyException
import dev.yidafu.swc.generated.VariableDeclaration
import org.slf4j.LoggerFactory
import java.util.*
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

data class DependenceNode(
    val source: String,
    val parent: DependenceNode? = null,
    val children: MutableList<DependenceNode> = mutableListOf(),
) {
    private fun hasChildren(source: String): Boolean {
        return children.any { it.source == source }
    }

    private fun getChildren(source: String): DependenceNode? {
        return children.find { it.source == source }
    }

    private fun detectCircularDependency(child: String) {
        var node = parent
        while (node != null) {
            if (node.source == child) {
                throw CircularDependencyException(node.source, child)
            }
            node = node.parent
        }
    }

    fun addChildren(child: String): DependenceNode {
        detectCircularDependency(child)
        return if (!hasChildren(child)) {
            val newChild = DependenceNode(child, this)
            children.add(newChild)
            newChild
        } else {
            getChildren(child)!!
        }
    }
}

@OptIn(ExperimentalEncodingApi::class)
internal fun url2VarName(
    url: String,
    global: Boolean = true,
): String {
    return (if (global) "global_" else "inline_") + Base64.encode(url.toByteArray()).replace("=", "")
}

/**
 * save variable name / it's json string value, declare by `@jupyter` virtual package.
 *
 * For performance reason, those variable will not pass to SWC
 *
 * At final step will transform to js variable declarations string. and concat with js code.
 */
class JavascriptProcessContext(
    val processor: DefaultJavaScriptProcessor,
) {
    private val log = LoggerFactory.getLogger(JavascriptProcessContext::class.java)
    private val importedVariables: MutableList<Pair<String, String>> = mutableListOf()
    private val root = DependenceNode("root")

    private var currentDepNode: DependenceNode = root
    private val importQueue: Deque<String> = LinkedList()

    fun addImport(varName: String) {
        if (importQueue.contains(varName)) {
            importQueue.remove(varName)
        }
        importQueue.offerFirst(varName)
    }

    private val globalImportStat = mutableMapOf<String, VariableDeclaration>()

    fun addGlobalImportStat(
        varName: String,
        stat: VariableDeclaration,
    ) {
        addImport(varName)
        globalImportStat[varName] = stat
    }

    fun hasImport(varName: String): Boolean {
        return importQueue.contains(varName)
    }

    val globalImports: List<VariableDeclaration>
        get() {
            return importQueue.mapNotNull { varName ->
                globalImportStat[varName]
            }
        }

    fun <T> dependencyScope(
        source: String,
        block: () -> T,
    ): T? {
        if (!globalImportStat.containsKey(url2VarName(source))) {
            log.info("enter scope: $source")
            val newDepNode = currentDepNode.addChildren(source)
            currentDepNode = newDepNode
            val result = block()
            currentDepNode = currentDepNode.parent!!
            log.info("exit scope: $source")
            return result
        }
        return null
    }

    fun addKotlinValue(pair: Pair<String, String>) {
        importedVariables.add(pair)
    }

    override fun toString(): String {
        return importedVariables.joinToString(";\n") {
            """const ${it.first} = ${it.second} """
        }
    }
}
