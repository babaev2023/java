
package test_lab3;

/**
 *
 * @author Stepan Babaev
 */
public class Test {
    
    private int x;

    public Test(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "x=" + x;
    }
    

    
}                              