<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Formulário Consumo Energia</title>
</head>
<body>
    <div class="container mt-5">
        <form action="" method="post">

            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="nome" class="form-label">Nome:</label>
                    <input type="text" class="form-control" name="nome" id="nome"  required>
                </div>
                <div class="col-md-6">
                    <label for="cpf" class="form-label">CPF:</label>
                    <input type="text" class="form-control" name="cpf" id="cpf" required>
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
                    <label for="consumo" class="form-label">Consumo em kWh:</label>
                    <input type="text" class="form-control" name="consumo" id="consumo">
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>