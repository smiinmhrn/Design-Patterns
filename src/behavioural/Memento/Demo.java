package behavioural.Memento;
public class Demo {
    public static void show() {
        var document = new Document("Hello", "Font 1", "10");
        var history = new History();

        history.push(document.creatState());

        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);
    }
}

// UNDO THINGS
