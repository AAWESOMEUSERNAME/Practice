package designPatterns.createTypePatterns.builderPattern.builderImpl;

import designPatterns.createTypePatterns.builderPattern.Builder;
import designPatterns.createTypePatterns.builderPattern.Product;
import java.util.HashMap;
import java.util.Map;

public class NikeProductBuilder implements Builder{
    Map<String,String> props = new HashMap<>();

    @Override
    public void addName() {
        props.put("name : "," Nike");
    }

    @Override
    public void addLevel() {
        props.put("level : "," S");
    }

    @Override
    public Product getProduct() {
        Product product = new Product();
        product.setProperties(props);
        return product;
    }
}
