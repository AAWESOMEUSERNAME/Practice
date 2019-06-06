package designPatterns.behaviorTypePatterns.commandPattern;

import designPatterns.behaviorTypePatterns.commandPattern.commandImpl.ConcreteCommand01;
import designPatterns.behaviorTypePatterns.commandPattern.commandImpl.ConcreteCommand02;

public class Client {
    public static void main(String[] args) {
        Command command01 = new ConcreteCommand01();
        Command command02 = new ConcreteCommand02();

        Invoker invoker = new Invoker();
        invoker.invokeCommand(command01);
        System.out.println("================");
        invoker.invokeCommand(command02);
    }
}
