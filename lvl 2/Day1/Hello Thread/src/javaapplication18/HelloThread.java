
package javaapplication18;


public class HelloThread extends Thread{

    @Override
    public void run() {
    
        System.out.println("Hello from :" +Thread.currentThread() + "!!!");
        
    }
    
    
}
