<?php

echo "Insira o número para a tabuada: ";
$tabuada = (int) fgets(STDIN);

for($i = 0; $i <= 10; $i++)
{
    echo "{$tabuada} \t* \t{$i} = " . $tabuada * $i . "\n";
}