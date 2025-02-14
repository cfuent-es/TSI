<?php

    session_start();
    if (!isset($_SESSION['usuario_id'])) {
        header('Location: login.php');
        exit();
    }

    require_once('conexao.php');

    if($_POST){
        $nome = $_POST['nome'];
        $email = $_POST['email'];
        $senha = password_hash($_POST['senha'], PASSWORD_DEFAULT);

        $sql = "
            Insert into usuarios (nome, email, senha, data_criacao)
            Values ('$nome', '$email', '$senha', now())
        ";

        $resultado = mysqli_query($conexao, $sql);

        if($resultado){
            header('Location: index.php');
        } else {
            echo "Erro ao criar novo usuário";
        }
    }

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Autenticação - Sessão</title>
</head>
<body>

    <?php require_once('header.php'); ?>
    
    
    <div class="container mt-5">
        <h1>Novo Usuário</h1>
        <form method="POST">
            <div class="mb-3">
                <label for="nome" class="form-label">Nome</label>
                <input type="text" class="form-control" id="nome" name="nome">
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">E-mail</label>
                <input type="email" class="form-control" id="email" name="email">
            </div>
            <div class="mb-3">
                <label for="senha" class="form-label">Senha</label>
                <input type="password" class="form-control" id="senha" name="senha">
            </div>
            <button type="submit" class="btn btn-primary">Salvar</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>