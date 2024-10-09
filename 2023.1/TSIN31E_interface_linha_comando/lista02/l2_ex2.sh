#!/usr/bin/bash
read -p "Entre com o valor de A: " a
read -p "Entre com o valor de B: " b
let "quadrado_diff = (a*a) - (2*a*b) + (b*b)"
echo "O quadrado da diferença de" $a "por" $b "é igual a:" $quadrado_diff
