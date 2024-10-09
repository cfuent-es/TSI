#!/usr/bin/bash

read -p "Entre com o RA do aluno: " ra
read -p "Entre como nome do aluno: " nome
read -p "Entre com a quantidade de aulas dadas: " aulas
read -p "Entre com a quantidade de faltas do atleta: " faltas

read -p "Entrem com a nota da P1: " p1
read -p "Entrem com a nota da P2: " p2
read -p "Entrem com a nota da P3: " p3
read -p "Entrem com a nota da P4: " p4

media=$(( ((p1 * 2) + (p2 * 3) + (p3 * 1) + (p4 * 4)) / 10 ))
freq=$(( 100 - (( faltas * 100) / aulas) ))

if [ media -lt 6 ] && [ freq -lt 75 ]; then
    sit="Reprovado por Média e Frequencia"
elif [ media -ge 6 ] && [ freq -lt 75 ]; then
    sit="Reprovado por Frequencia"
elif [ media -lt 6 ] && [ freq -ge 75 ]; then
    sit="Reprovado por Nota"
elif [ media -ge 6 ] && [ freq -ge 75 ]; then
    sit="Aprovado por Nota e Frequencia"
fi

echo -e "\nAluno: $ra - $nome"
echo -e "Notas: P1: $p1\tP2: $p2\tP3: $p3\tP4: $p4\t\tMédia Final: $media"
echo -e "Aulas dadas: $aulas\t\tFaltas:$faltas\t\tFrequência: $freq%"
echo "---------------------------------------------------------------"
echo -e "Situação: $sit\n"