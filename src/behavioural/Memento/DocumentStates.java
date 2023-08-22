package behavioural.Memento;

public class DocumentStates {
    private final String content;
    private final String fontSize;

    private final String fonName;

    public DocumentStates(String content, String fontSize, String fonName) {
        this.content = content;
        this.fontSize = fontSize;
        this.fonName = fonName;
    }

    public String getContent() {
        return content;
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getFonName() {
        return fonName;
    }
}
