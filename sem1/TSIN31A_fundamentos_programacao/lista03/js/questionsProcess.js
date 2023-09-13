function getValueField(id) {
    var value = document.querySelector(id).value;
    return value;
}

function setValueField(id, value) {
    var field = document.querySelector(id).value = value;
    field.disabled = false;
    field.value = value;
    field.disabled = true;
}

function formatFloat(value) {
    var value = value.toFixed(2);
    var value = value.replace('.', ',');
    return value;
}

function processQuestion(questionIndex) {
    switch (questionIndex) {
        case 0:
            processQuestion1();
            break;

        case 1:
            processQuestion2();
            break;

        case 2:
            processQuestion3();
            break;

        case 3:
            processQuestion4();
            break;

        case 4:
            processQuestion5();
            break;

        case 5:
            processQuestion6();
            break;

        case 6:
            processQuestion7();
            break;

        case 7:
            processQuestion8();
            break;

        case 8:
            processQuestion9();
            break;

        case 9:
            processQuestion10();
            break;

        case 10:
            processQuestion11();
            break;

        case 11:
            processQuestion12();
            break;
    
        default:
            break;
    }
}

function processQuestion1() {
    var valorCompra = parseFloat(getValueField('#form-ex1-input-valorCompra'));
    if(valorCompra <= 5000.00)
        desconto = valorCompra * 0.15;
    else
        desconto = valorCompra * 0.20;
    var valorComDesconto = valorCompra - desconto;
    setValueField('#form-ex1-output-desconto', formatFloat(desconto));
    setValueField('#form-ex1-output-valorComDesconto', formatFloat(valorComDesconto));
}

function processQuestion2() {
    var inscritos = parseInt(getValueField('#form-ex2-input-inscritos'));
    var qtdInscritosSala = parseInt(getValueField('#form-ex2-input-qtdInscritosSala'));

    var qtdSalas = Math.ceil(inscritos / qtdInscritosSala);
    setValueField('#form-ex2-output-qtdSalas', qtdSalas);
}

function processQuestion3() {
    var sexo = getValueField('#form-ex3-input-sexo');
    var altura = parseFloat(getValueField('#form-ex3-input-altura'));
    if(sexo == 'M')
        pesoIdeal = (72.7 * altura) - 58;
    else
        pesoIdeal = (62.1 * altura) - 44.7;
    setValueField('#form-ex3-output-pesoIdeal', formatFloat(pesoIdeal));
}

function processQuestion4() {
    var numero = parseInt(getValueField('#form-ex4-input-numero'));
    if(numero % 2 == 0)
        parOuImpar = 'Par';
    else
        parOuImpar = 'Ímpar';
    setValueField('#form-ex4-output-parOuImpar', parOuImpar);
}

function processQuestion5() {
    var numero1 = parseFloat(getValueField('#form-ex5-input-numero1'));
    var numero2 = parseFloat(getValueField('#form-ex5-input-numero2'));
    var operacao = getValueField('#form-ex5-input-operacao');

    if(operacao == '+')
        resultado = numero1 + numero2;
    else if(operacao == '-')
        resultado = numero1 - numero2;
    else if(operacao == '*')
        resultado = numero1 * numero2;
    else if(operacao == '/')
        resultado = numero1 / numero2;
    else
        resultado = "Operação inválida.";

    setValueField('#form-ex5-output-resultado', resultado);
}

function processQuestion6() {
    var numero1 = parseInt(getValueField('#form-ex6-input-numero1'));
    var numero2 = parseInt(getValueField('#form-ex6-input-numero2'));

    if(numero1 < 0 || numero2 < 0)
        diferenca = "Os números devem ser positivos.";
    else if(numero1 <= numero2)      
        diferenca = "O 2º número deve ser menor que o 1º.";
    else
        diferenca = numero1 - numero2;

    setValueField('#form-ex6-output-diferenca', diferenca);
}

function processQuestion7() {
    var numero = parseInt(getValueField('#form-ex7-input-numero'));
    if(numero > 0)
        resposta = 'Positivo';
    else if(numero < 0)
        resposta = 'Negativo';
    else
        resposta = 'Nulo';
    setValueField('#form-ex7-output-resposta', resposta);
}

function processQuestion8() {
    var numero1 = parseInt(getValueField('#form-ex8-input-numero1'));
    var numero2 = parseInt(getValueField('#form-ex8-input-numero2'));
    
    if(numero1 > numero2)
        resposta = "O primeiro número é maior - núm informado: " + numero1;
    else if(numero2 > numero1)
        resposta = "O segundo número é maior - núm informado: " + numero2;
    else
        resposta = 'Os números são iguais.';
    setValueField('#form-ex8-output-resposta', resposta);
}

function processQuestion9() {
    var numeroA = parseInt(getValueField('#form-ex9-input-numeroA'));
    var numeroB = parseInt(getValueField('#form-ex9-input-numeroB'));

    if(numeroA > numeroB)
        var resposta = "O número B deve ser maior que o A.";
    else
        var resposta = Math.pow(numeroB - numeroA, 2)

    setValueField('#form-ex9-output-resposta', resposta);
}

function processQuestion10() {
    var numeroA = getValueField('#form-ex10-input-numeroA');
    var numeroB = getValueField('#form-ex10-input-numeroB');
    var numeroC = getValueField('#form-ex10-input-numeroC');
}