package factory;

import item.Item;
import org.json.JSONObject;

/**
 *
 * @author marcos
 * @time 7:16:54 PM
 */
public class WorldFactory {
    private WorldFactory lastRoom;
    private WorldFactory(){ 
    }
    public WorldFactory(int num){
        //Carrega o JSON da sala especificada
        JSONObject room = JSONFactory.getInstance(int num);
    }
    public static Item[] getItens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int[] getWays() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
