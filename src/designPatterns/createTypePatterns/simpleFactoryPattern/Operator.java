package designPatterns.createTypePatterns.simpleFactoryPattern;

public abstract class Operator {
    protected double numberA;
    protected double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    protected abstract double calculate();
}
