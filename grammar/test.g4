grammar test;

rule: (expression ';')* ;

arrayAccess: '[' expression ']' ;
methodCall: identifier fArgs ;
newObject: NEW identifier fArgs arrayAccess* ('.' (identifier | methodCall) arrayAccess*)* ;
fCall: identifier fArgs arrayAccess* ('.' (identifier | methodCall) arrayAccess*)* ;

thisAcces: THIS ('.' (identifier | methodCall) arrayAccess*)* ;
varAcces: identifier arrayAccess* ('.' (identifier | methodCall) arrayAccess*)* ;

lh_expression: thisAcces | varAcces ;

expression: lh_expression assignOP expression | orExpression;
orExpression: orExpression orOP andExpression | andExpression;
andExpression: andExpression andOP equalityExpression | equalityExpression;
equalityExpression: equalityExpression eqOP relationalExpression | relationalExpression;
relationalExpression: relationalExpression relOP additiveExpression | additiveExpression;
additiveExpression: additiveExpression addOP multiplicativeExpression | multiplicativeExpression;
multiplicativeExpression: multiplicativeExpression multOP exponentiationExpression | exponentiationExpression;
exponentiationExpression: exponentiationExpression expOP unaryExpression | unaryExpression;
unaryExpression: preOP unaryExpression | postExpression;
postExpression: primary postOP | primary;
primary: '(' orExpression ')'
    | newObject
    | fCall
    | varAcces
    | thisAcces
    | list
    | constant
    ;

list: '{' expressionMany '}'
    | '{' subList (',' subList)+ '}' ;
subList: '{' expressionMany '}' ;
expressionMany: orExpression (',' orExpression)*;
fArgs: '(' expressionMany? ')' ;

constant: doubleRule | intRule | stringRule | charRule | booleanRule | refRule ;
type: 'double' | 'int' | 'string' | 'char' | 'boolean' | identifier	;
identifier: ID ;
typemodifier: STATIC ;

doubleRule: DOUBLE_LIT ;
intRule: INT_LIT ;
stringRule: STRING_LIT ;
charRule: CHAR_LIT ;
booleanRule: TRUE | FALSE ;
refRule: THIS | NULL ;

assignOP: '=' | '+=' | '-=' | '*=' | '/=' | '%=' ;
orOP: '||' | 'or' ;
andOP: '&&' | 'and' ;
eqOP: '==' | '!=' ;
relOP: '<' | '<=' | '>' | '>=' ;
addOP: '+' | '-' ;
multOP: '*' | '/' | '%' ;
expOP: '^' ;
preOP: '!' | '-' | '+' ;
postOP: '++' | '--' ;

//Tokens
MAIN: 'main:' ;
FUNC: 'func:' ;
CLASS: 'class:' ;
VOID: 'void' ;
FIELD: 'field:' ;
VAR: 'var:' ;
GLOBAL: 'global:' ;
METH: 'method:' ;
CONST: 'constructor:' ;
ISA: 'isa:' ;

PRIVATE: 'private:' ;
PUBLIC: 'public:' ;
PROTECTED: 'protected:' ;
STATIC: 'static' ;

IF: 'if' ;
ELSE: 'else' ;
WHILE: 'while';
DO: 'do' ;
FOR: 'for' ;
CONTINUE: 'continue' ;
BREAK: 'break' ;
GOTO: 'goto' ;
RETURN: 'return' ;
LABEL: 'label:' ;
SWITCH: 'switch' ;
CASE: 'case' ;
DEFAULT: 'default' ;

TRUE: 'true' ;
FALSE: 'false' ;
THIS: 'this' ;
NULL: 'null' ;
NEW: 'new' ;

//MISC
INT_LIT: [0-9]+ ;
DOUBLE_LIT: INT_LIT '.' INT_LIT;
CHAR_LIT: '\'' . '\'';
STRING_LIT: '"' .*? '"';

ID: [a-zA-Z_][a-zA-Z_0-9]* ;
COMMENT: '//' ~[\r\n]* -> skip ;
BIG_COMMENT: '/*' .*? '*/' -> skip ;
WS: [ \t\n\r\f]+ -> skip ;