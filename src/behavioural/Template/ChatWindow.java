package behavioural.Template;

public class ChatWindow extends Window{
    @Override
    protected void onClosing() {
        System.out.println("disconnecting from the server");
    }

    @Override
    protected void onClosed() {
        System.out.println("already disconnected");
    }
}
