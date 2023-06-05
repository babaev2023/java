
package lab4;

/**
 *
 * @author Stepan Babaev    
 */
public class Lab4 {

 
    public static void main(String[] args) {

      Rectangle r1 = new Rectangle(1, 2, 3, 4, "Rectangle-1");
      Circle c1 = new Circle(10, 20, 30, "Circle");
              
      System.out.println(r1);
      System.out.println(c1);
      System.out.println("================================");
      Shape[] shapes = {
          r1, c1, new Rectangle(10, 20, 30, 40, "Rectangle-2")
          
      };
      
      
        for (Shape shape : shapes) {
            System.out.println(shape);
            
        }
        
       printAreas(shapes);
       
       System.out.println("================================");
       
       for (Shape shape : shapes) {
        System.out.println(shape.area());
            
     }
        
    }

    private static void printAreas(Shape[] shapes) {
     // Так писать не нужно, но если других вариантов нет 
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle)
                System.out.println(((Rectangle)shape).area());
            else if (shape instanceof Circle)
                System.out.println(((Circle)shape).area());
        }
        
        
    }
    
}
