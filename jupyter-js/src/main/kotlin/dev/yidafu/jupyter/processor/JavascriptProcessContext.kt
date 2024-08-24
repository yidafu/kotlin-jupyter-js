package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.CircularDependencyException
import org.slf4j.LoggerFactory

data class DependenceNode(
    val source: String,
    val parent: DependenceNode? = null,
    val children: MutableList<DependenceNode> = mutableListOf(),
) {
    fun hasChildren(source: String): Boolean {
        return children.any { it.source == source }
    }

    fun getChildren(source: String): DependenceNode? {
        return children.find { it.source == source }
    }

    fun addChildren(child: String): DependenceNode {
        return if (!hasChildren(child)) {
            val newChild = DependenceNode(child, this)
            children.add(newChild)
            newChild
        } else {
            getChildren(child)!!
        }
    }
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

    fun <T> dependencyScope(
        source: String,
        block: () -> T,
    ): T {
        log.info("enter scope: $source")
        val newDepNode = currentDepNode.addChildren(source)
        currentDepNode = newDepNode
        val result = block()
        currentDepNode = currentDepNode.parent!!
        log.info("exit scope: $source")

        return result
    }

    /**
     * detect circular dependency
     */
    fun addDependency(child: String) {
        var p: DependenceNode? = currentDepNode
        while (p != null) {
            if (p.source == child) {
                throw CircularDependencyException(p.source, child)
            }
            p = p.parent
        }
        log.info("${currentDepNode.source} add dependency $child")
        currentDepNode.addChildren(child)
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
