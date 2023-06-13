
package javaapplication23;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Stepan Babaev
 */
public class JavaApplication23 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
    
        ExecutorService exec = Executors.newFixedThreadPool(5);
        //5 потоков 
        
        ArrayList<Future<String>> results = new ArrayList<>();
        
        for (int i = 0; i < 12; i++) {
        //12 задач по 5     
        
        results.add(exec.submit(new Callable<String>() {
        
        //exec.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " - ok");
                return Thread.currentThread().getName();
            }
        }));
        
        }
        
        exec.shutdown();
        
        
        
        for (Future<String> result : results) {
            System.out.println("result: "+ result.get());
            
        }
        
        System.out.println("END"); 
    }
    
}
