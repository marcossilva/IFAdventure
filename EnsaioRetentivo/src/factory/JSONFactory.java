package factory;

/**
 *
 * @author marcos
 * @time 3:07:23 PM
 */
public class JSONFactory {
    private static JSONFactory instance;
    private JSONFactory(){        
    }
    public static JSONFactory getInstance(){
        if (instance == null){
            instance = new JSONFactory();
        }
        return instance;
    }

}
