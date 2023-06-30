var questions = [
    {
        "question": "Uma empresa de vendas oferece para seus clientes um desconto que leva em consideração o valor da compra do cliente. Compras maiores ou iguais a R$ 5.000,00 recebem descontos de 20% e compras menores que R$ 5.000,00 recebem descontos de 15%. Faça um algoritmo que receba o valor da compra e informe o valor do desconto obtido e o valor da compra com desconto.",
        "inputs": {
            "valorCompra": {'type': 'text', 'label': 'Valor da Compra:'},
        },
        "outputs": {
            "desconto": {'type': 'text', 'label': 'Valor do Desconto:'},
            "valorComDesconto": {'type': 'text', 'label': 'Valor da Compra com Desconto:'},
        }
        
    },
    {
        "question": "Uma empresa, promotora de concursos, pretende fazer um programa para o cálculo do número de salas necessárias para a realização de provas. Desta forma, o algoritmo deverá receber o número total de candidatos e o número de pessoas que podem realizar as provas em uma mesma sala, calcular e escrever o número de salas necessárias. O algoritmo deverá retornar sempre um número 'inteiro' de s", 
        "inputs": {
            "inscritos": {'type': 'number', 'label': 'Número de Inscritos:'},
            "qtdInscritosSala": {'type': 'number', 'label': 'Número de Inscritos por Sala:'}
        },
        "outputs": {
            "qtdSalas": {'type': 'text', 'label': 'Quantidade de Salas Necessárias:'}
        }
        
    },
    {
        "question": "Faça um algoritmo que tendo como dados de entrada a altura e o sexo de uma pessoa, calcule e informe o peso ideal utilizando as seguintes fórmulas: a. Homens -> peso ideal = 72.7 * altura - 58 e b. Mulheres -> peso ideal = 62.1 * altura - 44.7",
        "inputs": {
            "sexo": {'type': 'text', 'label': 'Sexo (usar M ou F):'},
            "altura": {'type': 'text', 'label': 'Altura:'},
        },
        "outputs": {
            "pesoIdeal": {'type': 'text', 'label': 'Peso Ideal:'},
        }
        
    },
    {
        "question": "Faça um algoritmo que receba um número inteiro e informe se ele é par ou ímpar.",
        "inputs": {
            "numero": {'type': 'number', 'label': 'Digite um número:'}
        },
        "outputs": {
            "parOuImpar": {'type': 'text', 'label': 'Par ou Impar:'},
        }
        
    },
    {
        "question": "Faça um algoritmo que simula o funcionamento de uma calculadora básica. Ele deverá receber dois números inteiros e a operação desejada, e na sequência retornar o resultado.",
        "inputs": {
            "numero1": {'type': 'text', 'label': 'Número 1:'},
            "numero2": {'type': 'text', 'label': 'Número 2:'},
            "operacao": {'type': 'text', 'label': 'Operação (use +, -, * ou / ):'},
        },
        "outputs": {
            "resultado": {'type': 'text', 'label': 'Resultado da operação:'},
        }
        
    },
    {
        "question": "Faça um algoritmo que receba individualmente 2 números inteiros positivos e informe a diferença entre eles. O algoritmo deve garantir que o segundo número seja obrigatoriamente menor do que o primeiro",
        "inputs": {
            "numero1": {'type': 'number', 'label': 'Digite o primeiro número:'},
            "numero2": {'type': 'number', 'label': 'Digite o segundo número:'}
        },
        "outputs": {
            "diferenca": {'type': 'text', 'label': 'Diferença:'},
        }
        
    },
    {
        "question": "Faça um algoritmo que para determinado valor, informe se este é positivo, negativo ou nulo.",
        "inputs": {
            "numero": {'type': 'number', 'label': 'Digite um numero:'},
        },
        "outputs": {
            "resposta": {'type': 'text', 'label': 'Positivo, negativo ou nulo:'},
        }
        
    },
    {
        "question": "Faça um algoritmo que receba 2 números quaisquer e diferentes e retorne qual é o maior deles. O algoritmo deve garantir que os valores sejam de fato, diferentes.",
        "inputs": {
            "numero1": {'type': 'number', 'label': 'Digite o primeiro número:'},
            "numero2": {'type': 'number', 'label': 'Digite o segundo número:'}
        },
        "outputs": {
            "resposta": {'type': 'text', 'label': 'Maior número:'},
        }
        
    },
    {
        "question": "Faça um algoritmo para ler dois números inteiros A e B. Depois mostrar o resultado do quadrado da diferença do primeiro pelo segundo. O algoritmo deve garantir que o segundo número informado seja maior que o primeiro.",
        "inputs": {
            "numeroA": {'type': 'number', 'label': 'Número inteiro A:'},
            "numeroB": {'type': 'number', 'label': 'Número inteiro B:'}
        },
        "outputs": {
            "resposta": {'type': 'text', 'label': 'Quadrado da Diferença:'},
        }
        
    },
    {
        "question": "Faça um algoritmo que receba 3 números e informe o maior deles. Atenção: * Faça uso de “Ses” Aninhados; * Faça uso de no máximo 4 variáveis.",
        "inputs": {
            "numeroA": {'type': 'number', 'label': 'Número inteiro A:'},
            "numeroB": {'type': 'number', 'label': 'Número inteiro B:'},
            "numeroC": {'type': 'number', 'label': 'Número inteiro C:'}
        },
        "outputs": {
            
        }
        
    },
];

// seleciona o elemento HTML onde as perguntas serão exibidas
var questionsContainer = document.getElementById('questions-container');

// itera por cada objeto de pergunta no array
for (var i = 0; i < questions.length; i++) {
    var questionObj = questions[i];
    var question = questionObj.question;
    var inputs = questionObj.inputs;
    var outputs = questionObj.outputs;

    // cria os elementos HTML para a pergunta
    var questionEl = document.createElement('div');
    questionEl.className = 'row mb-5';

    var questionTitleEl = document.createElement('h4');
    questionTitleEl.innerText = 'Exercício ' + (i + 1);
    questionEl.appendChild(questionTitleEl);

    var questionTextEl = document.createElement('p');
    questionTextEl.innerText = question;
    questionEl.appendChild(questionTextEl);

    var formEl = document.createElement('form');
    formEl.id = 'form-ex' + (i + 1);
    questionEl.appendChild(formEl);

    var formContainerEl = document.createElement('div');
    formContainerEl.className = 'row g-5 mb-2';
    formEl.appendChild(formContainerEl);

    // cria os elementos HTML para os campos de entrada
    var inputContainerEl = document.createElement('div');
    inputContainerEl.className = 'col-md-6';
    formContainerEl.appendChild(inputContainerEl);

    var inputTitleEl = document.createElement('h5');
    inputTitleEl.innerText = 'Entradas';
    inputContainerEl.appendChild(inputTitleEl);

    for (var inputKey in inputs) {
        var inputObj = inputs[inputKey];
        var inputType = inputObj.type;
        var inputLabel = inputObj.label;

        var inputGroupEl = document.createElement('div');
        inputGroupEl.className = 'mb-3';

        var inputLabelEl = document.createElement('label');
        inputLabelEl.for = formEl.id + '-input-' + inputKey;
        inputLabelEl.className = 'form-label';
        inputLabelEl.innerText = inputLabel;
        inputGroupEl.appendChild(inputLabelEl);

        var inputEl = document.createElement('input');
        inputEl.type = inputType;
        inputEl.className = 'form-control';
        inputEl.id = formEl.id + '-input-' + inputKey;
        inputGroupEl.appendChild(inputEl);

        inputContainerEl.appendChild(inputGroupEl);
    }

    // cria o botão de envio
    var submitBtnEl = document.createElement('button');
    submitBtnEl.id = formEl.id + '-submit';
    submitBtnEl.type = 'submit';
    submitBtnEl.className = 'btn btn-primary';
    submitBtnEl.innerText = 'Enviar';
    inputContainerEl.appendChild(submitBtnEl);

    // cria os elementos HTML para os campos de saída
    var outputContainerEl = document.createElement('div');
    outputContainerEl.className = 'col-md-6';
    formContainerEl.appendChild(outputContainerEl);

    var outputTitleEl = document.createElement('h5');
    outputTitleEl.innerText = 'Saídas';
    outputContainerEl.appendChild(outputTitleEl);

    for (var outputKey in outputs) {
        var outputObj = outputs[outputKey];
        var outputType = outputObj.type;
        var outputLabel = outputObj.label;

        var outputGroupEl = document.createElement('div');
        outputGroupEl.className = 'mb-3';

        var outputLabelEl = document.createElement('label');
        outputLabelEl.for = formEl.id + '-output-' + outputKey;
        outputLabelEl.className = 'form-label';
        outputLabelEl.innerText = outputLabel;
        outputGroupEl.appendChild(outputLabelEl);

        var outputEl = document.createElement('input');
        outputEl.type = outputType;
        outputEl.className = 'form-control';
        outputEl.id = formEl.id + '-output-' + outputKey;
        outputEl.disabled = true;
        outputGroupEl.appendChild(outputEl);

        outputContainerEl.appendChild(outputGroupEl);
    }

    function createFormSubmitHandler(index) {
        return function(event) {
            event.preventDefault();
            processQuestion(index);
        };
    }

    formEl.addEventListener('submit', createFormSubmitHandler(i));

    // adiciona a pergunta ao contêiner
    questionsContainer.appendChild(questionEl);
}