package designPatterns.structuralTypePatterns.flyweightPattern;

public class UnsharedConcreteFlyweight implements Flyweight {

    private String intrinsicState;

    public UnsharedConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operate(String extrinsicState) {
        System.out.println("内部状态" + intrinsicState);
        System.out.println("外部状态：" + extrinsicState);
    }
}
