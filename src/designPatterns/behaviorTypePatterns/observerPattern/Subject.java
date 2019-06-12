package designPatterns.behaviorTypePatterns.observerPattern;

public interface Subject {
    void notify(String msg);
    String getState();
    String getName();
    void addObserver(Observer observer);
    void changeState(String state);
}
