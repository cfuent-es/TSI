#!/usr/bin/bash
read -p "Qual a sua idade em dias: " dias
anos=$((dias/360))
sobra=$((dias%360))
meses=$((sobra/30))
sobra=$((sobra%30))
echo "Você tem completos" $anos "ano(s)," $meses "mes(es) e" $sobra "dia(s)."
