package framework.player;

import framework.inventory.FiniteInventory;
import framework.inventory.InifiniteInventory;
/**
 *
 * @author marcos
 * @time 2:48:14 PM
 */
public class PlayerWithHP extends Player {

    int hp;

    public PlayerWithHP(int health) {       
        super(new FiniteInventory(10));
        this.hp = health;        
    }

    public int hit(int hit) {
        return hp - hit;
    }

    public int recovery(int rec) {
        return hp + rec;
    }
    
    public int getHealth(){
        return hp;
    }
}
