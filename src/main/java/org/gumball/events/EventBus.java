package org.gumball.events;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.WeakEventHandler;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EventBus {
    Map<Class, List<EventHandler>> listenerMap = null;

    public EventBus() {
        listenerMap = new HashMap<>();
    }

    public <T extends Event> void addListener(Class<T> clazz, WeakEventHandler<T> listener) {
        List<EventHandler> list = listenerMap.get(clazz);
        if (list == null) {
            list = new ArrayList<>();
            listenerMap.put(clazz, list);
        }
        list.add(listener);
    }

    public void fireEvent(Event event) {
        Class c = event.getClass();
        if (listenerMap.containsKey(c) == false)
            return;
        listenerMap.get(c).stream().forEach(eventHandler -> eventHandler.handle(event));
    }
}
