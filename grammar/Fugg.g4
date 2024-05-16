grammar Fugg;	

program: prog* main EOF ;
main: MAIN block ;
prog: func | classDec | globalVarDec ;
func: FUNC fHeader fArgs block ;
rType: VOID | type ;
type: INT
	| DOUBLE
	| STRING
	| CHAR
	| BOOLEAN
	| ID
	;
fHeader: rType ('[' ']')* ID ;
visibilty: PUBLIC | PRIVATE ;
fArgs: '(' argList? ')';
argList: type arraySize* ID (',' type arraySize* ID)*;
arraySize: '[' INT_NUM ']'
	| '[' ']'
	;
classDec: CLASS ID (ISA ID (',' ID)*)? '{' classInsides* '}';
classInsides:  classConst
	| (visibilty classField)
	| (visibilty method)
	;
classConst: CONST ID fArgs block ;
classField: FIELD type arraySize* ID ';' ;
varDec: VAR type arraySize* ID (',' ID)* ('=' expr)? ;

method: METH fHeader fArgs block ;
globalVarDec: GLOBAL type arraySize* ID '=' (list | constExpr) ';' ;

block: '{' stmt* '}' ;
stmt: ifStmt
	| whileStmt
	| forStmt
	| switchCase
	| label
	| block
	| (varDec | expr | jumpStmt | assignSmt | doWhileStmt) ';'
	;
check: '(' expr ')' ;
assignSmt: ID | thisAccess index* assignOP expr ;
ifStmt: IF check block (ELSE (ifStmt | block))? ;
whileStmt: WHILE check block ;
doWhileStmt: DO block WHILE check ;
forStmt: FOR '(' (varDec | expr)? ';' expr? ';' expr? ')' block ;
jumpStmt: BREAK
	| CONTINUE
	| GOTO ID
	| RETURN expr? ;
label: LABEL ID block ;
switchCase: SWITCH check '{' caseBlock+ '}' ;
caseBlock: CASE constExpr ':' block
	| DEFAULT ':' block
	;


list: '{' constExpressions '}'
	| '{' subList (',' subList)+ '}'
	;
subList: '{' constExpressions '}' ;
constExpressions: constExpr (',' constExpr)* ;


expr: expr OR join 						# orExpr
	| join 								# loneJoin
	| expr postOP 						# postExpr
	;
join: join AND equality					# andExpr
	| equality 							# loneEq
	;
equality: equality EQ rel 				# EQExpr
	| rel                               # loneRel
	;
rel: rel logicOp logic					# logicExpr
	| logic                             # loneLogic
	;
logic: logic ADD term					# add_sub_modExpr
	| term 								# loneTerm
	;
term: term MULT expo 					# mul_div_modExpr
	| expo                              # loneExpo
	;
expo: expo EXPO unary 					# expoExpr
	| unary                             # loneUnary
	;
unary: NOT_NEG unary					# not_negExpr
	| factor 							# loneFactor
	;
factor: '(' expr ')'					# parentExpr
	| constant                          # loneConstant
	| idNest							# loneID
	| fCall                             # loneFCall
	| methCall							# loneMethCall
	| createObject                      # loneCreateObj
	| listExpr							# loneListExpr
	| constExpr							# constExprInExpr
	;

createObject: NEW ID aParams index* ;
idNest: ID | thisAccess index* ;
thisAccess: THIS ('.' ID)* ;
index: '[' expr ']' ;
fCall:  ID aParams ;
methCall: (idNest | createObject) ('.' ID aParams index*)+ ;
aParams: '(' (expr (',' expr)*)? ')' ;

listExpr: '{' exprs '}'
	| '{' subListExpr (',' subListExpr)+ '}'
	;
subListExpr: '{' exprs '}' ;
exprs: expr (',' expr)* ;

constant: CHAR_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL | DOUBLE_NUM | INT_NUM ;
logicOp: '<' | '<=' | '>' | '>=' ;
assignOP: '=' | '+=' | '-=' | '*=' | '/=' | '^=' | '%=' ;
postOP: '++' | '--' ;

constExpr: constExpr OR constJoin | constJoin ;
constJoin: constJoin AND constEquality | constEquality;
constEquality: constEquality EQ constRel | constRel;
constRel: constRel logicOp constLogic | constLogic ;
constLogic: constLogic ADD constTerm | constTerm ;
constTerm: constTerm MULT constExpo | constExpo ;
constExpo: constExpo EXPO constUnary | constUnary ;
constUnary: NOT_NEG constUnary | constFactor ;
constFactor: '(' constExpr ')'
	| constant
	| list ;


//tökens
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

OR: 'or' | '||' ;
AND: 'and' | '&&' ;
NOT_NEG: 'not' | '!' | '-' ;
EQ: '==' | 'is' | '!=' | 'is not' ;
ADD: '+' | '-' ;
MULT: '*' | '/' | '%' ;
EXPO: '^' ;

INT: 'int';
DOUBLE: 'double';
STRING: 'String';
CHAR: 'char';
BOOLEAN: 'boolean';

TRUE: 'true' ;
FALSE: 'false' ;
THIS: 'this' ;
NULL: 'null' ;
NEW: 'new' ;

INT_NUM: [0-9]+ ;
DOUBLE_NUM: INT_NUM '.' INT_NUM;
CHAR_LITERAL: '\'' . '\'';
STRING_LITERAL: '"' .*? '"';
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
COMMENT: '//' ~[\r\n]* -> skip ;
BIG_COMMENT: '/*' .*? '*/' -> skip ;
WS: [ \t\n\r\f]+ -> skip ;
