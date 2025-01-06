<?php
include 'config.php';

// Lista de vendas com o JOIN correto
$vendas = $conn->query("
    SELECT venda.*, produto.nome AS produto_nome, usuario.nome AS usuario_nome
    FROM venda
    INNER JOIN produto ON venda.produto_id = produto.id
    INNER JOIN usuario ON venda.usuario_id = usuario.id
");

?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vendas Realizadas</title>
</head>
<body>
    <h1>Vendas Realizadas</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Produto</th>
                <th>Usuário</th>
                <th>Quantidade</th>
                <th>Total</th>
                <th>Condição de Pagamento</th>
                <th>Parcelas</th>
            </tr>
        </thead>
        <tbody>
            <?php while ($venda = $vendas->fetch_assoc()): ?>
                <tr>
                    <td><?= $venda['id'] ?></td>
                    <td><?= $venda['produto_nome'] ?></td>
                    <td><?= $venda['usuario_nome'] ?></td>
                    <td><?= $venda['quantidade'] ?></td>
                    <td><?= $venda['total'] ?></td>
                    <td><?= $venda['condicoes_pagamento'] ?></td>
                    <td><?= $venda['quantidade_parcelas'] ? $venda['quantidade_parcelas'] . 'x' : 'À vista' ?></td>
                </tr>
            <?php endwhile; ?>
        </tbody>
    </table>
</body>
</html>
