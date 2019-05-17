package designPatterns.createTypePatterns.builderPattern;

public class Director {
    public void construct(Builder builder){
        builder.addLevel();
        builder.addName();
    }
}
