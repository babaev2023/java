
package javaapplication33;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author Stepan Babaev
 */
public class JavaApplication33 {

    
    public static void main(String[] args) throws IOException {
        //Client 
        Socket soc = new Socket("localhost", 30333);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
        writer.write("Hello Server! \n");
        writer.flush();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        String str = reader.readLine();
        System.out.println("Server sent: "+ str);
        
        
    }
    
}
