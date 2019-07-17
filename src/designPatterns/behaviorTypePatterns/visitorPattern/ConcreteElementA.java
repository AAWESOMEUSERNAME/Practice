package designPatterns.behaviorTypePatterns.visitorPattern;

public class ConcreteElementA implements Element {
    private String name;

    public ConcreteElementA(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    public String getName() {
        return name;
    }

}
