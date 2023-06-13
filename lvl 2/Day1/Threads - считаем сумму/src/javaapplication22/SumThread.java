
package javaapplication22;

/**
 *
 * @author Stepan Babaev
 */
public class SumThread extends Thread{
    
    //Математика тут
    
    private  int pos; //Позиция для потока 

    public SumThread(int pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        for (int i = pos; i < GlobalData.ARRAY_LENGTH; i+=GlobalData.THREADS_COUNT) {
            GlobalData.results[pos]+=GlobalData.array[i];
        }
    }
    
    
    
    
}
