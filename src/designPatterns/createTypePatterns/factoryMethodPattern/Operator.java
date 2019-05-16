package designPatterns.createTypePatterns.factoryMethodPattern;

public abstract class Operator {
    protected double numberA;
    protected double numberB;

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public abstract double calculate();
}
