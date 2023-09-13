#!/usr/bin/bash

read -p "Informe um número até 1000: " num

if [ $num -gt 1000 ]; then
    echo "Número inválido. Apenas números até 1000 são aceitos"
    exit 1
fi

centenas=$(( num / 100 ))
num_=$(( num - (centenas * 100) ))
dezenas=$(( num_ / 10 ))
unidades=$(( num_ - (dezenas * 10) ))

echo "$num = $centenas centena(s), $dezenas dezena(s), $unidades unidade(s)"