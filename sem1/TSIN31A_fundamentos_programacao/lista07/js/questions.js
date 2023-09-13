var questions = [
    {
        "question": "<strong>Usando doWhile</strong> - Faça um programa que exiba o quadrado dos números de 1 até 20.",
        "inputs": {
            "inicial": {'type': 'text', 'label': 'Número Inicial:', 'value': '1', 'disabled': '1'},
            "final": {'type': 'text', 'label': 'Número Final:', 'value': '20', 'disabled': '1'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Quadrado do número:'},
        }
        
    },
    {
        "question": "<strong>Usando doWhile</strong> - Faça um programa que informe os números pares no intervalo de 1 a 600.",
        "inputs": {
            "inicial": {'type': 'text', 'label': 'Número Inicial:', 'value': '1', 'disabled': '1'},
            "final": {'type': 'text', 'label': 'Número Final:', 'value': '600', 'disabled': '1'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Números pares:'},
        }
        
    },
    {
        "question": "<strong>Usando doWhile</strong> - Faça um programa que imprima os números de 1 até 10 e a soma deles.",
        "inputs": {
            "inicial": {'type': 'text', 'label': 'Número Inicial:', 'value': '1', 'disabled': '1'},
            "final": {'type': 'text', 'label': 'Número Final:', 'value': '10', 'disabled': '1'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Somatória dos números:'},
        }
        
    },
    {
        "question": "<strong>Usando doWhile</strong> - Crie um programa que imprima a soma dos números pares entre 24 e 200.",
        "inputs": {
            "inicial": {'type': 'text', 'label': 'Número Inicial:', 'value': '24', 'disabled': '1'},
            "final": {'type': 'text', 'label': 'Número Final:', 'value': '200', 'disabled': '1'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Somatória dos números pares:'},
        }
        
    },
    {
        "question": "<strong>Usando doWhile</strong> - Faça um programa que receba e some N números. Onde N deve ser informado pelo usuário.",
        "inputs": {
            "inicial": {'type': 'text', 'label': 'Número Inicial:', 'value': '1', 'disabled': '1'},
            "final": {'type': 'text', 'label': 'Número Final:', 'value': '0', 'disabled': '0'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Somatória dos números pares:'},
        }
        
    },
    {
        "question": "<strong>Usando doWhile</strong> - Faça um programa que receba um número, calcule e mostre a tabuada deste número.",
        "inputs": {
            "num": {'type': 'text', 'label': 'Número:', 'value': '0', 'disabled': '0'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Tabuada:'},
        }
        
    },
    {
        "question": "<strong>Usando doWhile</strong> - Faça um programa que mostre as tabuadas dos números de 1 a 10.",
        "inputs": {
            "num": {'type': 'text', 'label': 'Clique em enviar para mostrar a tabuada:', 'value': '0', 'disabled': '1'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Tabuada:'},
        }
        
    },
    {
        "question": "<strong>Usando While</strong> - Faça um programa que leia um número que será o limite superior de um intervalo e retorne todos os números ímpares menores do que esse número.",
        "inputs": {
            "num": {'type': 'text', 'label': 'Limite Superior:', 'value': '0', 'disabled': '0'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Números impares:'},
        }
        
    },
    {
        "question": "<strong>Usando While</strong> - Crie um programa que leia um número que servirá para controlar os números pares que serão impressos a partir de 2.",
        "inputs": {
            "num": {'type': 'text', 'label': 'Número de Pares à exibir:', 'value': '0', 'disabled': '0'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Números Pares:'},
        }
        
    },
    {
        "question": "<strong>Usando While</strong> - Faça um programa que receba 10 números inteiros informados pelo usuário e retorne:<br><br>a. A soma dos números digitados<br>b. A média dos números digitados<br>c. O maior número digitado<br>d. O menor número digitado",
        "inputs": {
            "num": {'type': 'text', 'label': 'Digite os números separados por vírgula (qualquer quantidade):', 'value': "1,2,3,4,5,6,7,8,9,10", 'disabled': '0'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Resultados:'},
        }
        
    },
    {
        "question": "<strong>Usando While</strong> - Faça um programa que receba 10 números inteiros informados pelo usuário e retorne:<br><br>a. Informe se o número é par ou impar<br>b. Informe quantos números pares foram digitados<br>c. Informe quantos números ímpares foram digitados.",
        "inputs": {
            "num": {'type': 'text', 'label': 'Digite os números separados por vírgula (qualquer quantidade):', 'value': "10,20,30,40,50", 'disabled': '0'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Resultados:'},
        }
        
    },
    {
        "question": "<strong>Usando While</strong> - Faça um programa que receba o nome e o salário de 10 funcionários de uma empresa e retorne o nome e o salário do funcionário que receber o salário mais alto.",
        "inputs": {
            "num": {'type': 'text', 'label': 'Digite os números separados por vírgula (qualquer quantidade):', 'value': "10,20,30,40,50", 'disabled': '0'},
        },
        "outputs": {
            "resultado": {'type': 'textarea', 'label': 'Resultados:'},
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
    questionTextEl.innerHTML = question;
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
        var inputValue = inputObj.value;
        var inputDisabled = parseInt(inputObj.disabled);

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
        if(inputValue)
            inputEl.value = inputValue;
        if(inputDisabled)
            inputEl.disabled = true;
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

        if(outputType == 'textarea'){
            var outputEl = document.createElement('textarea');
            outputEl.style.height = "200px";
        } else {
            var outputEl = document.createElement('input');
            outputEl.type = outputType;
        }
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