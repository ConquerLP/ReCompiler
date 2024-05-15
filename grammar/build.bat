del *.java
del *.class
del *.log
del *.interp
del *.tokens

antlr4 ReFugg.g4 -visitor -package ch.compiler.parser -o ../src/ch/compiler/parser -Werror
