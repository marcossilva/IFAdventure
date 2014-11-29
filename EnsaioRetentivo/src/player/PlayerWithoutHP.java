package player;

import inventory.*;

/**
 *
 * @author marcos
 * @time 2:51:00 PM
 */
public class PlayerWithoutHP extends Player {
    /**
     * Creates a player with a default InfiniteInventory
     */
    public PlayerWithoutHP() {
        super(new InifiniteInventory());        
    }
    
    public PlayerWithoutHP(Inventory i) {
        super(i);
    }

}
