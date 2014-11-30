package framework.player;

import framework.inventory.Inventory;

/**
 *
 * @author marcos
 * @time 2:47:36 PM
 */
public abstract class Player {
    Inventory i;
    Player(Inventory i){
        this.i = i;
    }
    
    public Inventory getInventory(){
        return i;
    }
}
