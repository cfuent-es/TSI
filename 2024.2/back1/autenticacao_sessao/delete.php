<?php

require_once('conexao.php');

if ($_GET) {
    $id = $_GET['id'];

    $sql = "DELETE FROM usuarios WHERE id = $id";

    mysqli_query($conexao, $sql);

    header('Location: index.php');
}

?>