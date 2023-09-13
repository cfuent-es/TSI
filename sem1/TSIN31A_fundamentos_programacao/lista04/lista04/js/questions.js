var questions = [
    {
        "question": "Faça um programa que receba 2 números quaisquer e a operação desejada (+, -, *, /) e informe o resultado. Caso qualquer outro caracter seja informado na operação, o programa deverá retornar a frase “operação não reconhecida.",
        "inputs": {
            "num1": {'type': 'text', 'label': 'Primeiro Número:'},
            "num2": {'type': 'text', 'label': 'Segundo Número:'},
            "operacao": {'type': 'text', 'label': 'Informe a operação - +, -, *, / (ultilize . para decimal):'},
        },
        "outputs": {
            "resultado": {'type': 'text', 'label': 'Resultado da Operação:'},
        }
        
    },
    {
        "question": "Faça um programa que receba um número inteiro qualquer e informe se ele é par ou ímpar.",
        "inputs": {
            "num1": {'type': 'text', 'label': 'Infome um número inteiro:'},
        },
        "outputs": {
            "resultado": {'type': 'text', 'label': 'O número informado é:'},
        }
        
    },
    {
        "question": "Faça um programa que receba dois números e execute as seguintes operações abaixo de acordo com a escolha do usuário.\n\nEscolha do Usuário Operação:\n\n1 - Média aritmética entre os valores digitados;\n2 - Diferença do maior pelo menor;\n3 - Produto entre os números digitados;\n4 - Divisão do primeiro pelo segundo;",
        "inputs": {
            "num1": {'type': 'text', 'label': 'Primeiro Número:'},
            "num2": {'type': 'text', 'label': 'Segundo Número:'},
            "operacao": {'type': 'text', 'label': 'Escolha a operação (de 1 a 4):'},
        },
        "outputs": {
            "resultado": {'type': 'text', 'label': 'O resultado da operação escolhida é:'},
        }
        
    },
    {
        "question": "Faça um programa que receba 3 notas e calcule a média ponderada (nota1=20%, nota2=30% e nota3=50%) e com base na média informe um conceito, conforme tabulação abaixo:\n\n0 à 49 – insuficiente;\n50 à 64 – regular;\n65 à 84 – bom;\n85 à 100 – ótimo.",
        "inputs": {
            "nota1": {'type': 'text', 'label': 'Informe a nota 1 (Peso 2):'},
            "nota2": {'type': 'text', 'label': 'Informe a nota 2 (Peso 3):'},
            "nota3": {'type': 'text', 'label': 'Informe a nota 3 (Peso 5):'}
        },
        "outputs": {
            "media": {'type': 'text', 'label': 'A Média do Aluno é:'},
        }
        
    },
    {
        "question": "Faça um programa que, dada a idade de um competidor de natação, classifique-o em uma das categorias abaixo:",
        "inputs": {
            "idade": {'type': 'text', 'label': 'Informe a idade do aluno:'},
        },
        "outputs": {
            "categoria": {'type': 'text', 'label': 'A categoria do aluno é:'},
        }
        
    },
    {
        "question": "Faça um programa que calcule o IMC de um paciente e que apresente o nome do paciente e sua faixa de risco, baseando-se na seguinte tabela:\n\n\tIMC = peso / altura^2\nOnde: Peso é definido em quilos e Altura é definido em metros (utilizar ponto (.), ex: 94.5kg, 1.82mt).\n\nIMC -> Faixa de Risco\nAbaixo de 20 -> Abaixo do peso\nA partir de 20 até 25 -> Normal\nAcima de 25 até 30 -> Excesso de peso\nAcima de 30 até 35 -> Obesidade\nAcima de 35 -> Obesidade mórbida",
        "inputs": {
            "peso": {'type': 'text', 'label': 'Informe o seu peso:'},
            "altura": {'type': 'text', 'label': 'Informe a sua altura:'},
        },
        "outputs": {
            "imc": {'type': 'text', 'label': 'Confira o seu IMC e faixa de risco:'},
        }
        
    },
    {
        "question": "Faça um programa para calcular o reajuste do salário de um funcionário de uma determinada empresa. Considere que o funcionário receberá um reajuste de 25% caso seu salário seja menor que R$ 945,00. Se o salário for maior ou igual a R$ 945,00, mas menor que R$ 1025,00, o reajuste será de 10%. Se o salário for maior ou igual a R$ 1025,00, o reajuste será de 3%.",
        "inputs": {
            "salario": {'type': 'text', 'label': 'Informe o salário do funcionário:'}
        },
        "outputs": {
            "reajuste": {'type': 'text', 'label': 'Salário reajustado:'},
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