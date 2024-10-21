<?php

if(isset($_POST['tabuada'])) {
    $tabuada = (int) $_POST['tabuada'];
    for($i = 0; $i <= 10; $i++)
    {
        echo "{$tabuada} \t* \t{$i} = " . $tabuada * $i . "<br>";
    }
}

/*
echo "Insira o número para a tabuada: ";
$tabuada = (int) fgets(STDIN);

for($i = 0; $i <= 10; $i++)
{
    echo "{$tabuada} \t* \t{$i} = " . $tabuada * $i . "\n";
}*/

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista 1 - Ex 3</title>
</head>
<body>
    <form action="" method="post">
        Insira o número para a tabuada: <input type="text" name="tabuada" id="tabuada"> <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>