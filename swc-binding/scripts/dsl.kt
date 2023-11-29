package dev.yidafu.swc.dsl



import dev.yidafu.swc.types.Union

import dev.yidafu.swc.types.*



fun Pattern.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
  return BindingIdentifier().apply(block)
}

fun Pattern.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
  return ArrayPattern().apply(block)
}

fun Pattern.restElement(block: RestElement.() -> Unit): RestElement {
  return RestElement().apply(block)
}

fun Pattern.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
  return ObjectPattern().apply(block)
}

fun Pattern.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
  return AssignmentPattern().apply(block)
}

fun Pattern.invalid(block: Invalid.() -> Unit): Invalid {
  return Invalid().apply(block)
}

fun Pattern.expression(block: Expression.() -> Unit): Expression {
  return Expression().apply(block)
}

fun ModuleDeclaration.importDeclaration(block: ImportDeclaration.() -> Unit): ImportDeclaration {
  return ImportDeclaration().apply(block)
}

fun ModuleDeclaration.exportDeclaration(block: ExportDeclaration.() -> Unit): ExportDeclaration {
  return ExportDeclaration().apply(block)
}

fun ModuleDeclaration.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
  return EmptyStatement().apply(block)
}

fun Statement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
  return BlockStatement().apply(block)
}

fun Statement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
  return EmptyStatement().apply(block)
}

fun ModuleItem.moduleDeclaration(block: ModuleDeclaration.() -> Unit): ModuleDeclaration {
  return ModuleDeclaration().apply(block)
}

fun ModuleItem.statement(block: Statement.() -> Unit): Statement {
  return Statement().apply(block)
}

fun ModuleExportName.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun ModuleExportName.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
  return StringLiteral().apply(block)
}