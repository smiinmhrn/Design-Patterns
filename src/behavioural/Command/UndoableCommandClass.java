package behavioural.Command;

public abstract class UndoableCommandClass implements UndoableCommand{
    protected VideoEditor videoEditor;
    protected History history;

    public UndoableCommandClass(VideoEditor videoEditor,History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }


    @Override
    public void execute() {
        doExecute();

        history.push(this);
    }
    protected abstract void doExecute();
}
