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

        case 12:
            processQuestion13();
            break;

        case 13:
            processQuestion14();
            break;
        
        case 14:
            processQuestion15();
            break;

        case 15:
            processQuestion16();
            break;

        case 16:
            processQuestion17();
            break;

        case 17:
            processQuestion18();
            break;

        case 18:
            processQuestion19();
            break;

        case 19:
            processQuestion20();
            break;
    
        default:
            break;
    }
}

function processQuestion1() {
    var salario = parseFloat(getValueField('#form-ex1-input-salario'));
    var salarioReajustado = salario * 1.128;
    var valorReajuste = salarioReajustado - salario;
    setValueField('#form-ex1-output-salarioReajustado', formatFloat(salarioReajustado));
    setValueField('#form-ex1-output-valorReajuste', formatFloat(valorReajuste));
}

function processQuestion2() {
    var kwatts = parseFloat(getValueField('#form-ex2-input-kwatts'));
    var valorKwatts = kwatts * 0.41;
    var taxaIluminacao = valorKwatts * 0.03;
    var taxaManutencao = 1.70;
    var total = valorKwatts + taxaIluminacao + taxaManutencao;
    setValueField('#form-ex2-output-valorKwatts', formatFloat(valorKwatts));
    setValueField('#form-ex2-output-taxaIluminacao', formatFloat(taxaIluminacao));
    setValueField('#form-ex2-output-taxaManutencao', formatFloat(taxaManutencao));
    setValueField('#form-ex2-output-total', formatFloat(total));
}

function processQuestion3() {
    var salario = parseFloat(getValueField('#form-ex3-input-salario'));
    var valorInss = salario * 0.05;
    var valorIr = salario * 0.07;
    var valorAlimentacao = salario * 0.08;
    var salarioTotal = salario - valorInss - valorIr - valorAlimentacao;
    setValueField('#form-ex3-output-valorInss', formatFloat(valorInss));
    setValueField('#form-ex3-output-valorIr', formatFloat(valorIr));
    setValueField('#form-ex3-output-valorAlimentacao', formatFloat(valorAlimentacao));
    setValueField('#form-ex3-output-total', formatFloat(salarioTotal));
}

function processQuestion4() {
    var nomeProduto = getValueField('#form-ex4-input-nomeProduto');
    var precoCusto = parseFloat(getValueField('#form-ex4-input-precoCusto'));
    var precoVenda = parseFloat(getValueField('#form-ex4-input-precoVenda'));
    var quantidadeVendida = parseFloat(getValueField('#form-ex4-input-quantidadeVendida'));
    var lucro = (precoVenda - precoCusto) * quantidadeVendida;
    setValueField('#form-ex4-output-lucro', formatFloat(lucro));
}

function processQuestion5() {
    var qtdAndares = parseInt(getValueField('#form-ex5-input-qtdAndares'));
    var qtdAltura = parseFloat(getValueField('#form-ex5-input-qtdAltura'));
    var alturaPredio = qtdAndares * qtdAltura;
    setValueField('#form-ex5-output-alturaPredio', formatFloat(alturaPredio));
}

function processQuestion6() {
    var anos = parseInt(getValueField('#form-ex6-input-anos'));
    var meses = parseInt(getValueField('#form-ex6-input-meses'));
    var dias = parseInt(getValueField('#form-ex6-input-dias'));
    var diasDeVida = (anos * 365) + (meses * 30) + dias;
    setValueField('#form-ex6-output-diasDeVida', diasDeVida);
}

function processQuestion7() {
    var prestacaoTotal = parseInt(getValueField('#form-ex7-input-prestacaoTotal'));
    var prestacaoPagas = parseInt(getValueField('#form-ex7-input-prestacaoPagas'));
    var valorPrestacao = parseFloat(getValueField('#form-ex7-input-valorPrestacao'));
    var totalConsorcio = prestacaoTotal * valorPrestacao;
    var totalPago = prestacaoPagas * valorPrestacao;
    var saldoDevedor = totalConsorcio - (prestacaoPagas * valorPrestacao);
    setValueField('#form-ex7-output-totalPago', formatFloat(totalPago));
    setValueField('#form-ex7-output-saldoDevedor', formatFloat(saldoDevedor));
}

function processQuestion8() {
    var grausFahrenheit = parseInt(getValueField('#form-ex8-input-grausFahrenheit'));
    var grausCelsius = (grausFahrenheit - 32) * (5 / 9);
    setValueField('#form-ex8-output-grausCelsius', formatFloat(grausCelsius));
}

function processQuestion9()
{
    var grausCelsius = parseInt(getValueField('#form-ex9-input-grausCelsius'));
    var grausFahrenheit = (9 / 5) * grausCelsius + 32;
    setValueField('#form-ex9-output-grausFahrenheit', formatFloat(grausFahrenheit));
}

function processQuestion10() {
    var comprimento = parseInt(getValueField('#form-ex10-input-comprimento'));
    var largura = parseInt(getValueField('#form-ex10-input-largura'));
    var altura = parseInt(getValueField('#form-ex10-input-altura'));
    var volume = comprimento * largura * altura;
    setValueField('#form-ex10-output-volume', volume);
}

function processQuestion11() {
    var variavelA = parseInt(getValueField('#form-ex11-input-variavelA'));
    var variavelB = parseInt(getValueField('#form-ex11-input-variavelB'));
    var temp = variavelA;
    variavelA = variavelB;
    variavelB = temp;
    setValueField('#form-ex11-input-variavelA', variavelA);
    setValueField('#form-ex11-input-variavelB', variavelB);
    setValueField('#form-ex11-output-variavelA', variavelA);
    setValueField('#form-ex11-output-variavelB', variavelB);
}

function processQuestion12() {
    var nota1 = parseFloat(getValueField('#form-ex12-input-nota1'));
    var nota2 = parseFloat(getValueField('#form-ex12-input-nota2'));
    var nota3 = parseFloat(getValueField('#form-ex12-input-nota3'));
    var nota4 = parseFloat(getValueField('#form-ex12-input-nota4'));
    var media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 1) + (nota4 * 4)) / 10;
    setValueField('#form-ex12-output-media', formatFloat(media));
}

function processQuestion13() {
    var valorCompra = parseFloat(getValueField('#form-ex13-input-valorCompra'));
    if(valorCompra <= 5000.00)
        desconto = valorCompra * 0.15;
    else
        desconto = valorCompra * 0.20;
    var valorComDesconto = valorCompra - desconto;
    setValueField('#form-ex13-output-desconto', formatFloat(desconto));
    setValueField('#form-ex13-output-valorComDesconto', formatFloat(valorComDesconto));
}

function processQuestion14() {
    var sexo = getValueField('#form-ex14-input-sexo');
    var altura = parseFloat(getValueField('#form-ex14-input-altura'));
    if(sexo == 'M')
        pesoIdeal = (72.7 * altura) - 58;
    else
        pesoIdeal = (62.1 * altura) - 44.7;
    setValueField('#form-ex14-output-pesoIdeal', formatFloat(pesoIdeal));
}

function processQuestion15() {
    var numero = parseInt(getValueField('#form-ex15-input-numero'));
    if(numero % 2 == 0)
        parOuImpar = 'Par';
    else
        parOuImpar = 'Ímpar';
    setValueField('#form-ex15-output-parOuImpar', parOuImpar);
}

function processQuestion16() {
    var numero1 = parseInt(getValueField('#form-ex16-input-numero1'));
    var numero2 = parseInt(getValueField('#form-ex16-input-numero2'));

    if(numero1 < 0 || numero2 < 0)
        diferenca = "Os números devem ser positivos.";
    else if(numero1 <= numero2)      
        diferenca = "O 2º número deve ser menor que o 1º.";
    else
        diferenca = numero1 - numero2;

    setValueField('#form-ex16-output-diferenca', diferenca);
}

function processQuestion17() {
    var numero = parseInt(getValueField('#form-ex17-input-numero'));
    if(numero > 0)
        resposta = 'Positivo';
    else if(numero < 0)
        resposta = 'Negativo';
    else
        resposta = 'Nulo';
    setValueField('#form-ex17-output-resposta', resposta);
}

function processQuestion18() {
    var numero1 = parseInt(getValueField('#form-ex18-input-numero1'));
    var numero2 = parseInt(getValueField('#form-ex18-input-numero2'));
    
    if(numero1 > numero2)
        resposta = "O primeiro número é maior - núm informado: " + numero1;
    else if(numero2 > numero1)
        resposta = "O segundo número é maior - núm informado: " + numero2;
    else
        resposta = 'Os números são iguais.';
    setValueField('#form-ex18-output-resposta', resposta);
}

function processQuestion19() {
    var numeroA = parseInt(getValueField('#form-ex19-input-numeroA'));
    var numeroB = parseInt(getValueField('#form-ex19-input-numeroB'));

    if(numeroA > numeroB)
        var resposta = "O número B deve ser maior que o A.";
    else
        var resposta = Math.pow(numeroB - numeroA, 2)

    setValueField('#form-ex19-output-resposta', resposta);
}

function processQuestion20() {
    var numeroA = getValueField('#form-ex20-input-numeroA');
    var numeroB = getValueField('#form-ex20-input-numeroB');
    var numeroC = getValueField('#form-ex20-input-numeroC');
}