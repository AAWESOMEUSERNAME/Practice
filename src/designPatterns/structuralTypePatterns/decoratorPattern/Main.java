package designPatterns.structuralTypePatterns.decoratorPattern;

public class Main {
    public static void main(String[] args) {
        Component a = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        a.doSth();
    }
}
