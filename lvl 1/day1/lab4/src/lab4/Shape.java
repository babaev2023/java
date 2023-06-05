
package lab4;

/**
 *
 * @author Stepan Babaev    
 */
public abstract class Shape {
    
    private int x,y;
    private String name;

    public Shape(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    @Override
    public String toString() {
        return name  + ": x=" + x + ", y=" + y ;
    }
    
    public abstract double area();
    
    
}
