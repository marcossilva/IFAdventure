package inventory;

import item.Item;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author marcos
 * @time 2:30:16 PM
 */
public class FiniteInventory extends Inventory {

    private int capacity;

    public FiniteInventory(int capacity, Collection c) {
        super(c);
        this.capacity = capacity;
    }
    
    public FiniteInventory(int capacity) {
        super(new ArrayList<Item>());
        this.capacity = capacity;
    }

    @Override
    public boolean add(Item i) {
        if (capacity > (i.getWeight() + c.size())) {
            capacity -= i.getWeight();
            return c.add(i);
        } else {
            return false;
        }
    }
    
    @Override
    public boolean remove(Item i){
        if (c.remove(i)){
            capacity += i.getWeight();
        }
        return false;
    }

}
