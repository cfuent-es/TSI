#!/usr/bin/bash
let num=$RANDOM
echo "O número de \$RANDOM é" $num
let num=$num%100
echo "Valores entre 0 e 100 usando módulo" $num
