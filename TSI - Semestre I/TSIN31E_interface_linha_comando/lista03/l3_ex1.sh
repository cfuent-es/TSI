#!/usr/bin/bash
read -p "Insira o primeiro valor: " a
read -p "Insira o segundo valor: " b
read -p "Insira o terceiro valor: " c
if [ $a -gt $b -a $a -gt $c ]; then
	echo "O maior valor é o primeiro:" $a
elif [ $b -gt $a -a $b -gt $c ]; then
	echo "O maior valor é o segundo:" $b
else 
	echo "O maior valor é o terceiro:" $c
fi
