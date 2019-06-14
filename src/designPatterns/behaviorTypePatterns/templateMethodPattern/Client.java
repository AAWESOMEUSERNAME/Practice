package designPatterns.behaviorTypePatterns.templateMethodPattern;

public class Client {
    public static void main(String[] args) {
        AbstractClass cls1 = new ConcreteClass1();
        AbstractClass cls2 = new ConcreteClass2();

        cls1.algorithmMethod();
        System.out.println("==================");
        cls2.algorithmMethod();
    }
}
