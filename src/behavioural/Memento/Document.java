package behavioural.Memento;

public class Document {
    private String content;
    private String fontSize;
    private String fonName;

    public Document(String content, String fontSize, String fonName) {
        this.content = content;
        this.fontSize = fontSize;
        this.fonName = fonName;
    }

    public DocumentStates creatState() {
        return new DocumentStates(content, fontSize, fonName);
    }
    public void restore(DocumentStates documentStates) {
        content = documentStates.getContent();
        fonName = documentStates.getFonName();
        fontSize = documentStates.getFontSize();
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
