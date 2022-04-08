// Generated from D:/OneDrive/��ѧ/6 ������/����ԭ�������/ʵ��/ʵ��4/lab4\C.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(CParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(CParser.Postfix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#argument_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expression_list(CParser.Argument_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(CParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(CParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(CParser.Cast_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(CParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(CParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(CParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(CParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(CParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(CParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(CParser.Exclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(CParser.Inclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(CParser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(CParser.Logical_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(CParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(CParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(CParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(CParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifiers(CParser.Declaration_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declaration_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifier(CParser.Declaration_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#init_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_list(CParser.Init_declarator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator(CParser.Init_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_class_specifier(CParser.Storage_class_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(CParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_or_union_specifier(CParser.Struct_or_union_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#struct_or_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_or_union(CParser.Struct_or_unionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration_list(CParser.Struct_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(CParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifier_qualifier_list(CParser.Specifier_qualifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator_list(CParser.Struct_declarator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#struct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator(CParser.Struct_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enum_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_specifier(CParser.Enum_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumerator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator_list(CParser.Enumerator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(CParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier(CParser.Type_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#function_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_specifier(CParser.Function_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#alignment_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignment_specifier(CParser.Alignment_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#direct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_declarator(CParser.Direct_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(CParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#type_qualifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier_list(CParser.Type_qualifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parameter_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_type_list(CParser.Parameter_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(CParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(CParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(CParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(CParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#abstract_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_declarator(CParser.Abstract_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_abstract_declarator(CParser.Direct_abstract_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(CParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_list(CParser.Initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(CParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#designator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator_list(CParser.Designator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(CParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(CParser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(CParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#block_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item_list(CParser.Block_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item(CParser.Block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(CParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(CParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(CParser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(CParser.Jump_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(CParser.Translation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#external_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_declaration(CParser.External_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(CParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_list(CParser.Declaration_listContext ctx);
}