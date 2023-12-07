package dev.yidafu.swc

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import kotlin.test.Test
object NodeSerializer : JsonContentPolymorphicSerializer<Node>(Node::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Node> {
        return when {
            "type" in element.jsonObject -> {
                val nodeType = element.jsonObject["type"]?.jsonPrimitive?.contentOrNull
                when (nodeType) {
                    "BlockStatement" -> BlockStatement.serializer()
                    "BreakStatement" -> BreakStatement.serializer()
                    "BooleanLiteral" -> BooleanLiteral.serializer()
                    "ExpressionStatement" -> ExpressionStatement.serializer()
                    else -> TODO()
                }
            }
            else -> {
                TODO()
            }
        }
    }
}

@Serializable(with = NodeSerializer::class)
sealed interface Node {
//    val type: String?
}

interface ModuleItem : Node

interface Statement : ModuleItem

@Serializable
@SerialName("BlockStatement")
class BlockStatement : Statement, Node {
//    override var type: String? = "BlockStatement"
    var stmts: Array<Statement>? = null
}

@Serializable
@SerialName("BreakStatement")
class BreakStatement : Statement, Node {
//    override var type: String? = "BreakStatement"
    var label: String? = "break"
}

interface Expression : Node

interface Literal : Expression

@Serializable
@SerialName("BooleanLiteral")
class BooleanLiteral : Literal, Node {
//    override var type: String? = "BooleanLiteral"
    var value: Boolean = false
}

@Serializable
@SerialName("ExpressionStatement")
class ExpressionStatement : Node, Statement {
    var type: String? = "ExpressionStatement"
    var expression: Expression? = null
}

val module = SerializersModule {
    polymorphic(Node::class) {
        subclass(BreakStatement::class)
        subclass(BlockStatement::class)
        subclass(BooleanLiteral::class)
        subclass(ExpressionStatement::class)
    }

    polymorphic(Statement::class) {
        subclass(BreakStatement::class)
        subclass(BlockStatement::class)
        subclass(ExpressionStatement::class)
    }
    polymorphic(Expression::class) {
        subclass(BooleanLiteral::class)
    }
}
class JsonPolymorphismTest {

    @OptIn(ExperimentalSerializationApi::class)
    val json = Json {
        prettyPrint = true
        encodeDefaults = true
        explicitNulls = false
        classDiscriminator = "type"
        serializersModule = module
    }

    @Test
    fun jsonTest() {
        val node = BlockStatement().apply {
            stmts = arrayOf(
                BreakStatement(),
                ExpressionStatement().apply { expression = BooleanLiteral() }
            )
        }

        val json = json.encodeToString<Node>(node)
        println(json)

        Json {
            prettyPrint = true
            encodeDefaults = true
            explicitNulls = false
            classDiscriminator = "type"
            serializersModule = module
        }.decodeFromString<BlockStatement>(json)
    }
}
