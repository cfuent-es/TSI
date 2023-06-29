#!/usr/bin/bash

read -p "Qual a hora de início do jogo? " inicio_hora
read -p "Qual o minuto de início do jogo? " inicio_minutos

read -p "Qual a hora de término do jogo? " termino_hora
read -p "Qual o minuto de término do jogo? " termino_minutos

inicio=$(( (inicio_hora * 60) + inicio_minutos ))
termino=$(( (termino_hora * 60) + termino_minutos ))

total=$(( inicio - termino ))

# se positivo, jogo passou de um dia para outro - max 24h
if [ $total -ge 0 ]; then
    total=$(( 1440 - total ))
else 
    total=$(( total * -1 ))
fi

hora=$(( total / 60 ))
minutos=$(( total - ( hora * 60 ) ))

echo "Hora inicial => $inicio_hora:$inicio_minutos"
echo "Hora final => $termino_hora:$termino_minutos"
echo "Duração do jogo => $hora:$minutos"