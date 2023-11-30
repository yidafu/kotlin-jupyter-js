# SWC-Binding

[SWC](https://github.com/swc-project/swc) jvm binding by kotlin.

# TODO
+ [ ] config dsl
+ [ ] minify / print api
+ [ ] async api
+ [ ] load ddl from jar
+ [ ] rust code optimize

# Installtion

```kts
implementation("dev.yidafu.swc:swc-binding:$latest-version")
```

# Usage

## transform code
```kt
val swc = SwcNative()
val res = swc.transformSync(
    """
     import x from './test.js';
     class Foo {
       bar: string
     }
    """.trimIndent(),
    false,
    Options().apply {
        jsc  = jscConfig {
            parser = ParserConfig().apply {
                syntax = "ecmascript"
            }
        }
    }
)
```
## parse code

```kotlin
val ast = SwcNative().parseSync(
    """
     import x from './test.js';
     class Foo {
       bar: string
     }
    """.trimIndent(),
    ParseOptions().apply { syntax = "typescript" },
    "temp.js"
)
```

# AST DSL

```kt
// import x from './test.js';
// class Foo {
//     bar: string
// }
module {
    body = arrayOf(
        importDeclaration {
            specifiers = arrayOf(
                importDefaultSpecifier {
                    local = Identifier().apply {
                        value = "x"
                    }
                }
            )
            source = stringLiteral {
                value=  "./test.js"
                raw =  "./test.js"
                span = Span()
            }
            typeOnly = false
            span = Span()
        },

        classDeclaration {
            identifier = Identifier()
            body = arrayOf(
                classProperty {
                    typeAnnotation = tsTypeAnnotation {
                        typeAnnotation = tsKeywordType {
                            kind = TsKeywordTypeKind.STRING
                        }
                    }
                }
            )
        }
    )
}
```
