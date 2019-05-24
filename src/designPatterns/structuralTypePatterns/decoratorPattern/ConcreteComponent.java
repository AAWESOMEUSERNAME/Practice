package designPatterns.structuralTypePatterns.decoratorPattern;

public class ConcreteComponent implements Component {
    @Override
    public void doSth() {
        System.out.println("基本的组件方法");
    }
}
