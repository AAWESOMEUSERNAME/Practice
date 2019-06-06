package designPatterns.behaviorTypePatterns.iteratorPattern;


public abstract class Iterator<T> {
    protected Aggregate<T> aggregate;
    public Iterator(Aggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    public abstract boolean hasNext();
    public abstract T next();
    public abstract T first();
    public abstract int current();
}
