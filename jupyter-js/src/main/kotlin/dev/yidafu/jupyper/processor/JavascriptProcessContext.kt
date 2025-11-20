package dev.yidafu.jupyper.processor

import dev.yidafu.jupyper.CircularDependencyException
import org.slf4j.LoggerFactory

/**
 * Dependency node
 *
 * Used to build dependency tree and detect circular dependencies
 *
 * @param source Dependency source identifier (usually file name or module name)
 * @param parent Parent node
 * @param children List of child nodes
 */
data class DependenceNode(
    val source: String,
    val parent: DependenceNode? = null,
    val children: MutableList<DependenceNode> = mutableListOf(),
) {
    /**
     * Checks if contains child node with specified source
     */
    fun hasChildren(source: String): Boolean {
        return children.any { it.source == source }
    }

    /**
     * Gets child node with specified source
     */
    fun getChildren(source: String): DependenceNode? {
        return children.find { it.source == source }
    }

    /**
     * Adds child node
     * Returns existing node if child already exists, otherwise creates new node
     */
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
 * JavaScript processing context
 *
 * Stores and passes context information during code processing, including:
 * 1. Variables imported from Kotlin (via @jupyter virtual package)
 * 2. Dependency tree (for detecting circular dependencies)
 *
 * Performance optimization:
 * Variables imported from Kotlin are not passed to SWC compiler, but instead
 * converted to JavaScript variable declaration strings in final step, then concatenated with JavaScript code
 *
 * @param processor JavaScript processor instance
 */
class JavascriptProcessContext(
    val processor: DefaultJavaScriptProcessor,
) {
    private val log = LoggerFactory.getLogger(JavascriptProcessContext::class.java)

    /**
     * List of variables imported from Kotlin
     * Format: (variable name, JSON string value)
     */
    private val importedVariables: MutableList<Pair<String, String>> = mutableListOf()

    /**
     * Root node of dependency tree
     */
    private val root = DependenceNode("root")

    /**
     * Current dependency node
     */
    private var currentDepNode: DependenceNode = root

    /**
     * Enters dependency scope
     *
     * Used to track dependency relationships during code processing, supports nested scopes
     *
     * @param source Scope identifier (usually file name)
     * @param block Code block to execute within scope
     * @return Return value of code block
     */
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
     * Adds dependency and detects circular dependencies
     *
     * Throws CircularDependencyException if circular dependency is detected
     *
     * @param child Source identifier of dependency
     * @throws CircularDependencyException if circular dependency is detected
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

    /**
     * Adds variable imported from Kotlin
     *
     * @param pair Pair of variable name and JSON string value
     */
    fun addKotlinValue(pair: Pair<String, String>) {
        importedVariables.add(pair)
    }

    /**
     * Converts to JavaScript variable declaration string
     *
     * Converts all imported Kotlin variables to const declarations
     * Example: `const foo = "bar"; const baz = "qux";`
     */
    override fun toString(): String {
        return importedVariables.joinToString(";\n") {
            """const ${it.first} = ${it.second} """
        }
    }
}
