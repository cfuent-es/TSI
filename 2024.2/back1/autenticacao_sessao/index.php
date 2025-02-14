<?php

    session_start();
    if (!isset($_SESSION['usuario_id'])) {
        header('Location: login.php');
        exit();
    }

    require_once('conexao.php');

    $sql = "
        Select * from usuarios
    ";

    $resultado = mysqli_query($conexao, $sql);

    // Informações da sessão
    $session_id = session_id();
    $session_expiration = ini_get("session.gc_maxlifetime");
    $session_expiration_time = date('d/m/Y H:i:s', time() + $session_expiration);

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
        <h1>Lista de Usuários</h1>

        <div class="alert alert-info" role="alert">
            Logado como: <?php echo $_SESSION['usuario_nome']; ?><br>
            ID da Sessão: <?php echo $session_id; ?><br>
            Expiração da Sessão: <?php echo $session_expiration_time; ?>
        </div>

        <table class="table">
            <thead>
                <tr>
                    <th style="width: 5%;" scope="col" class="text-center">ID</th>
                    <th style="width: 35%;" scope="col" class="text-center">Nome</th>
                    <th style="width: 20%;"  scope="col" class="text-center">E-mail</th>
                    <th style="width: 15%;"  scope="col" class="text-center">Data Criação</th>
                    <th style="width: 15%;" scope="col" class="text-center">Ações</th>
                </tr>
            </thead>
            <tbody>
                <?php while ($usuario = mysqli_fetch_assoc($resultado)) { ?>
                    <tr>
                        <td class="text-center"><?php echo $usuario['id']; ?></td>
                        <td><?php echo $usuario['nome']; ?></td>
                        <td class="text-center"><?php echo $usuario['email']; ?></td>
                        <td class="text-center"><?php echo date('d/m/Y H\hi\m\i\ns', strtotime($usuario['data_criacao'])); ?></td>
                        <td class="text-center">
                            <a href="edit.php?id=<?php echo $usuario['id']; ?>" class="btn btn-sm btn-primary">Editar</a>
                            <a href="delete.php?id=<?php echo $usuario['id']; ?>" class="btn btn-sm btn-danger" onclick="return confirm('Tem certeza que deseja excluir este item?');">Excluir</a>
                        </td>
                    </tr>
                <?php } ?>
            </tbody>
        </table>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>