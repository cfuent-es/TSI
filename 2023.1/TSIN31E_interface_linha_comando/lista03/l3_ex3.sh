#!/usr/bin/bash
read -p "Informe a string: " string
string_size=${#string}

if [ $string_size -eq 0 ]; then
	echo "A string está vazia"
    exit 1;
elif [ $string_size -ge 1 -a $string_size -le 5 ]; then
    echo "A string é curta. Quantidade de caracteres:" $string_size
elif [ $string_size -ge 6 -a $string_size -le 15 ]; then
    echo "A string é adequada. Quantidade de caracteres:" $string_size
else
    echo "A string é muito comprida. Quantidade de caracteres:" $string_size
fi