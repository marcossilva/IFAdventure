package world;

import factory.WorldFactory;
import item.Item;

/**
 *
 * @author marcos
 * @time 3:03:56 PM
 */
public abstract class WorldPiece {
    private final String DESCRIPTION;
    private final Item[] ITENS;
    private final int[] WAYS;    
    
    public WorldPiece(int numSala){
        
        this.DESCRIPTION = WorldFactory.getDescription();
        this.WAYS = WorldFactory.getWays();
        this.ITENS = WorldFactory.getItens();
    }
    
}
