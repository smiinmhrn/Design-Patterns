package behavioural.Memento;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class History {
    private Deque<DocumentStates> documentStates = new ArrayDeque<>();
    public void push(DocumentStates documentStates) {
        this.documentStates.push(documentStates);
    }
    public DocumentStates pop() {
        //using lists
//        var lastState = documentStates.size() - 1;
//        documentStates.remove(lastState);
//        return documentStates.get(lastState);

        //using deque
        return documentStates.pop();
    }
}
