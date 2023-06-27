
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
        
        Socket soc =server.accept(); //Должен работать в потоке для 
        //Нужен поток управления - дополнительно 
        
        System.out.println("Client "+ soc.getInetAddress().getHostAddress()+ " connected");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
        String str;
        
        
        while (true) {
        str = reader.readLine();
        if ("close".equals(str)) break;
        System.out.println("Client sent: " + str);
        
        
        
        writer.write(str);
        writer.write(" - accepted\n");
        writer.flush();
        
        
        }
        System.out.println("Client closed connection");
     
     
     
    }
    
}
