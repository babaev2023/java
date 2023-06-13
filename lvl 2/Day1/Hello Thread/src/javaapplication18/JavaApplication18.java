
package javaapplication18;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stepan Babaev
 */
public class JavaApplication18 {

    
    public static void main(String[] args) {
       
        System.out.println("Start of :" + Thread.currentThread());
        
        HelloThread thread = new HelloThread();
        thread.start();
        
        try {
            thread.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("End of main()");
        
        
    }
    
}
