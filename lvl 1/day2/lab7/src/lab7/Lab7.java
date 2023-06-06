
package lab7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Stepan Babaev
 */
public class Lab7 {

   
    public static void main(String[] args) {
      
        writeHellotoFile("hello.txt");
        
        try {
        String str = readFromFile ("string2.txt");
        System.out.println(str);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
            
        }
        
        try {
        String str = readFromFile ("string.txt");
        System.out.println(str);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
            
        }
        
        
    }

    private static void writeHellotoFile(String hellotxt) {
        
        try (FileWriter writer = new FileWriter(hellotxt)) {
            
            writer.write("Привет из JAVA!");
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    
    }

    private static String readFromFile(String stringtxt) 
            throws IOException {
        
        
        //FileReader reader = new FileReader(stringtxt);
        //reader.
        
        BufferedReader reader = new BufferedReader (
                new InputStreamReader(new FileInputStream(stringtxt),"cp1251"));
                //new BufferedReader (new FileReader(stringtxt) ); 
                //Выше пример с выбором кодировки
        String str = reader.readLine();
        return str;
        
        
    }
}
