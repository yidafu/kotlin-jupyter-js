package dev.yidafu.swc

import dev.yidafu.swc.dsl.*
import dev.yidafu.swc.types.Module

val esAddFunction: Module =
    module {
        span =
            span {
                start = 1
                end = 52
                ctxt = 0
            }
        body =
            arrayOf(
                functionDeclaration {
                    identifier =
                        identifier {
                            span =
                                span {
                                    start = 10
                                    end = 13
                                    ctxt = 2
                                }
                            value = "add"
                            optional = false
                        }
                    declare = false
                    params =
                        arrayOf(
                            param {
                                span =
                                    span {
                                        start = 14
                                        end = 15
                                        ctxt = 0
                                    }
                                decorators = arrayOf()
                                pat =
                                    identifier {
                                        span =
                                            span {
                                                start = 14
                                                end = 15
                                                ctxt = 3
                                            }
                                        value = "a"
                                        optional = false
                                    }
                            },
                            param {
                                span =
                                    span {
                                        start = 17
                                        end = 18
                                        ctxt = 0
                                    }
                                decorators = arrayOf()
                                pat =
                                    identifier {
                                        span =
                                            span {
                                                start = 17
                                                end = 18
                                                ctxt = 3
                                            }
                                        value = "b"
                                        optional = false
                                    }
                            },
                        )
                    decorators = arrayOf()
                    span =
                        span {
                            start = 1
                            end = 41
                            ctxt = 3
                        }
                    body =
                        blockStatement {
                            span =
                                span {
                                    start = 20
                                    end = 42
                                    ctxt = 3
                                }
                            stmts =
                                arrayOf(
                                    returnStatement {
                                        span =
                                            span {
                                                start = 26
                                                end = 39
                                                ctxt = 0
                                            }
                                        argument =
                                            binaryExpression {
                                                span =
                                                    span {
                                                        start = 33
                                                        end = 38
                                                        ctxt = 0
                                                    }
                                                operator = "+"
                                                left =
                                                    identifier {
                                                        span =
                                                            span {
                                                                start = 33
                                                                end = 34
                                                                ctxt = 3
                                                            }
                                                        value = "a"
                                                        optional = false
                                                    }
                                                right =
                                                    identifier {
                                                        span =
                                                            span {
                                                                start = 37
                                                                end = 38
                                                                ctxt = 3
                                                            }
                                                        value = "b"
                                                        optional = false
                                                    }
                                            }
                                    },
                                )
                        }
                    generator = false
                    async = false
                },
                emptyStatement {
                    span =
                        span {
                            start = 41
                            end = 42
                            ctxt = 0
                        }
                },
                expressionStatement {
                    span =
                        span {
                            start = 43
                            end = 52
                            ctxt = 0
                        }
                    expression =
                        callExpression {
                            span =
                                span {
                                    start = 43
                                    end = 51
                                    ctxt = 0
                                }
                            callee =
                                identifier {
                                    span =
                                        span {
                                            start = 43
                                            end = 46
                                            ctxt = 2
                                        }
                                    value = "add"
                                    optional = false
                                }
                            arguments =
                                arrayOf(
                                    argument {
                                        expression =
                                            numericLiteral {
                                                span =
                                                    span {
                                                        start = 47
                                                        end = 48
                                                        ctxt = 0
                                                    }
                                                value = 1
                                                raw = "1"
                                            }
                                    },
                                    argument {
                                        expression =
                                            numericLiteral {
                                                span =
                                                    span {
                                                        start = 49
                                                        end = 50
                                                        ctxt = 2
                                                    }
                                                value = 2
                                                raw = "2"
                                            }
                                    },
                                )
                        }
                },
            )
        interpreter = null
    }
