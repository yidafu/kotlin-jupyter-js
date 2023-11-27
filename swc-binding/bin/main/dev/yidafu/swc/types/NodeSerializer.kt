
package dev.yidafu.swc.types

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.*

object NodeSerializer : JsonContentPolymorphicSerializer<Node>(Node::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Node> {
        return when {
            "type" in element.jsonObject -> {
                val nodeType = element.jsonObject["type"]?.jsonPrimitive?.contentOrNull
                when (nodeType) {
                  
                    "ClassProperty" -> ClassProperty.serializer()

                    "PrivateProperty" -> PrivateProperty.serializer()

                    "Param" -> Param.serializer()

                    "Constructor" -> Constructor.serializer()

                    "ClassMethod" -> ClassMethod.serializer()

                    "PrivateMethod" -> PrivateMethod.serializer()

                    "StaticBlock" -> StaticBlock.serializer()

                    "Decorator" -> Decorator.serializer()

                    "ClassDeclaration" -> ClassDeclaration.serializer()

                    "VariableDeclaration" -> VariableDeclaration.serializer()

                    "VariableDeclarator" -> VariableDeclarator.serializer()

                    "Identifier" -> Identifier.serializer()

                    "OptionalChainingExpression" -> OptionalChainingExpression.serializer()

                    "OptionalChainingCall" -> OptionalChainingCall.serializer()

                    "ThisExpression" -> ThisExpression.serializer()

                    "ArrayExpression" -> ArrayExpression.serializer()

                    "ObjectExpression" -> ObjectExpression.serializer()

                    "UnaryExpression" -> UnaryExpression.serializer()

                    "UpdateExpression" -> UpdateExpression.serializer()

                    "BinaryExpression" -> BinaryExpression.serializer()

                    "FunctionExpression" -> FunctionExpression.serializer()

                    "ClassExpression" -> ClassExpression.serializer()

                    "AssignmentExpression" -> AssignmentExpression.serializer()

                    "MemberExpression" -> MemberExpression.serializer()

                    "SuperPropExpression" -> SuperPropExpression.serializer()

                    "ConditionalExpression" -> ConditionalExpression.serializer()

                    "CallExpression" -> CallExpression.serializer()

                    "NewExpression" -> NewExpression.serializer()

                    "SequenceExpression" -> SequenceExpression.serializer()

                    "ArrowFunctionExpression" -> ArrowFunctionExpression.serializer()

                    "YieldExpression" -> YieldExpression.serializer()

                    "AwaitExpression" -> AwaitExpression.serializer()

                    "TemplateLiteral" -> TemplateLiteral.serializer()

                    "TaggedTemplateExpression" -> TaggedTemplateExpression.serializer()

                    "TemplateElement" -> TemplateElement.serializer()

                    "ParenthesisExpression" -> ParenthesisExpression.serializer()

                    "PrivateName" -> PrivateName.serializer()

                    "TsAsExpression" -> TsAsExpression.serializer()

                    "TsSatisfiesExpression" -> TsSatisfiesExpression.serializer()

                    "TsTypeAssertion" -> TsTypeAssertion.serializer()

                    "TsConstAssertion" -> TsConstAssertion.serializer()

                    "TsNonNullExpression" -> TsNonNullExpression.serializer()

                    "SpreadElement" -> SpreadElement.serializer()

                    "Super" -> Super.serializer()

                    "Import" -> Import.serializer()

                    "MetaProperty" -> MetaProperty.serializer()

                    "BindingIdentifier" -> BindingIdentifier.serializer()

                    "ArrayPattern" -> ArrayPattern.serializer()

                    "ObjectPattern" -> ObjectPattern.serializer()

                    "AssignmentPattern" -> AssignmentPattern.serializer()

                    "RestElement" -> RestElement.serializer()

                    "JSXMemberExpression" -> JSXMemberExpression.serializer()

                    "JSXNamespacedName" -> JSXNamespacedName.serializer()

                    "JSXEmptyExpression" -> JSXEmptyExpression.serializer()

                    "JSXExpressionContainer" -> JSXExpressionContainer.serializer()

                    "JSXSpreadChild" -> JSXSpreadChild.serializer()

                    "JSXOpeningElement" -> JSXOpeningElement.serializer()

                    "JSXClosingElement" -> JSXClosingElement.serializer()

                    "JSXAttribute" -> JSXAttribute.serializer()

                    "JSXText" -> JSXText.serializer()

                    "JSXElement" -> JSXElement.serializer()

                    "JSXFragment" -> JSXFragment.serializer()

                    "JSXOpeningFragment" -> JSXOpeningFragment.serializer()

                    "JSXClosingFragment" -> JSXClosingFragment.serializer()

                    "StringLiteral" -> StringLiteral.serializer()

                    "BooleanLiteral" -> BooleanLiteral.serializer()

                    "NullLiteral" -> NullLiteral.serializer()

                    "RegExpLiteral" -> RegExpLiteral.serializer()

                    "NumericLiteral" -> NumericLiteral.serializer()

                    "BigIntLiteral" -> BigIntLiteral.serializer()

                    "ExportDefaultExpression" -> ExportDefaultExpression.serializer()

                    "ExportDeclaration" -> ExportDeclaration.serializer()

                    "ImportDeclaration" -> ImportDeclaration.serializer()

                    "ExportAllDeclaration" -> ExportAllDeclaration.serializer()

                    "ExportNamedDeclaration" -> ExportNamedDeclaration.serializer()

                    "ExportDefaultDeclaration" -> ExportDefaultDeclaration.serializer()

                    "ImportDefaultSpecifier" -> ImportDefaultSpecifier.serializer()

                    "ImportNamespaceSpecifier" -> ImportNamespaceSpecifier.serializer()

                    "NamedImportSpecifier" -> NamedImportSpecifier.serializer()

                    "ExportNamespaceSpecifier" -> ExportNamespaceSpecifier.serializer()

                    "ExportDefaultSpecifier" -> ExportDefaultSpecifier.serializer()

                    "NamedExportSpecifier" -> NamedExportSpecifier.serializer()

                    "Module" -> Module.serializer()

                    "Script" -> Script.serializer()

                    "KeyValuePatternProperty" -> KeyValuePatternProperty.serializer()

                    "AssignmentPatternProperty" -> AssignmentPatternProperty.serializer()

                    "KeyValueProperty" -> KeyValueProperty.serializer()

                    "GetterProperty" -> GetterProperty.serializer()

                    "SetterProperty" -> SetterProperty.serializer()

                    "MethodProperty" -> MethodProperty.serializer()

                    "AssignmentProperty" -> AssignmentProperty.serializer()

                    "ComputedPropName" -> ComputedPropName.serializer()

                    "BlockStatement" -> BlockStatement.serializer()

                    "ExpressionStatement" -> ExpressionStatement.serializer()

                    "EmptyStatement" -> EmptyStatement.serializer()

                    "DebuggerStatement" -> DebuggerStatement.serializer()

                    "WithStatement" -> WithStatement.serializer()

                    "ReturnStatement" -> ReturnStatement.serializer()

                    "LabeledStatement" -> LabeledStatement.serializer()

                    "BreakStatement" -> BreakStatement.serializer()

                    "ContinueStatement" -> ContinueStatement.serializer()

                    "IfStatement" -> IfStatement.serializer()

                    "SwitchStatement" -> SwitchStatement.serializer()

                    "ThrowStatement" -> ThrowStatement.serializer()

                    "TryStatement" -> TryStatement.serializer()

                    "WhileStatement" -> WhileStatement.serializer()

                    "DoWhileStatement" -> DoWhileStatement.serializer()

                    "ForStatement" -> ForStatement.serializer()

                    "ForInStatement" -> ForInStatement.serializer()

                    "ForOfStatement" -> ForOfStatement.serializer()

                    "SwitchCase" -> SwitchCase.serializer()

                    "CatchClause" -> CatchClause.serializer()

                    "TsTypeAnnotation" -> TsTypeAnnotation.serializer()

                    "TsTypeParameterDeclaration" -> TsTypeParameterDeclaration.serializer()

                    "TsTypeParameter" -> TsTypeParameter.serializer()

                    "TsTypeParameterInstantiation" -> TsTypeParameterInstantiation.serializer()

                    "TsParameterProperty" -> TsParameterProperty.serializer()

                    "TsQualifiedName" -> TsQualifiedName.serializer()

                    "TsCallSignatureDeclaration" -> TsCallSignatureDeclaration.serializer()

                    "TsConstructSignatureDeclaration" -> TsConstructSignatureDeclaration.serializer()

                    "TsPropertySignature" -> TsPropertySignature.serializer()

                    "TsGetterSignature" -> TsGetterSignature.serializer()

                    "TsSetterSignature" -> TsSetterSignature.serializer()

                    "TsMethodSignature" -> TsMethodSignature.serializer()

                    "TsIndexSignature" -> TsIndexSignature.serializer()

                    "TsKeywordType" -> TsKeywordType.serializer()

                    "TsThisType" -> TsThisType.serializer()

                    "TsFunctionType" -> TsFunctionType.serializer()

                    "TsConstructorType" -> TsConstructorType.serializer()

                    "TsTypeReference" -> TsTypeReference.serializer()

                    "TsTypePredicate" -> TsTypePredicate.serializer()

                    "TsImportType" -> TsImportType.serializer()

                    "TsTypeQuery" -> TsTypeQuery.serializer()

                    "TsTypeLiteral" -> TsTypeLiteral.serializer()

                    "TsArrayType" -> TsArrayType.serializer()

                    "TsTupleType" -> TsTupleType.serializer()

                    "TsTupleElement" -> TsTupleElement.serializer()

                    "TsOptionalType" -> TsOptionalType.serializer()

                    "TsRestType" -> TsRestType.serializer()

                    "TsUnionType" -> TsUnionType.serializer()

                    "TsIntersectionType" -> TsIntersectionType.serializer()

                    "TsConditionalType" -> TsConditionalType.serializer()

                    "TsInferType" -> TsInferType.serializer()

                    "TsParenthesizedType" -> TsParenthesizedType.serializer()

                    "TsTypeOperator" -> TsTypeOperator.serializer()

                    "TsIndexedAccessType" -> TsIndexedAccessType.serializer()

                    "TsMappedType" -> TsMappedType.serializer()

                    "TsLiteralType" -> TsLiteralType.serializer()

                    "TsTemplateLiteralType" -> TsTemplateLiteralType.serializer()

                    "TsInterfaceDeclaration" -> TsInterfaceDeclaration.serializer()

                    "TsInterfaceBody" -> TsInterfaceBody.serializer()

                    "TsExpressionWithTypeArguments" -> TsExpressionWithTypeArguments.serializer()

                    "TsTypeAliasDeclaration" -> TsTypeAliasDeclaration.serializer()

                    "TsEnumDeclaration" -> TsEnumDeclaration.serializer()

                    "TsEnumMember" -> TsEnumMember.serializer()

                    "TsModuleDeclaration" -> TsModuleDeclaration.serializer()

                    "TsModuleBlock" -> TsModuleBlock.serializer()

                    "TsNamespaceDeclaration" -> TsNamespaceDeclaration.serializer()

                    "TsImportEqualsDeclaration" -> TsImportEqualsDeclaration.serializer()

                    "TsExternalModuleReference" -> TsExternalModuleReference.serializer()

                    "TsExportAssignment" -> TsExportAssignment.serializer()

                    "TsNamespaceExportDeclaration" -> TsNamespaceExportDeclaration.serializer()

                    "TsInstantiation" -> TsInstantiation.serializer()

                    "Invalid" -> Invalid.serializer()
                    else -> throw SerializationException("$nodeType Not Ast Node Type")
                }
            }
            else -> {
                throw SerializationException("Not Valid Tree Node")
            }
        }
    }
}