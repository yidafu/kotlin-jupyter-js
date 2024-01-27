package dev.yidafu.jupyper

open class JupyterJsException(msg: String) : RuntimeException(msg)

class NotSupportMimeTypeException(type: String) : JupyterJsException("mime type: $type not support in in Kotlin Jupyter JS")

class InvalidMimeTypeResult(type: String) : JupyterJsException("Kotlin Jupyter MimeTypedResult ($type) data can't be null")

class CircularDependencyException(parent: String, child: String) : JupyterJsException(
    """
    Jupyter JS not support circular dependency:
    $parent
    |    ^
    V    |
    $child
    """.trimIndent()
)
