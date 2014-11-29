package world;

import game.TerrorHistoryJSONFactory;
import item.Item;
import org.json.JSONObject;

/**
 *
 * @author marcos
 * @time 7:16:54 PM
 */
public class WorldFactory {   
    private WorldFactory(){}
    private int num;
    public WorldFactory(int num){
        this.num = num;
    }
    static String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static int[] getWays() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Item[] getItens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
