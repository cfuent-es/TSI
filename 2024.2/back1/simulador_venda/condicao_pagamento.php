<?php
session_start(); // Inicia a sessão
include 'config.php'; // Inclui a conexão com o banco

// Verificar se as variáveis de sessão estão definidas
if (!isset($_SESSION['produto_id']) || !isset($_SESSION['usuario_id']) || !isset($_SESSION['preco_produto'])) {
    die("Dados não encontrados. Por favor, volte e complete o formulário corretamente.");
}

// Recupera os dados armazenados na sessão
$produto_id = $_SESSION['produto_id'];
$usuario_id = $_SESSION['usuario_id'];
$preco_produto = $_SESSION['preco_produto'];

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // Coleta os dados do segundo formulário
    $condicoes_pagamento = $_POST['condicoes_pagamento'];
    $quantidade_parcelas = $_POST['quantidade_parcelas'] ?? NULL;

    // Calcula o valor da parcela, se for parcelado
    if ($condicoes_pagamento == 'parcelado' && $quantidade_parcelas) {
        $valor_parcela = $preco_produto / $quantidade_parcelas;
    } else {
        $quantidade_parcelas = NULL;
        $valor_parcela = 0;
    }

    // Insere os dados na tabela venda
    $query = "
        INSERT INTO venda (produto_id, usuario_id, quantidade, total, condicoes_pagamento, quantidade_parcelas)
        VALUES ('$produto_id', '$usuario_id', 1, '$preco_produto', '$condicoes_pagamento', '$quantidade_parcelas')
    ";

    if ($conn->query($query) === TRUE) {
        echo "Venda registrada com sucesso!";

        // Limpar os dados da sessão após registrar a venda
        session_unset();
        session_destroy();
    } else {
        echo "Erro: " . $conn->error;
    }
}
?>

<!-- Segundo Formulário (Condição de Pagamento) -->
<form method="POST" action="condicao_pagamento.php">
    Condição de Pagamento:
    <select name="condicoes_pagamento" required>
        <option value="à vista">À vista</option>
        <option value="parcelado">Parcelado</option>
    </select><br>

    Quantidade de Parcelas:
    <input type="number" name="quantidade_parcelas" min="1" required><br>

    <p>Valor Total: R$ <span><?= number_format($preco_produto, 2, ',', '.') ?></span></p>
    <p>Valor por Parcela: R$ <span id="valor_parcela"><?= isset($valor_parcela) ? number_format($valor_parcela, 2, ',', '.') : '0,00' ?></span></p>

    <button type="submit">Finalizar Venda</button>
</form>
