#!/usr/bin/bash

read -p "Informe o nome do arquivo/diretório: " arquivo

if [ ! -e $arquivo ]; then
    echo "Arquivo/diretório não existe"
    exit 1;
fi

if [ -d $arquivo ]; then
    echo "É um diretório"
    exit 0;
elif [ -f $arquivo ]; then
    echo "É um arquivo comum"
    exit 0;
else 
    echo "É outro tipo de arquivo"
    exit 1;
fi