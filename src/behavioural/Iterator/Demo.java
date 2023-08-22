package behavioural.Iterator;

public class Demo {
    public static void show() {
        var collection = new ProductCollection();
        collection.push(new Product(1, "a"));
        collection.push(new Product(2, "b"));
        collection.push(new Product(3, "c"));

        var iterator = collection.creatIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}

// SHOW HISTORY UNTIL HAVING NEXT ITE
