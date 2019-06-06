package designPatterns.behaviorTypePatterns.commandPattern.commandImpl;

import designPatterns.behaviorTypePatterns.commandPattern.Command;
import designPatterns.behaviorTypePatterns.commandPattern.Receiver;

public class ConcreteCommand01 extends Command {
    public ConcreteCommand01() {
        super();
        super.setReceiver(new Receiver());
    }

    @Override
    public void execute() {
        super.getReceiver().doSometing1();
        super.getReceiver().doSometing2();
    }
}
