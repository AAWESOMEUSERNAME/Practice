package designPatterns.createTypePatterns.builderPattern;

public interface Builder {
    void addName();
    void addLevel();
    Product getProduct();
}
