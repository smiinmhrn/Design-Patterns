package behavioural.Command;

public class Demo {
    public static void show() {
        var videoEditor = new VideoEditor();
        var history = new History();

        var setTextCommand = new SetTextCommand("Video Title", videoEditor, history);
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);
    }
}
