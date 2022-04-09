grammar C;

primary_expression
    : IDENTIFIER
    | CONSTANT
    | STRING_LITERAL
    | '(' expression ')'
    ;

postfix_expression
    : primary_expression
    ('[' expression ']'
    | '(' argument_expression_list? ')'
    | '.' IDENTIFIER
    | '->' IDENTIFIER
    | '*' IDENTIFIER
    | '++'
    | '--')*
    ;

argument_expression_list
    : assignment_expression
    (',' assignment_expression)*
    ;

unary_expression
    : ('++' | '--' | 'sizeof')*
    ( postfix_expression
    | unary_operator cast_expression
    | 'sizeof' '(' type_name ')')
    ;

unary_operator
    : '&'
    | '*'
    | '+'
    | '-'
    | '~'
    | '!'
    ;

cast_expression
    : unary_expression
    | '(' type_name ')' cast_expression
    ;

multiplicative_expression
    : cast_expression
    ( '*' cast_expression
    | '/' cast_expression
    | '%' cast_expression
    )*
    ;

additive_expression
    : multiplicative_expression
    ( '+' multiplicative_expression
    | '-' multiplicative_expression
    )*
    ;

shift_expression
    : additive_expression
    ( '<<' additive_expression
    | '>>' additive_expression
    )*
    ;

relational_expression
    : shift_expression
    ('<' shift_expression
    | '>' shift_expression
    | '<=' shift_expression
    | '>=' shift_expression
    )*
    ;

equality_expression
    : relational_expression
    ( '==' relational_expression
    | '!=' relational_expression
    )*
    ;

and_expression
    : equality_expression
    ( '&' equality_expression)*
    ;

exclusive_or_expression
    : and_expression
    ( '^' and_expression )*
    ;

inclusive_or_expression
    : exclusive_or_expression
    ( '|' exclusive_or_expression )*
    ;

logical_and_expression
    : inclusive_or_expression
    ( '&&' inclusive_or_expression )*
    ;

logical_or_expression
    : logical_and_expression
    ( '||' logical_and_expression )*
    ;

conditional_expression
    : logical_or_expression
    | logical_or_expression '?' expression ':' conditional_expression
    ;

assignment_expression
    : conditional_expression
    | unary_expression assignment_operator assignment_expression
    ;

assignment_operator
    : '='
    | '*='
    | '/='
    | '%='
    | '+='
    | '-='
    | '<<='
    | '>>='
    | '&='
    | '^='
    | '|='
    ;

expression
    : assignment_expression (',' assignment_expression)*
    ;

constant_expression
    : conditional_expression
    ;

declaration
    : declaration_specifiers init_declarator_list? ';'
    ;

declaration_specifiers
    : declaration_specifier+;

declaration_specifier
    : storage_class_specifier
    | type_specifier
    | type_qualifier
    | function_specifier
    | alignment_specifier
    ;

init_declarator_list
    : init_declarator (',' init_declarator)*
    ;

init_declarator
    : declarator ('=' initializer)?
    ;

storage_class_specifier
    : TYPEDEF
    | EXTERN
    | STATIC
    | AUTO
    | REGISTER
    ;

type_specifier
    : VOID
    | CHAR
    | SHORT
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    | SIGNED
    | UNSIGNED
    | BOOL
    | COMPLEX
    | struct_or_union_specifier
    | enum_specifier
    | TYPEDEF_NAME
    ;

struct_or_union_specifier
    : struct_or_union IDENTIFIER? '{' struct_declaration_list '}'
    | struct_or_union IDENTIFIER
    ;

struct_or_union
    : STRUCT
    | UNION
    ;

struct_declaration_list
    : struct_declaration+
    ;

struct_declaration
    : specifier_qualifier_list struct_declarator_list? ';'
    ;

specifier_qualifier_list
    : (type_specifier | type_qualifier)+
    ;

struct_declarator_list
    : struct_declarator (',' struct_declarator)*
    ;

struct_declarator
    : declarator
    | declarator ':' constant_expression
    ;

enum_specifier
    : ENUM '{' enumerator_list '}'
    | ENUM IDENTIFIER '{' enumerator_list '}'
    | ENUM IDENTIFIER
    ;

enumerator_list
    : enumerator
    | enumerator_list ',' enumerator
    ;

enumerator
    : IDENTIFIER
    | IDENTIFIER '=' constant_expression
    ;

type_qualifier
    : CONST
    | VOLATILE
    | RESTRICT
    ;

function_specifier
    : INLINE
    | NORETURN
    ;

alignment_specifier
    : ALIGNAS '(' type_name ')'
    | ALIGNAS constant_expression
    ;

declarator
    : pointer? direct_declarator
    ;

direct_declarator
    : IDENTIFIER
    | '(' declarator ')'
    | direct_declarator '[' type_qualifier_list? assignment_expression? ']'
    | direct_declarator '(' parameter_type_list ')'
    | direct_declarator '(' identifier_list ')'
    | direct_declarator '(' ')'
    ;

pointer
    : '*' type_qualifier_list?
    ;

type_qualifier_list
    : type_qualifier+
    ;

parameter_type_list
    : parameter_list (',' parameter_list)*
    ;

parameter_list
    : parameter_declaration (',' parameter_declaration)*
    ;

parameter_declaration
    : declaration_specifiers (declarator | abstract_declarator)?
    ;

identifier_list
    : IDENTIFIER (',' IDENTIFIER)*
    ;

type_name
    : specifier_qualifier_list abstract_declarator
    ;

abstract_declarator
    : pointer
    | direct_abstract_declarator
    | pointer direct_abstract_declarator
    ;

direct_abstract_declarator
    : '(' abstract_declarator ')'
    | '[' ']'
    | '[' type_qualifier_list assignment_expression ']'
    | '[' type_qualifier_list ']'
    | '[' assignment_expression ']'
    | '[' ']'
    | direct_abstract_declarator '[' ']'
    | direct_abstract_declarator '[' type_qualifier_list assignment_expression ']'
    | direct_abstract_declarator '[' type_qualifier_list ']'
    | direct_abstract_declarator '[' assignment_expression ']'
    | direct_abstract_declarator '[' ']'
    | direct_abstract_declarator '(' parameter_type_list ')'
    | direct_abstract_declarator '(' identifier_list ')'
    | direct_abstract_declarator '(' ')'
    ;


initializer
    : assignment_expression
    | '{' initializer_list ','? '}'
    ;

initializer_list
    : initializer (',' initializer)*
    ;

statement
    : labeled_statement
    | compound_statement
    | expression_statement
    | selection_statement
    | iteration_statement
    | jump_statement
    ;

labeled_statement
    : IDENTIFIER ':' statement
    | CASE constant_expression ':' statement
    | DEFAULT ':' statement
    ;

compound_statement
    : '{' block_item_list? '}'
    ;

block_item_list
    : block_item+
    ;

block_item
    : declaration
    | statement
    ;

expression_statement
    : expression? ';'
    ;

selection_statement
    : IF '(' expression ')' statement
    | IF '(' expression ')' statement ELSE statement
    | SWITCH '(' expression ')' statement
    ;

iteration_statement
    : WHILE '(' expression ')' statement
    | DO statement WHILE '(' expression ')' ';'
    | FOR '(' expression_statement expression_statement ')' statement
    | FOR '(' expression_statement expression_statement expression ')' statement
    ;

jump_statement
    : GOTO IDENTIFIER ';'
    | CONTINUE ';'
    | BREAK ';'
    | RETURN ';'
    | RETURN expression ';'
    ;

translation_unit
    : external_declaration+
    ;

external_declaration
    : function_definition
    | declaration
    | ';'
    ;

function_definition
    : declaration_specifiers? declarator declaration_list? compound_statement
    ;

declaration_list
    : declaration+
    ;

TYPEDEF : 'typedef';
EXTERN : 'extern';
STATIC : 'static';
AUTO : 'auto';
REGISTER : 'register';
VOID : 'void';
CHAR : 'char';
SHORT : 'short';
INT : 'int';
LONG : 'long';
FLOAT : 'float';
DOUBLE : 'double';
SIGNED : 'signed';
UNSIGNED : 'unsigned';
BOOL : '_Bool';
COMPLEX : '_Complex';
STRUCT : 'struct';
UNION : 'union';
ENUM : 'enum';
CONST : 'const';
VOLATILE : 'volatile';
RESTRICT : 'restrict';
INLINE : 'inline';
NORETURN : '_Noreturn';
ALIGNAS : '_Alignas';
CASE : 'case';
DEFAULT : 'default';
IF : 'if';
ELSE : 'else';
SWITCH : 'switch';
WHILE : 'while';
DO : 'do';
FOR : 'for';
GOTO : 'goto';
CONTINUE : 'continue';
BREAK : 'break';
RETURN : 'return';

IDENTIFIER
    : IDENTIFIER_NONDIGIT
    ( IDENTIFIER_NONDIGIT
    | IDENTIFIER_DIGIT
    )*
    ;

CONSTANT
    : INTEGER_CONSTANT
    | FLOATING_CONSTANT
    | CHARACTER_CONSTANT
    | STRING_LITERAL
    ;

TYPEDEF_NAME : IDENTIFIER;

IDENTIFIER_NONDIGIT
    : NONDIGIT
    ;

NONDIGIT
    : '_'
    | 'a'..'z'
    | 'A'..'Z'
    ;

IDENTIFIER_DIGIT
    : DIGIT
    ;

DIGIT
    : '0'..'9'
    ;


fragment
INTEGER_CONSTANT
    : (HEX_CONSTANT
    | OCTAL_CONSTANT
    | DECIMAL_CONSTANT
    ) INTEGER_SUFFIX
    ;

HEX_CONSTANT
    : HEX_PREFIX HEX_DIGIT+
    ;

DECIMAL_CONSTANT
    : NONZERO_DIGIT DIGIT*
    | '0'
    ;

fragment
OCTAL_CONSTANT
    : '0' OCTAL_DIGIT+
    ;

fragment
HEX_PREFIX
    : '0' ('x' | 'X')
    ;

fragment
NONZERO_DIGIT
    : '1'..'9'
    ;

fragment
OCTAL_DIGIT
    : '0'..'7'
    ;

fragment
HEX_DIGIT
    : '0'..'9'
    | 'a'..'f'
    | 'A'..'F'
    ;

fragment
INTEGER_SUFFIX
    : 'u'
    | 'U'
    | 'l'
    | 'L'
    | 'll'
    | 'LL'
    ;

FLOATING_CONSTANT
    : DECIMAL_FLOATING_CONSTANT
    | HEX_FLOATING_CONSTANT
    ;

fragment
DECIMAL_FLOATING_CONSTANT
    : ( DIGIT+ EXPONENT?
    | FRACTIONAL_CONSTANT EXPONENT
    ) FLOATING_SUFFIX?
    ;

fragment
HEX_FLOATING_CONSTANT
    : HEX_PREFIX
    ( HEX_FRACTIONAL_CONSTANT
    | HEX_DIGIT+
    ) BINARY_EXPONENT FLOATING_SUFFIX?
    ;

fragment
FRACTIONAL_CONSTANT
    : DIGIT* '.' DIGIT*
    ;

fragment
EXPONENT
    : ( 'e' | 'E' ) SIGN? DIGIT+
    ;

fragment
SIGN
    : '+'
    | '-'
    ;

fragment
HEX_FRACTIONAL_CONSTANT
    : HEX_DIGIT* '.' HEX_DIGIT*
    ;

fragment
BINARY_EXPONENT
    : ( 'p' | 'P' ) SIGN? DIGIT+
    ;

fragment
FLOATING_SUFFIX
    : 'f'
    | 'F'
    | 'l'
    | 'L'
    ;

fragment
CHARACTER_CONSTANT
    : ( 'L' | 'u' | 'U' )? '\'' C_CHAR_SEQUENCE '\''
    ;

fragment
C_CHAR_SEQUENCE
    : C_CHAR+
    ;

fragment
C_CHAR
    : ESCAPE_SEQUENCE
    | ~['\\\r\n]
    ;

fragment
ESCAPE_SEQUENCE
    : SINGLE_ESCAPE_SEQUENCE
    | OCTAL_ESCAPE_SEQUENCE
    | HEX_ESCAPE_SEQUENCE
    ;

fragment
SINGLE_ESCAPE_SEQUENCE
    : '\\' ['"?abfnrtv\\]
    ;

fragment
OCTAL_ESCAPE_SEQUENCE
    : '\\' OCTAL_DIGIT OCTAL_DIGIT+ OCTAL_DIGIT+
    ;

fragment
HEX_ESCAPE_SEQUENCE
    : '\\x' HEX_DIGIT+
    ;

STRING_LITERAL
    : ENCODING_PREFIX? '"' S_CHAR_SEQUENCE '"'
    ;

fragment
ENCODING_PREFIX
    : 'u8'
    | 'u'
    | 'U'
    | 'L'
    ;

fragment
S_CHAR_SEQUENCE
    : S_CHAR+
    ;

fragment
S_CHAR
    : ~["\\\n]
    | ESCAPE_SEQUENCE
    ;

NEWLINE : '\r'?'\n' -> skip;
WS : (' ' | '\t')+ -> skip;