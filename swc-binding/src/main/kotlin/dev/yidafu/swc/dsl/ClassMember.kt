package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of ClassMember
 */
fun ClassMember.constructor(block: Constructor.() -> Unit): Constructor {
    return ConstructorImpl().apply(block)
}

/**
 * subtype of ClassMember
 */
fun ClassMember.classMethod(block: ClassMethod.() -> Unit): ClassMethod {
    return ClassMethodImpl().apply(block)
}

/**
 * subtype of ClassMember
 */
fun ClassMember.privateMethod(block: PrivateMethod.() -> Unit): PrivateMethod {
    return PrivateMethodImpl().apply(block)
}

/**
 * subtype of ClassMember
 */
fun ClassMember.classProperty(block: ClassProperty.() -> Unit): ClassProperty {
    return ClassPropertyImpl().apply(block)
}

/**
 * subtype of ClassMember
 */
fun ClassMember.privateProperty(block: PrivateProperty.() -> Unit): PrivateProperty {
    return PrivatePropertyImpl().apply(block)
}

/**
 * subtype of ClassMember
 */
fun ClassMember.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignatureImpl().apply(block)
}

/**
 * subtype of ClassMember
 */
fun ClassMember.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * subtype of ClassMember
 */
fun ClassMember.staticBlock(block: StaticBlock.() -> Unit): StaticBlock {
    return StaticBlockImpl().apply(block)
}
