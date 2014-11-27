package player;

import inventory.*;

/**
 *
 * @author marcos
 * @time 2:51:00 PM
 */
public class PlayerWithoutHP extends Player {

    public PlayerWithoutHP() {
        super(new InifiniteInventory());
    }
    
    public PlayerWithoutHP(Inventory i) {
        super(i);
    }

}
