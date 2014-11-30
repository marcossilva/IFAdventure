package myGame;

import framework.game.JSONBackup;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import framework.org.json.JSONObject;

/**
 *
 * @author marcos
 * @time 3:07:23 PM
 */
public class JSONFactory {

    private static JSONFactory instance;
    private static JSONObject game;
    private static JSONObject gameItens;
    private static JSONObject commands;
    private static String gameName;
/**
 * retorna todos os comandos do jogo
 * @return 
 */
    public static JSONObject getCommands() {
        if (commands == null) {
            commands = game.getJSONObject("commands");
        }
        return commands;
    }
/**
 * retorna todos os itens do jogo
 * @return 
 */
    public static JSONObject getItens() {
        if (gameItens == null) {
            gameItens = game.getJSONObject("itens");
        }
        return gameItens;
    }

    /**
     * retorna todas as coisas da sala num
     *
     * @param num numero da sala desejado
     * @return
     */
    public static JSONObject getWorldPiece(int num) {
        return game.getJSONObject("sala" + num);
    }

    private JSONFactory(String gameName) {
        File json = new File(System.getProperty("user.dir") + File.separator + "game" + File.separator + gameName + ".json");
        if (json.exists()) {
            //<editor-fold defaultstate="collapsed" desc="Le o JSON e carrega em game">
            StringBuilder temp = new StringBuilder();
            try {
                Scanner in = new Scanner(json);
                while (in.hasNext()) {
                    temp.append(in.nextLine()).append("\n");
                }
            } catch (FileNotFoundException ex) {
                //Não é ncessário tratar pois o arquivo existe
            }
            game = new JSONObject(temp.toString());
//</editor-fold>
        } else {
            System.out.println("Arquivo n existe");
            JSONFactory.criaJSON();
        }
    }

    private static JSONFactory getInstance(String gameName) {
        if (instance == null) {
            JSONFactory.gameName = gameName;
            instance = new JSONFactory(gameName);
        }
        return instance;
    }

    private static void criaJSON() {
        game = new JSONObject(JSONBackup.json);
    }

}
