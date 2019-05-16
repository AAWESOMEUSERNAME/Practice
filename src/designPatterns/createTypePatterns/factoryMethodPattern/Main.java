package designPatterns.createTypePatterns.factoryMethodPattern;

import designPatterns.createTypePatterns.factoryMethodPattern.factoryImpl.AddFactory;

public class Main {
    public static void main(String[] args){
        Factory addFactory = new AddFactory();
        Operator operator = addFactory.getOperator();
        operator.setNumberA(1);
        operator.setNumberB(2);
        System.out.println(operator.calculate());
    }
}
