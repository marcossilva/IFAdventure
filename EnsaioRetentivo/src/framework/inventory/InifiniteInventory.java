package framework.inventory;

import framework.item.Item;
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
    public <T extends Item> boolean add(T i) {
        return this.c.add(i);
    }

    @Override
    public <T extends Item> boolean remove(T c) {
        return this.c.remove(c);
    }
    

}
