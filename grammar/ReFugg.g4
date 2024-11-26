grammar ReFugg;

//bodys
program: (func | classDec | globalVar | label)* main EOF ;
main: MAIN block ;

//function
func: FUNC fHeader fParam block ;
fHeader: returntype ('[' ']')* identifier ;
fParam: '(' argList? ')' ;
arg: type constArray* identifier ;
argList: arg (',' arg)* ;

//class
classDec: CLASS identifier poly? 
	'{' (visibilty classInside+)* '}' ;
classInside: (classConstructor | classField | method) ;
poly: ISA identifier (',' identifier)* ;
visibilty: PUBLIC | PRIVATE | PROTECTED ;
classConstructor: CONST identifier fParam block ;
method: METH fHeader fParam block ;
classField: FIELD typemodifier type constArray* identifier SEMI ;

//programflow & statements
block: '{' stmt* '}' ;
stmt: ifStmt
	| whileStmt
	| doWhileStmt SEMI
	| forStmt
	| switchCase
	| label
	| block
	| varDec SEMI
	| expression SEMI
	| jumpStmt SEMI
	;
ifStmt: IF check stmt (ELSE stmt)? ;
whileStmt: WHILE check block ;
doWhileStmt: DO block WHILE check ;
forStmt: FOR '(' (varDec | orExpression)? SEMI orExpression? SEMI orExpression? ')' block ;
jumpStmt: BREAK
	| CONTINUE
	| GOTO identifier
	| RETURN expression?
	;
label: LABEL identifier block ;
switchCase: SWITCH check '{' caseBlock+ '}' ;
caseBlock: CASE constExpr ':' block
	| DEFAULT ':' block
	;
check: '(' orExpression ')' ;

//declaration & assignment
varDec: typemodifier? type constArray* identifier ('=' (orExpression | list))? ;

//static declarations
globalVar: GLOBAL typemodifier? type constArray* identifier '=' (constExpr | constList) SEMI ;

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
	| constVar
	| constArrayAccess
	;

//expression
arrayAccess: '[' expression ']' ;
methodCall: '.' identifier fArgs arrayAccess* exprTail* ;
newObject: NEW identifier fArgs arrayAccess* exprTail* ;
fCall: identifier fArgs arrayAccess* exprTail* ;

thisAcces: THIS exprTail* ;
varAcces: identifier arrayAccess* exprTail* ;
exprTail: (('.' identifier) | methodCall) arrayAccess* ;
lh_expression: thisAcces | varAcces ;

expression: lh_expression assignOP (expression | list) | orExpression;
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
    | constant
    ;

list: '{' expressionMany '}'
    | '{' subList (',' subList)+ '}' ;
subList: '{' expressionMany '}' ;
expressionMany: orExpression (',' orExpression)*;
fArgs: '(' expressionMany? ')' ;

//const & type
returntype: VOID | type ;

constant: doubleRule | intRule | stringRule | charRule | booleanRule | refRule ;
type: 'double' | 'int' | 'string' | 'char' | 'boolean' | identifier	;
identifier: ID ;
typemodifier: FINAL ;

doubleRule: DOUBLE_LIT ;
intRule: INT_LIT ;
stringRule: STRING_LIT ;
charRule: CHAR_LIT ;
booleanRule: TRUE | FALSE ;
refRule: NULL ;

assignOP: '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '**=' ;
orOP: '||' | 'or' ;
andOP: '&&' | 'and' ;
eqOP: '==' | '!=' ;
relOP: '<' | '<=' | '>' | '>=' ;
addOP: '+' | '-' ;
multOP: '*' | '/' | '%' ;
expOP: '^' | '**' ;
preOP: '!' | 'not' | '-' | '+' ;
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
SEMI: ';' ;

ID: [a-zA-Z_][a-zA-Z_0-9]* ;
COMMENT: '//' ~[\r\n]* -> skip ;
BIG_COMMENT: '/*' .*? '*/' -> skip ;
WS: [ \t\n\r\f]+ -> skip ;