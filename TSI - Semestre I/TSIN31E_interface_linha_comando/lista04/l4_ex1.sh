#!/usr/bin/bash

echo -e "Números entre 0 e 100: while\n";

count=0

while [ $count -le 100 ]; do
    echo -n "$count "
    (( count++ ))
done

echo -e "\n\nNúmeros de 0 e 100: for e range\n"

for count in {0..100}; do
    echo -n "$count "
done
echo ""