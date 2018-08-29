grammar Simple;

function: FUNCTION ID BRACKET_OPEN
		sentence*
 BRACKET_CLOSE;
		
sentence: var_decl | var_assign | println;

var_decl: DECLARE ID SEMICOLON;
var_assign: ID ASSIGN NUMBER SEMICOLON | ID ASSIGN ID SEMICOLON | ID ASSIGN STRING SEMICOLON;
println: PRINTLN NUMBER SEMICOLON | PRINTLN ID SEMICOLON;


 
 

 

FUNCTION: 'function';
DECLARE: 'declare';

PRINTLN: 'println';
PRINT: 'print';
READ: 'read';

WHILE: 'while';
IF: 'if';
ELSE: 'else';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
POW: '^';

AND: 'and';
OR: 'or';
NOT: 'not';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '<>';


ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';
QUOTATION_MARKS: '"';

ID: [a-zA-Z_][a-zA-Z0-9]*;
NUMBER: [0-9]+;
STRING: ["][^"]["];



WSA
:
	[ \t\r\n]+ -> skip
;
