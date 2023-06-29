#!/usr/bin/bash

read -p "Informe o valor de A: " a
read -p "Informe o valor de B: " b
read -p "Informe o valor de C: " c

read -p "Informe: 1 p/ ordem crescente, 2 p/ ordem decrescente, 3 p/ maior no meio: " i

ordem_crescente_ou_meio() {
    if (( $(bc <<< "$a > $b") )); then
        aux=$a
        a=$b
        b=$aux
    fi

    if (( $(bc <<< "$a > $c ") )); then
        aux=$a
        a=$c
        c=$aux
    fi

    if (( $(bc <<< "$b > $c") )); then
        aux=$b
        b=$c
        c=$aux
    fi

    if [ $i == 3 ]; then
        aux=$b
        b=$c
        c=$aux
    fi
}

ordem_decrescente() {
    if (( $(bc <<< "$a < $b") )); then
        aux=$a
        a=$b
        b=$aux
    fi

    if (( $(bc <<< "$a < $c") )); then
        aux=$a
        a=$c
        c=$aux
    fi

    if (( $(bc <<< "$b < $c") )); then
        aux=$b
        b=$c
        c=$aux
    fi
}

echo -n "Valores informados: A=$a, B=$b, C=$c - Opção i=$i - "

if [ $i == 1 ]; then
    ordem_crescente_ou_meio
    echo "Ordem crescente: $a | $b | $c"
elif [ $i == 2 ]; then
    ordem_decrescente
    echo "Ordem decrescente: $a | $b | $c"
elif [ $i == 3 ]; then
    ordem_crescente_ou_meio
    echo "Maior no meio: $a | $b | $c"
fi

