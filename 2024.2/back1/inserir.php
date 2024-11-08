<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inserir</title>
</head>
<body>
    <form action="conexao.php" method="post">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" required>
        <br>
        <br>
        <label for="nascimento">Data de Nascimento:</label>
        <input type="date" name="nascimento" id="nascimento" required>
        <br>
        <br>
        <label for="endereco">Endereço:</label>
        <input type="text" name="endereco" id="endereco" required>
        <br>
        <br>
        <label for="bairro">Bairro:</label>
        <input type="text" name="bairro" id="bairro" required>
        <br>
        <input type="hidden" name="acao" value="inserir">
        <button type="submit">Enviar</button>
    </form>
</body>
</html>