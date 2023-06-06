
package lab6;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stepan Babaev
 */
public class Lab6 {
//Работа с файлами

    public static void main(String[] args)  {
       //Создаем файлы test.txt
        File file =new File("test.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        
        
        //Выводим файлы в текущей директории
        File dir = new File (".");
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept (File currentFile){
                return currentFile.isFile();
            }
        });
        
        for (File f : files) {
            System.out.println(f.getName());
            
        }
        
        
    }
    
}
