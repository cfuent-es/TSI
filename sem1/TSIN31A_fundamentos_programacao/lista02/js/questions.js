var questions = [
    {
        "question": "Faça um algoritmo que receba como entrada o valor do salário de um funcionário e informe seu novo salário após o recebimento de um reajuste de 12,8%. Também deverá ser informado o valor somente do reajuste.",
        "inputs": {
            "salario": {'type': 'number', 'label': 'Salário:'},
        },
        "outputs": {
            "salarioReajustado": {'type': 'text', 'label': 'Salário reajustado:'},
            "valorReajuste": {'type': 'text', 'label': 'Valor do reajuste:'},
        }
    }, 
    {
        "question": "Faça um algoritmo que receba como entrada o valor do consumo de energia elétrica de um cliente em quilowatts (kWatts) e informe o valor a ser pago, sabendo-se que cada quilowatt custa R$ 0,41. Também deverá ser informado o valor somente da taxa de iluminação pública (3%) e o valor somente da taxa de manutenção da rede (R$ 1,70).",
        "inputs": {
            "kwatts": {'type': 'number', 'label': 'Consumo de energia elétrica (kWatts):'},
        },
        "outputs": {
            "valorKwatts": {'type': 'text', 'label': 'Valor do consumo de energia elétrica:'},
            "taxaIluminacao": {'type': 'text', 'label': 'Valor da taxa de iluminação pública:'},
            "taxaManutencao": {'type': 'text', 'label': 'Valor da taxa de manutenção da rede:'},
            "total": {'type': 'text', 'label': 'Valor total a ser pago:'},
        }
    },
    {
        "question": "Faça um algoritmo que receba o salário bruto de um funcionário e calcule o valor do INSS - 5%, do IR-7% e do Auxílio Alimentação-8% e informe os valores de cada um destes impostos/benefícios bem como o salário líquido.",
        "inputs": {
            "salario": {'type': 'number', 'label': 'Salário:'},
        },
        "outputs": {
            "valorInss": {'type': 'text', 'label': 'Valor INSS (5%):'},
            "valorIr": {'type': 'text', 'label': 'Valor IR (7%):'},
            "valorAlimentacao": {'type': 'text', 'label': 'Valor auxílio alimentação:'},
            "total": {'type': 'text', 'label': 'Salário Liquido:'},
        }
    },
    {
        "question": "Faça um algoritmo que calcule o lucro em reais obtido com todas as unidades de um determinado produto. O usuário deverá informar o nome do produto, o preço de custo, o preço de venda, e a quantidade de itens vendidos.",
        "inputs": {
            "nomeProduto": {'type': 'text', 'label': 'Nome do Produto:'},
            "precoCusto": {'type': 'number', 'label': 'Preço de Custo:'},
            "precoVenda": {'type': 'number', 'label': 'Preço de Venda:'},
            "quantidadeVendida": {'type': 'number', 'label': 'Quantidade Vendida:'},
        },
        "outputs": {
            "lucro": {'type': 'text', 'label': 'Lucro do Produto:'},
        }
    },
    {
        "question": "Elaborar um algoritmo que leia a altura dos andares de um prédio e o número de andares, e calcule a altura do prédio.",
        "inputs": {
            "qtdAndares": {'type': 'number', 'label': 'Quantidade de Andares:'},
            "qtdAltura": {'type': 'text', 'label': 'Altura de cada andar:'},
        },
        "outputs": {
            "alturaPredio": {'type': 'text', 'label': 'Altura do Prédio:'},
        }
    },
    {
        "question": "Faça um algoritmo que receba a idade da pessoa em anos, meses e dias e calcule quantos dias essa pessoa já viveu. Considere que: * Ano possui 365 dias * Mês possui 30 dias.",
        "inputs": {
            "anos": {'type': 'number', 'label': 'Quantidade de Anos:'},
            "meses": {'type': 'number', 'label': 'Quantidade de Meses:'},
            "dias": {'type': 'number', 'label': 'Quantidade de Dias:'},
        },
        "outputs": {
            "diasDeVida": {'type': 'text', 'label': 'Dias Vividos:'},
        }
    },
    {
        "question": "Considerando que para um consórcio, sabe-se o número total de prestações, a quantidade de prestações pagas e o valor atual das prestações. Elaborar um programa para determinar o total pago pelo consorciado e o saldo devedor.",
        "inputs": {
            "prestacaoTotal": {'type': 'number', 'label': 'Total de Prestações:'},
            "prestacaoPagas": {'type': 'number', 'label': 'Prestações Pagas:'},
            "valorPrestacao": {'type': 'text', 'label': 'Valor da Prestação:'},
        },
        "outputs": {
            "totalPago": {'type': 'text', 'label': 'Total Pago do Consórcio:'},
            "saldoDevedor": {'type': 'text', 'label': 'Saldo Devedor:'},
        }
        
    },
    {
        "question": "Faça um algoritmo para ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de conversão é C= (F - 32) * (5 / 9), sendo C a temperatura em Celsius e F a temperatura em Fahrenheit.",
        "inputs": {
            "grausFahrenheit": {'type': 'number', 'label': 'Graus em Fahrenheit:'},
        },
        "outputs": {
            "grausCelsius": {'type': 'text', 'label': 'Graus Celsius:'},
        }
        
    },
    {
        "question": "Faça um algoritmo para ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F = (9 / 5) * C + 32, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.",
        "inputs": {
            "grausCelsius": {'type': 'number', 'label': 'Graus em Celsius:'},
        },
        "outputs": {
            "grausFahrenheit": {'type': 'text', 'label': 'Graus Fahrenheit:'},
        }
        
    },
    {
        "question": " Elaborar um algoritmo que calcule e apresente o volume de uma caixa retangular por meio da fórmula V = COMPRIMENTO * LARGURA * ALTURA.",
        "inputs": {
            "comprimento": {'type': 'number', 'label': 'Comprimento:'},
            "largura": {'type': 'number', 'label': 'Largura:'},
            "altura": {'type': 'number', 'label': 'Altura:'},
        },
        "outputs": {
            "volume": {'type': 'text', 'label': 'Volume:'},
        }
        
    },
    {
        "question": "Faça um algoritmo que receba dois números inteiros, armazenados cada um em uma variável posteriormente troque o conteúdo das variáveis. Isto é, no final do algoritmo, a variável A deverá estar com o valor da variável B e a variável B deverá estar com o valor da variável A.",
        "inputs": {
            "variavelA": {'type': 'number', 'label': 'Variável A:'},
            "variavelB": {'type': 'number', 'label': 'Variável B:'},
        },
        "outputs": {
            "variavelA": {'type': 'number', 'label': 'Variável A:'},
            "variavelB": {'type': 'number', 'label': 'Variável B:'},
        }
        
    },
    {
        "question": "Faça um algoritmo que leia as 4 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2, 3, 1 e 4, respectivamente.",
        "inputs": {
            "nota1": {'type': 'text', 'label': 'Nota 1:'},
            "nota2": {'type': 'text', 'label': 'Nota 2:'},
            "nota3": {'type': 'text', 'label': 'Nota 3:'},
            "nota4": {'type': 'text', 'label': 'Nota 4:'},
        },
        "outputs": {
            "media": {'type': 'text', 'label': 'Média:'},
        }
        
    },
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