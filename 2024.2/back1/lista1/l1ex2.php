<?php

if(isset($_POST['fatorial'])) {
    $fatorial = (int) $_POST['fatorial'];
    for($i = ($fatorial - 1); $i > 0; $i--)
    {
        echo "{$fatorial} * {$i} = ";
        $fatorial =  $fatorial * $i;
        echo "{$fatorial}<br>";
    }
    echo "Total: {$fatorial}<br>";
}
/*
echo "Insira o valor a fatorar: ";
$fatorial = (int) fgets(STDIN);

for($i = ($fatorial - 1); $i > 0; $i--)
{
    echo "{$fatorial} * {$i} = ";
    $fatorial =  $fatorial * $i;
    echo "{$fatorial}\n";
}

echo "Total: {$fatorial}\n";*/

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista 1 - Ex 2</title>
</head>
<body>
    <form action="" method="post">
        Insira o valor a fatorar: <input type="text" name="fatorial" id="fatorial"> <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>