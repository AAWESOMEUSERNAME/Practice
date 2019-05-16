package designPatterns.createTypePatterns.abstractFactoryPattern.product.productBImpl;

import designPatterns.createTypePatterns.abstractFactoryPattern.product.ProductB;

public class NikeProductB implements ProductB {
    @Override
    public void useProductB() {
        System.out.println("使用Nike 产品B");
    }
}
