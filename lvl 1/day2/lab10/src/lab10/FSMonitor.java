
package lab10;

/**
 *
 * @author Stepan Babaev
 */
public interface FSMonitor {
    
    static final int CREATE = 1;
    static final int REMOVE = 2;

    void event(String fName, int kind);
    
}
