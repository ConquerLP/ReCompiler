grammar ReFugg;

//bodys
program: (func | classDec | globalVar | label)* main EOF ;
main: MAIN block ;

//function
func: FUNC fHeader fParam block ;
fHeader: returntype ('[' ']')* identifier ;
fParam: '(' argList? ')' ;
argList: complexType identifier (',' complexType identifier)* ;

//class
classDec: CLASS identifier poly? 
	'{' complexClassInsides* '}' ;
complexClassInsides: visibilty classInsides+ ;
classInsides: classConstructor | classField | method ;
poly: ISA identifier (',' identifier)* ;
visibilty: PUBLIC | PRIVATE | PROTECTED ;
classConstructor: CONST identifier fParam block ;
method: METH fHeader fParam block ;
classField: FIELD typemodifier? complexType identifier ';' ;

//programflow & statements
block: '{' stmt* '}' ;
stmt: ifStmt
	| whileStmt
	| doWhileStmt ';'
	| forStmt
	| switchCase
	| label
	| block
	| varDec ';'
	| expression ';'
	| jumpStmt ';'
	;
ifStmt: IF check stmt (ELSE stmt)? ;
whileStmt: WHILE check block ;
doWhileStmt: DO block WHILE check ;
forStmt: FOR '(' (varDec | orExpression)? ';' orExpression? ';' orExpression? ')' block ;
jumpStmt: BREAK
	| CONTINUE
	| GOTO identifier
	| RETURN orExpression?
	;
label: LABEL identifier block ;
switchCase: SWITCH check '{' caseBlock+ '}' ;
caseBlock: CASE constExpr ':' block
	| DEFAULT ':' block
	;
check: '(' orExpression ')' ;

//declaration & assignment
varDec: complexType identifier ('=' orExpression)? ;

//static declarations
globalVar: GLOBAL typemodifier? complexType identifier '=' constExpr ';' ;

constArray: '[' constExpr? ']' ;

constList: '{' constExprMany '}'
	| '{' constSubList (',' constSubList)+ '}'
	;
constSubList: '{' constExprMany '}' ;
constExprMany: constExpr (',' constExpr)* ;
constVar: identifier ;
constArrayAccess: identifier ('[' constExpr ']')+ ;

constExpr: constExpr orOP constJoin | constJoin ;
constJoin: constJoin andOP constEQ | constEQ ;
constEQ: constEQ eqOP constRel | constRel ;
constRel: constRel relOP constLogic | constLogic ;
constLogic: constLogic addOP constTerm | constTerm ;
constTerm: constTerm multOP constExpo | constExpo ;
constExpo: constExpo expOP constUnary | constUnary ;
constUnary: preOP constFactor | constFactor;
constFactor:  constant
	| '(' constExpr ')'
	| constList
	| constVar
	| constArrayAccess
	;

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

//const & type
returntype: VOID
	| complexType
	;

//Operators
assignOP: '=' | '+=' | '-=' | '*=' | '/=' | '%=' ;
orOP: '||' | 'or' ;
andOP: '&&' | 'and' ;
eqOP: '==' | '!=' | 'is' | 'is not' ;
relOP: '<' | '<=' | '>' | '>=' ;
addOP: '+' | '-' ;
multOP: '*' | '/' | '%' ;
expOP: '^' ;
preOP: '!' | '-' | '+' ;
postOP: '++' | '--' ;

constant: doubleRule | intRule | stringRule | charRule | booleanRule | refRule ;
complexType: type constArray* ;
type: 'double' | 'int' | 'string' | 'char' | 'boolean' | identifier ;
identifier: ID ;
typemodifier: STATIC | FINAL ;

doubleRule: DOUBLE_LIT ;
intRule: INT_LIT ;
stringRule: STRING_LIT ;
charRule: CHAR_LIT ;
booleanRule: TRUE | FALSE ;
refRule: THIS | NULL ;

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
FINAL: 'final' ;

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