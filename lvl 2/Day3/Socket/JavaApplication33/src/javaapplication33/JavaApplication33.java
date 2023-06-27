
package javaapplication33;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Stepan Babaev
 */
public class JavaApplication33 {

    
    public static void main(String[] args) throws IOException {
        //Client 
        Socket soc = new Socket("localhost", 30333);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        String str;
        Scanner scan = new Scanner(System.in);
        
        
        while(true) {
        
            System.out.println("close to exit > ");
            str = scan.nextLine();
            writer.write(str);
            writer.write("\n");
            writer.flush();
            if("close".equals(str)) break;
        
        
            str = reader.readLine();
            System.out.println("Server sent: "+ str);
        
        
        }
        
        System.out.println("Client closed connection");
    
    }
    
}
