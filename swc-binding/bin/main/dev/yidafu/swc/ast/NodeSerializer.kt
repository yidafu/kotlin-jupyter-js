package dev.yidafu.swc.ast

object NodeSerializer : JsonContentPolymorphicSerializer<Node>(Node::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Node> {
        return when {
            "type" in element.jsonObject -> {
                val sourceContent = element.jsonObject["type"]?.jsonPrimitive?.contentOrNull
                when (sourceContent) {
                    "Invalid" -> Invalid.serializer()
                    "JSXAttribute" -> JSXAttribute.serializer()
                    else -> TODO()
                }
            }
            else -> {
                TODO()
            }
        }
    }
}