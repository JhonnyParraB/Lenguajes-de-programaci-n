grammar Simple;

start: 'hello' 'world';
declaracion: 'declare';
retorno: 'return';



asignacion: '=';
suma: '+';
resta: '-';
multiplicacion: '*';
division: '/';
exponente: '^';

si: 'if';
sino: 'else';

mayor: '>';
menor: '<';
menorigual: '<=';
mayorigual: '>=';
comparacion: '==';
diferente: '<>';

imprimir: 'println';






WS
:
	[ \t\r\n]+ -> skip
;
