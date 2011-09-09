grammar Chunky;

options {
//	language = Java;
	language = CSharp3;
	output = AST;
	ASTLabelType = CommonTree; 
}

tokens {
	BLOCK; PARAMS; ARGS; CALL;
}

@parser::namespace { Chunky }

@lexer::namespace { Chunky }


public program
	:	exprs
	;

params
	:	(p+=ID (',' p+=ID)*)?
		-> ^(PARAMS $p*)
	;

func_expr
	:	FUNC^ '('! params ')'! block
	;

if_expr
	:	IF '(' cond=expr ')' '{' (cons_exps+=expr? ';')* '}'
		( 'else' ( alt_if=if_expr						-> ^(IF $cond ^(BLOCK $cons_exps*) $alt_if)
				 | '{' (alt_exps+=expr? ';')* '}'		-> ^(IF $cond ^(BLOCK $cons_exps*) ^(BLOCK $alt_exps*))
				 )
		|												-> ^(IF $cond $cons_exps*)
		)
	;

term:	ID
	|	'('! expr ')'!
	|	INT
	|	FLOAT
	|	TRUE
	|	FALSE
	|	STRING
	|	if_expr
	|	func_expr
	;

dot
	:	term (DOT^ ID)* 
		('='^ expr)?
	;

args:	(b=expr (',' b=expr)*)?
		-> ^(ARGS $b)
	;

call:	(t=dot->$t)
		(
			'(' args ')'
			-> ^(CALL $call args)
		)*
	;

not	:	'!'^? call
	;

mul :	not (('*' | '/' | '%')^ not)*
	;

add :	mul (('+' | '-')^ mul)*
	;

comp:	add (('==' | '<' | '<=' | '>=' | '>' | '!=')^ add)*
	;

bool:	comp (('&' | '&&' | '|' | '||')^ comp)*
	;

expr:	bool
	;

exprs
	:	(e+=expr? ';')+ 
		-> ^(BLOCK $e*)
	;

block
	:	'{'! exprs? '}'!
	;


//   T O K E N S

TRUE	:	'true' ;

FALSE	:	'false' ;

IF	:	'if' ;

FUNC:	'func' ;

LPAREN	: '(';

RPAREN	: ')';

COMMA	: ',';

SEMI 	: ';';

PLUS 	: '+';

MINUS    : '-' ;

STAR    : '*' ;

SLASH    : '/' ;

PIPE	: '|' ;

DPIPE	: '||' ;

AMPER    : '&' ;

DAMPER :	'&&' ;

LESS    : '<' ;

GREATER    : '>' ;

ASSIGN    : '=' ;

PERCENT    : '%' ;

LCURLY    : '{' ;

RCURLY    : '}' ;

EQUAL    : '==' ;

NOTEQUAL    : '!=' ;

LESSEQUAL    : '<=' ;

GREATEREQUAL    : '>=' ;

DOT	:	'.' ;


fragment
LETTER	: ('a'..'z'|'A'..'Z') ;

fragment
DIGIT	: '0'..'9' ;

STRING :	'"' (~'"'|'\\"')* '"' ;

ID	:	(LETTER | '_') (LETTER | DIGIT | '_')* ;

INT	:	DIGIT+ ;

FLOAT :	(DIGIT)* (('.' DIGIT+)=>('.' DIGIT+) | { $type = INT; }) ;


WS	:	( ' '
		| '\t'
		| '\r'
		| '\n'
		) {$channel=99;}
		;