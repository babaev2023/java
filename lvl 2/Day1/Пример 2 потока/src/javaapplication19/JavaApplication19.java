
package javaapplication19;

/**
 *
 * @author Stepan Babaev
 */
public class JavaApplication19 {

    
    public static void main(String[] args) throws InterruptedException {
        
        SecondThread th1 = new SecondThread();
        SecondThread th2 = new SecondThread();
        
        th1.start();
        th2.start();
        
        th1.join();
        th2.join();
        
        System.out.println("End of main()");
    }
    
}
