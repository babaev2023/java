package lab9;


/**
 *
 * @author Stepan Babaev
 */
public class Singleton {
    
    private static volatile Singleton instance;
    
    private Singleton() {}

    public static synchronized Singleton getInstance() {
        // Ленивая инициализация 
        if (instance == null) instance = new Singleton();
        return instance;
    }
    
        
}
