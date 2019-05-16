package designPatterns.createTypePatterns.abstractFactoryPattern.product.productBImpl;

import designPatterns.createTypePatterns.abstractFactoryPattern.product.ProductB;

public class HMProductB implements ProductB{
    @Override
    public void useProductB() {
        System.out.println("使用H&M 产品B");
    }
}
