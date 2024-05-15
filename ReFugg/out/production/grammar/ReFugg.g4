grammar ReFugg;

//bodys
program: (func | classDec | globalVar | label)* main EOF ;
main: MAIN block ;

//function
func: FUNC fHeader fParam block ;
fHeader: returntype ('[' ']')* identifier ;
fParam: '(' argList? ')' ;
argList: type constArray* identifier (',' type constArray* identifier)* ;

//class
classDec: CLASS identifier poly? 
	'{' (classConstructor | (visibilty classField) | (visibilty method))* '}' ;
poly: ISA identifier (',' identifier)* ;
visibilty: PUBLIC | PRIVATE | PROTECTED ;
classConstructor: CONST identifier fParam block ;
method: METH fHeader fParam block ;
classField: FIELD type constArray* identifier ';' ;

//programflow & statements
block: '{' stmt* '}' ;
stmt: ifStmt				# ifStatement
	| whileStmt				# whileStatement
	| doWhileStmt ';'		# doWhileStatement
	| forStmt				# forStatement
	| switchCase			# switchStatement
	| label					# labelStatement
	| block					# blockStatement
	| varDec ';'			# varDecStatement
	| assign ';'			# asssignStatement
	| expr ';'				# exprStatement
	| jumpStmt ';'			# jumpStatement
	;
ifStmt: IF check block (ELSE (ifStmt | block))? ;
whileStmt: WHILE check block ;
doWhileStmt: DO block WHILE check ;
forStmt: FOR '(' (varDec | expr)? ';' expr? ';' expr? ')' block ;
jumpStmt: BREAK			# breakStatement
	| CONTINUE			# continueStatement
	| GOTO identifier			# gotoStatement
	| RETURN expr? 		# returnStatement
	;	
label: LABEL identifier block ;
switchCase: SWITCH check '{' caseBlock+ '}' ;
caseBlock: CASE constExpr ':' block		# caseStatement
	| DEFAULT ':' block					# defaultStatement
	;
check: '(' expr ')' ;

//declaration & assignment
varDec: VAR type identifier constArray* ('=' expr)? ;
assign: identifier index assignOP expr 
	| thisAccess index assignOP expr 
	;

//static declarations
globalVar: GLOBAL type identifier constArray* ';' 					# globalNoInit
	| GLOBAL type identifier  constArray* '=' constExpr ';' 		# globalYesInit
	;

constArray: '[' constExpr ']' 				# constKnownArraysize
	| '[' ']' 								# constUnknownArraysize
	;

constList: '{' constExprMany '}' 				# constListNoSub
	| '{' constSubList (',' constSubList)+ '}' 	# constListYesSub
	;
constSubList: '{' constExprMany '}' ;
constExprMany: constExpr (',' constExpr)* ;

constExpr: constExpr or constJoin | constJoin ;
constJoin: constJoin and constEQ | constEQ ;
constEQ: constEQ eqOP constRel | constRel ;
constRel: constRel logicOp constLogic | constLogic ;
constLogic: constLogic add constTerm | constTerm ;
constTerm: constTerm mult constExpo | constExpo ;
constExpo: constExpo expoOp constUnary | constUnary ;
constUnary: notNeg constFactor | constFactor;
constFactor:  constant 			# constExprConst
	| '(' constExpr ')' 		# constExprParenth
	| constList					# constExprList
	;

//declarations
expr: expr or join 
	| join 
	;
join: join and eq 
	| eq 
	;
eq: eq eqOP rel 
	| rel 
	;
rel: rel logicOp logic 
	| logic
	;
logic: logic add term 
	| term
	;
term: term mult expo 
	| expo
	;
expo: expo expoOp unary
	| unary
	;
unary: notNeg factor
	| factor
	;
factor: '(' expr ')'			#exprParenth
	| fCall						#exprfCall
	| methCall 					#exprmethCall
	| identifier postOP?		#expridentifier
	| identifier index postOP?	#expridentifierIndex
	| create					#exprCreate
	| constant 					#exprConstant
	| thisAccess postOP?		#exprThis
	| list 						#exprList
	;

fCall: identifier fArgs ;
methCall: identifier index methCallTail+	#MethCallidentifier
	| thisAccess methCallTail+		#MethCallThis
	;
methCallTail: '.' fCall index ;	
	
create: NEW identifier fArgs index methCallTail* ;
fArgs: '(' (expr (',' expr)*)? ')' ;	
index: ('[' expr ']')* ;  	
thisAccess: THIS ('.' identifier index)* ;

//list
list: '{' exprMany '}' 					#exprListNoSub
	| '{' subList (',' subList)+ '}' 	#exprListYesSub
	;
subList: '{' exprMany '}' ;
exprMany: expr (',' expr)* ;
	
//const & type
returntype: VOID 
	| type
	;
	
//Operators
logicOp: '<' | '<=' | '>' | '>=' ;
assignOP: '=' | '+=' | '-=' | '*=' | '/=' | '^=' | '%=' ;
postOP: '++' | '--' ;	
	
constant: doubleRule | intRule | stringRule | charRule | TRUE | FALSE | THIS | NULL ;	
type: 'double' | 'int' | 'string' | 'char' | 'boolean' | identifier	;
identifier: ID ;

doubleRule: DOUBLE_LIT ;
intRule: INT_LIT ;
stringRule: STRING_LIT ;
charRule: CHAR_LIT ;
	
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

or: 'or' | '||' ;
and: 'and' | '&&' ; 
notNeg: 'not' | '!' | '-' ;
eqOP: '==' | 'is' | '!=' | 'is not' ;
add: '+' | '-' ;
mult: '*' | '/' | '%' ;
expoOp: '^' ;

//MISC
INT_LIT: [0-9]+ ;
DOUBLE_LIT: INT_LIT '.' INT_LIT;
CHAR_LIT: '\'' . '\'';
STRING_LIT: '"' .*? '"';

ID: [a-zA-Z_][a-zA-Z_0-9]* ;
COMMENT: '//' ~[\r\n]* -> skip ; 
BIG_COMMENT: '/*' .*? '*/' -> skip ;
WS: [ \t\n\r\f]+ -> skip ;