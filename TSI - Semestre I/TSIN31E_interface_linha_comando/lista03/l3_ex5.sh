#!/usr/bin/bash

read -p "Informe o valor de A: " a
read -p "Informe o valor de B: " b
read -p "Informe o valor de C: " c

soma_ab=$((a+b))
soma_ac=$((a+c))
soma_bc=$((b+c))

echo -n "Valores lidos: A=$a, B=$b, C=$c - Pode formar um triângulo: "

if [ $soma_ab -gt $c ] && [ $soma_ac -gt $b ] && [ $soma_bc -gt $a ]; then
    echo "Sim"
else 
    echo "Não"
fi
