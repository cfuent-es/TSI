<?php
session_start();
$mensagem = '';

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    require_once('conexao.php');

    $email = $_POST['email'];
    $senha = $_POST['senha'];

    $sql = "SELECT * FROM usuarios WHERE email = ?";
    $stmt = $conexao->prepare($sql);
    $stmt->bind_param('s', $email);
    $stmt->execute();
    $resultado = $stmt->get_result();

    if ($resultado->num_rows > 0) {
        $usuario = $resultado->fetch_assoc();
        if (password_verify($senha, $usuario['senha'])) {
            $_SESSION['usuario_id'] = $usuario['id'];
            $_SESSION['usuario_nome'] = $usuario['nome'];
            header('Location: index.php');
            exit();
        } else {
            $mensagem = "Senha incorreta.";
        }
    } else {
        $mensagem = "Usuário não encontrado.";
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
        <h1>Login</h1>

        <div class="p-3">
            <div class="alert alert-warning" role="alert">
                Caso ainda não tenha um usuário cadastrado, use o e-mail <strong>usuario@email.com</strong> e a senha <strong>123456</strong>.
            </div>
        </div>
        

        <?php if ($mensagem): ?>
            <div class="alert alert-danger" role="alert">
                <?php echo $mensagem; ?>
            </div>
        <?php endif; ?>

        <form action="login.php" method="post">
            <div class="mb-3">
                <label for="email" class="form-label">E-mail</label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>
            <div class="mb-3">
                <label for="senha" class="form-label">Senha</label>
                <input type="password" class="form-control" id="senha" name="senha" required>
            </div>
            <button type="submit" class="btn btn-primary">Entrar</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>