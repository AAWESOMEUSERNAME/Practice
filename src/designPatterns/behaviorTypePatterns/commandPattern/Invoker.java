package designPatterns.behaviorTypePatterns.commandPattern;

public class Invoker {
    private Command command;
    public void invokeCommand(Command command){
        command.execute();
    }
}
