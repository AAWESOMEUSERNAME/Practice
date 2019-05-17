package designPatterns.createTypePatterns.prototypePattern;

public class CloneableClass implements Cloneable{
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return clone;
    }
}
