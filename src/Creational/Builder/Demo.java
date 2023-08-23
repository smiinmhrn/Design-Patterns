package Creational.Builder;

import java.io.IOException;

public class Demo {
    public static void show() throws IOException {
        var document = new Document();
        document.add(new Text("Hello World"));
        document.add(new Image("pic1.jpg"));

        document.export(new HtmlDocumentBuilder(), "export.html");

        document.export(new TextDocumentBuilder(), "export.txt");
    }
}
