
package javaapplication32;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Stepan Babaev    
 */
public class JavaApplication32 {

    
    public static void main(String[] args) throws IOException {
     //Server 
     
        ServerSocket server = new ServerSocket(30333);
        
        Socket soc =server.accept();
        //Нужен поток управления - дополнительно 
        
        System.out.println("Client "+ soc.getInetAddress().getHostAddress()+ " connected");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        String str = reader.readLine();
        System.out.println("Client sent: " + str);
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
        
        writer.write(str);
        writer.write(" - accepted\n");
        writer.flush();
        
        
        
     
     
     
     
    }
    
}
