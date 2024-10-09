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
    var inicial = parseInt(getValueField('#form-ex1-input-inicial'));
    var final = parseInt(getValueField('#form-ex1-input-final'));
    var resultado = "";

    var i = inicial;
    do {
        quad = i * i;
        console.log(quad);
        resultado += "Núm " + i + ": " + quad + "\n";
        i++;
    } while(i <= final)
    
    setValueField('#form-ex1-output-resultado', resultado);
}

function processQuestion2() {
    var inicial = parseInt(getValueField('#form-ex2-input-inicial'));
    var final = parseInt(getValueField('#form-ex2-input-final'));
    var resultado = "";

    var i = inicial;
    do {
        if(!(i % 2))
            resultado += "Número Par: " + i + "\n";
        i++;
    } while(i <= final)
    
    setValueField('#form-ex2-output-resultado', resultado);
}

function processQuestion3() {
    var inicial = parseInt(getValueField('#form-ex3-input-inicial'));
    var final = parseInt(getValueField('#form-ex3-input-final'));
    var resultado = "";

    var i = inicial;
    var soma = 0;
    do {
        soma += i;
        resultado += "Número Atual: " + i + " - Somatória: " + soma + "\n";
        i++;
    } while(i <= final)
    
    setValueField('#form-ex3-output-resultado', resultado);
}

function processQuestion4() {
    var inicial = parseInt(getValueField('#form-ex4-input-inicial'));
    var final = parseInt(getValueField('#form-ex4-input-final'));
    var resultado = "";

    var i = inicial;
    var soma = 0;
    do {
        if(!(i % 2)){
            soma += i;
            resultado += "Número Par: " + i + " - Somatória: " + soma + "\n";
        }
        i++;
    } while(i <= final)
    
    setValueField('#form-ex4-output-resultado', resultado);
}

function processQuestion5() {
    var inicial = parseInt(getValueField('#form-ex5-input-inicial'));
    var final = parseInt(getValueField('#form-ex5-input-final'));
    var resultado = "";

    var i = inicial;
    var soma = 0;
    do {
        soma += i;
        resultado += "Número: " + i + " - Somatória: " + soma + "\n";
        i++;
    } while(i <= final)
    
    setValueField('#form-ex5-output-resultado', resultado);
}

function processQuestion6() {
    var num = parseInt(getValueField('#form-ex6-input-num'));
    var resultado = "";

    var i = 1;
    do {
        resultado += num + " * " + i + " = " + (num * i) + "\n";
        i++;
    } while(i <= 10)
    
    setValueField('#form-ex6-output-resultado', resultado);
}

function processQuestion7(){
    var i = 1;
    var resultado = "";
    do {
        j = 1;
        resultado += "\nTabuada do " + i + "\n";
        do{
            resultado += i + " * " + j + " = " + i * j + "\n"
            j++;
        } while(j <= 10)
        i++
    } while(i <= 10)

    setValueField('#form-ex7-output-resultado', resultado);
}

function processQuestion8()
{
    var num = parseInt(getValueField('#form-ex8-input-num'));
    var resultado = "";
    i = 1;
    while(i < num) {
        if(i % 2)
            resultado += "Número impar: " + i + "\n";
        i++
    }
    setValueField('#form-ex8-output-resultado', resultado);
}

function processQuestion9()
{
    var num = parseInt(getValueField('#form-ex9-input-num'));
    var resultado = "";
    i = 1;
    qtd = 0;
    while(true) {
        if(!(i % 2)){
            qtd++;
            resultado += qtd + ". Número par: " + i + "\n";
        }
        if(qtd == num)
            break;
        i++;
    }
    setValueField('#form-ex9-output-resultado', resultado);
}

function processQuestion10()
{
    var num = getValueField('#form-ex10-input-num').split(",");
    var i = 0;
    while(i < num.length) {
        num_ = parseInt(num[i]);
        if(i === 0){
            soma = maior = menor = num_;
        } else {
            soma += num_;

            if(maior < num_)
                maior = num_;

            if(menor > num_)
                menor = num_;
        }

        i++;
    }

    var resultado = "Soma dos números: " + soma + "\n"
                        + "Média dos números: " + Math.round(soma / num.length) + "\n"
                        + "Maior número: " + maior + "\n"
                        + "Menor número: " + menor;

    setValueField('#form-ex10-output-resultado', resultado);
}

function processQuestion11()
{
    var num = getValueField('#form-ex11-input-num').split(",");
    var resultado = "";
    var i = qtd_par = qtd_impar = 0;
    while(i < num.length) {
        num_ = parseInt(num[i]);

        if(num_ % 2){
            p_i = "impar";
            qtd_impar++;
        }
        else {
            p_i = "par";
            qtd_par++;
        }

        resultado += "Número " + num_ + ": " + p_i + "\n";
        i++;
    }

    resultado += "\nQuantidade de números pares: " + qtd_par + "\n"
                        + "Quantidade de números impares: " + qtd_impar + "\n";

    setValueField('#form-ex11-output-resultado', resultado);
}