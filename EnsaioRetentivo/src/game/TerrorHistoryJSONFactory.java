package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONObject;

/**
 *
 * @author marcos
 * @time 3:07:23 PM
 */
public class TerrorHistoryJSONFactory {
    private static TerrorHistoryJSONFactory instance;
    private static JSONObject game;   
    private TerrorHistoryJSONFactory(){
        File json = new File(System.getProperty("user.dir")+File.separator+"game"+File.separator+"TerrorHistoryGame.json");
        System.out.println(json.toString());
        if (json.exists()){
            //<editor-fold defaultstate="collapsed" desc="Le o JSON e carrega em game">
            StringBuilder temp = new StringBuilder();
            try {
                Scanner in = new Scanner(json);
                while(in.hasNext()){
                    temp.append(in.nextLine()).append("\n");
                }
            } catch (FileNotFoundException ex) {
                //Não é ncessário tratar pois o arquivo existe
            }
            game = new JSONObject(temp.toString());
//</editor-fold>
        } else {
            System.out.println("Arquivo n existe");
            TerrorHistoryJSONFactory.criaJSON();
        }
    }
    public static TerrorHistoryJSONFactory getInstance(){
        if (instance == null){
            instance = new TerrorHistoryJSONFactory();
        }
        return instance;
    }
    
    public static JSONObject getObject(int num){
        TerrorHistoryJSONFactory json = TerrorHistoryJSONFactory.getInstance();
        return null;
    }
    
    private static void criaJSON() {
        game = new JSONObject(JSONBackup.json);
    }
    public static void main(String[] args) {
        TerrorHistoryJSONFactory t = new TerrorHistoryJSONFactory();
    }

}