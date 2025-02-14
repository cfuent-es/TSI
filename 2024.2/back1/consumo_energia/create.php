<?php

require_once('conexao.php');

if ($_POST) {
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

    $sql = "INSERT INTO consumo_energia (
        nome, 
        cpf, 
        sexo, 
        nascimento, 
        endereco, 
        numero, 
        bairro, 
        cep,    
        email,
        site, 
        data_vencimento,
        unidade_consumidora,
        kvh,
        valor_total
    ) VALUES (
        '{$_POST['nome']}',
        '{$_POST['cpf']}',
        '{$_POST['sexo']}',
        '{$_POST['nascimento']}',
        '{$_POST['endereco']}',
        '{$_POST['numero']}',
        '{$_POST['bairro']}',
        '{$_POST['cep']}',
        '{$_POST['email']}',
        '{$_POST['site']}',
        '{$_POST['data_vencimento']}',
        '{$_POST['unidade_consumidora']}',
        '{$_POST['kvh']}',
        '{$_POST['valor_total']}'
    )
    ";

    mysqli_query($conexao, $sql);

    header('Location: index.php');
}

    //validação campo site
    if (isset($iste) && !filter_var($site, FILTER_VALIDATE_URL)) {
        $site_erro = "Site inválido";
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
        <form action="" method="post">

            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="nome" class="form-label">Nome:</label>
                    <input type="text" class="form-control" name="nome" id="nome" <?php if(isset($_POST['nome'])) echo "value=\"{$_POST['nome']}\"" ?> required>
                </div>
                <div class="col-md-6">
                    <label for="cpf" class="form-label">CPF:</label>
                    <input type="text" class="form-control" name="cpf" id="cpf" <?php if(isset($_POST['cpf'])) echo "value=\"{$_POST['cpf']}\"" ?> required>
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="sexo" class="form-label">Sexo:</label>
                    <select class="form-select" name="sexo" id="sexo" required>
                        <option value="">Selecione</option>
                        <option value="M">Masculino</option>
                        <option value="F">Feminino</option>
                    </select>
                </div>
                <div class="col-md-6">
                    <label for="nascimento" class="form-label">Data de Nascimento:</label>
                    <input type="date" class="form-control" name="nascimento" id="nascimento" required>
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-md-8">
                    <label for="endereco" class="form-label">Endereço:</label>
                    <input type="text" class="form-control" name="endereco" id="endereco" required>
                </div>
                <div class="col-md-4">
                    <label for="numero" class="form-label">Número:</label>
                    <input type="text" class="form-control" name="numero" id="numero" required>
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="bairro" class="form-label">Bairro:</label>
                    <input type="text" class="form-control" name="bairro" id="bairro" required>
                </div>
                <div class="col-md-6">
                    <label for="cep" class="form-label">CEP:</label>
                    <input type="text" class="form-control" name="cep" id="cep" required>
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="email" class="form-label">E-mail:</label>
                    <input type="email" class="form-control" name="email" id="email" required>
                </div>
                <div class="col-md-6">
                    <label for="site" class="form-label">Site:</label>
                    <input type="text" class="form-control" name="site" id="site" required>
                    <div class="text-danger">
                        <?php if (isset($site_erro)) echo $site_erro; ?>
                    </div>
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-md-3">
                    <label for="data_vencimento" class="form-label">Data de Vencimento:</label>
                    <input type="date" class="form-control" name="data_vencimento" id="data_vencimento" required>
                </div>
                <div class="col-md-3">
                    <label for="unidade_consumidora" class="form-label">Unid. Consumidora:</label>
                    <input type="number" class="form-control" name="unidade_consumidora" id="unidade_consumidora" required>
                </div>
                <div class="col-md-3">
                    <label for="kvh" class="form-label">KVh:</label>
                    <input type="text" class="form-control" name="kvh" id="kvh" required>
                </div>
                <div class="col-md-3">
                    <label for="valor_total" class="form-label">Valor Total:</label>
                    <input type="text" class="form-control" name="valor_total" id="valor_total" required>
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>