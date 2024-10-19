<?php

if(isset($_POST["numeros"])) {
    echo "Números escolhidos:";

    foreach($_POST["numeros"] as $numero)
    {
        echo "- " . $numero . "<br>";
    }
} else {
    echo "Você não escolheu numero preferido!<br>";
}

if(isset($_POST["newsletter"])){
    echo "Você deseja receber as novidades por email!";
} else {
    echo "Você não quer receber as novidades por email";
}