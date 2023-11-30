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

fun Options.matchPattern(block: MatchPattern.() -> Unit): MatchPattern {
  return MatchPattern().apply(block)
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

fun ClassProperty.decorator(block: Decorator.() -> Unit): Decorator {
  return Decorator().apply(block)
}

fun PrivateProperty.decorator(block: Decorator.() -> Unit): Decorator {
  return Decorator().apply(block)
}

fun Param.decorator(block: Decorator.() -> Unit): Decorator {
  return Decorator().apply(block)
}

fun FunctionDeclaration.param(block: Param.() -> Unit): Param {
  return Param().apply(block)
}

fun FunctionDeclaration.decorator(block: Decorator.() -> Unit): Decorator {
  return Decorator().apply(block)
}

fun VariableDeclaration.variableDeclarator(block: VariableDeclarator.() -> Unit): VariableDeclarator {
  return VariableDeclarator().apply(block)
}

fun OptionalChainingCall.exprOrSpread(block: ExprOrSpread.() -> Unit): ExprOrSpread {
  return ExprOrSpread().apply(block)
}

fun ArrayExpression.exprOrSpread(block: ExprOrSpread.() -> Unit): ExprOrSpread {
  return ExprOrSpread().apply(block)
}

fun FunctionExpression.param(block: Param.() -> Unit): Param {
  return Param().apply(block)
}

fun FunctionExpression.decorator(block: Decorator.() -> Unit): Decorator {
  return Decorator().apply(block)
}

fun CallExpression.argument(block: Argument.() -> Unit): Argument {
  return Argument().apply(block)
}

fun NewExpression.argument(block: Argument.() -> Unit): Argument {
  return Argument().apply(block)
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

fun JSXOpeningElement.jSXAttribute(block: JSXAttribute.() -> Unit): JSXAttribute {
  return JSXAttribute().apply(block)
}

fun JSXOpeningElement.spreadElement(block: SpreadElement.() -> Unit): SpreadElement {
  return SpreadElement().apply(block)
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

fun ImportDeclaration.namedImportSpecifier(block: NamedImportSpecifier.() -> Unit): NamedImportSpecifier {
  return NamedImportSpecifier().apply(block)
}

fun ImportDeclaration.importDefaultSpecifier(block: ImportDefaultSpecifier.() -> Unit): ImportDefaultSpecifier {
  return ImportDefaultSpecifier().apply(block)
}

fun ImportDeclaration.importNamespaceSpecifier(block: ImportNamespaceSpecifier.() -> Unit): ImportNamespaceSpecifier {
  return ImportNamespaceSpecifier().apply(block)
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

fun SwitchStatement.switchCase(block: SwitchCase.() -> Unit): SwitchCase {
  return SwitchCase().apply(block)
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

fun TsParameterProperty.decorator(block: Decorator.() -> Unit): Decorator {
  return Decorator().apply(block)
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

fun TsInterfaceDeclaration.tsExpressionWithTypeArguments(block: TsExpressionWithTypeArguments.() -> Unit): TsExpressionWithTypeArguments {
  return TsExpressionWithTypeArguments().apply(block)
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

fun TsEnumDeclaration.tsEnumMember(block: TsEnumMember.() -> Unit): TsEnumMember {
  return TsEnumMember().apply(block)
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