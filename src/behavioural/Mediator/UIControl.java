package behavioural.Mediator;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    public void notifyEventHandlers() {
        for (var handler : eventHandlers)
            handler.handle();
    }
}
