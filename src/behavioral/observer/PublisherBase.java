package behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublisherBase {
    private final Map<EventType, ArrayList<EventListener>> subscribers;

    public PublisherBase() {
        this.subscribers = new HashMap<>();
    }

    public void subscribe(EventType eventType, EventListener listener) {
        var subList = subscribers.get(eventType);
        if(subList!=null){
            subList.add(listener);
        }
        else{
            subscribers.put(eventType, new ArrayList<>(List.of(listener)));
        }
    }

    public void unsubscribe(EventType eventType, EventListener listener){
        var subList = subscribers.get(eventType);
        if(subList!=null){
            subList.remove(listener);
        }
        else{
            eventTypeMissingError();
        }
    }

    public void notify(EventType eventType){
        var subList = subscribers.get(eventType);
        if(subList!=null){
            for(var sub : subList){
                sub.update();
            }
        }
        else{
            eventTypeMissingError();
        }
    }

    private void eventTypeMissingError(){
        System.out.println("ERROR - EventType missing");
    }
}
