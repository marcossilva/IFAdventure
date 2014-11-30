/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.game;

/**
 *
 * @author Marcos
 */
public final class JSONBackup {

    public final static String json = "{\n" +
"    \"comandos\": {\n" +
"        \"ir\": \"movimento\",\n" +
"        \"andar\": \"movimento\",\n" +
"        \"descer\": \"movimento\",\n" +
"        \"subir\": \"movimento\",\n" +
"        \"analisar\": \"observar\",\n" +
"        \"descrever\": \"observar\",\n" +
"        \"observar\": \"observar\",\n" +
"        \"ver\": \"observar\",\n" +
"        \"pegar\": \"observar\",\n" +
"        \"ajuda\": \"ajuda\",\n" +
"        \"inventario\": \"inventorio\",\n" +
"        \"inventorio\": \"inventorio\",\n" +
"        \"mochila\": \"inventorio\",\n" +
"        \"ler\": \"inventorio\"\n" +
"\n" +
"    },\n" +
"    \"itens\": {\n" +
"        \"nota0\": {\n" +
"            \"descricao\": \"\\\"Janeiro 18, 1998. Julie acaba de voltar do médico e felizmente vimos que está tudo bem com o bebê. Ela ainda está abalada com o acidente e precisa de repouso. Precisamos ter cautela para que nada aconteça a minha pequena Lucy.\\\"\\nQuem deixou esta nota aqui? Parece uma nota de um diário, mas ela foi arrancada. Talvez se eu continuar procurando estas notas eu consiga entender o que aconteceu.\",\n" +
"            \"weight\": 1\n" +
"        },\n" +
"        \"bussola\": {\n" +
"            \"descricao\": \"Apenas uma bússola velha, mas que parece funcionar.\",\n" +
"            \"weight\": 1\n" +
"        },\n" +
"        \"canoa\": {\n" +
"            \"descricao\": \"Uma canoa de madeira mas parece fragilizada pelo tempo e não vejo remo em lugar algum. Vejo no entanto uma nota no fundo da canoa\",\n" +
"            \"weight\": 100\n" +
"        },\n" +
"        \"nota2\": {\n" +
"            \"descricao\": \"\\\"Fevereiro 26, 1998. Como vamos manter o repouso com estes dias de carnaval? A rua com toda certeza ficará insuportável, bem como as músicas altíssimas e pessoas irritantes. Acho melhor irmos para a fazenda da minha mãe Lehane Otelia. Julie está melhorando mas eu ainda estou receoso sobre a saúde do bebê\\\".\\n\\nEu definitivamete preciso encontrar mais páginas deste diário. Mas também preciso sair daqui. Será que estou nesta fazenda? E onde estarão Julie e Lucy?\",\n" +
"            \"weight\": 1\n" +
"        },\n" +
"        \"nota4\": {\n" +
"            \"descricao\": \"\\\"São elas! Elas merecem! Seus espíritos farão parte de um propósito maior. Devo sacrificá-los para o meu senhor. Elas merecem, eu sei que merecem. Elas merecem. Elas merecem. Elas merecem.....\\\"\\nMas esta nota é diferente. Seu papel é diferente, a cor da caneta é diferente, mas a letra é a mesma.\",\n" +
"            \"weight\": 1\n" +
"        },\n" +
"        \"cartas\": {\n" +
"            \"descricao\": \"São contas de banco endereçadas à Lehane Otelia\",\n" +
"            \"weight\": 1\n" +
"        },\n" +
"        \"crianca\": {\n" +
"            \"descricao\": \"A criança chora em desespero pois está nua e coberta de sangue.\",\n" +
"            \"weight\": 1\n" +
"        },\n" +
"        \"gaveteiro\": {\n" +
"            \"descricao\": \"Dentro da gaveta há alguns papéis e uma arma. Um pistola com algumas balas. Vou levar isso comigo.\",\n" +
"            \"weight\": 100\n" +
"        },\n" +
"        \"arma\": {\n" +
"            \"descricao\": \"Uma arma com algumas balas\",\n" +
"            \"weight\": 1\n" +
"        },\n" +
"        \"velha\": {\n" +
"            \"descricao\": \"Uma mulher louca e assutadora.\",\n" +
"            \"weight\": 100\n" +
"        },\n" +
"        \"altar\": {\n" +
"            \"descricao\": \"O altar tem velas de cera preta queimando lentamente. A essencia exalada é podre a quase me faz vomitar. Mas percebo que há uma anotação em uma foto apoiada em uma vela.\",\n" +
"            \"weight\": 100\n" +
"        },\n" +
"        \"notaAltar\": {\n" +
"            \"descricao\": \"Está escrito:\\\"Meu filho,\\n\\nEu disse a voce que sua mulher não era uma boa esposa. Voce não quis acreditar em mim por isso devo salvar voce de uma vida ao lado desse leviatã. Sua filha só poderá ser salva se for retirada do ventre dessa mulher a tempo. Farei qualquer sacrifício para que voce fique feliz.\\n\\nCom amor,\\nLehane Otelia, sua mãe querida\\\"\",\n" +
"            \"weight\": 1\n" +
"        },\n" +
"        \"chave\": {\n" +
"            \"descricao\": \"É uma chave normal. Parece que é de algum ambiente interno da casa.\",\n" +
"            \"weight\": 1\n" +
"        },\n" +
"        \"galao\": {\n" +
"            \"descricao\": \"O galão contém gasolina e está cheio.\",\n" +
"            \"weight\": 1\n" +
"        },\n" +
"\n" +
"        \"estante\": {\n" +
"            \"descricao\": \"Vejo alguns livros empoeirados somente isso nada mais\",\n" +
"            \"weight\": 100\n" +
"        },\n" +
"        \"casaCachorro\": {\n" +
"            \"descricao\": \"Está com um cheiro horrível. Acho que há algo morto ali dentro.\",\n" +
"            \"weight\": 100\n" +
"        }\n" +
"          \n" +
"    },\n" +
"    \"salas\": {\n" +
"        \"sala0\": {\n" +
"            \"descricao\": \"Estou em uma cabana abandonada mal iluminada. Grilos cantam e o suor escorre pela pele como se tivesse em uma febre alta. A minha frente vejo uma mesa com uma nota e uma bússola.\",\n" +
"            \"itens\": [\"nota0\", \"bussola\"],\n" +
"            \"ways\": [1, -1, -1, -1]\n" +
"        },\n" +
"        \"sala1\": {\n" +
"            \"descricao\": \"Estou numa floresta e existem duas trilhas que eu posso seguir. Ao leste há um grande lago e uma canoa. Ao oeste, consigo ver uma caminhonete velha.\",\n" +
"            \"itens\": [],\n" +
"            \"ways\": [-1, 0, 2, 3]\n" +
"        },\n" +
"        \"sala2\": {\n" +
"            \"descricao\": \"Estou na beira de um lago calmo vejo uma canoa encostada na margem a minha frente. Não há caminhos para seguir adiante, só posso voltar por oeste por onde vim.\",\n" +
"            \"itens\": [\"canoa\", \"nota2\"],\n" +
"            \"ways\": [-1, -1, -1, 1]\n" +
"        },\n" +
"        \"sala3\": {\n" +
"            \"descricao\": \"Estou em frente à caminhonete. Vejo mais uma cabana ao norte com luzes acesas e uma trilha a oeste.\",\n" +
"            \"itens\": [],\n" +
"            \"ways\": [5, -1 4, 1]\n" +
"        },\n" +
"        \"sala4\": {\n" +
"            \"descricao\": \"A trilha termina em uma clareira com uma rocha ao centro. Na rocha existem símbolos desenhados e parece um local de ritual.\",\n" +
"            \"itens\": [\"nota4\"],\n" +
"            \"ways\": [-1, -1, 3, -1]\n" +
"        },\n" +
"        \"sala5\": {\n" +
"            \"descricao\": \"Estou em frente a uma cabana com as luzes acesas. A porta a minha frente está entreaberta e consigo ouvir um choro infantil vindo de dentro. Na frente da casa há uma caixa de correio americana com algumas cartas.\",\n" +
"            \"itens\": [\"cartas\"],\n" +
"            \"ways\": [6, 3, -1, -1]\n" +
"        },\n" +
"        \"sala6\": {\n" +
"            \"descricao\": \"Na sala onde estou há sangue. Há desenhos de sangue pelas paredes com os símbolos mais estranho. Não há nada na sala exceto um bebe no meio de um macabro círculo de sangue no meio da sala. Vejo que há uma passagem para frente para outra sala.\",\n" +
"            \"itens\": [\"crianca\"],\n" +
"            \"ways\": [7, 5, -1, -1]\n" +
"        },\n" +
"        \"sala7\": {\n" +
"            \"descricao\": \"Estou em uma sala com uma estante com muitos livros e muita poeira em frente a um gaveteiro. Ao leste vejo uma escada que dá em outro andar\",\n" +
"            \"itens\": [\"estante\", \"gaveteiro\", \"arma\"],\n" +
"            \"ways\": [10, 6, 8, -1]\n" +
"        },\n" +
"        \"sala8\": {\n" +
"            \"descricao\": \"Estou no hall do segundo andar. Seguindo leste vejo um corredor de portas lacradas por estacas de madeira à esquerda e a direita. No final do corredor vejo uma porta que está entreaberta e não tem estacas bloqueando a passagem\",\n" +
"            \"itens\": [],\n" +
"            \"ways\": [-1, -1, 9, 7]\n" +
"        },\n" +
"        \"sala9\": {\n" +
"            \"descricao\": \"Estou em uma sala adornada em todos os cantos por imagens terríveis de demonios e pessoas sofrendo. A sala é escura pois a única fonte de luz vem das velas um altar onde há uma pessoa fazendo orações em uma linguagem que não conheço.\",\n" +
"            \"itens\": [\"velha\", \"altar\"],\n" +
"            \"ways\": [-1, -1, -1, 8]\n" +
"        },\n" +
"        \"sala10\": {\n" +
"            \"descricao\": \"Estou no quintal de trás da casa. Há alguns galões no canto e uma casa de cachorro.\",\n" +
"            \"itens\": [\"galao\", \"casaCachorro\"],\n" +
"            \"ways\": [-1, 7, -1, -1]\n" +
"        }\n" +
"    }\n" +
"}";

}
