#!/usr/bin/bash
read -p "Qual o comprimento em cm? " comprimento
read -p "Qual a larguda em cm? " largura
read -p "Qual a altura em cm? " altura
volume=$((comprimento * largura * altura))
echo "O volume da caixa é de" $volume " cm^3."
