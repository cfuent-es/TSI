// declaração de variáveis fora das funções para ficarem globais
let personagens, perguntas, respostas, personagemAleatorio;

// pontuação inicial
let pontuacao = 110;

// função assincrona para ler as matrizes e montar os objetos javascript
fetch('personagens.json')
    .then(response => response.json())
    .then(data => {
        personagens = data.personagens;
        perguntas = data.perguntas;
        respostas = data.respostas;

        montaTabela();

        montaPerguntas();

        //pega um personagem aleatório dentro do objetos de personanges
        var chavesPersonagens = Object.keys(personagens);
        var indiceAleatorio = Math.floor(Math.random() * chavesPersonagens.length); 
        personagemAleatorio = chavesPersonagens[indiceAleatorio];

        console.log(personagemAleatorio);
    })
    .catch(error => console.error('Erro ao carregar o JSON:', error));

    // ao clicar em uma pergunta, atualiza a tabela de personagens e subtrai os pontos
function atualizarPersonagens(pergunta) {
    
    if(respostas[pergunta][personagemAleatorio] === 'sim'){
        content = " Sim";
    } else {
        content = " Não";
    }
    document.getElementById(pergunta + '-resposta').textContent = content;

    pontuacao -= 10;
    if(pontuacao <= 0){
        alert("Você não tem mais pontos! Tente novamente.");
        window.location.reload();
    }

    document.getElementById('pontuacao_valor').textContent = pontuacao;

    for (const personagem in respostas[pergunta]) {
        if(respostas[pergunta][personagem] === 'sim'){
            var imagem = document.getElementById(personagem);
            imagem.classList.remove('tremor');
            void imagem.offsetWidth;
            imagem.classList.add('tremor');
        }
    }
}

// monta a tabela de forma dinamica, conforme o array
function montaTabela() {
    const table = document.getElementById('personagensTable');
    let rowIndex = 0;

    for (const personagem in personagens) {
        if (rowIndex % 4 === 0) {
            var row = table.insertRow();
        }

        const nome = personagens[personagem].nome;
        const imagem = personagens[personagem].imagem;

        const cell = row.insertCell();

        const img = document.createElement('img');
        img.src = `imagens/personagens/${imagem}`;
        img.alt = nome;
        img.id = personagem;
        cell.appendChild(img);

        cell.innerHTML += '<br>';

        const span = document.createElement('span');
        span.textContent = nome;
        span.id= personagem + '-nome';
        span.classList.add('link-personagem');
        cell.appendChild(span);

        span.addEventListener('click', function() {
            personagemEscolhido(personagem);
        });

        rowIndex++;
    }
}

// quando o usuário escolhe um personagem
function personagemEscolhido(personagem)
{
    switch (true) {
        case pontuacao >= 0 && pontuacao <= 40:
            msg = "Você foi péssimo! Fez muitas perguntas!"
            break;

        case pontuacao >= 50 && pontuacao <= 70:
            msg = "Você foi razoável! Está na média!"
            break;
        
        case pontuacao >= 80 && pontuacao <= 100:
            msg = "Você foi bom! Fez poucas perguntas!"
            break;

        case pontuacao >= 110:
            msg = "Você foi ótimo! Fez zero perguntas (ou usou o console :-P)!"
            break;
        
        default:
            msg = "Você foi péssimo! Teve pontuação negativa!"
    }

    if(personagem == personagemAleatorio) {
        alert("Você acertou o personagem!\n" + "Sua pontuação foi: " + pontuacao + "\n" + msg);
    }
    else 
        alert("Você errou o personagem!\n" + "Sua pontuação foi: " + pontuacao + "\n" + "O personagem era: " + personagens[personagemAleatorio].nome );

    window.location.reload();
}

function montaPerguntas() {
    const listaPerguntas = document.getElementById('listaPerguntas');

    for (const key in perguntas) {
        if (perguntas.hasOwnProperty(key)) {
            const pergunta = perguntas[key];

            const listItem = document.createElement('li');
            listItem.id = key;

            const respostaSpan = document.createElement('span');
            respostaSpan.id = key + '-resposta';
            respostaSpan.classList.add('resposta-pergunta');

            listItem.textContent = pergunta;
            listItem.appendChild(respostaSpan);

            listaPerguntas.appendChild(listItem);
        }
    }

    // Adicionar evento de clique para cada pergunta
    const perguntasItems = listaPerguntas.getElementsByTagName('li');
    for (let i = 0; i < perguntasItems.length; i++) {
        perguntasItems[i].addEventListener('click', () => {
            atualizarPersonagens(perguntasItems[i].id);
            //console.log('Clicou na pergunta', perguntasItems[i].id);
        });
    }
}