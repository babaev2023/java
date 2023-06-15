
package game_1;

/**
 *
 * @author Stepan Babaev
 */
public class MoveThread implements Runnable{
    
    private Thread self; 
    private JBoxFrame frame;
    private volatile boolean canMove; //Флаг
    private int delay; //задержка

    public MoveThread(JBoxFrame frame, int delay) {
        this.frame = frame;
        this.delay = delay;
        self =new Thread(this);
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
    
    public void start() {
        canMove = true;
        self.start();
    }
    
    public void stop() {
        canMove = false;
    }

    @Override
    public void run() {
        
        try {while (canMove) {            
            Thread.sleep(delay);
            frame.moveBox();
        } } catch (InterruptedException ex) {}
    }
    
}
