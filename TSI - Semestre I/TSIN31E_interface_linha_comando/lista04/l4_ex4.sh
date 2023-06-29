#!/usr/bin/bash

read -p "Quantos números Tribonacci serão exibidos? " n

a=0
b=0
c=1

for (( i = 1; i <= n; i++)); do
    echo -n "$c, "

    next=$(( a + b + c ))
    a=$b
    b=$c
    c=$next
done

echo -e "\n"