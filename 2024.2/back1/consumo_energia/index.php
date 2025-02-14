<?php

require_once('conexao.php');

    $sql = "
        Select * from consumo_energia
    ";

    $resultado = mysqli_query($conexao, $sql);

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
        <h1>Consumo de Energia</h1>
        <table class="table">
            <thead>
                <tr>
                    <th style="width: 5%;" scope="col" class="text-center">ID</th>
                    <th style="width: 35%;" scope="col" class="text-center">Nome</th>
                    <th style="width: 20%;"  scope="col" class="text-center">CPF</th>
                    <th style="width: 15%;"  scope="col" class="text-center">Unid. Consumidora</th>
                    <th style="width: 15%;" scope="col" class="text-center">Ações</th>
                </tr>
            </thead>
            <tbody>
                <?php while ($consumo = mysqli_fetch_assoc($resultado)) { ?>
                    <tr>
                        <td class="text-center"><?php echo $consumo['id']; ?></td>
                        <td><?php echo $consumo['nome']; ?></td>
                        <td class="text-center"><?php echo $consumo['cpf']; ?></td>
                        <td class="text-center"><?php echo $consumo['unidade_consumidora']; ?></td>
                        <td class="text-center">
                            <a href="edit.php?id=<?php echo $consumo['id']; ?>" class="btn btn-sm btn-primary">Editar</a>
                            <a href="delete.php?id=<?php echo $consumo['id']; ?>" class="btn btn-sm btn-danger" onclick="return confirm('Tem certeza que deseja excluir este item?');">Excluir</a>
                        </td>
                    </tr>
                <?php } ?>
            </tbody>
        </table>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>