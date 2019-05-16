package designPatterns.createTypePatterns.factoryMethodPattern.factoryImpl;

import designPatterns.createTypePatterns.factoryMethodPattern.Factory;
import designPatterns.createTypePatterns.factoryMethodPattern.Operator;
import designPatterns.createTypePatterns.factoryMethodPattern.operatorImpl.AddOperator;

public class AddFactory extends Factory{
    @Override
    public Operator getOperator() {
        return new AddOperator();
    }
}
