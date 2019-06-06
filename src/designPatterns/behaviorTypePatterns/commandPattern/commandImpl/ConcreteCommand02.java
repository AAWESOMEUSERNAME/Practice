package designPatterns.behaviorTypePatterns.commandPattern.commandImpl;

import designPatterns.behaviorTypePatterns.commandPattern.Command;
import designPatterns.behaviorTypePatterns.commandPattern.Receiver;

public class ConcreteCommand02 extends Command {
    public ConcreteCommand02() {
        super();
        super.setReceiver(new Receiver());
    }

    @Override
    public void execute() {
        super.getReceiver().doSometing2();
        super.getReceiver().doSometing3();
    }
}
