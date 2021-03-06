package designPatterns.structuralTypePatterns.decoratorPattern;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void beforeDoSth() {
        System.out.println("装饰器A before");
    }

    @Override
    public void afterDoSth() {
        System.out.println("装饰器A after");
    }
}
