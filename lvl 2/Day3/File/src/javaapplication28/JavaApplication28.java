
package javaapplication28;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stepan Babaev
 */
public class JavaApplication28 {

    
    public static void main(String[] args)  {
        //Создаем файл test.txt
        File file = new File("test.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        //Поиск файлов в текущей директории
        File dir = new File(".");
        File[] files = dir.listFiles((File currentFile) -> currentFile.isFile());
        for (File f : files) {
            System.out.println(f.getName());
            
        }
        
    }
    
}
