
package lab10;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import javax.sound.midi.Patch;

/**
 *
 * @author Stepan Babaev
 */
public class FSServer {
    
    //Храним директорию
    private String dir;
    //Коллекция - храним клиентов 
    private ArrayList<FSMonitor> clients;
    //Флаг - чтобы отключать
    private volatile boolean canWork; 
    
    
    public FSServer(String dir) {
        this.dir = dir;
        clients = new ArrayList<>();
    }
    
    public void addClient(FSMonitor client) {
        clients.add(client);
    }
    
    public void removeClient(FSMonitor client) {
        clients.remove(client);
    }
    
    //метод запуска
    public void start() {
        canWork = true;
        run(); // Переделать на запуск потока 
    }
    //метод остановки
    public void stop() {
        canWork = false;
        
    }
    // метод запуска    
    public void run () {
        try {
            //Наблюдатель
        WatchService watch = FileSystems.getDefault().newWatchService();
            Paths.get(dir).register(watch,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE);
            while(canWork) {
                WatchKey key = watch.take(); //потом переделать когда узнаю многопоточность
                for (WatchEvent event : key.pollEvents()) {
                    String fName = event.context().toString();
                    int kind = 0;
                    if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE)
                        kind = FSMonitor.CREATE;
                    else kind = FSMonitor.REMOVE;
                    for (FSMonitor client : clients) {
                        client.event(fName, kind);
                    }
                }
                key.reset();
            }
            
            watch.close();
            
    } catch (IOException ex) {
        //Потом
    } catch (InterruptedException ex) {
        //Потом 
    }
        
    
    }
}