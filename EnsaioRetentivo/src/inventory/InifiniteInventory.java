package inventory;

import item.Item;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author marcos
 * @time 2:33:28 PM
 */
public class InifiniteInventory extends Inventory {

    public InifiniteInventory(Collection c) {
        super(c);
    }

    public InifiniteInventory() {
        super(new ArrayList<Item>());
    }
    @Override
    public boolean add(Item i) {
        return this.c.add(i);
    }

    @Override
    public <T extends Item> boolean remove(T c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
