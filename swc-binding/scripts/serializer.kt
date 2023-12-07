
package dev.yidafu.swc.types

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerializationException
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import kotlinx.serialization.modules.SerializersModule

object NodeSerializer : JsonContentPolymorphicSerializer<Node>(Node::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Node> {
        return when {
            "type" in element.jsonObject -> {
                val nodeType = element.jsonObject["type"]?.jsonPrimitive?.contentOrNull
                when (nodeType) {
                  
					"StringLiteral" -> StringLiteralImpl.serializer()

					"ImportDeclaration" -> ImportDeclarationImpl.serializer()

					"ClassMethod" -> ClassMethodImpl.serializer()
                    else -> throw SerializationException("$nodeType Not Ast Node Type")
                }
            }
            else -> {
                throw SerializationException("Not Valid Tree Node")
            }
        }
    }
}
val swcSerializersModule = SerializersModule {
  
    polymorphic(ParserConfig::class) {
	    subclass(ParseOptions::class)
	    subclass(TsParserConfigImpl::class)
	    subclass(EsParserConfigImpl::class)
    }

    polymorphic(ModuleDeclaration::class) {
	    subclass(ImportDeclarationImpl::class)
	    subclass(ExportDeclarationImpl::class)
    }

    polymorphic(Statement::class) {
	    subclass(BlockStatementImpl::class)
	    subclass(EmptyStatementImpl::class)
    }

    polymorphic(ImportDeclaration::class) {
	    subclass(ImportDeclarationImpl::class)
    }

    polymorphic(ExportDeclaration::class) {
	    subclass(ExportDeclarationImpl::class)
    }

    polymorphic(BlockStatement::class) {
	    subclass(BlockStatementImpl::class)
    }

    polymorphic(EmptyStatement::class) {
	    subclass(EmptyStatementImpl::class)
    }

    polymorphic(Es6Config::class) {
	    subclass(Es6ConfigImpl::class)
    }

    polymorphic(CommonJsConfig::class) {
	    subclass(CommonJsConfigImpl::class)
    }

    polymorphic(TsParserConfig::class) {
	    subclass(TsParserConfigImpl::class)
    }

    polymorphic(EsParserConfig::class) {
	    subclass(EsParserConfigImpl::class)
    }

    polymorphic(StringLiteral::class) {
	    subclass(StringLiteralImpl::class)
    }

    polymorphic(Fn::class) {
	    subclass(FunctionDeclarationImpl::class)
    }

    polymorphic(FunctionDeclaration::class) {
	    subclass(FunctionDeclarationImpl::class)
    }

    polymorphic(ClassMethodBase::class) {
	    subclass(ClassMethodImpl::class)
    }

    polymorphic(ClassMethod::class) {
	    subclass(ClassMethodImpl::class)
    }
}