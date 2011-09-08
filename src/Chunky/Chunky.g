grammar Chunky;

options {
	//language = Java;
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
	:	IF '(' cond=expr ')' if_body=block
		( 'else' (	a=if_expr	-> ^(IF $cond $if_body $a)
				 |	b=block		-> ^(IF $cond $if_body $b)
				 )
		|						-> ^(IF $cond $if_body)
		)
	;

term:	ID
	|	'('! expr ')'!
	|	INT
	|	FLOAT
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

mul :	not (('*' | '/')^ not)*
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

STRING
	:	'"' (~'"'|'\\"')* '"'
	;

IF	:	'if' ;

FUNC:	'func' ;

ID	:	(LETTER | '_') (LETTER | DIGIT | '_')*
		;

INT	:	DIGIT+;

FLOAT
	:	(DIGIT)* (('.' DIGIT+)=>('.' DIGIT+) | { $type = INT; })
	;

WS	:	( ' '
		| '\t'
		| '\r'
		| '\n'
		) {$channel=99;}
		;

DOT	:	'.';

fragment
LETTER	: ('a'..'z'|'A'..'Z') ;

fragment
DIGIT	: '0'..'9' ;