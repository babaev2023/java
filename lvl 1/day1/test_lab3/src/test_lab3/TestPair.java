
package test_lab3;

/**
 *
 * @author Stepan Babaev
 */
public class TestPair extends Test{

private int y;

    public TestPair(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + ", y=" + y;
    }

  



    
    
}
