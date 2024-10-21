<?php

$total = 0;

if(isset($_POST['produto'])) {
    $compras = $_POST['produto'];
    foreach($compras as $compra)
    {
        switch($compra)
        {
            case 'arroz':
                $total += 25.9;
                break;
            case 'oleo':
                $total += 89.9;
                break;
            case 'kuat':
                $total += 34.9;
                break;
            case 'feijao':
                $total += 38.5;
                break;
            case 'acucar':
                $total += 12.9;
                break;
            case 'cafe':
                $total += 78.9;
                break;
        }
    }
    echo "Total da compra: R$ " . number_format($total, 2, ',', '.') . "<br>";
}

/*
echo "Escolha a quantidade de produtos:\n";

echo "Arroz 5 Kg (R$ 25,90): ";
$compras['Arroz']['valor'] = 25.9;
$compras['Arroz']['qtd'] = (int) fgets(STDIN);

echo "Caixa de óleo de soja com 10 (R$ 89,90): ";
$compras['Caixa de óleo']['valor'] = 89.9;
$compras['Caixa de óleo']['qtd'] = (int) fgets(STDIN);

echo "Fardo guaraná Kuat 8 unidades (R$ 34.90): ";
$compras['Fardo Guaraná Kuat']['valor'] = 34.9;
$compras['Fardo Guaraná Kuat']['qtd'] = (int) fgets(STDIN);

echo "Feijão carioquinha 10 Kg (R$ 38,50): ";
$compras['Feijão carioquinha 10 Kg']['valor'] = 38.5;
$compras['Feijão carioquinha 10 Kg']['qtd'] = (int) fgets(STDIN);


echo "Açucar mascavo 5kg (R$ 12,90): ";
$compras['Açucar mascavo 5kg']['valor'] = 12.9;
$compras['Feijão carioquinha 10 Kg']['qtd'] = (int) fgets(STDIN);

echo "Fardo café com 10 unidades (R$ 78,90): ";
$compras['Fardo café']['valor'] = 78.9;
$compras['Fardo café']['qtd'] = (int) fgets(STDIN);

$total = 0;
foreach($compras as $item => $compra)
{
    if($compra['qtd'] > 0)
    {
        echo "Item:\t{$item}\n";
        echo "Quantidade: {$compra['qtd']} - Total: " . $compra['qtd'] * $compra['valor'] . "\n\n";
        $total += $compra['qtd'] * $compra['valor'];
    }
}
echo "Total da compra: R$ " . number_format($total, 2, ',', '.') . "\n\n";*/

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista 1 - Ex 4</title>
</head>
<body>
    <form action="" method="post">
        <label>
            <input type="checkbox" name="produto[]" value="arroz">
            Arroz 5 Kg (R$ 25,90)
        </label><br>
        <label>
            <input type="checkbox" name="produto[]" value="oleo">
            Caixa de óleo de soja com 10 (R$ 89,90)
        </label><br>
        <label>
            <input type="checkbox" name="produto[]" value="kuat">
            Fardo guaraná Kuat 8 unidades (R$ 34.90)
        </label><br>
        <label>
            <input type="checkbox" name="produto[]" value="feijao">
            Feijão carioquinha 10 Kg  (R$ 38,50)
        </label><br>
        <label>
            <input type="checkbox" name="produto[]" value="acucar">
            Açucar mascavo 5kg (R$ 12,90)
        </label><br>
        <label>
            <input type="checkbox" name="produto[]" value="cafe">
            Fardo café com 10 unidades (R$ 78,90)
        </label><br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>