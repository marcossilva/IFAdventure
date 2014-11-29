package item;

/**
 *
 * @author marcos
 * @time 2:32:23 PM
 */
public class Item {

    private String description;
    private int weight = 1;
    private String name = "";
    public Item(String desc) {
        this.description = desc;
    }

    public Item(String name, String desc, int weight) {
        this.name = name;
        this.description = desc;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public int getWeight() {
        return weight;
    }

    public Object getName() {
        return name;
    }
}
