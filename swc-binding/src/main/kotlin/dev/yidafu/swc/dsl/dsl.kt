package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.* // ktlint-disable no-wildcard-imports

fun ClassMember.constructor(block: Constructor.() -> Unit): Constructor {
    return Constructor().apply(block)
}

fun ClassMember.classMethod(block: ClassMethod.() -> Unit): ClassMethod {
    return ClassMethod().apply(block)
}

fun ClassMember.privateMethod(block: PrivateMethod.() -> Unit): PrivateMethod {
    return PrivateMethod().apply(block)
}

fun ClassMember.classProperty(block: ClassProperty.() -> Unit): ClassProperty {
    return ClassProperty().apply(block)
}

fun ClassMember.privateProperty(block: PrivateProperty.() -> Unit): PrivateProperty {
    return PrivateProperty().apply(block)
}

fun ClassMember.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignature().apply(block)
}

fun ClassMember.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun ClassMember.staticBlock(block: StaticBlock.() -> Unit): StaticBlock {
    return StaticBlock().apply(block)
}

fun Declaration.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun Declaration.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun Declaration.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun Declaration.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun Declaration.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun Declaration.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun Declaration.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun Expression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun Expression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun Expression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun Expression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun Expression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun Expression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun Expression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun Expression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun Expression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun Expression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun Expression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun Expression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun Expression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun Expression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun Expression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun Expression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun Expression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun Expression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun Expression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun Expression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun Expression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun Expression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun Expression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun Expression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun Expression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun Expression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun Expression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun Expression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun Expression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun Expression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun Expression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun Expression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun Expression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun Expression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun Expression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun Expression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun Expression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun Expression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun Expression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun Expression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun Expression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun Expression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun Expression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun Expression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun JSXObject.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun JSXObject.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun JSXExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun JSXExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun JSXExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun JSXExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun JSXExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun JSXExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun JSXExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun JSXExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun JSXExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun JSXExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun JSXExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun JSXExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun JSXExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun JSXExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun JSXExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun JSXExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun JSXExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun JSXExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun JSXExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun JSXExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun JSXExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun JSXExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun JSXExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun JSXExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun JSXExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun JSXExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun JSXExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun JSXExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun JSXExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun JSXExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun JSXExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun JSXExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun JSXExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun JSXExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun JSXExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun JSXExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun JSXExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun JSXExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun JSXExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun JSXExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun JSXExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun JSXExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun JSXElementName.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXElementName.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun JSXElementName.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun JSXAttributeOrSpread.jSXAttribute(block: JSXAttribute.() -> Unit): JSXAttribute {
    return JSXAttribute().apply(block)
}

fun JSXAttributeOrSpread.spreadElement(block: SpreadElement.() -> Unit): SpreadElement {
    return SpreadElement().apply(block)
}

fun JSXAttributeName.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXAttributeName.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun JSXAttrValue.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun JSXAttrValue.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun JSXAttrValue.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun JSXAttrValue.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun JSXAttrValue.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun JSXAttrValue.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun JSXAttrValue.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun JSXAttrValue.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainer().apply(block)
}

fun JSXAttrValue.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun JSXAttrValue.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun JSXElementChild.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun JSXElementChild.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainer().apply(block)
}

fun JSXElementChild.jSXSpreadChild(block: JSXSpreadChild.() -> Unit): JSXSpreadChild {
    return JSXSpreadChild().apply(block)
}

fun JSXElementChild.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun JSXElementChild.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun Literal.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun Literal.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun Literal.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun Literal.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun Literal.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun Literal.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun Literal.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ModuleDeclaration.importDeclaration(block: ImportDeclaration.() -> Unit): ImportDeclaration {
    return ImportDeclaration().apply(block)
}

fun ModuleDeclaration.exportDeclaration(block: ExportDeclaration.() -> Unit): ExportDeclaration {
    return ExportDeclaration().apply(block)
}

fun ModuleDeclaration.exportNamedDeclaration(block: ExportNamedDeclaration.() -> Unit): ExportNamedDeclaration {
    return ExportNamedDeclaration().apply(block)
}

fun ModuleDeclaration.exportDefaultDeclaration(block: ExportDefaultDeclaration.() -> Unit): ExportDefaultDeclaration {
    return ExportDefaultDeclaration().apply(block)
}

fun ModuleDeclaration.exportDefaultExpression(block: ExportDefaultExpression.() -> Unit): ExportDefaultExpression {
    return ExportDefaultExpression().apply(block)
}

fun ModuleDeclaration.exportAllDeclaration(block: ExportAllDeclaration.() -> Unit): ExportAllDeclaration {
    return ExportAllDeclaration().apply(block)
}

fun ModuleDeclaration.tsImportEqualsDeclaration(block: TsImportEqualsDeclaration.() -> Unit): TsImportEqualsDeclaration {
    return TsImportEqualsDeclaration().apply(block)
}

fun ModuleDeclaration.tsExportAssignment(block: TsExportAssignment.() -> Unit): TsExportAssignment {
    return TsExportAssignment().apply(block)
}

fun ModuleDeclaration.tsNamespaceExportDeclaration(block: TsNamespaceExportDeclaration.() -> Unit): TsNamespaceExportDeclaration {
    return TsNamespaceExportDeclaration().apply(block)
}

fun DefaultDecl.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun DefaultDecl.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun DefaultDecl.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun ImportSpecifier.namedImportSpecifier(block: NamedImportSpecifier.() -> Unit): NamedImportSpecifier {
    return NamedImportSpecifier().apply(block)
}

fun ImportSpecifier.importDefaultSpecifier(block: ImportDefaultSpecifier.() -> Unit): ImportDefaultSpecifier {
    return ImportDefaultSpecifier().apply(block)
}

fun ImportSpecifier.importNamespaceSpecifier(block: ImportNamespaceSpecifier.() -> Unit): ImportNamespaceSpecifier {
    return ImportNamespaceSpecifier().apply(block)
}

fun ModuleExportName.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ModuleExportName.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ExportSpecifier.exportNamespaceSpecifier(block: ExportNamespaceSpecifier.() -> Unit): ExportNamespaceSpecifier {
    return ExportNamespaceSpecifier().apply(block)
}

fun ExportSpecifier.exportDefaultSpecifier(block: ExportDefaultSpecifier.() -> Unit): ExportDefaultSpecifier {
    return ExportDefaultSpecifier().apply(block)
}

fun ExportSpecifier.namedExportSpecifier(block: NamedExportSpecifier.() -> Unit): NamedExportSpecifier {
    return NamedExportSpecifier().apply(block)
}

fun Program.module(block: Module.() -> Unit): Module {
    return Module().apply(block)
}

fun Program.script(block: Script.() -> Unit): Script {
    return Script().apply(block)
}

fun ModuleItem.importDeclaration(block: ImportDeclaration.() -> Unit): ImportDeclaration {
    return ImportDeclaration().apply(block)
}

fun ModuleItem.exportDeclaration(block: ExportDeclaration.() -> Unit): ExportDeclaration {
    return ExportDeclaration().apply(block)
}

fun ModuleItem.exportNamedDeclaration(block: ExportNamedDeclaration.() -> Unit): ExportNamedDeclaration {
    return ExportNamedDeclaration().apply(block)
}

fun ModuleItem.exportDefaultDeclaration(block: ExportDefaultDeclaration.() -> Unit): ExportDefaultDeclaration {
    return ExportDefaultDeclaration().apply(block)
}

fun ModuleItem.exportDefaultExpression(block: ExportDefaultExpression.() -> Unit): ExportDefaultExpression {
    return ExportDefaultExpression().apply(block)
}

fun ModuleItem.exportAllDeclaration(block: ExportAllDeclaration.() -> Unit): ExportAllDeclaration {
    return ExportAllDeclaration().apply(block)
}

fun ModuleItem.tsImportEqualsDeclaration(block: TsImportEqualsDeclaration.() -> Unit): TsImportEqualsDeclaration {
    return TsImportEqualsDeclaration().apply(block)
}

fun ModuleItem.tsExportAssignment(block: TsExportAssignment.() -> Unit): TsExportAssignment {
    return TsExportAssignment().apply(block)
}

fun ModuleItem.tsNamespaceExportDeclaration(block: TsNamespaceExportDeclaration.() -> Unit): TsNamespaceExportDeclaration {
    return TsNamespaceExportDeclaration().apply(block)
}

fun ModuleItem.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun ModuleItem.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun ModuleItem.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun ModuleItem.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun ModuleItem.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun ModuleItem.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun ModuleItem.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun ModuleItem.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun ModuleItem.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun ModuleItem.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun ModuleItem.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun ModuleItem.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun ModuleItem.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun ModuleItem.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun ModuleItem.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun ModuleItem.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun ModuleItem.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun ModuleItem.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun ModuleItem.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun ModuleItem.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun ModuleItem.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun ModuleItem.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun ModuleItem.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun ModuleItem.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun ModuleItem.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

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

fun Pattern.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun Pattern.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun Pattern.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun Pattern.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun Pattern.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun Pattern.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun Pattern.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun Pattern.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun Pattern.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun Pattern.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun Pattern.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun Pattern.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun Pattern.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun Pattern.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun Pattern.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun Pattern.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun Pattern.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun Pattern.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun Pattern.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun Pattern.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun Pattern.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun Pattern.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun Pattern.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun Pattern.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun Pattern.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun Pattern.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun Pattern.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun Pattern.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun Pattern.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun Pattern.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun Pattern.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun Pattern.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun Pattern.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun Pattern.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun Pattern.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun Pattern.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun Pattern.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun Pattern.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun Pattern.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun Pattern.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun Pattern.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun Pattern.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun Pattern.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ObjectPatternProperty.keyValuePatternProperty(block: KeyValuePatternProperty.() -> Unit): KeyValuePatternProperty {
    return KeyValuePatternProperty().apply(block)
}

fun ObjectPatternProperty.assignmentPatternProperty(block: AssignmentPatternProperty.() -> Unit): AssignmentPatternProperty {
    return AssignmentPatternProperty().apply(block)
}

fun ObjectPatternProperty.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun Property.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun Property.keyValueProperty(block: KeyValueProperty.() -> Unit): KeyValueProperty {
    return KeyValueProperty().apply(block)
}

fun Property.assignmentProperty(block: AssignmentProperty.() -> Unit): AssignmentProperty {
    return AssignmentProperty().apply(block)
}

fun Property.getterProperty(block: GetterProperty.() -> Unit): GetterProperty {
    return GetterProperty().apply(block)
}

fun Property.setterProperty(block: SetterProperty.() -> Unit): SetterProperty {
    return SetterProperty().apply(block)
}

fun Property.methodProperty(block: MethodProperty.() -> Unit): MethodProperty {
    return MethodProperty().apply(block)
}

fun PropertyName.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun PropertyName.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun PropertyName.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun PropertyName.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropName().apply(block)
}

fun PropertyName.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun Statement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun Statement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun Statement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun Statement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun Statement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun Statement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun Statement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun Statement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun Statement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun Statement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun Statement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun Statement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun Statement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun Statement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun Statement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun Statement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun Statement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun Statement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun Statement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun Statement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun Statement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun Statement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun Statement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun Statement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun Statement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun TsParameterPropertyParameter.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsParameterPropertyParameter.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun TsEntityName.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedName().apply(block)
}

fun TsEntityName.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsTypeElement.tsCallSignatureDeclaration(block: TsCallSignatureDeclaration.() -> Unit): TsCallSignatureDeclaration {
    return TsCallSignatureDeclaration().apply(block)
}

fun TsTypeElement.tsConstructSignatureDeclaration(block: TsConstructSignatureDeclaration.() -> Unit): TsConstructSignatureDeclaration {
    return TsConstructSignatureDeclaration().apply(block)
}

fun TsTypeElement.tsPropertySignature(block: TsPropertySignature.() -> Unit): TsPropertySignature {
    return TsPropertySignature().apply(block)
}

fun TsTypeElement.tsGetterSignature(block: TsGetterSignature.() -> Unit): TsGetterSignature {
    return TsGetterSignature().apply(block)
}

fun TsTypeElement.tsSetterSignature(block: TsSetterSignature.() -> Unit): TsSetterSignature {
    return TsSetterSignature().apply(block)
}

fun TsTypeElement.tsMethodSignature(block: TsMethodSignature.() -> Unit): TsMethodSignature {
    return TsMethodSignature().apply(block)
}

fun TsTypeElement.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignature().apply(block)
}

fun TsType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsFnOrConstructorType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsFnOrConstructorType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsFnParameter.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsFnParameter.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun TsFnParameter.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun TsFnParameter.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun TsThisTypeOrIdent.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsThisTypeOrIdent.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsTypeQueryExpr.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedName().apply(block)
}

fun TsTypeQueryExpr.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsTypeQueryExpr.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsUnionOrIntersectionType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsUnionOrIntersectionType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsLiteral.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsLiteral.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsLiteral.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsLiteral.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsLiteral.tsTemplateLiteralType(block: TsTemplateLiteralType.() -> Unit): TsTemplateLiteralType {
    return TsTemplateLiteralType().apply(block)
}

fun TsEnumMemberId.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsEnumMemberId.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsNamespaceBody.tsModuleBlock(block: TsModuleBlock.() -> Unit): TsModuleBlock {
    return TsModuleBlock().apply(block)
}

fun TsNamespaceBody.tsNamespaceDeclaration(block: TsNamespaceDeclaration.() -> Unit): TsNamespaceDeclaration {
    return TsNamespaceDeclaration().apply(block)
}

fun TsModuleName.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsModuleName.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsModuleReference.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedName().apply(block)
}

fun TsModuleReference.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsModuleReference.tsExternalModuleReference(block: TsExternalModuleReference.() -> Unit): TsExternalModuleReference {
    return TsExternalModuleReference().apply(block)
}

fun JsMinifyOptions.jsFormatOptions(block: JsFormatOptions.() -> Unit): JsFormatOptions {
    return JsFormatOptions().apply(block)
}

fun TerserMangleOptions.terserManglePropertiesOptions(block: TerserManglePropertiesOptions.() -> Unit): TerserManglePropertiesOptions {
    return TerserManglePropertiesOptions().apply(block)
}

fun Options.callerOptions(block: CallerOptions.() -> Unit): CallerOptions {
    return CallerOptions().apply(block)
}

fun Options.plugin(block: Plugin.() -> Unit): Plugin {
    return Plugin().apply(block)
}

fun Options.matchPattern(block: MatchPattern.() -> Unit): MatchPattern {
    return MatchPattern().apply(block)
}

fun Config.envConfig(block: EnvConfig.() -> Unit): EnvConfig {
    return EnvConfig().apply(block)
}

fun Config.jscConfig(block: JscConfig.() -> Unit): JscConfig {
    return JscConfig().apply(block)
}

fun JscConfig.transformConfig(block: TransformConfig.() -> Unit): TransformConfig {
    return TransformConfig().apply(block)
}

fun JscConfig.jsMinifyOptions(block: JsMinifyOptions.() -> Unit): JsMinifyOptions {
    return JsMinifyOptions().apply(block)
}

fun TransformConfig.reactConfig(block: ReactConfig.() -> Unit): ReactConfig {
    return ReactConfig().apply(block)
}

fun TransformConfig.constModulesConfig(block: ConstModulesConfig.() -> Unit): ConstModulesConfig {
    return ConstModulesConfig().apply(block)
}

fun TransformConfig.optimizerConfig(block: OptimizerConfig.() -> Unit): OptimizerConfig {
    return OptimizerConfig().apply(block)
}

fun OptimizerConfig.globalPassOption(block: GlobalPassOption.() -> Unit): GlobalPassOption {
    return GlobalPassOption().apply(block)
}

fun HasSpan.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

fun Class.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun Class.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun Class.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun Class.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun Class.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun Class.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun Class.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun Class.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun Class.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun Class.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun Class.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun Class.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun Class.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun Class.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun Class.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun Class.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun Class.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun Class.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun Class.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun Class.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun Class.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun Class.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun Class.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun Class.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun Class.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun Class.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun Class.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun Class.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun Class.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun Class.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun Class.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun Class.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun Class.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun Class.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun Class.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun Class.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun Class.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun Class.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun Class.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun Class.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun Class.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun Class.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun Class.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun Class.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun Class.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun Class.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun Class.constructor(block: Constructor.() -> Unit): Constructor {
    return Constructor().apply(block)
}

fun Class.classMethod(block: ClassMethod.() -> Unit): ClassMethod {
    return ClassMethod().apply(block)
}

fun Class.privateMethod(block: PrivateMethod.() -> Unit): PrivateMethod {
    return PrivateMethod().apply(block)
}

fun Class.classProperty(block: ClassProperty.() -> Unit): ClassProperty {
    return ClassProperty().apply(block)
}

fun Class.privateProperty(block: PrivateProperty.() -> Unit): PrivateProperty {
    return PrivateProperty().apply(block)
}

fun Class.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignature().apply(block)
}

fun Class.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun Class.staticBlock(block: StaticBlock.() -> Unit): StaticBlock {
    return StaticBlock().apply(block)
}

fun Class.tsExpressionWithTypeArguments(block: TsExpressionWithTypeArguments.() -> Unit): TsExpressionWithTypeArguments {
    return TsExpressionWithTypeArguments().apply(block)
}

fun Class.decorator(block: Decorator.() -> Unit): Decorator {
    return Decorator().apply(block)
}

fun ClassPropertyBase.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ClassPropertyBase.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ClassPropertyBase.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ClassPropertyBase.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ClassPropertyBase.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ClassPropertyBase.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ClassPropertyBase.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ClassPropertyBase.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ClassPropertyBase.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ClassPropertyBase.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ClassPropertyBase.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ClassPropertyBase.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ClassPropertyBase.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ClassPropertyBase.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ClassPropertyBase.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ClassPropertyBase.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ClassPropertyBase.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ClassPropertyBase.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ClassPropertyBase.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ClassPropertyBase.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ClassPropertyBase.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ClassPropertyBase.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ClassPropertyBase.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ClassPropertyBase.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ClassPropertyBase.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ClassPropertyBase.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ClassPropertyBase.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ClassPropertyBase.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ClassPropertyBase.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ClassPropertyBase.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ClassPropertyBase.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ClassPropertyBase.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ClassPropertyBase.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ClassPropertyBase.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ClassPropertyBase.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ClassPropertyBase.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ClassPropertyBase.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ClassPropertyBase.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ClassPropertyBase.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ClassPropertyBase.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ClassPropertyBase.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ClassPropertyBase.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ClassPropertyBase.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ClassPropertyBase.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun ClassPropertyBase.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun ClassProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ClassProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ClassProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ClassProperty.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropName().apply(block)
}

fun ClassProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ClassProperty.decorator(block: Decorator.() -> Unit): Decorator {
    return Decorator().apply(block)
}

fun PrivateProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun PrivateProperty.decorator(block: Decorator.() -> Unit): Decorator {
    return Decorator().apply(block)
}

fun Param.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun Param.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun Param.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun Param.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun Param.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun Param.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun Param.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun Param.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun Param.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun Param.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun Param.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun Param.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun Param.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun Param.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun Param.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun Param.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun Param.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun Param.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun Param.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun Param.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun Param.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun Param.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun Param.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun Param.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun Param.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun Param.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun Param.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun Param.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun Param.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun Param.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun Param.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun Param.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun Param.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun Param.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun Param.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun Param.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun Param.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun Param.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun Param.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun Param.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun Param.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun Param.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun Param.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun Param.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun Param.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun Param.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun Param.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun Param.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun Param.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun Param.decorator(block: Decorator.() -> Unit): Decorator {
    return Decorator().apply(block)
}

fun Constructor.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun Constructor.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun Constructor.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun Constructor.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropName().apply(block)
}

fun Constructor.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun Constructor.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun ClassMethod.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ClassMethod.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ClassMethod.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ClassMethod.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropName().apply(block)
}

fun ClassMethod.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun PrivateMethod.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun StaticBlock.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun Decorator.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun Decorator.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun Decorator.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun Decorator.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun Decorator.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun Decorator.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun Decorator.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun Decorator.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun Decorator.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun Decorator.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun Decorator.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun Decorator.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun Decorator.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun Decorator.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun Decorator.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun Decorator.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun Decorator.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun Decorator.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun Decorator.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun Decorator.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun Decorator.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun Decorator.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun Decorator.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun Decorator.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun Decorator.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun Decorator.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun Decorator.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun Decorator.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun Decorator.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun Decorator.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun Decorator.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun Decorator.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun Decorator.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun Decorator.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun Decorator.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun Decorator.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun Decorator.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun Decorator.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun Decorator.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun Decorator.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun Decorator.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun Decorator.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun Decorator.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun Decorator.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun FunctionDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun FunctionDeclaration.param(block: Param.() -> Unit): Param {
    return Param().apply(block)
}

fun FunctionDeclaration.decorator(block: Decorator.() -> Unit): Decorator {
    return Decorator().apply(block)
}

fun Fn.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun Fn.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun Fn.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun ClassDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun VariableDeclarator.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun VariableDeclarator.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun VariableDeclarator.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun VariableDeclarator.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun VariableDeclarator.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun VariableDeclarator.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun VariableDeclarator.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun VariableDeclarator.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun VariableDeclarator.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun VariableDeclarator.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun VariableDeclarator.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun VariableDeclarator.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun VariableDeclarator.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun VariableDeclarator.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun VariableDeclarator.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun VariableDeclarator.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun VariableDeclarator.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun VariableDeclarator.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun VariableDeclarator.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun VariableDeclarator.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun VariableDeclarator.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun VariableDeclarator.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun VariableDeclarator.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun VariableDeclarator.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun VariableDeclarator.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun VariableDeclarator.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun VariableDeclarator.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun VariableDeclarator.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun VariableDeclarator.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun VariableDeclarator.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun VariableDeclarator.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun VariableDeclarator.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun VariableDeclarator.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun VariableDeclarator.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun VariableDeclarator.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun VariableDeclarator.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun VariableDeclarator.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun VariableDeclarator.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun VariableDeclarator.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun VariableDeclarator.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun VariableDeclarator.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun VariableDeclarator.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun VariableDeclarator.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun VariableDeclarator.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun VariableDeclarator.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun VariableDeclarator.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun VariableDeclarator.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun VariableDeclarator.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun VariableDeclarator.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun OptionalChainingExpression.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

fun OptionalChainingCall.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun OptionalChainingCall.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun OptionalChainingCall.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun OptionalChainingCall.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun OptionalChainingCall.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun OptionalChainingCall.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun OptionalChainingCall.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun OptionalChainingCall.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun OptionalChainingCall.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun OptionalChainingCall.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun OptionalChainingCall.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun OptionalChainingCall.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun OptionalChainingCall.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun OptionalChainingCall.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun OptionalChainingCall.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun OptionalChainingCall.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun OptionalChainingCall.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun OptionalChainingCall.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun OptionalChainingCall.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun OptionalChainingCall.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun OptionalChainingCall.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun OptionalChainingCall.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun OptionalChainingCall.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun OptionalChainingCall.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun OptionalChainingCall.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun OptionalChainingCall.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun OptionalChainingCall.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun OptionalChainingCall.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun OptionalChainingCall.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun OptionalChainingCall.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun OptionalChainingCall.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun OptionalChainingCall.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun OptionalChainingCall.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun OptionalChainingCall.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun OptionalChainingCall.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun OptionalChainingCall.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun OptionalChainingCall.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun OptionalChainingCall.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun OptionalChainingCall.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun OptionalChainingCall.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun OptionalChainingCall.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun OptionalChainingCall.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun OptionalChainingCall.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun OptionalChainingCall.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun OptionalChainingCall.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun OptionalChainingCall.exprOrSpread(block: ExprOrSpread.() -> Unit): ExprOrSpread {
    return ExprOrSpread().apply(block)
}

fun ExprOrSpread.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

fun ExprOrSpread.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ExprOrSpread.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ExprOrSpread.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ExprOrSpread.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ExprOrSpread.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ExprOrSpread.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ExprOrSpread.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ExprOrSpread.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ExprOrSpread.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ExprOrSpread.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ExprOrSpread.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ExprOrSpread.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ExprOrSpread.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ExprOrSpread.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ExprOrSpread.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ExprOrSpread.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ExprOrSpread.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ExprOrSpread.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ExprOrSpread.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ExprOrSpread.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ExprOrSpread.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ExprOrSpread.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ExprOrSpread.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ExprOrSpread.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ExprOrSpread.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ExprOrSpread.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ExprOrSpread.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ExprOrSpread.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ExprOrSpread.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ExprOrSpread.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ExprOrSpread.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ExprOrSpread.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ExprOrSpread.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ExprOrSpread.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ExprOrSpread.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ExprOrSpread.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ExprOrSpread.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ExprOrSpread.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ExprOrSpread.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ExprOrSpread.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ExprOrSpread.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ExprOrSpread.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ExprOrSpread.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ExprOrSpread.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun Argument.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

fun Argument.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun Argument.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun Argument.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun Argument.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun Argument.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun Argument.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun Argument.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun Argument.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun Argument.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun Argument.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun Argument.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun Argument.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun Argument.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun Argument.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun Argument.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun Argument.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun Argument.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun Argument.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun Argument.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun Argument.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun Argument.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun Argument.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun Argument.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun Argument.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun Argument.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun Argument.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun Argument.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun Argument.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun Argument.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun Argument.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun Argument.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun Argument.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun Argument.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun Argument.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun Argument.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun Argument.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun Argument.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun Argument.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun Argument.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun Argument.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun Argument.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun Argument.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun Argument.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun Argument.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun SpreadElement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

fun SpreadElement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun SpreadElement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun SpreadElement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun SpreadElement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun SpreadElement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun SpreadElement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun SpreadElement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun SpreadElement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun SpreadElement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun SpreadElement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun SpreadElement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun SpreadElement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun SpreadElement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun SpreadElement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun SpreadElement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun SpreadElement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun SpreadElement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun SpreadElement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun SpreadElement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun SpreadElement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun SpreadElement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun SpreadElement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun SpreadElement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun SpreadElement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun SpreadElement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun SpreadElement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun SpreadElement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun SpreadElement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun SpreadElement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun SpreadElement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun SpreadElement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun SpreadElement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun SpreadElement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun SpreadElement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun SpreadElement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun SpreadElement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun SpreadElement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun SpreadElement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun SpreadElement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun SpreadElement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun SpreadElement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun SpreadElement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun SpreadElement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun SpreadElement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun UnaryExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun UnaryExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun UnaryExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun UnaryExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun UnaryExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun UnaryExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun UnaryExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun UnaryExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun UnaryExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun UnaryExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun UnaryExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun UnaryExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun UnaryExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun UnaryExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun UnaryExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun UnaryExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun UnaryExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun UnaryExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun UnaryExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun UnaryExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun UnaryExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun UnaryExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun UnaryExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun UnaryExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun UnaryExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun UnaryExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun UnaryExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun UnaryExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun UnaryExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun UnaryExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun UnaryExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun UnaryExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun UnaryExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun UnaryExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun UnaryExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun UnaryExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun UnaryExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun UnaryExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun UnaryExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun UnaryExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun UnaryExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun UnaryExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun UnaryExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun UpdateExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun UpdateExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun UpdateExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun UpdateExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun UpdateExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun UpdateExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun UpdateExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun UpdateExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun UpdateExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun UpdateExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun UpdateExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun UpdateExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun UpdateExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun UpdateExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun UpdateExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun UpdateExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun UpdateExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun UpdateExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun UpdateExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun UpdateExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun UpdateExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun UpdateExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun UpdateExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun UpdateExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun UpdateExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun UpdateExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun UpdateExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun UpdateExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun UpdateExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun UpdateExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun UpdateExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun UpdateExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun UpdateExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun UpdateExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun UpdateExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun UpdateExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun UpdateExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun UpdateExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun UpdateExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun UpdateExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun UpdateExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun UpdateExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun UpdateExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun BinaryExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun BinaryExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun BinaryExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun BinaryExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun BinaryExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun BinaryExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun BinaryExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun BinaryExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun BinaryExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun BinaryExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun BinaryExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun BinaryExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun BinaryExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun BinaryExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun BinaryExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun BinaryExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun BinaryExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun BinaryExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun BinaryExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun BinaryExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun BinaryExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun BinaryExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun BinaryExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun BinaryExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun BinaryExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun BinaryExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun BinaryExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun BinaryExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun BinaryExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun BinaryExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun BinaryExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun BinaryExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun BinaryExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun BinaryExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun BinaryExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun BinaryExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun BinaryExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun BinaryExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun BinaryExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun BinaryExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun BinaryExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun BinaryExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun BinaryExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun FunctionExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun FunctionExpression.param(block: Param.() -> Unit): Param {
    return Param().apply(block)
}

fun FunctionExpression.decorator(block: Decorator.() -> Unit): Decorator {
    return Decorator().apply(block)
}

fun ClassExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun AssignmentExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun AssignmentExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun AssignmentExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun AssignmentExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun AssignmentExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun AssignmentExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun AssignmentExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun AssignmentExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun AssignmentExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun AssignmentExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun AssignmentExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun AssignmentExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun AssignmentExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun AssignmentExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun AssignmentExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun AssignmentExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun AssignmentExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun AssignmentExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun AssignmentExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun AssignmentExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun AssignmentExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun AssignmentExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun AssignmentExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun AssignmentExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun AssignmentExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun AssignmentExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun AssignmentExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun AssignmentExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun AssignmentExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun AssignmentExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun AssignmentExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun AssignmentExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun AssignmentExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun AssignmentExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun AssignmentExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun AssignmentExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun AssignmentExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun AssignmentExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun AssignmentExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun AssignmentExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun AssignmentExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun AssignmentExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun AssignmentExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun MemberExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun MemberExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun MemberExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun MemberExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun MemberExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun MemberExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun MemberExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun MemberExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun MemberExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun MemberExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun MemberExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun MemberExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun MemberExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun MemberExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun MemberExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun MemberExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun MemberExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun MemberExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun MemberExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun MemberExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun MemberExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun MemberExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun MemberExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun MemberExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun MemberExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun MemberExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun MemberExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun MemberExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun MemberExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun MemberExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun MemberExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun MemberExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun MemberExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun MemberExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun MemberExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun MemberExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun MemberExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun MemberExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun MemberExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun MemberExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun MemberExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun MemberExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun MemberExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun SuperPropExpression.jsSuper(block: Super.() -> Unit): Super {
    return Super().apply(block)
}

fun ConditionalExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ConditionalExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ConditionalExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ConditionalExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ConditionalExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ConditionalExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ConditionalExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ConditionalExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ConditionalExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ConditionalExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ConditionalExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ConditionalExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ConditionalExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ConditionalExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ConditionalExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ConditionalExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ConditionalExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ConditionalExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ConditionalExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ConditionalExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ConditionalExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ConditionalExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ConditionalExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ConditionalExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ConditionalExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ConditionalExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ConditionalExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ConditionalExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ConditionalExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ConditionalExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ConditionalExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ConditionalExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ConditionalExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ConditionalExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ConditionalExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ConditionalExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ConditionalExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ConditionalExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ConditionalExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ConditionalExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ConditionalExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ConditionalExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ConditionalExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun CallExpression.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun CallExpression.argument(block: Argument.() -> Unit): Argument {
    return Argument().apply(block)
}

fun NewExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun NewExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun NewExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun NewExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun NewExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun NewExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun NewExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun NewExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun NewExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun NewExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun NewExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun NewExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun NewExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun NewExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun NewExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun NewExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun NewExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun NewExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun NewExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun NewExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun NewExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun NewExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun NewExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun NewExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun NewExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun NewExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun NewExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun NewExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun NewExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun NewExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun NewExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun NewExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun NewExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun NewExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun NewExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun NewExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun NewExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun NewExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun NewExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun NewExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun NewExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun NewExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun NewExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun NewExpression.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun NewExpression.argument(block: Argument.() -> Unit): Argument {
    return Argument().apply(block)
}

fun ArrowFunctionExpression.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun ArrowFunctionExpression.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun ArrowFunctionExpression.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun ArrowFunctionExpression.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun ArrowFunctionExpression.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun ArrowFunctionExpression.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun ArrowFunctionExpression.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun ArrowFunctionExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun ArrowFunctionExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ArrowFunctionExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ArrowFunctionExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ArrowFunctionExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ArrowFunctionExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ArrowFunctionExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ArrowFunctionExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ArrowFunctionExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ArrowFunctionExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ArrowFunctionExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ArrowFunctionExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ArrowFunctionExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ArrowFunctionExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ArrowFunctionExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ArrowFunctionExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ArrowFunctionExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ArrowFunctionExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ArrowFunctionExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ArrowFunctionExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ArrowFunctionExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ArrowFunctionExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ArrowFunctionExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ArrowFunctionExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ArrowFunctionExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ArrowFunctionExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ArrowFunctionExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ArrowFunctionExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ArrowFunctionExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ArrowFunctionExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ArrowFunctionExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ArrowFunctionExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ArrowFunctionExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ArrowFunctionExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ArrowFunctionExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ArrowFunctionExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ArrowFunctionExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ArrowFunctionExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ArrowFunctionExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ArrowFunctionExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ArrowFunctionExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ArrowFunctionExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ArrowFunctionExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ArrowFunctionExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun YieldExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun YieldExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun YieldExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun YieldExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun YieldExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun YieldExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun YieldExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun YieldExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun YieldExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun YieldExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun YieldExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun YieldExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun YieldExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun YieldExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun YieldExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun YieldExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun YieldExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun YieldExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun YieldExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun YieldExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun YieldExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun YieldExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun YieldExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun YieldExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun YieldExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun YieldExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun YieldExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun YieldExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun YieldExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun YieldExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun YieldExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun YieldExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun YieldExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun YieldExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun YieldExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun YieldExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun YieldExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun YieldExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun YieldExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun YieldExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun YieldExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun YieldExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun YieldExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun AwaitExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun AwaitExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun AwaitExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun AwaitExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun AwaitExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun AwaitExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun AwaitExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun AwaitExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun AwaitExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun AwaitExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun AwaitExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun AwaitExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun AwaitExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun AwaitExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun AwaitExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun AwaitExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun AwaitExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun AwaitExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun AwaitExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun AwaitExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun AwaitExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun AwaitExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun AwaitExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun AwaitExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun AwaitExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun AwaitExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun AwaitExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun AwaitExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun AwaitExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun AwaitExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun AwaitExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun AwaitExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun AwaitExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun AwaitExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun AwaitExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun AwaitExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun AwaitExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun AwaitExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun AwaitExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun AwaitExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun AwaitExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun AwaitExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun AwaitExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TaggedTemplateExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TaggedTemplateExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TaggedTemplateExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TaggedTemplateExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TaggedTemplateExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TaggedTemplateExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TaggedTemplateExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TaggedTemplateExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TaggedTemplateExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TaggedTemplateExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TaggedTemplateExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TaggedTemplateExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TaggedTemplateExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TaggedTemplateExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TaggedTemplateExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TaggedTemplateExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TaggedTemplateExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TaggedTemplateExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TaggedTemplateExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TaggedTemplateExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TaggedTemplateExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TaggedTemplateExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TaggedTemplateExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TaggedTemplateExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TaggedTemplateExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TaggedTemplateExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TaggedTemplateExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TaggedTemplateExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TaggedTemplateExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TaggedTemplateExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TaggedTemplateExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TaggedTemplateExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TaggedTemplateExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TaggedTemplateExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TaggedTemplateExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TaggedTemplateExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TaggedTemplateExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TaggedTemplateExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TaggedTemplateExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TaggedTemplateExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TaggedTemplateExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TaggedTemplateExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TaggedTemplateExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TaggedTemplateExpression.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun ParenthesisExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ParenthesisExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ParenthesisExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ParenthesisExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ParenthesisExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ParenthesisExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ParenthesisExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ParenthesisExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ParenthesisExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ParenthesisExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ParenthesisExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ParenthesisExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ParenthesisExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ParenthesisExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ParenthesisExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ParenthesisExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ParenthesisExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ParenthesisExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ParenthesisExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ParenthesisExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ParenthesisExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ParenthesisExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ParenthesisExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ParenthesisExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ParenthesisExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ParenthesisExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ParenthesisExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ParenthesisExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ParenthesisExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ParenthesisExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ParenthesisExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ParenthesisExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ParenthesisExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ParenthesisExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ParenthesisExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ParenthesisExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ParenthesisExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ParenthesisExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ParenthesisExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ParenthesisExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ParenthesisExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ParenthesisExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ParenthesisExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun PatternBase.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun PrivateName.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXMemberExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXNamespacedName.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXExpressionContainer.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun JSXExpressionContainer.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun JSXExpressionContainer.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun JSXExpressionContainer.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun JSXExpressionContainer.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun JSXExpressionContainer.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun JSXExpressionContainer.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun JSXExpressionContainer.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun JSXExpressionContainer.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun JSXExpressionContainer.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun JSXExpressionContainer.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun JSXExpressionContainer.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun JSXExpressionContainer.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun JSXExpressionContainer.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun JSXExpressionContainer.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun JSXExpressionContainer.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXExpressionContainer.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun JSXExpressionContainer.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun JSXExpressionContainer.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun JSXExpressionContainer.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun JSXExpressionContainer.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun JSXExpressionContainer.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun JSXExpressionContainer.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun JSXExpressionContainer.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun JSXExpressionContainer.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun JSXExpressionContainer.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun JSXExpressionContainer.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun JSXExpressionContainer.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun JSXExpressionContainer.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun JSXExpressionContainer.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun JSXExpressionContainer.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun JSXExpressionContainer.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun JSXExpressionContainer.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun JSXExpressionContainer.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun JSXExpressionContainer.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun JSXExpressionContainer.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun JSXExpressionContainer.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun JSXExpressionContainer.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun JSXExpressionContainer.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun JSXExpressionContainer.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun JSXExpressionContainer.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun JSXExpressionContainer.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun JSXExpressionContainer.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun JSXExpressionContainer.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun JSXSpreadChild.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun JSXSpreadChild.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun JSXSpreadChild.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun JSXSpreadChild.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun JSXSpreadChild.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun JSXSpreadChild.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun JSXSpreadChild.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun JSXSpreadChild.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun JSXSpreadChild.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun JSXSpreadChild.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun JSXSpreadChild.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun JSXSpreadChild.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun JSXSpreadChild.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun JSXSpreadChild.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun JSXSpreadChild.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXSpreadChild.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun JSXSpreadChild.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun JSXSpreadChild.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun JSXSpreadChild.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun JSXSpreadChild.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun JSXSpreadChild.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun JSXSpreadChild.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun JSXSpreadChild.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun JSXSpreadChild.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun JSXSpreadChild.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun JSXSpreadChild.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun JSXSpreadChild.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun JSXSpreadChild.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun JSXSpreadChild.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun JSXSpreadChild.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun JSXSpreadChild.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun JSXSpreadChild.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun JSXSpreadChild.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun JSXSpreadChild.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun JSXSpreadChild.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun JSXSpreadChild.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun JSXSpreadChild.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun JSXSpreadChild.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun JSXSpreadChild.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun JSXSpreadChild.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun JSXSpreadChild.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun JSXSpreadChild.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun JSXSpreadChild.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun JSXSpreadChild.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun JSXOpeningElement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXOpeningElement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun JSXOpeningElement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun JSXOpeningElement.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun JSXOpeningElement.jSXAttribute(block: JSXAttribute.() -> Unit): JSXAttribute {
    return JSXAttribute().apply(block)
}

fun JSXOpeningElement.spreadElement(block: SpreadElement.() -> Unit): SpreadElement {
    return SpreadElement().apply(block)
}

fun JSXClosingElement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXClosingElement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun JSXClosingElement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun JSXAttribute.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun JSXAttribute.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun JSXAttribute.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun JSXAttribute.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun JSXAttribute.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun JSXAttribute.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun JSXAttribute.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun JSXAttribute.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun JSXAttribute.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun JSXAttribute.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainer().apply(block)
}

fun JSXAttribute.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun JSXAttribute.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun JSXElement.jSXOpeningElement(block: JSXOpeningElement.() -> Unit): JSXOpeningElement {
    return JSXOpeningElement().apply(block)
}

fun JSXElement.jSXClosingElement(block: JSXClosingElement.() -> Unit): JSXClosingElement {
    return JSXClosingElement().apply(block)
}

fun JSXElement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun JSXElement.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainer().apply(block)
}

fun JSXElement.jSXSpreadChild(block: JSXSpreadChild.() -> Unit): JSXSpreadChild {
    return JSXSpreadChild().apply(block)
}

fun JSXElement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun JSXElement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun JSXFragment.jSXOpeningFragment(block: JSXOpeningFragment.() -> Unit): JSXOpeningFragment {
    return JSXOpeningFragment().apply(block)
}

fun JSXFragment.jSXClosingFragment(block: JSXClosingFragment.() -> Unit): JSXClosingFragment {
    return JSXClosingFragment().apply(block)
}

fun JSXFragment.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun JSXFragment.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainer().apply(block)
}

fun JSXFragment.jSXSpreadChild(block: JSXSpreadChild.() -> Unit): JSXSpreadChild {
    return JSXSpreadChild().apply(block)
}

fun JSXFragment.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun JSXFragment.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ExportDefaultExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ExportDefaultExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ExportDefaultExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ExportDefaultExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ExportDefaultExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ExportDefaultExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ExportDefaultExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ExportDefaultExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ExportDefaultExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ExportDefaultExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ExportDefaultExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ExportDefaultExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ExportDefaultExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ExportDefaultExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ExportDefaultExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ExportDefaultExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ExportDefaultExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ExportDefaultExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ExportDefaultExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ExportDefaultExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ExportDefaultExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ExportDefaultExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ExportDefaultExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ExportDefaultExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ExportDefaultExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ExportDefaultExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ExportDefaultExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ExportDefaultExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ExportDefaultExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ExportDefaultExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ExportDefaultExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ExportDefaultExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ExportDefaultExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ExportDefaultExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ExportDefaultExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ExportDefaultExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ExportDefaultExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ExportDefaultExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ExportDefaultExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ExportDefaultExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ExportDefaultExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ExportDefaultExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ExportDefaultExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ExportDefaultExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun ExportDeclaration.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun ExportDeclaration.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun ExportDeclaration.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun ExportDeclaration.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun ExportDeclaration.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun ExportDeclaration.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun ExportDeclaration.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun ImportDeclaration.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ImportDeclaration.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ImportDeclaration.namedImportSpecifier(block: NamedImportSpecifier.() -> Unit): NamedImportSpecifier {
    return NamedImportSpecifier().apply(block)
}

fun ImportDeclaration.importDefaultSpecifier(block: ImportDefaultSpecifier.() -> Unit): ImportDefaultSpecifier {
    return ImportDefaultSpecifier().apply(block)
}

fun ImportDeclaration.importNamespaceSpecifier(block: ImportNamespaceSpecifier.() -> Unit): ImportNamespaceSpecifier {
    return ImportNamespaceSpecifier().apply(block)
}

fun ExportAllDeclaration.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ExportAllDeclaration.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ExportNamedDeclaration.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ExportNamedDeclaration.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ExportNamedDeclaration.exportNamespaceSpecifier(block: ExportNamespaceSpecifier.() -> Unit): ExportNamespaceSpecifier {
    return ExportNamespaceSpecifier().apply(block)
}

fun ExportNamedDeclaration.exportDefaultSpecifier(block: ExportDefaultSpecifier.() -> Unit): ExportDefaultSpecifier {
    return ExportDefaultSpecifier().apply(block)
}

fun ExportNamedDeclaration.namedExportSpecifier(block: NamedExportSpecifier.() -> Unit): NamedExportSpecifier {
    return NamedExportSpecifier().apply(block)
}

fun ExportDefaultDeclaration.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ExportDefaultDeclaration.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ExportDefaultDeclaration.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun ImportDefaultSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ImportNamespaceSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun NamedImportSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun NamedImportSpecifier.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ExportNamespaceSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ExportNamespaceSpecifier.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ExportDefaultSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun NamedExportSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun NamedExportSpecifier.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun AssignmentPattern.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun AssignmentPattern.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun AssignmentPattern.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun AssignmentPattern.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun AssignmentPattern.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun AssignmentPattern.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun AssignmentPattern.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun AssignmentPattern.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun AssignmentPattern.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun AssignmentPattern.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun AssignmentPattern.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun AssignmentPattern.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun AssignmentPattern.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun AssignmentPattern.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun AssignmentPattern.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun AssignmentPattern.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun AssignmentPattern.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun AssignmentPattern.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun AssignmentPattern.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun AssignmentPattern.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun AssignmentPattern.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun AssignmentPattern.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun AssignmentPattern.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun AssignmentPattern.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun AssignmentPattern.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun AssignmentPattern.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun AssignmentPattern.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun AssignmentPattern.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun AssignmentPattern.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun AssignmentPattern.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun AssignmentPattern.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun AssignmentPattern.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun AssignmentPattern.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun AssignmentPattern.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun AssignmentPattern.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun AssignmentPattern.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun AssignmentPattern.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun AssignmentPattern.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun AssignmentPattern.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun AssignmentPattern.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun AssignmentPattern.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun AssignmentPattern.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun AssignmentPattern.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun AssignmentPattern.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun AssignmentPattern.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun AssignmentPattern.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun AssignmentPattern.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun AssignmentPattern.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun RestElement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

fun RestElement.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun RestElement.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun RestElement.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun RestElement.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun RestElement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun RestElement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun RestElement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun RestElement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun RestElement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun RestElement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun RestElement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun RestElement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun RestElement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun RestElement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun RestElement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun RestElement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun RestElement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun RestElement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun RestElement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun RestElement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun RestElement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun RestElement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun RestElement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun RestElement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun RestElement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun RestElement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun RestElement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun RestElement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun RestElement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun RestElement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun RestElement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun RestElement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun RestElement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun RestElement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun RestElement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun RestElement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun RestElement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun RestElement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun RestElement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun RestElement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun RestElement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun RestElement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun RestElement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun RestElement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun RestElement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun RestElement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun RestElement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun RestElement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun KeyValuePatternProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun KeyValuePatternProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun KeyValuePatternProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun KeyValuePatternProperty.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropName().apply(block)
}

fun KeyValuePatternProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun KeyValuePatternProperty.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun KeyValuePatternProperty.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun KeyValuePatternProperty.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun KeyValuePatternProperty.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun KeyValuePatternProperty.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun KeyValuePatternProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun KeyValuePatternProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun KeyValuePatternProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun KeyValuePatternProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun KeyValuePatternProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun KeyValuePatternProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun KeyValuePatternProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun KeyValuePatternProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun KeyValuePatternProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun KeyValuePatternProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun KeyValuePatternProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun KeyValuePatternProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun KeyValuePatternProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun KeyValuePatternProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun KeyValuePatternProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun KeyValuePatternProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun KeyValuePatternProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun KeyValuePatternProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun KeyValuePatternProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun KeyValuePatternProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun KeyValuePatternProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun KeyValuePatternProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun KeyValuePatternProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun KeyValuePatternProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun KeyValuePatternProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun KeyValuePatternProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun KeyValuePatternProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun KeyValuePatternProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun KeyValuePatternProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun KeyValuePatternProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun KeyValuePatternProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun KeyValuePatternProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun KeyValuePatternProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun KeyValuePatternProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun KeyValuePatternProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun KeyValuePatternProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun KeyValuePatternProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun KeyValuePatternProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun KeyValuePatternProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun KeyValuePatternProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun AssignmentPatternProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun AssignmentPatternProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun AssignmentPatternProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun AssignmentPatternProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun AssignmentPatternProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun AssignmentPatternProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun AssignmentPatternProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun AssignmentPatternProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun AssignmentPatternProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun AssignmentPatternProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun AssignmentPatternProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun AssignmentPatternProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun AssignmentPatternProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun AssignmentPatternProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun AssignmentPatternProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun AssignmentPatternProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun AssignmentPatternProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun AssignmentPatternProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun AssignmentPatternProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun AssignmentPatternProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun AssignmentPatternProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun AssignmentPatternProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun AssignmentPatternProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun AssignmentPatternProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun AssignmentPatternProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun AssignmentPatternProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun AssignmentPatternProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun AssignmentPatternProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun AssignmentPatternProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun AssignmentPatternProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun AssignmentPatternProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun AssignmentPatternProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun AssignmentPatternProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun AssignmentPatternProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun AssignmentPatternProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun AssignmentPatternProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun AssignmentPatternProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun AssignmentPatternProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun AssignmentPatternProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun AssignmentPatternProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun AssignmentPatternProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun AssignmentPatternProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun AssignmentPatternProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun AssignmentPatternProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun PropBase.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun PropBase.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun PropBase.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun PropBase.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropName().apply(block)
}

fun PropBase.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun KeyValueProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun KeyValueProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun KeyValueProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun KeyValueProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun KeyValueProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun KeyValueProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun KeyValueProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun KeyValueProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun KeyValueProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun KeyValueProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun KeyValueProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun KeyValueProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun KeyValueProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun KeyValueProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun KeyValueProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun KeyValueProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun KeyValueProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun KeyValueProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun KeyValueProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun KeyValueProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun KeyValueProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun KeyValueProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun KeyValueProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun KeyValueProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun KeyValueProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun KeyValueProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun KeyValueProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun KeyValueProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun KeyValueProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun KeyValueProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun KeyValueProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun KeyValueProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun KeyValueProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun KeyValueProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun KeyValueProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun KeyValueProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun KeyValueProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun KeyValueProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun KeyValueProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun KeyValueProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun KeyValueProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun KeyValueProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun KeyValueProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun KeyValueProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun AssignmentProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun AssignmentProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun AssignmentProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun AssignmentProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun AssignmentProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun AssignmentProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun AssignmentProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun AssignmentProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun AssignmentProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun AssignmentProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun AssignmentProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun AssignmentProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun AssignmentProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun AssignmentProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun AssignmentProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun AssignmentProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun AssignmentProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun AssignmentProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun AssignmentProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun AssignmentProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun AssignmentProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun AssignmentProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun AssignmentProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun AssignmentProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun AssignmentProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun AssignmentProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun AssignmentProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun AssignmentProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun AssignmentProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun AssignmentProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun AssignmentProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun AssignmentProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun AssignmentProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun AssignmentProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun AssignmentProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun AssignmentProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun AssignmentProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun AssignmentProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun AssignmentProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun AssignmentProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun AssignmentProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun AssignmentProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun AssignmentProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun AssignmentProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun GetterProperty.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun GetterProperty.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun SetterProperty.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun SetterProperty.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun SetterProperty.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun SetterProperty.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun SetterProperty.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun SetterProperty.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun SetterProperty.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun SetterProperty.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun SetterProperty.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun SetterProperty.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun SetterProperty.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun SetterProperty.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun SetterProperty.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun SetterProperty.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun SetterProperty.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun SetterProperty.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun SetterProperty.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun SetterProperty.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun SetterProperty.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun SetterProperty.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun SetterProperty.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun SetterProperty.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun SetterProperty.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun SetterProperty.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun SetterProperty.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun SetterProperty.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun SetterProperty.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun SetterProperty.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun SetterProperty.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun SetterProperty.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun SetterProperty.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun SetterProperty.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun SetterProperty.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun SetterProperty.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun SetterProperty.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun SetterProperty.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun SetterProperty.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun SetterProperty.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun SetterProperty.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun SetterProperty.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun SetterProperty.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun SetterProperty.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun SetterProperty.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun SetterProperty.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun SetterProperty.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun SetterProperty.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun SetterProperty.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun SetterProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun SetterProperty.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun SetterProperty.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun ComputedPropName.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ComputedPropName.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ComputedPropName.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ComputedPropName.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ComputedPropName.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ComputedPropName.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ComputedPropName.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ComputedPropName.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ComputedPropName.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ComputedPropName.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ComputedPropName.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ComputedPropName.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ComputedPropName.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ComputedPropName.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ComputedPropName.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ComputedPropName.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ComputedPropName.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ComputedPropName.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ComputedPropName.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ComputedPropName.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ComputedPropName.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ComputedPropName.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ComputedPropName.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ComputedPropName.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ComputedPropName.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ComputedPropName.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ComputedPropName.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ComputedPropName.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ComputedPropName.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ComputedPropName.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ComputedPropName.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ComputedPropName.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ComputedPropName.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ComputedPropName.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ComputedPropName.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ComputedPropName.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ComputedPropName.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ComputedPropName.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ComputedPropName.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ComputedPropName.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ComputedPropName.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ComputedPropName.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ComputedPropName.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ComputedPropName.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun ExpressionStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ExpressionStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ExpressionStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ExpressionStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ExpressionStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ExpressionStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ExpressionStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ExpressionStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ExpressionStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ExpressionStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ExpressionStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ExpressionStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ExpressionStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ExpressionStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ExpressionStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ExpressionStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ExpressionStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ExpressionStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ExpressionStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ExpressionStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ExpressionStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ExpressionStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ExpressionStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ExpressionStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ExpressionStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ExpressionStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ExpressionStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ExpressionStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ExpressionStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ExpressionStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ExpressionStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ExpressionStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ExpressionStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ExpressionStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ExpressionStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ExpressionStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ExpressionStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ExpressionStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ExpressionStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ExpressionStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ExpressionStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ExpressionStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ExpressionStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ExpressionStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun WithStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun WithStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun WithStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun WithStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun WithStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun WithStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun WithStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun WithStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun WithStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun WithStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun WithStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun WithStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun WithStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun WithStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun WithStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun WithStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun WithStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun WithStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun WithStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun WithStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun WithStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun WithStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun WithStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun WithStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun WithStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun WithStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun WithStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun WithStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun WithStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun WithStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun WithStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun WithStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun WithStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun WithStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun WithStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun WithStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun WithStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun WithStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun WithStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun WithStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun WithStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun WithStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun WithStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun WithStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun WithStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun WithStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun WithStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun WithStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun WithStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun WithStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun WithStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun WithStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun WithStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun WithStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun WithStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun WithStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun WithStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun WithStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun WithStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun WithStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun WithStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun WithStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun WithStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun WithStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun WithStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun WithStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun WithStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun WithStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun ReturnStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ReturnStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ReturnStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ReturnStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ReturnStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ReturnStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ReturnStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ReturnStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ReturnStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ReturnStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ReturnStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ReturnStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ReturnStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ReturnStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ReturnStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ReturnStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ReturnStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ReturnStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ReturnStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ReturnStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ReturnStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ReturnStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ReturnStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ReturnStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ReturnStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ReturnStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ReturnStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ReturnStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ReturnStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ReturnStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ReturnStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ReturnStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ReturnStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ReturnStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ReturnStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ReturnStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ReturnStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ReturnStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ReturnStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ReturnStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ReturnStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ReturnStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ReturnStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ReturnStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun LabeledStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun LabeledStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun LabeledStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun LabeledStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun LabeledStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun LabeledStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun LabeledStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun LabeledStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun LabeledStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun LabeledStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun LabeledStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun LabeledStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun LabeledStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun LabeledStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun LabeledStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun LabeledStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun LabeledStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun LabeledStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun LabeledStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun LabeledStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun LabeledStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun LabeledStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun LabeledStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun LabeledStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun LabeledStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun BreakStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ContinueStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun IfStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun IfStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun IfStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun IfStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun IfStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun IfStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun IfStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun IfStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun IfStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun IfStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun IfStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun IfStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun IfStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun IfStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun IfStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun IfStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun IfStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun IfStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun IfStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun IfStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun IfStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun IfStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun IfStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun IfStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun IfStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun IfStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun IfStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun IfStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun IfStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun IfStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun IfStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun IfStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun IfStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun IfStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun IfStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun IfStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun IfStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun IfStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun IfStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun IfStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun IfStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun IfStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun IfStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun IfStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun IfStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun IfStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun IfStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun IfStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun IfStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun IfStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun IfStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun IfStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun IfStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun IfStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun IfStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun IfStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun IfStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun IfStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun IfStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun IfStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun IfStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun IfStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun IfStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun IfStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun IfStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun IfStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun IfStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun IfStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun SwitchStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun SwitchStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun SwitchStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun SwitchStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun SwitchStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun SwitchStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun SwitchStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun SwitchStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun SwitchStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun SwitchStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun SwitchStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun SwitchStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun SwitchStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun SwitchStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun SwitchStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun SwitchStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun SwitchStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun SwitchStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun SwitchStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun SwitchStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun SwitchStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun SwitchStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun SwitchStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun SwitchStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun SwitchStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun SwitchStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun SwitchStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun SwitchStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun SwitchStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun SwitchStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun SwitchStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun SwitchStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun SwitchStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun SwitchStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun SwitchStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun SwitchStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun SwitchStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun SwitchStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun SwitchStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun SwitchStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun SwitchStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun SwitchStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun SwitchStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun SwitchStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun SwitchStatement.switchCase(block: SwitchCase.() -> Unit): SwitchCase {
    return SwitchCase().apply(block)
}

fun ThrowStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ThrowStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ThrowStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ThrowStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ThrowStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ThrowStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ThrowStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ThrowStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ThrowStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ThrowStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ThrowStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ThrowStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ThrowStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ThrowStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ThrowStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ThrowStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ThrowStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ThrowStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ThrowStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ThrowStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ThrowStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ThrowStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ThrowStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ThrowStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ThrowStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ThrowStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ThrowStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ThrowStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ThrowStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ThrowStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ThrowStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ThrowStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ThrowStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ThrowStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ThrowStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ThrowStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ThrowStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ThrowStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ThrowStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ThrowStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ThrowStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ThrowStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ThrowStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ThrowStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TryStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun TryStatement.catchClause(block: CatchClause.() -> Unit): CatchClause {
    return CatchClause().apply(block)
}

fun WhileStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun WhileStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun WhileStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun WhileStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun WhileStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun WhileStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun WhileStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun WhileStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun WhileStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun WhileStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun WhileStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun WhileStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun WhileStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun WhileStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun WhileStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun WhileStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun WhileStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun WhileStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun WhileStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun WhileStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun WhileStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun WhileStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun WhileStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun WhileStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun WhileStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun WhileStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun WhileStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun WhileStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun WhileStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun WhileStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun WhileStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun WhileStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun WhileStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun WhileStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun WhileStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun WhileStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun WhileStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun WhileStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun WhileStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun WhileStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun WhileStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun WhileStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun WhileStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun WhileStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun WhileStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun WhileStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun WhileStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun WhileStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun WhileStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun WhileStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun WhileStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun WhileStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun WhileStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun WhileStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun WhileStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun WhileStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun WhileStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun WhileStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun WhileStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun WhileStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun WhileStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun WhileStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun WhileStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun WhileStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun WhileStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun WhileStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun WhileStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun WhileStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun DoWhileStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun DoWhileStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun DoWhileStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun DoWhileStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun DoWhileStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun DoWhileStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun DoWhileStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun DoWhileStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun DoWhileStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun DoWhileStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun DoWhileStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun DoWhileStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun DoWhileStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun DoWhileStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun DoWhileStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun DoWhileStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun DoWhileStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun DoWhileStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun DoWhileStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun DoWhileStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun DoWhileStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun DoWhileStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun DoWhileStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun DoWhileStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun DoWhileStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun DoWhileStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun DoWhileStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun DoWhileStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun DoWhileStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun DoWhileStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun DoWhileStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun DoWhileStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun DoWhileStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun DoWhileStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun DoWhileStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun DoWhileStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun DoWhileStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun DoWhileStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun DoWhileStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun DoWhileStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun DoWhileStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun DoWhileStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun DoWhileStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun DoWhileStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun DoWhileStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun DoWhileStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun DoWhileStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun DoWhileStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun DoWhileStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun DoWhileStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun DoWhileStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun DoWhileStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun DoWhileStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun DoWhileStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun DoWhileStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun DoWhileStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun DoWhileStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun DoWhileStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun DoWhileStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun DoWhileStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun DoWhileStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun DoWhileStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun DoWhileStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun DoWhileStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun DoWhileStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun DoWhileStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun DoWhileStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun DoWhileStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun ForStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ForStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ForStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ForStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ForStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ForStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ForStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ForStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ForStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ForStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ForStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ForStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ForStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ForStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ForStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ForStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ForStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ForStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ForStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ForStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ForStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ForStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ForStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ForStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ForStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ForStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ForStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ForStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ForStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ForStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ForStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ForStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ForStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ForStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ForStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ForStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ForStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ForStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ForStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ForStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ForStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ForStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ForStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ForStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun ForStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun ForStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun ForStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun ForStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun ForStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun ForStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun ForStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun ForStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun ForStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun ForStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun ForStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun ForStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun ForStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun ForStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun ForStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun ForStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun ForStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun ForStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun ForStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun ForStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun ForStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun ForStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun ForStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun ForStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun ForInStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ForInStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ForInStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ForInStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ForInStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ForInStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ForInStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ForInStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ForInStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ForInStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ForInStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ForInStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ForInStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ForInStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ForInStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ForInStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ForInStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ForInStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ForInStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ForInStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ForInStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ForInStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ForInStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ForInStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ForInStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ForInStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ForInStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ForInStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ForInStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ForInStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ForInStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ForInStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ForInStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ForInStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ForInStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ForInStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ForInStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ForInStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ForInStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ForInStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ForInStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ForInStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ForInStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ForInStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun ForInStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun ForInStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun ForInStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun ForInStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun ForInStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun ForInStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun ForInStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun ForInStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun ForInStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun ForInStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun ForInStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun ForInStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun ForInStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun ForInStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun ForInStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun ForInStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun ForInStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun ForInStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun ForInStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun ForInStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun ForInStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun ForInStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun ForInStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun ForInStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun ForOfStatement.span(block: Span.() -> Unit): Span {
    return Span().apply(block)
}

fun ForOfStatement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ForOfStatement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ForOfStatement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ForOfStatement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ForOfStatement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ForOfStatement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ForOfStatement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ForOfStatement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ForOfStatement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ForOfStatement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ForOfStatement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ForOfStatement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ForOfStatement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ForOfStatement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ForOfStatement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ForOfStatement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ForOfStatement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ForOfStatement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ForOfStatement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ForOfStatement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ForOfStatement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ForOfStatement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ForOfStatement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ForOfStatement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ForOfStatement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ForOfStatement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ForOfStatement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ForOfStatement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ForOfStatement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ForOfStatement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ForOfStatement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ForOfStatement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ForOfStatement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ForOfStatement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ForOfStatement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ForOfStatement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ForOfStatement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ForOfStatement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ForOfStatement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ForOfStatement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ForOfStatement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ForOfStatement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ForOfStatement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ForOfStatement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun ForOfStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun ForOfStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun ForOfStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun ForOfStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun ForOfStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun ForOfStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun ForOfStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun ForOfStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun ForOfStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun ForOfStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun ForOfStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun ForOfStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun ForOfStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun ForOfStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun ForOfStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun ForOfStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun ForOfStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun ForOfStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun ForOfStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun ForOfStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun ForOfStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun ForOfStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun ForOfStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun ForOfStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun SwitchCase.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun SwitchCase.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun SwitchCase.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun SwitchCase.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun SwitchCase.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun SwitchCase.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun SwitchCase.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun SwitchCase.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun SwitchCase.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun SwitchCase.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun SwitchCase.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun SwitchCase.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun SwitchCase.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun SwitchCase.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun SwitchCase.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun SwitchCase.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun SwitchCase.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun SwitchCase.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun SwitchCase.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun SwitchCase.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun SwitchCase.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun SwitchCase.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun SwitchCase.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun SwitchCase.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun SwitchCase.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun SwitchCase.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun SwitchCase.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun SwitchCase.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun SwitchCase.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun SwitchCase.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun SwitchCase.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun SwitchCase.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun SwitchCase.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun SwitchCase.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun SwitchCase.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun SwitchCase.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun SwitchCase.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun SwitchCase.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun SwitchCase.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun SwitchCase.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun SwitchCase.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun SwitchCase.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun SwitchCase.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun SwitchCase.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun SwitchCase.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun SwitchCase.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun SwitchCase.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun SwitchCase.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun SwitchCase.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun SwitchCase.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun SwitchCase.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun SwitchCase.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun SwitchCase.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun SwitchCase.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun SwitchCase.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun SwitchCase.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun SwitchCase.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun SwitchCase.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun SwitchCase.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun SwitchCase.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun SwitchCase.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun SwitchCase.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun SwitchCase.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun SwitchCase.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun SwitchCase.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun SwitchCase.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun SwitchCase.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun SwitchCase.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun SwitchCase.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun CatchClause.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun CatchClause.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun CatchClause.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun CatchClause.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun CatchClause.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun CatchClause.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun CatchClause.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun CatchClause.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun CatchClause.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun CatchClause.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun CatchClause.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun CatchClause.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun CatchClause.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun CatchClause.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun CatchClause.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun CatchClause.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun CatchClause.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun CatchClause.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun CatchClause.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun CatchClause.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun CatchClause.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun CatchClause.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun CatchClause.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun CatchClause.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun CatchClause.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun CatchClause.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun CatchClause.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun CatchClause.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun CatchClause.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun CatchClause.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun CatchClause.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun CatchClause.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun CatchClause.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun CatchClause.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun CatchClause.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun CatchClause.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun CatchClause.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun CatchClause.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun CatchClause.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun CatchClause.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun CatchClause.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun CatchClause.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun CatchClause.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun CatchClause.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun CatchClause.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun CatchClause.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun CatchClause.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun CatchClause.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun CatchClause.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun CatchClause.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun TsTypeAnnotation.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsTypeAnnotation.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsTypeAnnotation.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsTypeAnnotation.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsTypeAnnotation.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsTypeAnnotation.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsTypeAnnotation.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsTypeAnnotation.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsTypeAnnotation.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsTypeAnnotation.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsTypeAnnotation.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsTypeAnnotation.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsTypeAnnotation.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsTypeAnnotation.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsTypeAnnotation.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsTypeAnnotation.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsTypeAnnotation.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsTypeAnnotation.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsTypeAnnotation.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsTypeAnnotation.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsTypeAnnotation.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsTypeAnnotation.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsTypeParameter.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsTypeParameter.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsTypeParameter.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsTypeParameter.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsTypeParameter.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsTypeParameter.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsTypeParameter.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsTypeParameter.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsTypeParameter.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsTypeParameter.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsTypeParameter.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsTypeParameter.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsTypeParameter.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsTypeParameter.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsTypeParameter.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsTypeParameter.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsTypeParameter.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsTypeParameter.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsTypeParameter.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsTypeParameter.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsTypeParameter.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsTypeParameter.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsTypeParameter.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsParameterProperty.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsParameterProperty.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun TsParameterProperty.decorator(block: Decorator.() -> Unit): Decorator {
    return Decorator().apply(block)
}

fun TsQualifiedName.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsCallSignatureDeclaration.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun TsCallSignatureDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun TsCallSignatureDeclaration.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsCallSignatureDeclaration.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun TsCallSignatureDeclaration.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun TsCallSignatureDeclaration.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun TsConstructSignatureDeclaration.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun TsConstructSignatureDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun TsConstructSignatureDeclaration.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsConstructSignatureDeclaration.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun TsConstructSignatureDeclaration.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun TsConstructSignatureDeclaration.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun TsPropertySignature.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsPropertySignature.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsPropertySignature.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsPropertySignature.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsPropertySignature.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsPropertySignature.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsPropertySignature.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsPropertySignature.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsPropertySignature.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsPropertySignature.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsPropertySignature.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsPropertySignature.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsPropertySignature.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsPropertySignature.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsPropertySignature.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsPropertySignature.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsPropertySignature.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsPropertySignature.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsPropertySignature.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsPropertySignature.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsPropertySignature.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsPropertySignature.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsPropertySignature.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsPropertySignature.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsPropertySignature.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsPropertySignature.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsPropertySignature.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsPropertySignature.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsPropertySignature.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsPropertySignature.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsPropertySignature.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsPropertySignature.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsPropertySignature.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsPropertySignature.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsPropertySignature.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsPropertySignature.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsPropertySignature.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsPropertySignature.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsPropertySignature.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsPropertySignature.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsPropertySignature.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsPropertySignature.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsPropertySignature.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsPropertySignature.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsPropertySignature.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun TsPropertySignature.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun TsPropertySignature.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsPropertySignature.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun TsPropertySignature.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun TsPropertySignature.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun TsGetterSignature.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsGetterSignature.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsGetterSignature.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsGetterSignature.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsGetterSignature.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsGetterSignature.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsGetterSignature.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsGetterSignature.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsGetterSignature.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsGetterSignature.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsGetterSignature.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsGetterSignature.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsGetterSignature.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsGetterSignature.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsGetterSignature.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsGetterSignature.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsGetterSignature.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsGetterSignature.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsGetterSignature.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsGetterSignature.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsGetterSignature.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsGetterSignature.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsGetterSignature.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsGetterSignature.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsGetterSignature.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsGetterSignature.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsGetterSignature.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsGetterSignature.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsGetterSignature.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsGetterSignature.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsGetterSignature.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsGetterSignature.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsGetterSignature.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsGetterSignature.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsGetterSignature.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsGetterSignature.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsGetterSignature.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsGetterSignature.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsGetterSignature.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsGetterSignature.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsGetterSignature.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsGetterSignature.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsGetterSignature.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsGetterSignature.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsGetterSignature.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun TsSetterSignature.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsSetterSignature.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsSetterSignature.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsSetterSignature.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsSetterSignature.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsSetterSignature.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsSetterSignature.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsSetterSignature.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsSetterSignature.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsSetterSignature.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsSetterSignature.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsSetterSignature.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsSetterSignature.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsSetterSignature.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsSetterSignature.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsSetterSignature.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsSetterSignature.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsSetterSignature.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsSetterSignature.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsSetterSignature.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsSetterSignature.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsSetterSignature.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsSetterSignature.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsSetterSignature.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsSetterSignature.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsSetterSignature.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsSetterSignature.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsSetterSignature.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsSetterSignature.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsSetterSignature.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsSetterSignature.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsSetterSignature.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsSetterSignature.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsSetterSignature.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsSetterSignature.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsSetterSignature.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsSetterSignature.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsSetterSignature.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsSetterSignature.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsSetterSignature.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsSetterSignature.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsSetterSignature.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsSetterSignature.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsSetterSignature.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsSetterSignature.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsSetterSignature.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun TsSetterSignature.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun TsSetterSignature.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun TsMethodSignature.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsMethodSignature.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsMethodSignature.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsMethodSignature.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsMethodSignature.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsMethodSignature.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsMethodSignature.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsMethodSignature.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsMethodSignature.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsMethodSignature.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsMethodSignature.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsMethodSignature.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsMethodSignature.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsMethodSignature.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsMethodSignature.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsMethodSignature.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsMethodSignature.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsMethodSignature.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsMethodSignature.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsMethodSignature.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsMethodSignature.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsMethodSignature.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsMethodSignature.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsMethodSignature.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsMethodSignature.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsMethodSignature.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsMethodSignature.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsMethodSignature.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsMethodSignature.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsMethodSignature.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsMethodSignature.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsMethodSignature.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsMethodSignature.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsMethodSignature.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsMethodSignature.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsMethodSignature.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsMethodSignature.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsMethodSignature.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsMethodSignature.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsMethodSignature.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsMethodSignature.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsMethodSignature.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsMethodSignature.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsMethodSignature.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsMethodSignature.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun TsMethodSignature.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun TsMethodSignature.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsMethodSignature.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun TsMethodSignature.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun TsMethodSignature.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun TsIndexSignature.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun TsIndexSignature.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsIndexSignature.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun TsIndexSignature.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun TsIndexSignature.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun TsFunctionType.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun TsFunctionType.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun TsFunctionType.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsFunctionType.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun TsFunctionType.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun TsFunctionType.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun TsConstructorType.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun TsConstructorType.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun TsConstructorType.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsConstructorType.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun TsConstructorType.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun TsConstructorType.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun TsTypeReference.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedName().apply(block)
}

fun TsTypeReference.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsTypeReference.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun TsTypePredicate.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsTypePredicate.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsTypePredicate.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotation().apply(block)
}

fun TsImportType.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsImportType.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedName().apply(block)
}

fun TsImportType.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsImportType.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun TsTypeQuery.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedName().apply(block)
}

fun TsTypeQuery.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsTypeQuery.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsTypeQuery.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun TsArrayType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsArrayType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsArrayType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsArrayType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsArrayType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsArrayType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsArrayType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsArrayType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsArrayType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsArrayType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsArrayType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsArrayType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsArrayType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsArrayType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsArrayType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsArrayType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsArrayType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsArrayType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsArrayType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsArrayType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsArrayType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsTupleElement.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun TsTupleElement.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun TsTupleElement.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun TsTupleElement.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun TsTupleElement.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun TsTupleElement.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsTupleElement.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsTupleElement.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsTupleElement.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsTupleElement.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsTupleElement.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsTupleElement.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsTupleElement.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsTupleElement.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsTupleElement.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsTupleElement.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsTupleElement.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsTupleElement.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsTupleElement.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsTupleElement.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsTupleElement.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsTupleElement.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsTupleElement.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsTupleElement.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsTupleElement.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsTupleElement.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsTupleElement.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsTupleElement.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsTupleElement.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsTupleElement.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsTupleElement.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsTupleElement.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsTupleElement.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsTupleElement.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsTupleElement.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsTupleElement.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsTupleElement.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsTupleElement.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsTupleElement.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsTupleElement.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsTupleElement.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsTupleElement.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsTupleElement.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsTupleElement.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsTupleElement.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsTupleElement.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsTupleElement.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsTupleElement.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsTupleElement.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsTupleElement.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsTupleElement.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsTupleElement.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsTupleElement.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsTupleElement.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsTupleElement.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsTupleElement.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsTupleElement.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsTupleElement.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsTupleElement.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsTupleElement.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsTupleElement.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsTupleElement.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsTupleElement.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsTupleElement.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsTupleElement.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsTupleElement.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsTupleElement.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsTupleElement.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsTupleElement.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsTupleElement.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsTupleElement.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsOptionalType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsOptionalType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsOptionalType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsOptionalType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsOptionalType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsOptionalType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsOptionalType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsOptionalType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsOptionalType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsOptionalType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsOptionalType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsOptionalType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsOptionalType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsOptionalType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsOptionalType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsOptionalType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsOptionalType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsOptionalType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsOptionalType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsOptionalType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsOptionalType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsRestType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsRestType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsRestType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsRestType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsRestType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsRestType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsRestType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsRestType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsRestType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsRestType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsRestType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsRestType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsRestType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsRestType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsRestType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsRestType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsRestType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsRestType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsRestType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsRestType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsRestType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsConditionalType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsConditionalType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsConditionalType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsConditionalType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsConditionalType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsConditionalType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsConditionalType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsConditionalType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsConditionalType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsConditionalType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsConditionalType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsConditionalType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsConditionalType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsConditionalType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsConditionalType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsConditionalType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsConditionalType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsConditionalType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsConditionalType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsConditionalType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsConditionalType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsInferType.tsTypeParameter(block: TsTypeParameter.() -> Unit): TsTypeParameter {
    return TsTypeParameter().apply(block)
}

fun TsParenthesizedType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsParenthesizedType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsParenthesizedType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsParenthesizedType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsParenthesizedType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsParenthesizedType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsParenthesizedType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsParenthesizedType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsParenthesizedType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsParenthesizedType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsParenthesizedType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsParenthesizedType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsParenthesizedType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsParenthesizedType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsParenthesizedType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsParenthesizedType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsParenthesizedType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsParenthesizedType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsParenthesizedType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsParenthesizedType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsParenthesizedType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsTypeOperator.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsTypeOperator.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsTypeOperator.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsTypeOperator.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsTypeOperator.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsTypeOperator.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsTypeOperator.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsTypeOperator.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsTypeOperator.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsTypeOperator.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsTypeOperator.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsTypeOperator.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsTypeOperator.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsTypeOperator.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsTypeOperator.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsTypeOperator.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsTypeOperator.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsTypeOperator.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsTypeOperator.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsTypeOperator.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsTypeOperator.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsIndexedAccessType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsIndexedAccessType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsIndexedAccessType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsIndexedAccessType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsIndexedAccessType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsIndexedAccessType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsIndexedAccessType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsIndexedAccessType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsIndexedAccessType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsIndexedAccessType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsIndexedAccessType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsIndexedAccessType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsIndexedAccessType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsIndexedAccessType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsIndexedAccessType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsIndexedAccessType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsIndexedAccessType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsIndexedAccessType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsIndexedAccessType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsIndexedAccessType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsIndexedAccessType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsMappedType.tsTypeParameter(block: TsTypeParameter.() -> Unit): TsTypeParameter {
    return TsTypeParameter().apply(block)
}

fun TsMappedType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsMappedType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsMappedType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsMappedType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsMappedType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsMappedType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsMappedType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsMappedType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsMappedType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsMappedType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsMappedType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsMappedType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsMappedType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsMappedType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsMappedType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsMappedType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsMappedType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsMappedType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsMappedType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsMappedType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsMappedType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsLiteralType.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsLiteralType.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsLiteralType.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsLiteralType.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsLiteralType.tsTemplateLiteralType(block: TsTemplateLiteralType.() -> Unit): TsTemplateLiteralType {
    return TsTemplateLiteralType().apply(block)
}

fun TsInterfaceDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsInterfaceDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun TsInterfaceDeclaration.tsInterfaceBody(block: TsInterfaceBody.() -> Unit): TsInterfaceBody {
    return TsInterfaceBody().apply(block)
}

fun TsInterfaceDeclaration.tsExpressionWithTypeArguments(block: TsExpressionWithTypeArguments.() -> Unit): TsExpressionWithTypeArguments {
    return TsExpressionWithTypeArguments().apply(block)
}

fun TsExpressionWithTypeArguments.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsExpressionWithTypeArguments.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsExpressionWithTypeArguments.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsExpressionWithTypeArguments.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsExpressionWithTypeArguments.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsExpressionWithTypeArguments.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsExpressionWithTypeArguments.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsExpressionWithTypeArguments.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsExpressionWithTypeArguments.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsExpressionWithTypeArguments.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsExpressionWithTypeArguments.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsExpressionWithTypeArguments.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsExpressionWithTypeArguments.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsExpressionWithTypeArguments.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsExpressionWithTypeArguments.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsExpressionWithTypeArguments.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsExpressionWithTypeArguments.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsExpressionWithTypeArguments.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsExpressionWithTypeArguments.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsExpressionWithTypeArguments.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsExpressionWithTypeArguments.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsExpressionWithTypeArguments.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsExpressionWithTypeArguments.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsExpressionWithTypeArguments.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsExpressionWithTypeArguments.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsExpressionWithTypeArguments.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsExpressionWithTypeArguments.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsExpressionWithTypeArguments.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsExpressionWithTypeArguments.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsExpressionWithTypeArguments.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsExpressionWithTypeArguments.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsExpressionWithTypeArguments.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsExpressionWithTypeArguments.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsExpressionWithTypeArguments.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsExpressionWithTypeArguments.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsExpressionWithTypeArguments.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsExpressionWithTypeArguments.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsExpressionWithTypeArguments.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsExpressionWithTypeArguments.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsExpressionWithTypeArguments.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsExpressionWithTypeArguments.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsExpressionWithTypeArguments.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsExpressionWithTypeArguments.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsExpressionWithTypeArguments.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsExpressionWithTypeArguments.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun TsTypeAliasDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsTypeAliasDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclaration().apply(block)
}

fun TsTypeAliasDeclaration.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsTypeAliasDeclaration.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsTypeAliasDeclaration.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsTypeAliasDeclaration.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsTypeAliasDeclaration.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsTypeAliasDeclaration.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsTypeAliasDeclaration.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsTypeAliasDeclaration.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsTypeAliasDeclaration.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsTypeAliasDeclaration.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsTypeAliasDeclaration.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsTypeAliasDeclaration.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsTypeAliasDeclaration.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsTypeAliasDeclaration.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsTypeAliasDeclaration.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsTypeAliasDeclaration.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsTypeAliasDeclaration.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsTypeAliasDeclaration.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsTypeAliasDeclaration.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsTypeAliasDeclaration.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsTypeAliasDeclaration.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsTypeAliasDeclaration.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsEnumDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsEnumDeclaration.tsEnumMember(block: TsEnumMember.() -> Unit): TsEnumMember {
    return TsEnumMember().apply(block)
}

fun TsEnumMember.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsEnumMember.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsEnumMember.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsEnumMember.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsEnumMember.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsEnumMember.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsEnumMember.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsEnumMember.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsEnumMember.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsEnumMember.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsEnumMember.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsEnumMember.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsEnumMember.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsEnumMember.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsEnumMember.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsEnumMember.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsEnumMember.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsEnumMember.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsEnumMember.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsEnumMember.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsEnumMember.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsEnumMember.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsEnumMember.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsEnumMember.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsEnumMember.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsEnumMember.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsEnumMember.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsEnumMember.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsEnumMember.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsEnumMember.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsEnumMember.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsEnumMember.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsEnumMember.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsEnumMember.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsEnumMember.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsEnumMember.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsEnumMember.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsEnumMember.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsEnumMember.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsEnumMember.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsEnumMember.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsEnumMember.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsEnumMember.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsEnumMember.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsModuleDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsModuleDeclaration.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsModuleDeclaration.tsModuleBlock(block: TsModuleBlock.() -> Unit): TsModuleBlock {
    return TsModuleBlock().apply(block)
}

fun TsModuleDeclaration.tsNamespaceDeclaration(block: TsNamespaceDeclaration.() -> Unit): TsNamespaceDeclaration {
    return TsNamespaceDeclaration().apply(block)
}

fun TsNamespaceDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsNamespaceDeclaration.tsModuleBlock(block: TsModuleBlock.() -> Unit): TsModuleBlock {
    return TsModuleBlock().apply(block)
}

fun TsImportEqualsDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsImportEqualsDeclaration.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedName().apply(block)
}

fun TsImportEqualsDeclaration.tsExternalModuleReference(block: TsExternalModuleReference.() -> Unit): TsExternalModuleReference {
    return TsExternalModuleReference().apply(block)
}

fun TsExternalModuleReference.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsExportAssignment.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsExportAssignment.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsExportAssignment.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsExportAssignment.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsExportAssignment.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsExportAssignment.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsExportAssignment.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsExportAssignment.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsExportAssignment.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsExportAssignment.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsExportAssignment.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsExportAssignment.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsExportAssignment.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsExportAssignment.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsExportAssignment.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsExportAssignment.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsExportAssignment.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsExportAssignment.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsExportAssignment.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsExportAssignment.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsExportAssignment.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsExportAssignment.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsExportAssignment.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsExportAssignment.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsExportAssignment.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsExportAssignment.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsExportAssignment.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsExportAssignment.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsExportAssignment.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsExportAssignment.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsExportAssignment.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsExportAssignment.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsExportAssignment.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsExportAssignment.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsExportAssignment.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsExportAssignment.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsExportAssignment.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsExportAssignment.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsExportAssignment.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsExportAssignment.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsExportAssignment.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsExportAssignment.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsExportAssignment.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsExportAssignment.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsNamespaceExportDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsAsExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsAsExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsAsExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsAsExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsAsExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsAsExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsAsExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsAsExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsAsExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsAsExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsAsExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsAsExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsAsExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsAsExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsAsExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsAsExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsAsExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsAsExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsAsExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsAsExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsAsExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsAsExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsAsExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsAsExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsAsExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsAsExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsAsExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsAsExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsAsExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsAsExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsAsExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsAsExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsAsExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsAsExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsAsExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsAsExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsAsExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsAsExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsAsExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsAsExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsAsExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsAsExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsAsExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsAsExpression.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsAsExpression.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsAsExpression.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsAsExpression.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsAsExpression.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsAsExpression.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsAsExpression.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsAsExpression.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsAsExpression.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsAsExpression.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsAsExpression.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsAsExpression.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsAsExpression.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsAsExpression.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsAsExpression.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsAsExpression.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsAsExpression.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsAsExpression.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsAsExpression.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsAsExpression.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsAsExpression.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsAsExpression.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsSatisfiesExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsSatisfiesExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsSatisfiesExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsSatisfiesExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsSatisfiesExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsSatisfiesExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsSatisfiesExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsSatisfiesExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsSatisfiesExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsSatisfiesExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsSatisfiesExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsSatisfiesExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsSatisfiesExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsSatisfiesExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsSatisfiesExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsSatisfiesExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsSatisfiesExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsSatisfiesExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsSatisfiesExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsSatisfiesExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsSatisfiesExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsSatisfiesExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsSatisfiesExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsSatisfiesExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsSatisfiesExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsSatisfiesExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsSatisfiesExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsSatisfiesExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsSatisfiesExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsSatisfiesExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsSatisfiesExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsSatisfiesExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsSatisfiesExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsSatisfiesExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsSatisfiesExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsSatisfiesExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsSatisfiesExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsSatisfiesExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsSatisfiesExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsSatisfiesExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsSatisfiesExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsSatisfiesExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsSatisfiesExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsSatisfiesExpression.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsSatisfiesExpression.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsSatisfiesExpression.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsSatisfiesExpression.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsSatisfiesExpression.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsSatisfiesExpression.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsSatisfiesExpression.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsSatisfiesExpression.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsSatisfiesExpression.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsSatisfiesExpression.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsSatisfiesExpression.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsSatisfiesExpression.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsSatisfiesExpression.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsSatisfiesExpression.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsSatisfiesExpression.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsSatisfiesExpression.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsSatisfiesExpression.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsSatisfiesExpression.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsSatisfiesExpression.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsSatisfiesExpression.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsSatisfiesExpression.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsSatisfiesExpression.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsInstantiation.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsInstantiation.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsInstantiation.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsInstantiation.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsInstantiation.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsInstantiation.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsInstantiation.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsInstantiation.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsInstantiation.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsInstantiation.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsInstantiation.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsInstantiation.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsInstantiation.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsInstantiation.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsInstantiation.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsInstantiation.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsInstantiation.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsInstantiation.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsInstantiation.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsInstantiation.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsInstantiation.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsInstantiation.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsInstantiation.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsInstantiation.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsInstantiation.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsInstantiation.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsInstantiation.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsInstantiation.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsInstantiation.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsInstantiation.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsInstantiation.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsInstantiation.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsInstantiation.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsInstantiation.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsInstantiation.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsInstantiation.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsInstantiation.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsInstantiation.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsInstantiation.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsInstantiation.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsInstantiation.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsInstantiation.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsInstantiation.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsInstantiation.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiation().apply(block)
}

fun TsTypeAssertion.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsTypeAssertion.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsTypeAssertion.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsTypeAssertion.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsTypeAssertion.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsTypeAssertion.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsTypeAssertion.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsTypeAssertion.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsTypeAssertion.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsTypeAssertion.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsTypeAssertion.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsTypeAssertion.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsTypeAssertion.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsTypeAssertion.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsTypeAssertion.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsTypeAssertion.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsTypeAssertion.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsTypeAssertion.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsTypeAssertion.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsTypeAssertion.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsTypeAssertion.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsTypeAssertion.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsTypeAssertion.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsTypeAssertion.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsTypeAssertion.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsTypeAssertion.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsTypeAssertion.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsTypeAssertion.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsTypeAssertion.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsTypeAssertion.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsTypeAssertion.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsTypeAssertion.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsTypeAssertion.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsTypeAssertion.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsTypeAssertion.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsTypeAssertion.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsTypeAssertion.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsTypeAssertion.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsTypeAssertion.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsTypeAssertion.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsTypeAssertion.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsTypeAssertion.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsTypeAssertion.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsTypeAssertion.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsTypeAssertion.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsTypeAssertion.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsTypeAssertion.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsTypeAssertion.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsTypeAssertion.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsTypeAssertion.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsTypeAssertion.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsTypeAssertion.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsTypeAssertion.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsTypeAssertion.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsTypeAssertion.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsTypeAssertion.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsTypeAssertion.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsTypeAssertion.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsTypeAssertion.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsTypeAssertion.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsTypeAssertion.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsTypeAssertion.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsTypeAssertion.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsTypeAssertion.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsTypeAssertion.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsConstAssertion.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsConstAssertion.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsConstAssertion.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsConstAssertion.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsConstAssertion.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsConstAssertion.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsConstAssertion.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsConstAssertion.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsConstAssertion.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsConstAssertion.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsConstAssertion.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsConstAssertion.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsConstAssertion.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsConstAssertion.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsConstAssertion.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsConstAssertion.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsConstAssertion.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsConstAssertion.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsConstAssertion.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsConstAssertion.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsConstAssertion.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsConstAssertion.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsConstAssertion.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsConstAssertion.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsConstAssertion.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsConstAssertion.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsConstAssertion.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsConstAssertion.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsConstAssertion.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsConstAssertion.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsConstAssertion.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsConstAssertion.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsConstAssertion.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsConstAssertion.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsConstAssertion.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsConstAssertion.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsConstAssertion.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TsConstAssertion.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsConstAssertion.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsConstAssertion.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsConstAssertion.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsConstAssertion.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsConstAssertion.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TsNonNullExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TsNonNullExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TsNonNullExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TsNonNullExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TsNonNullExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TsNonNullExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TsNonNullExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TsNonNullExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TsNonNullExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TsNonNullExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TsNonNullExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TsNonNullExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TsNonNullExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TsNonNullExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TsNonNullExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TsNonNullExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TsNonNullExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TsNonNullExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TsNonNullExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TsNonNullExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TsNonNullExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TsNonNullExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TsNonNullExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TsNonNullExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TsNonNullExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TsNonNullExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TsNonNullExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TsNonNullExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TsNonNullExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TsNonNullExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TsNonNullExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TsNonNullExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TsNonNullExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TsNonNullExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TsNonNullExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TsNonNullExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TsNonNullExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TsNonNullExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TsNonNullExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TsNonNullExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TsNonNullExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TsNonNullExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TsNonNullExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun VariableDeclaration.variableDeclarator(block: VariableDeclarator.() -> Unit): VariableDeclarator {
    return VariableDeclarator().apply(block)
}

fun ArrayExpression.exprOrSpread(block: ExprOrSpread.() -> Unit): ExprOrSpread {
    return ExprOrSpread().apply(block)
}

fun SequenceExpression.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun SequenceExpression.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun SequenceExpression.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun SequenceExpression.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun SequenceExpression.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun SequenceExpression.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun SequenceExpression.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun SequenceExpression.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun SequenceExpression.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun SequenceExpression.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun SequenceExpression.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun SequenceExpression.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun SequenceExpression.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun SequenceExpression.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun SequenceExpression.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun SequenceExpression.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun SequenceExpression.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun SequenceExpression.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun SequenceExpression.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun SequenceExpression.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun SequenceExpression.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun SequenceExpression.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun SequenceExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun SequenceExpression.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun SequenceExpression.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun SequenceExpression.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun SequenceExpression.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun SequenceExpression.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun SequenceExpression.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun SequenceExpression.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun SequenceExpression.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun SequenceExpression.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun SequenceExpression.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun SequenceExpression.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun SequenceExpression.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun SequenceExpression.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun SequenceExpression.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun SequenceExpression.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun SequenceExpression.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun SequenceExpression.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun SequenceExpression.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun SequenceExpression.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun SequenceExpression.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun SequenceExpression.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TemplateLiteral.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun TemplateLiteral.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun TemplateLiteral.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun TemplateLiteral.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun TemplateLiteral.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun TemplateLiteral.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun TemplateLiteral.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun TemplateLiteral.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun TemplateLiteral.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun TemplateLiteral.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun TemplateLiteral.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun TemplateLiteral.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun TemplateLiteral.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun TemplateLiteral.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun TemplateLiteral.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun TemplateLiteral.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun TemplateLiteral.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun TemplateLiteral.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun TemplateLiteral.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun TemplateLiteral.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun TemplateLiteral.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun TemplateLiteral.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun TemplateLiteral.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun TemplateLiteral.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun TemplateLiteral.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun TemplateLiteral.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun TemplateLiteral.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun TemplateLiteral.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun TemplateLiteral.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun TemplateLiteral.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun TemplateLiteral.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun TemplateLiteral.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun TemplateLiteral.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun TemplateLiteral.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun TemplateLiteral.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun TemplateLiteral.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun TemplateLiteral.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun TemplateLiteral.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun TemplateLiteral.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun TemplateLiteral.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun TemplateLiteral.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun TemplateLiteral.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun TemplateLiteral.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun TemplateLiteral.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun TemplateLiteral.templateElement(block: TemplateElement.() -> Unit): TemplateElement {
    return TemplateElement().apply(block)
}

fun Module.importDeclaration(block: ImportDeclaration.() -> Unit): ImportDeclaration {
    return ImportDeclaration().apply(block)
}

fun Module.exportDeclaration(block: ExportDeclaration.() -> Unit): ExportDeclaration {
    return ExportDeclaration().apply(block)
}

fun Module.exportNamedDeclaration(block: ExportNamedDeclaration.() -> Unit): ExportNamedDeclaration {
    return ExportNamedDeclaration().apply(block)
}

fun Module.exportDefaultDeclaration(block: ExportDefaultDeclaration.() -> Unit): ExportDefaultDeclaration {
    return ExportDefaultDeclaration().apply(block)
}

fun Module.exportDefaultExpression(block: ExportDefaultExpression.() -> Unit): ExportDefaultExpression {
    return ExportDefaultExpression().apply(block)
}

fun Module.exportAllDeclaration(block: ExportAllDeclaration.() -> Unit): ExportAllDeclaration {
    return ExportAllDeclaration().apply(block)
}

fun Module.tsImportEqualsDeclaration(block: TsImportEqualsDeclaration.() -> Unit): TsImportEqualsDeclaration {
    return TsImportEqualsDeclaration().apply(block)
}

fun Module.tsExportAssignment(block: TsExportAssignment.() -> Unit): TsExportAssignment {
    return TsExportAssignment().apply(block)
}

fun Module.tsNamespaceExportDeclaration(block: TsNamespaceExportDeclaration.() -> Unit): TsNamespaceExportDeclaration {
    return TsNamespaceExportDeclaration().apply(block)
}

fun Module.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun Module.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun Module.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun Module.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun Module.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun Module.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun Module.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun Module.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun Module.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun Module.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun Module.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun Module.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun Module.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun Module.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun Module.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun Module.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun Module.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun Module.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun Module.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun Module.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun Module.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun Module.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun Module.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun Module.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun Module.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun Script.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun Script.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun Script.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun Script.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun Script.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun Script.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun Script.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun Script.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun Script.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun Script.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun Script.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun Script.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun Script.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun Script.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun Script.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun Script.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun Script.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun Script.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun Script.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun Script.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun Script.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun Script.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun Script.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun Script.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun Script.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun ArrayPattern.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifier().apply(block)
}

fun ArrayPattern.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPattern().apply(block)
}

fun ArrayPattern.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun ArrayPattern.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPattern().apply(block)
}

fun ArrayPattern.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPattern().apply(block)
}

fun ArrayPattern.invalid(block: Invalid.() -> Unit): Invalid {
    return Invalid().apply(block)
}

fun ArrayPattern.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpression().apply(block)
}

fun ArrayPattern.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpression().apply(block)
}

fun ArrayPattern.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpression().apply(block)
}

fun ArrayPattern.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpression().apply(block)
}

fun ArrayPattern.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpression().apply(block)
}

fun ArrayPattern.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpression().apply(block)
}

fun ArrayPattern.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpression().apply(block)
}

fun ArrayPattern.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpression().apply(block)
}

fun ArrayPattern.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpression().apply(block)
}

fun ArrayPattern.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpression().apply(block)
}

fun ArrayPattern.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpression().apply(block)
}

fun ArrayPattern.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpression().apply(block)
}

fun ArrayPattern.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpression().apply(block)
}

fun ArrayPattern.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpression().apply(block)
}

fun ArrayPattern.identifier(block: Identifier.() -> Unit): Identifier {
    return Identifier().apply(block)
}

fun ArrayPattern.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteral().apply(block)
}

fun ArrayPattern.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteral().apply(block)
}

fun ArrayPattern.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteral().apply(block)
}

fun ArrayPattern.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteral().apply(block)
}

fun ArrayPattern.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteral().apply(block)
}

fun ArrayPattern.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteral().apply(block)
}

fun ArrayPattern.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXText().apply(block)
}

fun ArrayPattern.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteral().apply(block)
}

fun ArrayPattern.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpression().apply(block)
}

fun ArrayPattern.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpression().apply(block)
}

fun ArrayPattern.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpression().apply(block)
}

fun ArrayPattern.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpression().apply(block)
}

fun ArrayPattern.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaProperty().apply(block)
}

fun ArrayPattern.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpression().apply(block)
}

fun ArrayPattern.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpression().apply(block)
}

fun ArrayPattern.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpression().apply(block)
}

fun ArrayPattern.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedName().apply(block)
}

fun ArrayPattern.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpression().apply(block)
}

fun ArrayPattern.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElement().apply(block)
}

fun ArrayPattern.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragment().apply(block)
}

fun ArrayPattern.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertion().apply(block)
}

fun ArrayPattern.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertion().apply(block)
}

fun ArrayPattern.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpression().apply(block)
}

fun ArrayPattern.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpression().apply(block)
}

fun ArrayPattern.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpression().apply(block)
}

fun ArrayPattern.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiation().apply(block)
}

fun ArrayPattern.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateName().apply(block)
}

fun ArrayPattern.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpression().apply(block)
}

fun ObjectPattern.keyValuePatternProperty(block: KeyValuePatternProperty.() -> Unit): KeyValuePatternProperty {
    return KeyValuePatternProperty().apply(block)
}

fun ObjectPattern.assignmentPatternProperty(block: AssignmentPatternProperty.() -> Unit): AssignmentPatternProperty {
    return AssignmentPatternProperty().apply(block)
}

fun ObjectPattern.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElement().apply(block)
}

fun MethodProperty.param(block: Param.() -> Unit): Param {
    return Param().apply(block)
}

fun MethodProperty.decorator(block: Decorator.() -> Unit): Decorator {
    return Decorator().apply(block)
}

fun BlockStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun BlockStatement.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun BlockStatement.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun BlockStatement.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun BlockStatement.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun BlockStatement.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun BlockStatement.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun BlockStatement.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun BlockStatement.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun BlockStatement.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun BlockStatement.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun BlockStatement.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun BlockStatement.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun BlockStatement.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun BlockStatement.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun BlockStatement.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun BlockStatement.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun BlockStatement.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun BlockStatement.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun BlockStatement.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun BlockStatement.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun BlockStatement.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun BlockStatement.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun BlockStatement.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun BlockStatement.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}

fun TsTypeParameterDeclaration.tsTypeParameter(block: TsTypeParameter.() -> Unit): TsTypeParameter {
    return TsTypeParameter().apply(block)
}

fun TsTypeParameterInstantiation.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsTypeParameterInstantiation.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsTypeParameterInstantiation.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsTypeParameterInstantiation.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsTypeParameterInstantiation.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsTypeParameterInstantiation.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsTypeParameterInstantiation.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsTypeParameterInstantiation.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsTypeParameterInstantiation.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsTypeParameterInstantiation.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsTypeParameterInstantiation.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsTypeParameterInstantiation.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsTypeParameterInstantiation.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsTypeParameterInstantiation.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsTypeParameterInstantiation.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsTypeParameterInstantiation.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsTypeParameterInstantiation.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsTypeParameterInstantiation.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsTypeParameterInstantiation.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsTypeParameterInstantiation.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsTypeParameterInstantiation.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsTypeParameterInstantiation.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsTypeLiteral.tsCallSignatureDeclaration(block: TsCallSignatureDeclaration.() -> Unit): TsCallSignatureDeclaration {
    return TsCallSignatureDeclaration().apply(block)
}

fun TsTypeLiteral.tsConstructSignatureDeclaration(block: TsConstructSignatureDeclaration.() -> Unit): TsConstructSignatureDeclaration {
    return TsConstructSignatureDeclaration().apply(block)
}

fun TsTypeLiteral.tsPropertySignature(block: TsPropertySignature.() -> Unit): TsPropertySignature {
    return TsPropertySignature().apply(block)
}

fun TsTypeLiteral.tsGetterSignature(block: TsGetterSignature.() -> Unit): TsGetterSignature {
    return TsGetterSignature().apply(block)
}

fun TsTypeLiteral.tsSetterSignature(block: TsSetterSignature.() -> Unit): TsSetterSignature {
    return TsSetterSignature().apply(block)
}

fun TsTypeLiteral.tsMethodSignature(block: TsMethodSignature.() -> Unit): TsMethodSignature {
    return TsMethodSignature().apply(block)
}

fun TsTypeLiteral.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignature().apply(block)
}

fun TsTupleType.tsTupleElement(block: TsTupleElement.() -> Unit): TsTupleElement {
    return TsTupleElement().apply(block)
}

fun TsUnionType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsUnionType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsUnionType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsUnionType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsUnionType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsUnionType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsUnionType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsUnionType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsUnionType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsUnionType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsUnionType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsUnionType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsUnionType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsUnionType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsUnionType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsUnionType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsUnionType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsUnionType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsUnionType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsUnionType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsUnionType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsUnionType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsIntersectionType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsIntersectionType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsIntersectionType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsIntersectionType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsIntersectionType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsIntersectionType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsIntersectionType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsIntersectionType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsIntersectionType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsIntersectionType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsIntersectionType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsIntersectionType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsIntersectionType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsIntersectionType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsIntersectionType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsIntersectionType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsIntersectionType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsIntersectionType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsIntersectionType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsIntersectionType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsIntersectionType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsIntersectionType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsTemplateLiteralType.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordType().apply(block)
}

fun TsTemplateLiteralType.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisType().apply(block)
}

fun TsTemplateLiteralType.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionType().apply(block)
}

fun TsTemplateLiteralType.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorType().apply(block)
}

fun TsTemplateLiteralType.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReference().apply(block)
}

fun TsTemplateLiteralType.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQuery().apply(block)
}

fun TsTemplateLiteralType.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteral().apply(block)
}

fun TsTemplateLiteralType.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayType().apply(block)
}

fun TsTemplateLiteralType.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleType().apply(block)
}

fun TsTemplateLiteralType.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalType().apply(block)
}

fun TsTemplateLiteralType.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestType().apply(block)
}

fun TsTemplateLiteralType.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionType().apply(block)
}

fun TsTemplateLiteralType.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionType().apply(block)
}

fun TsTemplateLiteralType.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalType().apply(block)
}

fun TsTemplateLiteralType.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferType().apply(block)
}

fun TsTemplateLiteralType.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedType().apply(block)
}

fun TsTemplateLiteralType.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperator().apply(block)
}

fun TsTemplateLiteralType.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessType().apply(block)
}

fun TsTemplateLiteralType.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedType().apply(block)
}

fun TsTemplateLiteralType.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralType().apply(block)
}

fun TsTemplateLiteralType.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicate().apply(block)
}

fun TsTemplateLiteralType.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportType().apply(block)
}

fun TsTemplateLiteralType.templateElement(block: TemplateElement.() -> Unit): TemplateElement {
    return TemplateElement().apply(block)
}

fun TsInterfaceBody.tsCallSignatureDeclaration(block: TsCallSignatureDeclaration.() -> Unit): TsCallSignatureDeclaration {
    return TsCallSignatureDeclaration().apply(block)
}

fun TsInterfaceBody.tsConstructSignatureDeclaration(block: TsConstructSignatureDeclaration.() -> Unit): TsConstructSignatureDeclaration {
    return TsConstructSignatureDeclaration().apply(block)
}

fun TsInterfaceBody.tsPropertySignature(block: TsPropertySignature.() -> Unit): TsPropertySignature {
    return TsPropertySignature().apply(block)
}

fun TsInterfaceBody.tsGetterSignature(block: TsGetterSignature.() -> Unit): TsGetterSignature {
    return TsGetterSignature().apply(block)
}

fun TsInterfaceBody.tsSetterSignature(block: TsSetterSignature.() -> Unit): TsSetterSignature {
    return TsSetterSignature().apply(block)
}

fun TsInterfaceBody.tsMethodSignature(block: TsMethodSignature.() -> Unit): TsMethodSignature {
    return TsMethodSignature().apply(block)
}

fun TsInterfaceBody.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignature().apply(block)
}

fun TsModuleBlock.importDeclaration(block: ImportDeclaration.() -> Unit): ImportDeclaration {
    return ImportDeclaration().apply(block)
}

fun TsModuleBlock.exportDeclaration(block: ExportDeclaration.() -> Unit): ExportDeclaration {
    return ExportDeclaration().apply(block)
}

fun TsModuleBlock.exportNamedDeclaration(block: ExportNamedDeclaration.() -> Unit): ExportNamedDeclaration {
    return ExportNamedDeclaration().apply(block)
}

fun TsModuleBlock.exportDefaultDeclaration(block: ExportDefaultDeclaration.() -> Unit): ExportDefaultDeclaration {
    return ExportDefaultDeclaration().apply(block)
}

fun TsModuleBlock.exportDefaultExpression(block: ExportDefaultExpression.() -> Unit): ExportDefaultExpression {
    return ExportDefaultExpression().apply(block)
}

fun TsModuleBlock.exportAllDeclaration(block: ExportAllDeclaration.() -> Unit): ExportAllDeclaration {
    return ExportAllDeclaration().apply(block)
}

fun TsModuleBlock.tsImportEqualsDeclaration(block: TsImportEqualsDeclaration.() -> Unit): TsImportEqualsDeclaration {
    return TsImportEqualsDeclaration().apply(block)
}

fun TsModuleBlock.tsExportAssignment(block: TsExportAssignment.() -> Unit): TsExportAssignment {
    return TsExportAssignment().apply(block)
}

fun TsModuleBlock.tsNamespaceExportDeclaration(block: TsNamespaceExportDeclaration.() -> Unit): TsNamespaceExportDeclaration {
    return TsNamespaceExportDeclaration().apply(block)
}

fun TsModuleBlock.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatement().apply(block)
}

fun TsModuleBlock.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatement().apply(block)
}

fun TsModuleBlock.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatement().apply(block)
}

fun TsModuleBlock.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatement().apply(block)
}

fun TsModuleBlock.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatement().apply(block)
}

fun TsModuleBlock.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatement().apply(block)
}

fun TsModuleBlock.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatement().apply(block)
}

fun TsModuleBlock.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatement().apply(block)
}

fun TsModuleBlock.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatement().apply(block)
}

fun TsModuleBlock.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatement().apply(block)
}

fun TsModuleBlock.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatement().apply(block)
}

fun TsModuleBlock.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatement().apply(block)
}

fun TsModuleBlock.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatement().apply(block)
}

fun TsModuleBlock.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatement().apply(block)
}

fun TsModuleBlock.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatement().apply(block)
}

fun TsModuleBlock.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatement().apply(block)
}

fun TsModuleBlock.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatement().apply(block)
}

fun TsModuleBlock.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclaration().apply(block)
}

fun TsModuleBlock.functionDeclaration(block: FunctionDeclaration.() -> Unit): FunctionDeclaration {
    return FunctionDeclaration().apply(block)
}

fun TsModuleBlock.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclaration().apply(block)
}

fun TsModuleBlock.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclaration().apply(block)
}

fun TsModuleBlock.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclaration().apply(block)
}

fun TsModuleBlock.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclaration().apply(block)
}

fun TsModuleBlock.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclaration().apply(block)
}

fun TsModuleBlock.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatement().apply(block)
}
