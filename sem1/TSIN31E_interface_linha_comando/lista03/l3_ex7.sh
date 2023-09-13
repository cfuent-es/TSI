#!/usr/bin/bash

read -p "Qual a idade do atleta? " idade

if [ $idade -ge 5 ] && [ $idade -le 7 ]; then
    categoria="Infantil A"
elif [ $idade -ge 8 ] && [ $idade -le 10 ]; then
    categoria="Infantil B"
elif [ $idade -ge 11 ] && [ $idade -le 13 ]; then
    categoria="Juvenil A"
elif [ $idade -ge 14 ] && [ $idade -le 17 ]; then
    categoria="Juvenil B"
elif [ $idade -ge 18 ] && [ $idade -le 60 ]; then
    categoria="Adulto"
elif [ $idade -gt 60 ]; then
    categoria="Sênior"
else 
    categoria="Idade fornecida não possui categoria"
fi

echo "A idade informada foi de $idade - Categoria: $categoria"