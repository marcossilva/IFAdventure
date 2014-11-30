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
    public final static String json = "{" +
"	\"comandos\":" +
"	{" +
"		\"inventário\":[\"usar\", \"inventorio\", \"descartar\"]," +
"		\"movimento\":[\"ir\", \"andar\", \"descer\", \"subir\"]," +
"		\"observar\":[\"analisar\", \"descrever\", \"observar\", \"ver\"]," +
"		\"observarEadicionar\":[\"pegar\"]" +
"	}," +
"	\"itens\":" +
"	{" +
"		\"nota0\":{		" +
"			\"descricao\":\"\\\"Janeiro 18, 1998. Julie acaba de voltar do médico e felizmente vimos que está tudo bem com o bebê. Ela ainda está abalada com o acidente e precisa de repouso. Precisamos ter cautela para que nada aconteça a minha pequena Lucy.\\\"\\nQuem deixou esta nota aqui? Parece uma nota de um diário, mas ela foi arrancada. Talvez se eu continuar procurando estas notas eu consiga entender o que aconteceu.\"," +
"			\"weight\":1" +
"			}," +
"		\"bussola\":{" +
"			\"descricao\":\"Apenas uma bússola velha, mas que parece funcionar.\"," +
"			\"weight\":1" +
"			}," +
"		\"canoa\":{" +
"			\"descricao\":\"Uma canoa de madeira mas parece fragilizada pelo tempo e não vejo remo em lugar algum. Vejo no entanto uma nota no fundo da canoa\"," +
"			\"weight\":1" +
"			}," +
"		\"nota1\":{" +
"			\"descricao\":\"\\\"Fevereiro 26, 1998. Como vamos manter o repouso com estes dias de carnaval? A rua com toda certeza ficará insuportável, bem como as músicas altíssimas e pessoas irritantes. Acho melhor irmos para a fazenda da minha mãe Sarah. Julie está melhorando mas eu ainda estou receoso sobre a saúde do bebê\\\".\\n\\nEu definitivamete preciso encontrar mais páginas deste diário. Mas também preciso sair daqui. Será que estou nesta fazenda? E onde estarão Julie e Lucy?\"," +
"			\"weight\":1" +
"			}," +
"		\"nota2\":{" +
"			\"descricao\":\"\\\"São elas! Elas merecem! Seus espíritos farão parte de um propósito maior. Devo sacrificá-los para o meu senhor. Elas merecem, eu sei que merecem. Elas merecem. Elas merecem. Elas merecem.....\\\"\\nMas esta nota é diferente. Seu papel é diferente, a cor da caneta é diferente, mas a letra é a mesma.\"," +
"			\"weight\":1" +
"			}," +
"		\"cartas\":{" +
"			\"descricao\":\"São contas de banco endereçadas à Sarah Millman\"," +
"			\"weight\":1" +
"			}," +
"		\"gaveta\":{" +
"			\"descricao\":\"Dentro da gaveta há alguns papéis e uma arma. Um pistola com algumas balas. Vou levar isso comigo.\"," +
"			\"weight\":1" +
"			}," +
"		\"arma\":{" +
"			\"descricao\":\"\"," +
"			\"weight\":10" +
"			}," +
"		\"velha\":{" +
"			\"descricao\":\"Velha\"," +
"			\"weight\":10" +
"			}," +
"		\"altar\":{" +
"			\"descricao\":\"O altar tem velas de cera preta queimando lentamente. A essencia exalada é podre a quase me faz vomitar. Mas percebo que há uma anotação em uma foto apoiada em uma vela.\"," +
"			\"weight\":1" +
"			}," +
"		\"notaAltar\":{" +
"			\"descricao\":\"Está escrito:\n\"Meu filho,\\n\\nEu disse a voce que sua mulher não era uma boa esposa. Voce não quis acreditar em mim por isso devo salvar voce de uma vida ao lado desse leviatã. Sua filha só poderá ser salva se for retirada do ventre dessa mulher a tempo. Farei qualquer sacrifício para que voce fique feliz.\\n\\nCom amor,\\nSarah, sua mãe querida\\\"\"," +
"			\"weight\":1" +
"			}," +
"		\"chave\":{" +
"			\"descricao\":\"É uma chave normal. Parece que é de algum ambiente interno da casa.\"," +
"			\"weight\":1" +
"			}," +
"		\"galao\":{" +
"			\"descricao\":\"O galão contém gasolina e está cheio.\"," +
"			\"weight\":1" +
"			}," +
"		\"casaCachorro\":{" +
"			\"descricao\":\"Está com um cheiro horrível. Acho que há algo morto ali dentro.\"," +
"			\"weight\":1" +
"			}		" +
"	}," +
"	\"salas\":" +
"	{" +
"		\"sala0\":{" +
"			\"descricao\":\"Estou em uma cabana abandonada mal iluminada. Grilos cantam e o suor escorre pela pele como se tivesse em uma febre alta. A minha frente vejo uma mesa com uma nota e uma bússola.\",			" +
"			\"itens\":[\"nota0\", \"bussola\"]," +
"			\"ways\":[1,-1,-1,-1]" +
"			}," +
"		\"sala1\":{" +
"			\"descricao\":\"Estou numa floresta e existem duas trilhas que eu posso seguir. Ao leste há um grande lago e uma canoa. Ao oeste, consigo ver uma caminhonete velha.\"," +
"			\"itens\":[]," +
"			\"ways\":[-1,0,2,3]" +
"			}," +
"		\"sala2\":{" +
"			\"descricao\":\"Estou na beira de um lago calmo vejo uma canoa encostada na margem a minha frente. Não há caminhos para seguir adiante, só posso voltar por oeste por onde vim.\"," +
"			\"itens\":[\"canoa\"]," +
"			\"ways\":[-1,-1,-1,1]" +
"			}," +
"		\"sala3\":{" +
"			\"descricao\":\"Estou em frente à caminhonete. Vejo mais uma cabana ao norte com luzes acesas e uma trilha a oeste.\"," +
"			\"itens\":[]," +
"			\"ways\":[1,-1,4,5]" +
"			}," +
"		\"sala4\":{" +
"			\"descricao\":\"A trilha termina em uma clareira com uma rocha ao centro. Na rocha existem símbolos desenhados e parece um local de ritual.\"," +
"			\"itens\":[\"nota2\"]," +
"			\"ways\":[-1,-1,3,-1]" +
"			}," +
"		\"sala5\":{" +
"			\"descricao\":\"Estou em frente a uma cabana com as luzes acesas. A porta a minha frente está entreaberta e consigo ouvir um choro infantil vindo de dentro. Na frente da casa há uma caixa de correio americana com algumas cartas.\"," +
"			\"itens\":[\"cartas\"]," +
"			\"ways\":[6,3,-1,-1]" +
"			}," +
"		\"sala6\":{" +
"			\"descricao\":\"Na sala onde estou há sangue. Há desenhos de sangue pelas paredes com os símbolos mais estranho. Não há nada na sala exceto um bebe no meio de um macabro círculo de sangue no meio da sala. A criança chora em desespero pois está nua e coberta de sangue. Vejo que há uma passagem para frente para outra sala.\"," +
"			\"itens\":[\"crianca\"]," +
"			\"ways\":[7,5,-1,-1]" +
"			}," +
"		\"sala7\":{" +
"			\"descricao\":\"Estou em uma sala com uma estante com muitos livros e muita poeira em frente a um gaveteiro. Ao leste vejo uma escada que dá em outro andar\"," +
"			\"itens\":[\"estante\",\"gaveteiro\"]," +
"			\"ways\":[10,6,8,-1]" +
"			}," +
"		\"sala8\":{" +
"			\"descricao\":\"Estou no hall do segundo andar. Seguindo leste vejo um corredor de portas lacradas por estacas de madeira à esquerda e a direita. No final do corredor vejo uma porta que está entreaberta e não tem estacas bloqueando a passagem\\n\"," +
"			\"itens\":[\"porta\"]," +
"			\"ways\":[-1,-1,9,7]" +
"			}," +
"		\"sala9\":{" +
"			\"descricao\":\"Estou em uma sala adornada em todos os cantos por imagens terríveis de demonios e pessoas sofrendo. A sala é escura pois a única fonte de luz vem das velas um altar onde há uma pessoa fazendo orações em uma linguagem que não conheço.\"," +
"			\"itens\":[\"velha\", \"altar\"]," +
"			\"ways\":[-1,-1,-1,8]" +
"			}," +
"		\"sala10\":{" +
"			\"descricao\":\"Estou no quintal de trás da casa. Há alguns galões no canto e uma casa de cachorro.\"," +
"			\"itens\":[\"galao\", \"casaCachorro\"]," +
"			\"ways\":[-1,7,-1,-1]" +
"			}			" +
"	}" +
"}";
    
    public static void main(String[] args) {
        System.out.println(JSONBackup.json);
    }
}
