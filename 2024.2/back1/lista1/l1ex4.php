<?php

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
echo "Total da compra: R$ " . number_format($total, 2, ',', '.') . "\n\n";