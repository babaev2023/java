package javaapplication19;

/**
 *
 * @author Stepan Babaev
 */
public class SecondThread extends Thread{

    @Override
    public void run() {
        try {
        for (int i = 0; i <10; i++) {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+" - " + i);
            
        }
        } catch (InterruptedException ex) {}
    } 
    
    
}
