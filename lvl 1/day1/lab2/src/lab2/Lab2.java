
package lab2;

/**
 *
 * @author Babaev Stepan
 */
//-wOutfileName -rInfileName 
public class Lab2 {
    
    public static void main(String[] args) {
        
        String[] keys = {"?", "r", "w"};
        ComLineParser p1 = new ComLineParser(keys);
        p1.Parse(args);
       
        
    }
    
}




