package designPatterns.behaviorTypePatterns.iteratorPattern;

public abstract class Aggregate<T> {
    public abstract Iterator<T> getIterator();
    public abstract void add(T item);
    public abstract int size();
    public abstract T get(int i);
}
