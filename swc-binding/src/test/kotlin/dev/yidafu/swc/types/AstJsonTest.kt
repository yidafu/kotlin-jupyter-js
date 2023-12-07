package dev.yidafu.swc.types

import dev.yidafu.swc.dsl.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class AstJsonTest {
    private val json1: Json = Json {
        encodeDefaults = true
        explicitNulls = false
        classDiscriminator = "type"
        serializersModule = swcSerializersModule
    }

    @Test
    fun `decode import default specifier`() {
        val astJson = """
        {"type":"ImportDefaultSpecifier","span":{"start":146,"end":147,"ctxt":0}}
        """.trimIndent()
        assertEquals(astJson, json1.encodeToString(json1.decodeFromString<ImportSpecifier>(astJson)))
    }

    @Test
    fun `decode identifier node`() {
        val jsonStr = """
        {"type":"Identifier","value":"x","optional":false,"span":{"start":146,"end":147,"ctxt":2}}
        """.trimIndent()

        val node = json1.decodeFromString<Identifier>(jsonStr)
        assertEquals(node.value, "x")
        val str = json1.encodeToString(node)
        assertEquals(jsonStr, str)
    }

    @Test
    fun `decode ast tree`() {
        val astJson = """
            {
                "type":"Module",
                "span":{
                    "start":104,
                    "end":171,
                    "ctxt":0
                },
                "body":[
                    {
                        "type":"ImportDeclaration",
                        "span":{
                            "start":104,
                            "end":130,
                            "ctxt":0
                        },
                        "specifiers":[
                            {
                                "type":"ImportDefaultSpecifier",
                                "span":{
                                    "start":111,
                                    "end":112,
                                    "ctxt":0
                                },
                                "local":{
                                    "type":"Identifier",
                                    "span":{
                                        "start":111,
                                        "end":112,
                                        "ctxt":2
                                    },
                                    "value":"x",
                                    "optional":false
                                }
                            }
                        ],
                        "source":{
                            "type":"StringLiteral",
                            "span":{
                                "start":118,
                                "end":129,
                                "ctxt":0
                            },
                            "value":"./test.js",
                            "raw":"'./test.js'"
                        },
                        "typeOnly":false,
                        "with":null
                    },
                    {
                        "type":"ClassDeclaration",
                        "identifier":{
                            "type":"Identifier",
                            "span":{
                                "start":137,
                                "end":140,
                                "ctxt":2
                            },
                            "value":"Foo",
                            "optional":false
                        },
                        "declare":false,
                        "span":{
                            "start":131,
                            "end":144,
                            "ctxt":0
                        },
                        "decorators":[

                        ],
                        "body":[

                        ],
                        "superClass":null,
                        "isAbstract":false,
                        "typeParams":null,
                        "superTypeParams":null,
                        "implements":[

                        ]
                    },
                    {
                        "type":"ClassDeclaration",
                        "identifier":{
                            "type":"Identifier",
                            "span":{
                                "start":152,
                                "end":155,
                                "ctxt":2
                            },
                            "value":"Bar",
                            "optional":false
                        },
                        "declare":false,
                        "span":{
                            "start":146,
                            "end":171,
                            "ctxt":0
                        },
                        "decorators":[

                        ],
                        "body":[

                        ],
                        "superClass":{
                            "type":"Identifier",
                            "span":{
                                "start":164,
                                "end":167,
                                "ctxt":2
                            },
                            "value":"Foo",
                            "optional":false
                        },
                        "isAbstract":false,
                        "typeParams":null,
                        "superTypeParams":null,
                        "implements":[

                        ]
                    }
                ],
                "interpreter":null
            }
        """.trimIndent()

        json1.decodeFromString<Program>(astJson)
    }

    @Test
    fun `encode ast dsl`() {
        val tree = module {
            span = span {
                start = 0
                end = 17
            }
            body = arrayOf(
                variableDeclaration {
                    span = span {
                        start = 5
                        end = 17
                    }
                    kind = VariableDeclarationKind.CONST
                    declarations = arrayOf(
                        variableDeclarator {
                            id = identifier {
                                value = "a"
                                span = span {
                                    start = 5
                                    end = 6
                                }
                            }
                            init = stringLiteral {
                                value = "String"
                                span = span {
                                    start = 9
                                    end = 17
                                }
                            }
                        }
                    )
                }
            )
        }

        val json = json1.encodeToString(tree)
        val mod: Module = json1.decodeFromString<Module>(json)
        assertTrue(mod.body!![0] is VariableDeclaration)
    }
}
