<?php

echo "Insira o valor a fatorar: ";
$fatorial = (int) fgets(STDIN);

for($i = ($fatorial - 1); $i > 0; $i--)
{
    echo "{$fatorial} * {$i} = ";
    $fatorial =  $fatorial * $i;
    echo "{$fatorial}\n";
}

echo "Total: {$fatorial}\n";