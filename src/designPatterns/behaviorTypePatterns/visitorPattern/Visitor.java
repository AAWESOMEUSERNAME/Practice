package designPatterns.behaviorTypePatterns.visitorPattern;

public interface Visitor {
    void visitElementA(ConcreteElementA concreteElementA);
    void visitElementB(ConcreteElementB concreteElementB);
}
