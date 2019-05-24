package designPatterns.structuralTypePatterns.compositePattern;

public interface Component {
    void add(Component component);
    void delete(Component component);
    void show(int deepth);
    void showLeafName();
}
