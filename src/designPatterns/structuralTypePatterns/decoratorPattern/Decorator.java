package designPatterns.structuralTypePatterns.decoratorPattern;

public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void beforeDoSth();
    public abstract void afterDoSth();

    @Override
    public void doSth() {
        beforeDoSth();
        component.doSth();
        afterDoSth();
    }
}
