package framework.world;

import framework.item.Item;
import framework.org.json.JSONArray;
import framework.org.json.JSONObject;
import java.util.LinkedList;
import java.util.List;
import myGame.JSONFactory;

/**
 *
 * @author marcos
 * @time 3:03:56 PM
 */
public class WorldPiece {
    private final String DESCRIPTION;
    private final List<Item> ITENS;
    private final int[] WAYS;
    private final int NUM_SALA;
    
    public WorldPiece(int numSala){
        this.NUM_SALA = numSala;
        JSONObject salaInfo = JSONFactory.getWorldPiece(numSala);
        this.DESCRIPTION = salaInfo.getString("descricao");
        //<editor-fold defaultstate="collapsed" desc="Cria Itens da sala">
        JSONArray itensSala = salaInfo.getJSONArray("itens");
        ITENS = new LinkedList<>();
        String nomeItem = "";
        for (int i = 0; i < itensSala.length(); i++) {
            nomeItem = (String) itensSala.get(i);
            JSONObject itemI = JSONFactory.getItens().getJSONObject(nomeItem);
            ITENS.add(new Item(nomeItem, itemI.getString("descricao"), itemI.getInt("weight")));
        }
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Cria waysOut da Sala">
        WAYS = new int[4];
        JSONArray waysOut = salaInfo.getJSONArray("ways");
        for (int i = 0; i < waysOut.length(); i++) {
            WAYS[i] = waysOut.getInt(i);
        }
//</editor-fold>        
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public int getNUM_SALA() {
        return NUM_SALA;
    }

    public List getITENS() {
        return ITENS;
    }

    public int[] getWAYS() {
        return WAYS;
    }
    
}
