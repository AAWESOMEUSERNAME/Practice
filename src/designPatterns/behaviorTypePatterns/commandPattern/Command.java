package designPatterns.behaviorTypePatterns.commandPattern;

public abstract class Command {
    private Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public abstract void execute();
}
