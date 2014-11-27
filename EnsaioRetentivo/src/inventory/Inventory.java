package inventory;

import item.Item;
import java.util.Collection;

/**
 *
 * @author marcos 
 * @time 2:29:30 PM
 */
public abstract class Inventory{
    Collection c;
    Inventory (Collection<? extends Item> c){ //Coleção de Itens
        this.c = c;
    }
    
    public abstract <T extends Item> boolean add(T c);
    public abstract <T extends Item> boolean remove(T c);
    
}
