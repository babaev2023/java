package javaapplication20;

/**
 *
 * @author Stepan Babaev
 */
public class CancelThread implements Runnable{
    
    private Thread self; 
    private static int threadsCounter;
    private int thereadID;
    private int counter;
    private volatile boolean canWork;

    public CancelThread() {
        thereadID = threadsCounter++;
        self = new Thread(this, "Cancel-"+ thereadID);
        
    }
    
    public int start () {
        canWork = true;
        self.start();
        return counter;
    }
    
    public int stop () {
        System.out.println("Stop it's work");
        canWork = false;
        return counter;
    }
    
    public int interrupt () {
        System.out.println("Interrupt!");
        self.interrupt();
        return counter;
    }
        
    
    public  int join(int ms) throws InterruptedException {
        self.join(ms);
        return counter;
    }

    @Override
    public void run() {
        /*  while (true) {
        try {
        Thread.sleep(50);
        } catch (InterruptedException ex) {
        System.out.println("Stop");
        break; //
        }
        counter++;
        }*/
        
        while (canWork) {            
            counter++;
        }
    }
    
    
}
