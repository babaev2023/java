
package javaapplication21;

/**
 *
 * @author Stepan Babaev
 */
public class JavaApplication21 {

   static int x;
    
    
    public static void main(String[] args) throws InterruptedException {
       
        Object monitor = new Object();
        
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100000; i++) {
                    synchronized (monitor) {
                        x++;
                    }
                    
                }
            }
        };
        
        Thread[] threads = new Thread[5];
        
        for (int i=0; i <threads.length; i++) {
            threads[i] = new Thread(runner);
            threads[i].start();
            
        }
        
        for (int i=0; i<threads.length; i++) {
            threads[i].join();
        }
        if (x==500000){
        System.out.println("Синхронизация");}
    }
    
}
