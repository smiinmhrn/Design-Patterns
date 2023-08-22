package behavioural.Template;

public abstract class Window {
    public void close() {
        onClosing();
        System.out.println("closing the window from screen");
        onClosed();
    }

    protected abstract void onClosing();
    protected abstract void onClosed();
}
