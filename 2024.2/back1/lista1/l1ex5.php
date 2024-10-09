<?php

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