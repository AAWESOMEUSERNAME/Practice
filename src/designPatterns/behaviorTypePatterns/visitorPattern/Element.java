package designPatterns.behaviorTypePatterns.visitorPattern;

public interface Element {
    void accept(Visitor visitor);
}
