package dev.yidafu.swc.dsl



import dev.yidafu.swc.types.*



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

fun JsMinifyOptions.jsMinifyOptions(block: JsMinifyOptions.() -> Unit): JsMinifyOptions {
  return JsMinifyOptions().apply(block)
}

fun TerserMangleOptions.terserManglePropertiesOptions(block: TerserManglePropertiesOptions.() -> Unit): TerserManglePropertiesOptions {
  return TerserManglePropertiesOptions().apply(block)
}

fun Options.plugin(block: Plugin.() -> Unit): Plugin {
  return Plugin().apply(block)
}

fun Config.jscConfig(block: JscConfig.() -> Unit): JscConfig {
  return JscConfig().apply(block)
}

fun JscConfig.jsFormatOptions(block: JsFormatOptions.() -> Unit): JsFormatOptions {
  return JsFormatOptions().apply(block)
}

fun JscConfig.jsMinifyOptions(block: JsMinifyOptions.() -> Unit): JsMinifyOptions {
  return JsMinifyOptions().apply(block)
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

fun Class.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
  return TsTypeParameterInstantiation().apply(block)
}

fun ClassPropertyBase.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
  return TsTypeAnnotation().apply(block)
}

fun PrivateProperty.privateName(block: PrivateName.() -> Unit): PrivateName {
  return PrivateName().apply(block)
}

fun Constructor.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
  return BlockStatement().apply(block)
}

fun PrivateMethod.privateName(block: PrivateName.() -> Unit): PrivateName {
  return PrivateName().apply(block)
}

fun StaticBlock.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
  return BlockStatement().apply(block)
}

fun FunctionDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun Fn.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
  return TsTypeAnnotation().apply(block)
}

fun ClassDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun OptionalChainingExpression.span(block: Span.() -> Unit): Span {
  return Span().apply(block)
}

fun OptionalChainingCall.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
  return TsTypeParameterInstantiation().apply(block)
}

fun ExprOrSpread.span(block: Span.() -> Unit): Span {
  return Span().apply(block)
}

fun Argument.span(block: Span.() -> Unit): Span {
  return Span().apply(block)
}

fun SpreadElement.span(block: Span.() -> Unit): Span {
  return Span().apply(block)
}

fun FunctionExpression.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun ClassExpression.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun SuperPropExpression.super(block: Super.() -> Unit): Super {
  return Super().apply(block)
}

fun CallExpression.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
  return TsTypeParameterInstantiation().apply(block)
}

fun NewExpression.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
  return TsTypeParameterInstantiation().apply(block)
}

fun ArrowFunctionExpression.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
  return TsTypeAnnotation().apply(block)
}

fun TaggedTemplateExpression.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
  return TemplateLiteral().apply(block)
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

fun JSXOpeningElement.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
  return TsTypeParameterInstantiation().apply(block)
}

fun JSXOpeningElement.jSXOpeningElement(block: JSXOpeningElement.() -> Unit): JSXOpeningElement {
  return JSXOpeningElement().apply(block)
}

fun JSXElement.jSXClosingElement(block: JSXClosingElement.() -> Unit): JSXClosingElement {
  return JSXClosingElement().apply(block)
}

fun JSXFragment.jSXClosingFragment(block: JSXClosingFragment.() -> Unit): JSXClosingFragment {
  return JSXClosingFragment().apply(block)
}

fun ImportDeclaration.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
  return ObjectExpression().apply(block)
}

fun ExportAllDeclaration.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
  return ObjectExpression().apply(block)
}

fun ExportNamedDeclaration.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
  return ObjectExpression().apply(block)
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

fun ExportDefaultSpecifier.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun RestElement.span(block: Span.() -> Unit): Span {
  return Span().apply(block)
}

fun AssignmentPatternProperty.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun AssignmentProperty.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun GetterProperty.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
  return BlockStatement().apply(block)
}

fun SetterProperty.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
  return BlockStatement().apply(block)
}

fun LabeledStatement.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun BreakStatement.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun ContinueStatement.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun TryStatement.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
  return BlockStatement().apply(block)
}

fun ForOfStatement.span(block: Span.() -> Unit): Span {
  return Span().apply(block)
}

fun CatchClause.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
  return BlockStatement().apply(block)
}

fun TsTypeParameter.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun TsTypeParameter.tsTypeParameter(block: TsTypeParameter.() -> Unit): TsTypeParameter {
  return TsTypeParameter().apply(block)
}

fun TsQualifiedName.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun TsCallSignatureDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
  return TsTypeParameterDeclaration().apply(block)
}

fun TsConstructSignatureDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
  return TsTypeParameterDeclaration().apply(block)
}

fun TsPropertySignature.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
  return TsTypeParameterDeclaration().apply(block)
}

fun TsGetterSignature.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
  return TsTypeAnnotation().apply(block)
}

fun TsMethodSignature.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
  return TsTypeParameterDeclaration().apply(block)
}

fun TsIndexSignature.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
  return TsTypeAnnotation().apply(block)
}

fun TsFunctionType.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
  return TsTypeAnnotation().apply(block)
}

fun TsConstructorType.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
  return TsTypeAnnotation().apply(block)
}

fun TsTypeReference.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
  return TsTypeParameterInstantiation().apply(block)
}

fun TsTypePredicate.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
  return TsTypeAnnotation().apply(block)
}

fun TsImportType.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
  return TsTypeParameterInstantiation().apply(block)
}

fun TsTypeQuery.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
  return TsTypeParameterInstantiation().apply(block)
}

fun TsInferType.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun TsInferType.tsTypeParameter(block: TsTypeParameter.() -> Unit): TsTypeParameter {
  return TsTypeParameter().apply(block)
}

fun TsMappedType.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun TsMappedType.tsTypeParameter(block: TsTypeParameter.() -> Unit): TsTypeParameter {
  return TsTypeParameter().apply(block)
}

fun TsInterfaceDeclaration.tsInterfaceBody(block: TsInterfaceBody.() -> Unit): TsInterfaceBody {
  return TsInterfaceBody().apply(block)
}

fun TsExpressionWithTypeArguments.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
  return TsTypeParameterInstantiation().apply(block)
}

fun TsTypeAliasDeclaration.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
  return TsTypeParameterDeclaration().apply(block)
}

fun TsEnumDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun TsNamespaceDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun TsImportEqualsDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun TsExternalModuleReference.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
  return StringLiteral().apply(block)
}

fun TsNamespaceExportDeclaration.identifier(block: Identifier.() -> Unit): Identifier {
  return Identifier().apply(block)
}

fun TsInstantiation.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
  return TsTypeParameterInstantiation().apply(block)
}