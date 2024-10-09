<?php

echo "Insira o primeiro valor: ";
$ar[0] = fgets(STDIN);

echo "Insira o segundo valor: ";
$ar[1] = fgets(STDIN);

echo "Insira o terceiro valor: ";
$ar[2] = fgets(STDIN);

echo "Insira o quarto valor: ";
$ar[3] = fgets(STDIN);

echo "Insira o quinto valor: ";
$ar[5] = fgets(STDIN);

array_multisort($ar);

echo "O maior valor é: " . $ar[4] . "\n";