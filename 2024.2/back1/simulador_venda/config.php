<?php
$host = 'localhost';
$db = 'tsi_back1';
$user = 'fuentes';
$pass = 'fuentes';

$conn = new mysqli($host, $user, $pass, $db);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}
?>
