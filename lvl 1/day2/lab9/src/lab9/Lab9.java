
package lab9;

import java.util.Calendar;
import java.util.zip.DataFormatException;

/**
 *
 * @author Stepan Babaev
 */
public class Lab9 {

   
    public static void main(String[] args) {
        
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        if (s==s2) System.out.println("Ok");
        
        
       //Пример 
        Calendar sys = Calendar.getInstance();
        System.out.println(sys);
    }
    
}
