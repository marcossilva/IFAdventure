package world;

import item.Item;

/**
 *
 * @author marcos
 * @time 3:03:56 PM
 */
public class WorldPiece {
    private final String DESCRIPTION;
    private final Item[] ITENS;
    private final int[] WAYS;
    private final int NUM_SALA;
    
    public WorldPiece(int numSala){
        this.NUM_SALA = numSala;
        this.DESCRIPTION = WorldFactory.getDescription();
        this.WAYS = WorldFactory.getWays();
        this.ITENS = WorldFactory.getItens();
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public int getNUM_SALA() {
        return NUM_SALA;
    }

    public Item[] getITENS() {
        return ITENS;
    }

    public int[] getWAYS() {
        return WAYS;
    }
    
}
