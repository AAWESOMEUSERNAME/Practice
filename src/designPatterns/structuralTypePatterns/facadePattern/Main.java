package designPatterns.structuralTypePatterns.facadePattern;

public class Main {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.methodA();
        System.out.println("-------");
        facade.methodB();
    }
}
