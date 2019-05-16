package designPatterns.createTypePatterns.abstractFactoryPattern;

import designPatterns.createTypePatterns.abstractFactoryPattern.product.ProductA;
import designPatterns.createTypePatterns.abstractFactoryPattern.product.ProductB;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        try {
            ProductA productA = factory.produceProductA();
            ProductB productB = factory.produceProductB();
            productA.useProductA();
            productB.useProductB();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
