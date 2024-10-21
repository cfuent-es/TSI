<?php

if(isset($_POST['idade']) && isset($_POST['data'])) {
    $idade = (int) $_POST['idade'];
    $data = (int) $_POST['data'];

    switch (true) {
        case ($idade >= 74):
            if($data == 1) {
                echo "01 de março - 74 anos ou mais<br>";
            } else {
                echo "Data inválida<br>";
            }
            break;
    
        case ($idade == 73):
            if($data == 2) {
                echo "02 de março - 73 anos<br>";
            } else {
                echo "Data inválida<br>";
            }
            break;
    
        case ($idade == 72):
            if($data == 3) {
                echo "03 de março - 72 anos<br>";
            } else {
                echo "Data inválida<br>";
            }
            break;
    
        case ($idade == 71):
            if($data == 4) {
                echo "04 de março - 71 anos<br>";
            } else {
                echo "Data inválida<br>";
            }
            break;
    
        case ($idade == 70):
            if($data == 5) {
                echo "05 de março - 70 anos<br>";
            } else {
                echo "Data inválida<br>";
            }
            break;
    
        case ($idade == 69):
            if($data == 8) {
                echo "08 de março - 69 anos<br>";
            } else {
                echo "Data inválida<br>";
            }
            break;
    
        case ($idade == 68):
            if($data == 9) {
                echo "09 de março - 68 anos<br>";
            } else {
                echo "Data inválida<br>";
            }
            break;
    
        case ($idade == 67):
            if($data == 10) {
                echo "10 de março - 67 anos<br>";
            } else {
                echo "Data inválida<br>";
            }
            break;
    
        case ($idade == 66):
            if($data == 11) {
                echo "11 de março - 66 anos<br>";
            } else {
                echo "Data inválida<br>";
            }
            break;
        
        case ($idade == 65):
            if($data == 12) {
                echo "12 de março - 65 anos<br>";
            } else {
                echo "Data inválida<br>";
            }
            break;
        
        default:
            echo "aguardar nova data para vacinação<br>";
            break;
    }
}

/*
echo "Insira sua idade: ";
$idade = (int) fgets(STDIN);

switch (true) {
    case ($idade >= 74):
        echo "01 de março - 74 anos ou mais\n";
        break;

    case ($idade == 73):
        echo "02 de março - 73 anos\n";
        break;

    case ($idade == 72):
        echo "03 de março - 72 anos\n";
        break;

    case ($idade == 71):
        echo "04 de março - 71 anos\n";
        break;

    case ($idade == 70):
        echo "05 de março - 70 anos\n";
        break;

    case ($idade == 69):
        echo "08 de março - 69 anos\n";
        break;

    case ($idade == 68):
        echo "09 de março - 68 anos\n";
        break;

    case ($idade == 67):
        echo "10 de março - 67 anos\n";
        break;

    case ($idade == 66):
        echo "11 de março - 66 anos\n";
        break;
    
    case ($idade == 65):
        echo "12 de março - 65 anos\n";
        break;
    
    default:
        echo "aguardar nova data para vacinação\n";
        break;
}

*/
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista 1 - Ex 5</title>
</head>
<body>
    <form action="" method="post">
        Insira sua idade: <input type="text" name="idade" id="idade"> <br>
        Selecione a data da vacinação:
        <select name="data" id="data">
            <option value="01">01 de março - 74 anos ou mais</option>
            <option value="02">02 de março - 73 anos</option>
            <option value="03">03 de março - 72 anos</option>
            <option value="04">04 de março - 71 anos</option>
            <option value="05">05 de março - 70 anos</option>
            <option value="08">08 de março - 69 anos</option>
            <option value="09">09 de março - 68 anos</option>
            <option value="10">10 de março - 67 anos</option>
            <option value="11">11 de março - 66 anos</option>
            <option value="12">12 de março - 65 anos</option>
        </select>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>