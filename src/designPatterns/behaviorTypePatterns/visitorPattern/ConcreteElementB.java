package designPatterns.behaviorTypePatterns.visitorPattern;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }
}
