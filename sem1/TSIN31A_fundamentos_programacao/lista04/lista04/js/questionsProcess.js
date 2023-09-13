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
    var num1 = parseFloat(getValueField('#form-ex1-input-num1'));
    var num2 = parseFloat(getValueField('#form-ex1-input-num2'));
    var operacao = getValueField('#form-ex1-input-operacao');
    var resultado;

    switch (operacao) {
        case "+":
            resultado = num1 + num2;
            break;
    
        case "-":
            resultado = num1 - num2;
            break;

        case "*":
            resultado = num1 * num2;
            break;

        case "/":
            resultado = num1 / num2;
            break;

        default:
            resultado = "Operação não reconhecida.";
            break;
    }
    
    setValueField('#form-ex1-output-resultado', resultado);
}

function processQuestion2() {
    var num1 = parseInt(getValueField('#form-ex2-input-num1'));
    var resultado;

    switch (true) {
        case (num1 % 2 == false):
            resultado = "Número par";
            break;

        case (num1 % 2 == true):
            resultado = "Número impar";
            break;

        default:
            resultado = "Ocorreu um erro interno.";
            break;
    }
    
    setValueField('#form-ex2-output-resultado', resultado);
}

function processQuestion3() {
    var num1 = parseFloat(getValueField('#form-ex3-input-num1'));
    var num2 = parseFloat(getValueField('#form-ex3-input-num2'));
    var operacao = parseInt(getValueField('#form-ex3-input-operacao'));
    var resultado;

    switch (operacao) {
        case 1:
            resultado = "Média aritmética: " + ((num1 + num2) / 2);
            break;
    
        case 2:
            resultado = "Diferença do maior para o menor: " + Math.abs(num1 - num2);
            break;

        case 3:
            resultado = "Produto dos números: " + (num1 * num2);
            break;

        case 4:
            resultado = "Divisão do primeiro pelo segundo: " + Math.round(num1 / num2);
            break;

        default:
            resultado = "Operação não reconhecida.";
            break;
    }
    
    setValueField('#form-ex3-output-resultado', resultado);
}

function processQuestion4() {
    var nota1 = parseFloat(getValueField('#form-ex4-input-nota1'));
    var nota2 = parseFloat(getValueField('#form-ex4-input-nota2'));
    var nota3 = parseFloat(getValueField('#form-ex4-input-nota3'));
    var media = Math.round(((nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5)) * 10);
    var resultado;

    switch (true) {
        case (media < 50):
            resultado = "Média: " + media + " - Insuficiente";
            break;
    
        case (media < 65):
            resultado = "Média: " + media + " - Regular";
            break;

        case (media < 85):
            resultado = "Média: " + media + " - Regular";
            break;

        case (media <= 100):
            resultado = "Média: " + media + " - Ótimo";
            break;

        default:
            resultado = "Valores fora o range permitido.";
            break;
    }
    
    setValueField('#form-ex4-output-media', resultado);
}

function processQuestion5() {
    var idade = parseInt(getValueField('#form-ex5-input-idade'));
    var categoria;

    switch (true) {
        case (idade < 5):
            categoria = "Não existe categoria para a idade informada";
            break;

        case (idade >= 5) && (idade <= 7):
            categoria = "Infantil A";
            break;
    
        case (idade <= 10):
            categoria = "Infantil B";
            break;

        case (idade <= 13):
            categoria = "Juvenil A";
            break;

        case (idade <= 17):
            categoria = "Juvenil B";
            break;

        case (idade <= 60):
            categoria = "Adulto";
            break;
        
        case (idade > 60):
            categoria = "Sênior";
            break;

        default:
            categoria = "Ocorreu um erro. Verfique a idade informada.";
            break;
    }
    
    setValueField('#form-ex5-output-categoria', categoria);
}

function processQuestion6() {
    var peso = parseFloat(getValueField('#form-ex6-input-peso'));
    var altura = parseFloat(getValueField('#form-ex6-input-altura'));
    var imc = Math.round(peso / (altura * altura));

    switch (true) {
        case (imc < 20):
            imc = "IMC: " + imc + " - Risco: Abaixo do Peso";
            break;

        case (imc <= 25):
            imc = "IMC: " + imc + " - Risco: Normal";
            break;

        case (imc <= 30):
            imc = "IMC: " + imc + " - Risco: Excesso de peso";
            break;

        case (imc <= 35):
            imc = "IMC: " + imc + " - Risco: Obesidade";
            break;
        
        case (imc > 35):
            imc = "IMC: " + imc + " - Risco: Obesidade mórbida";
            break;

        default:
            imc = "Ocorreu um erro interno.";
            break;
    }
    
    setValueField('#form-ex6-output-imc', imc);
}

function processQuestion7() {
    var salario = parseFloat(getValueField('#form-ex7-input-salario'));
    var reajuste;

    switch (true) {
        case (salario <= 945):
            reajuste = "Reajuste de 25% - Novo salário: R$ " + Math.round(salario * 1.25);
            break;

        case (salario <= 1025):
            reajuste = "Reajuste de 10% - Novo salário: R$ " + Math.round(salario * 1.10);
            break;

        case (salario > 1025):
            reajuste = "Reajuste de 3% - Novo salário: R$ " + Math.round(salario * 1.03);
            break;

        default:
            reajuste = "Ocorreu um erro interno.";
            break;
    }
    
    setValueField('#form-ex7-output-reajuste', reajuste);
}