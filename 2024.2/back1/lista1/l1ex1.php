<?php

if(isset($_POST['n1']) && isset($_POST['n2']) && isset($_POST['n3']) && isset($_POST['n4']) && isset($_POST['n5'])) {
    $ar = array($_POST['n1'], $_POST['n2'], $_POST['n3'], $_POST['n4'], $_POST['n5']);
    array_multisort($ar);
    echo "O maior valor é: " . $ar[4] . "\n";
}

/*
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

echo "O maior valor é: " . $ar[4] . "\n";*/

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista 1 - Ex 1</title>
</head>
<body>
    <form action="" method="post">
        Número 1: <input type="text" name="n1" id="n1"> <br>
        Número 2: <input type="text" name="n2" id="n2"> <br>
        Número 3: <input type="text" name="n3" id="n3"> <br>
        Número 4: <input type="text" name="n4" id="n4"> <br>
        Número 5: <input type="text" name="n5" id="n5"> <br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>