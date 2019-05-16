package designPatterns.createTypePatterns.abstractFactoryPattern.product.productAImpl;

import designPatterns.createTypePatterns.abstractFactoryPattern.product.ProductA;

public class NikeProductA implements ProductA {
    @Override
    public void useProductA() {
        System.out.println("使用Nike 产品A");
    }
}
