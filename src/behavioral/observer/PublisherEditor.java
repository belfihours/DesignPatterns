package behavioral.observer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PublisherEditor {
    public PublisherBase events;
    private File file;

    public PublisherEditor() {
        events = new PublisherBase();
    }

    public void open(String path){
        this.file = new File(path);
        events.notify(EventType.open);
    }

    public void writeFile(){
        try(OutputStream oStream = new FileOutputStream(file)){
            oStream.write("something".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        events.notify(EventType.write);
    }
}
