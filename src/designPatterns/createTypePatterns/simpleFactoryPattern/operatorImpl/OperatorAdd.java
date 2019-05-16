package designPatterns.createTypePatterns.simpleFactoryPattern.operatorImpl;

import designPatterns.createTypePatterns.simpleFactoryPattern.Operator;

public class OperatorAdd extends Operator {
    @Override
    protected double calculate() {
        return numberA + numberB;
    }
}
