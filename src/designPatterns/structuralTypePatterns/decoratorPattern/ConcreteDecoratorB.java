package designPatterns.structuralTypePatterns.decoratorPattern;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void beforeDoSth() {
        System.out.println("装饰器B before");
    }

    @Override
    public void afterDoSth() {
    }

}
