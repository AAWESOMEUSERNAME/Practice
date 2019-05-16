package designPatterns.createTypePatterns.abstractFactoryPattern.product.productAImpl;

import designPatterns.createTypePatterns.abstractFactoryPattern.product.ProductA;

public class HMProductA implements ProductA{
    @Override
    public void useProductA() {
        System.out.println("使用H&M 产品A");
    }
}
