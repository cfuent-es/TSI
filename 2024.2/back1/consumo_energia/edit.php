<?php 

require_once('conexao.php');

if ($_POST) {
    $id = $_POST['id'];
    $nome = $_POST['nome'];
    $cpf = $_POST['cpf'];
    $sexo = $_POST['sexo'];
    $nascimento = $_POST['nascimento'];
    $endereco = $_POST['endereco'];
    $numero = $_POST['numero'];
    $bairro = $_POST['bairro'];
    $cep = $_POST['cep'];
    $email = $_POST['email'];
    $site = $_POST['site'];
    $data_vencimento = $_POST['data_vencimento'];
    $unidade_consumidora = $_POST['unidade_consumidora'];
    $kvh = $_POST['kvh'];
    $valor_total = $_POST['valor_total'];

    $sql = "UPDATE consumo_energia SET 
        nome = '$nome',
        cpf = '$cpf',
        sexo = '$sexo',
        nascimento = '$nascimento',
        endereco = '$endereco',
        numero = '$numero',
        bairro = '$bairro',
        cep = '$cep',
        email = '$email',
        site = '$site',
        data_vencimento = '$data_vencimento',
        unidade_consumidora = '$unidade_consumidora',
        kvh = '$kvh',
        valor_total = '$valor_total'
        WHERE id = $id
    ";

    mysqli_query($conexao, $sql);

    header('Location: index.php');
}

if ($_GET) {
    $id = $_GET['id'];

    $sql = "SELECT * FROM consumo_energia WHERE id = $id";

    $resultado = mysqli_query($conexao, $sql);

    $consumo = mysqli_fetch_assoc($resultado);
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Formulário Consumo Energia</title>
</head>
<body>
  
    <?php require_once('header.php'); ?>

    <div class="container mt-5">
        <h1>Editar Consumo de Energia</h1>
        <form action="edit.php" method="post">
            <input type="hidden" name="id" value="<?php echo $consumo['id']; ?>">
            <div class="row">
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="nome" class="form-label">Nome</label>
                        <input type="text" class="form-control" id="nome" name="nome" value="<?php echo $consumo['nome']; ?>">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="cpf" class="form-label">CPF</label>
                        <input type="text" class="form-control" id="cpf" name="cpf" value="<?php echo $consumo['cpf']; ?>">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="sexo" class="form-label">Sexo</label>
                        <select class="form-select" id="sexo" name="sexo">
                            <option value="M" <?php if ($consumo['sexo'] == 'M') { echo 'selected'; } ?>>Masculino</option>
                            <option value="F" <?php if ($consumo['sexo'] == 'F') { echo 'selected'; } ?>>Feminino</option>
                        </select>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="nascimento" class="form-label">Data de Nascimento</label>
                        <input type="date" class="form-control" id="nascimento" name="nascimento" value="<?php echo $consumo['nascimento']; ?>">
                    </div>
                </div>
            </div>
            <div class="mb-3">
                <label for="endereco" class="form-label">Endereço</label>
                <input type="text" class="form-control" id="endereco" name="endereco" value="<?php echo $consumo['endereco']; ?>">
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="numero" class="form-label">Número</label>
                        <input type="text" class="form-control" id="numero" name="numero" value="<?php echo $consumo['numero']; ?>">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="bairro" class="form-label">Bairro</label>
                        <input type="text" class="form-control" id="bairro" name="bairro" value="<?php echo $consumo['bairro']; ?>">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="cep" class="form-label">CEP</label>
                        <input type="text" class="form-control" id="cep" name="cep" value="<?php echo $consumo['cep']; ?>">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="email" class="form-label">E-mail</label>
                        <input type="email" class="form-control" id="email" name="email" value="<?php echo $consumo['email']; ?>">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="site" class="form-label">Site</label>
                        <input type="text" class="form-control" id="site" name="site" value="<?php echo $consumo['site']; ?>">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="data_vencimento" class="form-label
                        ">Data de Vencimento</label>
                        <input type="date" class="form-control" id="data_vencimento" name="data_vencimento" value="<?php echo $consumo['data_vencimento']; ?>">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="unidade_consumidora" class="form-label">Unidade Consumidora</label>
                        <input type="text" class="form-control" id="unidade_consumidora" name="unidade_consumidora" value="<?php echo $consumo['unidade_consumidora']; ?>">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="kvh" class="form-label">kVh</label>
                        <input type="text" class="form-control" id="kvh" name="kvh" value="<?php echo $consumo['kvh']; ?>">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="mb-3">
                        <label for="valor_total" class="form-label">Valor Total</label>
                        <input type="text" class="form-control" id="valor_total" name="valor_total" value="<?php echo $consumo['valor_total']; ?>">
                    </div>
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Salvar</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
