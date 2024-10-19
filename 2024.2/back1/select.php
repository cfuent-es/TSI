<?php

if(isset($_POST["processador"]))
    echo "O seu processador é " . $_POST["processador"] . "<br>";

if(isset($_POST["livros"])){
    foreach($_POST["livros"] as $livro)
        echo "Livro " . $livro . "<br>";
} else 
    echo "Você não escolheu nenhum livro.";