package framework.inventory;

import framework.item.Item;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author marcos 
 * @time 2:29:30 PM
 */
public abstract class Inventory{
    Collection c;
    protected int capacity = Integer.MAX_VALUE;
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
    public <T extends Item> T searchItem(String d) {        
        for (Iterator it = c.iterator(); it.hasNext();) {
            T c1 = (T) it.next();
            if (c1.getName().equals(d)){
                return c1;
            }
        }
        return null;
    }
    public int getCapacity() {
        return capacity;        
    }
    public Iterator iterator(){
        return c.iterator();
    }
}
