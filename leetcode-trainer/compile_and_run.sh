#!/bin/bash
set -e
SRC="src/main/java"
OUT="out"
rm -rf $OUT && mkdir -p $OUT
echo "Compiling..."
find $SRC -name "*.java" | xargs javac -d $OUT
echo "Running..."
java -cp $OUT trainer.core.Trainer
