package inventory;

import item.Item;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author marcos 
 * @time 2:29:30 PM
 */
public abstract class Inventory{
    Collection c;
    <T extends Item> Inventory (Collection<T> c){ //Coleção de Itens
        this.c = c;
    }
    
    public abstract <T extends Item> boolean add(T d);
    public abstract <T extends Item> boolean remove(T d);
    public <T extends Item> boolean search(String d) {        
        for (Iterator it = c.iterator(); it.hasNext();) {
            Item c1 = (Item) it.next();
            if (c1.getName().equals(d)){
                return true;
            }
        }
        return false;
    }    
}
