cd ..
copy ReFugg.g4 testFiles
cd testFiles

del *.java
del *.class
del *.log
del *.interp
del *.tokens

antlr4 ReFugg.g4 -visitor -encoding ascii
