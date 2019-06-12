package designPatterns.behaviorTypePatterns.observerPattern.observer;

import designPatterns.behaviorTypePatterns.observerPattern.Observer;
import designPatterns.behaviorTypePatterns.observerPattern.Subject;

public class ConcreteObserver implements Observer {
    private String state = "default";
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void getMsg(Subject subject, String msg) {
        System.out.println(subject.getName() + " new state: " + subject.getState());
        System.out.println(name + " state " + state + " --> " + subject.getState());
        this.setState(subject.getState());
    }
}
