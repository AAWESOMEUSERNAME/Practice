package designPatterns.createTypePatterns.factoryMethodPattern.operatorImpl;

import designPatterns.createTypePatterns.factoryMethodPattern.Operator;

public class AddOperator extends Operator{
    @Override
    public double calculate() {
        return numberA + numberB;
    }
}
