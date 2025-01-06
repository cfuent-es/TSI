<?php
session_start(); // Adicionando session_start() para iniciar a sessão
include 'config.php'; // Inclui a conexão com o banco

// Recuperar produtos e usuários para os selects
$produtos = $conn->query("SELECT id, nome, preco FROM produto");
$usuarios = $conn->query("SELECT id, nome FROM usuario");

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // Coleta os dados do primeiro formulário
    $produto_id = $_POST['produto_id'];
    $usuario_id = $_POST['usuario_id'];

    // Recuperar o preço do produto selecionado
    $produto = $conn->query("SELECT preco FROM produto WHERE id = '$produto_id'")->fetch_assoc();
    $preco_produto = $produto['preco'];

    // Armazena os dados da venda para o próximo formulário
    $_SESSION['produto_id'] = $produto_id;
    $_SESSION['usuario_id'] = $usuario_id;
    $_SESSION['preco_produto'] = $preco_produto;

    // Redireciona para o segundo formulário de condição de pagamento
    header('Location: condicao_pagamento.php');
    exit();
}
?>
