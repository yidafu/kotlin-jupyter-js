package dev.yidafu.swc.dsl

import dev.yidafu.swc.types.*

/**
 * subtype of Node
 */
fun Node.classProperty(block: ClassProperty.() -> Unit): ClassProperty {
    return ClassPropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.privateProperty(block: PrivateProperty.() -> Unit): PrivateProperty {
    return PrivatePropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.param(block: Param.() -> Unit): Param {
    return ParamImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.constructor(block: Constructor.() -> Unit): Constructor {
    return ConstructorImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.classMethod(block: ClassMethod.() -> Unit): ClassMethod {
    return ClassMethodImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.privateMethod(block: PrivateMethod.() -> Unit): PrivateMethod {
    return PrivateMethodImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.staticBlock(block: StaticBlock.() -> Unit): StaticBlock {
    return StaticBlockImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.decorator(block: Decorator.() -> Unit): Decorator {
    return DecoratorImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.classDeclaration(block: ClassDeclaration.() -> Unit): ClassDeclaration {
    return ClassDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.variableDeclaration(block: VariableDeclaration.() -> Unit): VariableDeclaration {
    return VariableDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.variableDeclarator(block: VariableDeclarator.() -> Unit): VariableDeclarator {
    return VariableDeclaratorImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.identifier(block: Identifier.() -> Unit): Identifier {
    return IdentifierImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.optionalChainingExpression(block: OptionalChainingExpression.() -> Unit): OptionalChainingExpression {
    return OptionalChainingExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.optionalChainingCall(block: OptionalChainingCall.() -> Unit): OptionalChainingCall {
    return OptionalChainingCallImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.thisExpression(block: ThisExpression.() -> Unit): ThisExpression {
    return ThisExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.arrayExpression(block: ArrayExpression.() -> Unit): ArrayExpression {
    return ArrayExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.objectExpression(block: ObjectExpression.() -> Unit): ObjectExpression {
    return ObjectExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.unaryExpression(block: UnaryExpression.() -> Unit): UnaryExpression {
    return UnaryExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.updateExpression(block: UpdateExpression.() -> Unit): UpdateExpression {
    return UpdateExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.binaryExpression(block: BinaryExpression.() -> Unit): BinaryExpression {
    return BinaryExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.functionExpression(block: FunctionExpression.() -> Unit): FunctionExpression {
    return FunctionExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.classExpression(block: ClassExpression.() -> Unit): ClassExpression {
    return ClassExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.assignmentExpression(block: AssignmentExpression.() -> Unit): AssignmentExpression {
    return AssignmentExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.memberExpression(block: MemberExpression.() -> Unit): MemberExpression {
    return MemberExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.superPropExpression(block: SuperPropExpression.() -> Unit): SuperPropExpression {
    return SuperPropExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.conditionalExpression(block: ConditionalExpression.() -> Unit): ConditionalExpression {
    return ConditionalExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.callExpression(block: CallExpression.() -> Unit): CallExpression {
    return CallExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.newExpression(block: NewExpression.() -> Unit): NewExpression {
    return NewExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.sequenceExpression(block: SequenceExpression.() -> Unit): SequenceExpression {
    return SequenceExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.arrowFunctionExpression(block: ArrowFunctionExpression.() -> Unit): ArrowFunctionExpression {
    return ArrowFunctionExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.yieldExpression(block: YieldExpression.() -> Unit): YieldExpression {
    return YieldExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.awaitExpression(block: AwaitExpression.() -> Unit): AwaitExpression {
    return AwaitExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.templateLiteral(block: TemplateLiteral.() -> Unit): TemplateLiteral {
    return TemplateLiteralImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.taggedTemplateExpression(block: TaggedTemplateExpression.() -> Unit): TaggedTemplateExpression {
    return TaggedTemplateExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.templateElement(block: TemplateElement.() -> Unit): TemplateElement {
    return TemplateElementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.parenthesisExpression(block: ParenthesisExpression.() -> Unit): ParenthesisExpression {
    return ParenthesisExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.privateName(block: PrivateName.() -> Unit): PrivateName {
    return PrivateNameImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsAsExpression(block: TsAsExpression.() -> Unit): TsAsExpression {
    return TsAsExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsSatisfiesExpression(block: TsSatisfiesExpression.() -> Unit): TsSatisfiesExpression {
    return TsSatisfiesExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypeAssertion(block: TsTypeAssertion.() -> Unit): TsTypeAssertion {
    return TsTypeAssertionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsConstAssertion(block: TsConstAssertion.() -> Unit): TsConstAssertion {
    return TsConstAssertionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsNonNullExpression(block: TsNonNullExpression.() -> Unit): TsNonNullExpression {
    return TsNonNullExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.spreadElement(block: SpreadElement.() -> Unit): SpreadElement {
    return SpreadElementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jsSuper(block: Super.() -> Unit): Super {
    return SuperImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.import(block: Import.() -> Unit): Import {
    return ImportImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.metaProperty(block: MetaProperty.() -> Unit): MetaProperty {
    return MetaPropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.bindingIdentifier(block: BindingIdentifier.() -> Unit): BindingIdentifier {
    return BindingIdentifierImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.arrayPattern(block: ArrayPattern.() -> Unit): ArrayPattern {
    return ArrayPatternImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.objectPattern(block: ObjectPattern.() -> Unit): ObjectPattern {
    return ObjectPatternImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.assignmentPattern(block: AssignmentPattern.() -> Unit): AssignmentPattern {
    return AssignmentPatternImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.restElement(block: RestElement.() -> Unit): RestElement {
    return RestElementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXMemberExpression(block: JSXMemberExpression.() -> Unit): JSXMemberExpression {
    return JSXMemberExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXNamespacedName(block: JSXNamespacedName.() -> Unit): JSXNamespacedName {
    return JSXNamespacedNameImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXEmptyExpression(block: JSXEmptyExpression.() -> Unit): JSXEmptyExpression {
    return JSXEmptyExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXExpressionContainer(block: JSXExpressionContainer.() -> Unit): JSXExpressionContainer {
    return JSXExpressionContainerImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXSpreadChild(block: JSXSpreadChild.() -> Unit): JSXSpreadChild {
    return JSXSpreadChildImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXOpeningElement(block: JSXOpeningElement.() -> Unit): JSXOpeningElement {
    return JSXOpeningElementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXClosingElement(block: JSXClosingElement.() -> Unit): JSXClosingElement {
    return JSXClosingElementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXAttribute(block: JSXAttribute.() -> Unit): JSXAttribute {
    return JSXAttributeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXText(block: JSXText.() -> Unit): JSXText {
    return JSXTextImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXElement(block: JSXElement.() -> Unit): JSXElement {
    return JSXElementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXFragment(block: JSXFragment.() -> Unit): JSXFragment {
    return JSXFragmentImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXOpeningFragment(block: JSXOpeningFragment.() -> Unit): JSXOpeningFragment {
    return JSXOpeningFragmentImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.jSXClosingFragment(block: JSXClosingFragment.() -> Unit): JSXClosingFragment {
    return JSXClosingFragmentImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.stringLiteral(block: StringLiteral.() -> Unit): StringLiteral {
    return StringLiteralImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.booleanLiteral(block: BooleanLiteral.() -> Unit): BooleanLiteral {
    return BooleanLiteralImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.nullLiteral(block: NullLiteral.() -> Unit): NullLiteral {
    return NullLiteralImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.regExpLiteral(block: RegExpLiteral.() -> Unit): RegExpLiteral {
    return RegExpLiteralImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.numericLiteral(block: NumericLiteral.() -> Unit): NumericLiteral {
    return NumericLiteralImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.bigIntLiteral(block: BigIntLiteral.() -> Unit): BigIntLiteral {
    return BigIntLiteralImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.exportDefaultExpression(block: ExportDefaultExpression.() -> Unit): ExportDefaultExpression {
    return ExportDefaultExpressionImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.exportDeclaration(block: ExportDeclaration.() -> Unit): ExportDeclaration {
    return ExportDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.importDeclaration(block: ImportDeclaration.() -> Unit): ImportDeclaration {
    return ImportDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.exportAllDeclaration(block: ExportAllDeclaration.() -> Unit): ExportAllDeclaration {
    return ExportAllDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.exportNamedDeclaration(block: ExportNamedDeclaration.() -> Unit): ExportNamedDeclaration {
    return ExportNamedDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.exportDefaultDeclaration(block: ExportDefaultDeclaration.() -> Unit): ExportDefaultDeclaration {
    return ExportDefaultDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.importDefaultSpecifier(block: ImportDefaultSpecifier.() -> Unit): ImportDefaultSpecifier {
    return ImportDefaultSpecifierImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.importNamespaceSpecifier(block: ImportNamespaceSpecifier.() -> Unit): ImportNamespaceSpecifier {
    return ImportNamespaceSpecifierImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.namedImportSpecifier(block: NamedImportSpecifier.() -> Unit): NamedImportSpecifier {
    return NamedImportSpecifierImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.exportNamespaceSpecifier(block: ExportNamespaceSpecifier.() -> Unit): ExportNamespaceSpecifier {
    return ExportNamespaceSpecifierImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.exportDefaultSpecifier(block: ExportDefaultSpecifier.() -> Unit): ExportDefaultSpecifier {
    return ExportDefaultSpecifierImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.namedExportSpecifier(block: NamedExportSpecifier.() -> Unit): NamedExportSpecifier {
    return NamedExportSpecifierImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.module(block: Module.() -> Unit): Module {
    return ModuleImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.script(block: Script.() -> Unit): Script {
    return ScriptImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.keyValuePatternProperty(block: KeyValuePatternProperty.() -> Unit): KeyValuePatternProperty {
    return KeyValuePatternPropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.assignmentPatternProperty(block: AssignmentPatternProperty.() -> Unit): AssignmentPatternProperty {
    return AssignmentPatternPropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.keyValueProperty(block: KeyValueProperty.() -> Unit): KeyValueProperty {
    return KeyValuePropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.getterProperty(block: GetterProperty.() -> Unit): GetterProperty {
    return GetterPropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.setterProperty(block: SetterProperty.() -> Unit): SetterProperty {
    return SetterPropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.methodProperty(block: MethodProperty.() -> Unit): MethodProperty {
    return MethodPropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.assignmentProperty(block: AssignmentProperty.() -> Unit): AssignmentProperty {
    return AssignmentPropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.computedPropName(block: ComputedPropName.() -> Unit): ComputedPropName {
    return ComputedPropNameImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.blockStatement(block: BlockStatement.() -> Unit): BlockStatement {
    return BlockStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.expressionStatement(block: ExpressionStatement.() -> Unit): ExpressionStatement {
    return ExpressionStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.emptyStatement(block: EmptyStatement.() -> Unit): EmptyStatement {
    return EmptyStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.debuggerStatement(block: DebuggerStatement.() -> Unit): DebuggerStatement {
    return DebuggerStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.withStatement(block: WithStatement.() -> Unit): WithStatement {
    return WithStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.returnStatement(block: ReturnStatement.() -> Unit): ReturnStatement {
    return ReturnStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.labeledStatement(block: LabeledStatement.() -> Unit): LabeledStatement {
    return LabeledStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.breakStatement(block: BreakStatement.() -> Unit): BreakStatement {
    return BreakStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.continueStatement(block: ContinueStatement.() -> Unit): ContinueStatement {
    return ContinueStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.ifStatement(block: IfStatement.() -> Unit): IfStatement {
    return IfStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.switchStatement(block: SwitchStatement.() -> Unit): SwitchStatement {
    return SwitchStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.throwStatement(block: ThrowStatement.() -> Unit): ThrowStatement {
    return ThrowStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tryStatement(block: TryStatement.() -> Unit): TryStatement {
    return TryStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.whileStatement(block: WhileStatement.() -> Unit): WhileStatement {
    return WhileStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.doWhileStatement(block: DoWhileStatement.() -> Unit): DoWhileStatement {
    return DoWhileStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.forStatement(block: ForStatement.() -> Unit): ForStatement {
    return ForStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.forInStatement(block: ForInStatement.() -> Unit): ForInStatement {
    return ForInStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.forOfStatement(block: ForOfStatement.() -> Unit): ForOfStatement {
    return ForOfStatementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.switchCase(block: SwitchCase.() -> Unit): SwitchCase {
    return SwitchCaseImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.catchClause(block: CatchClause.() -> Unit): CatchClause {
    return CatchClauseImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypeAnnotation(block: TsTypeAnnotation.() -> Unit): TsTypeAnnotation {
    return TsTypeAnnotationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypeParameterDeclaration(block: TsTypeParameterDeclaration.() -> Unit): TsTypeParameterDeclaration {
    return TsTypeParameterDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypeParameter(block: TsTypeParameter.() -> Unit): TsTypeParameter {
    return TsTypeParameterImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypeParameterInstantiation(block: TsTypeParameterInstantiation.() -> Unit): TsTypeParameterInstantiation {
    return TsTypeParameterInstantiationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsParameterProperty(block: TsParameterProperty.() -> Unit): TsParameterProperty {
    return TsParameterPropertyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsQualifiedName(block: TsQualifiedName.() -> Unit): TsQualifiedName {
    return TsQualifiedNameImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsCallSignatureDeclaration(block: TsCallSignatureDeclaration.() -> Unit): TsCallSignatureDeclaration {
    return TsCallSignatureDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsConstructSignatureDeclaration(block: TsConstructSignatureDeclaration.() -> Unit): TsConstructSignatureDeclaration {
    return TsConstructSignatureDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsPropertySignature(block: TsPropertySignature.() -> Unit): TsPropertySignature {
    return TsPropertySignatureImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsGetterSignature(block: TsGetterSignature.() -> Unit): TsGetterSignature {
    return TsGetterSignatureImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsSetterSignature(block: TsSetterSignature.() -> Unit): TsSetterSignature {
    return TsSetterSignatureImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsMethodSignature(block: TsMethodSignature.() -> Unit): TsMethodSignature {
    return TsMethodSignatureImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsIndexSignature(block: TsIndexSignature.() -> Unit): TsIndexSignature {
    return TsIndexSignatureImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsKeywordType(block: TsKeywordType.() -> Unit): TsKeywordType {
    return TsKeywordTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsThisType(block: TsThisType.() -> Unit): TsThisType {
    return TsThisTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsFunctionType(block: TsFunctionType.() -> Unit): TsFunctionType {
    return TsFunctionTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsConstructorType(block: TsConstructorType.() -> Unit): TsConstructorType {
    return TsConstructorTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypeReference(block: TsTypeReference.() -> Unit): TsTypeReference {
    return TsTypeReferenceImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypePredicate(block: TsTypePredicate.() -> Unit): TsTypePredicate {
    return TsTypePredicateImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsImportType(block: TsImportType.() -> Unit): TsImportType {
    return TsImportTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypeQuery(block: TsTypeQuery.() -> Unit): TsTypeQuery {
    return TsTypeQueryImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypeLiteral(block: TsTypeLiteral.() -> Unit): TsTypeLiteral {
    return TsTypeLiteralImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsArrayType(block: TsArrayType.() -> Unit): TsArrayType {
    return TsArrayTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTupleType(block: TsTupleType.() -> Unit): TsTupleType {
    return TsTupleTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTupleElement(block: TsTupleElement.() -> Unit): TsTupleElement {
    return TsTupleElementImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsOptionalType(block: TsOptionalType.() -> Unit): TsOptionalType {
    return TsOptionalTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsRestType(block: TsRestType.() -> Unit): TsRestType {
    return TsRestTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsUnionType(block: TsUnionType.() -> Unit): TsUnionType {
    return TsUnionTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsIntersectionType(block: TsIntersectionType.() -> Unit): TsIntersectionType {
    return TsIntersectionTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsConditionalType(block: TsConditionalType.() -> Unit): TsConditionalType {
    return TsConditionalTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsInferType(block: TsInferType.() -> Unit): TsInferType {
    return TsInferTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsParenthesizedType(block: TsParenthesizedType.() -> Unit): TsParenthesizedType {
    return TsParenthesizedTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypeOperator(block: TsTypeOperator.() -> Unit): TsTypeOperator {
    return TsTypeOperatorImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsIndexedAccessType(block: TsIndexedAccessType.() -> Unit): TsIndexedAccessType {
    return TsIndexedAccessTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsMappedType(block: TsMappedType.() -> Unit): TsMappedType {
    return TsMappedTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsLiteralType(block: TsLiteralType.() -> Unit): TsLiteralType {
    return TsLiteralTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTemplateLiteralType(block: TsTemplateLiteralType.() -> Unit): TsTemplateLiteralType {
    return TsTemplateLiteralTypeImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsInterfaceDeclaration(block: TsInterfaceDeclaration.() -> Unit): TsInterfaceDeclaration {
    return TsInterfaceDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsInterfaceBody(block: TsInterfaceBody.() -> Unit): TsInterfaceBody {
    return TsInterfaceBodyImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsExpressionWithTypeArguments(block: TsExpressionWithTypeArguments.() -> Unit): TsExpressionWithTypeArguments {
    return TsExpressionWithTypeArgumentsImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsTypeAliasDeclaration(block: TsTypeAliasDeclaration.() -> Unit): TsTypeAliasDeclaration {
    return TsTypeAliasDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsEnumDeclaration(block: TsEnumDeclaration.() -> Unit): TsEnumDeclaration {
    return TsEnumDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsEnumMember(block: TsEnumMember.() -> Unit): TsEnumMember {
    return TsEnumMemberImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsModuleDeclaration(block: TsModuleDeclaration.() -> Unit): TsModuleDeclaration {
    return TsModuleDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsModuleBlock(block: TsModuleBlock.() -> Unit): TsModuleBlock {
    return TsModuleBlockImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsNamespaceDeclaration(block: TsNamespaceDeclaration.() -> Unit): TsNamespaceDeclaration {
    return TsNamespaceDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsImportEqualsDeclaration(block: TsImportEqualsDeclaration.() -> Unit): TsImportEqualsDeclaration {
    return TsImportEqualsDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsExternalModuleReference(block: TsExternalModuleReference.() -> Unit): TsExternalModuleReference {
    return TsExternalModuleReferenceImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsExportAssignment(block: TsExportAssignment.() -> Unit): TsExportAssignment {
    return TsExportAssignmentImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsNamespaceExportDeclaration(block: TsNamespaceExportDeclaration.() -> Unit): TsNamespaceExportDeclaration {
    return TsNamespaceExportDeclarationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.tsInstantiation(block: TsInstantiation.() -> Unit): TsInstantiation {
    return TsInstantiationImpl().apply(block)
}

/**
 * subtype of Node
 */
fun Node.invalid(block: Invalid.() -> Unit): Invalid {
    return InvalidImpl().apply(block)
}
