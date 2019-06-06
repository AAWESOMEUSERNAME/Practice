package designPatterns.behaviorTypePatterns.iteratorPattern;

public class ConcreteIterator<T> extends Iterator<T> {
    private int current = -1;
    public ConcreteIterator(Aggregate<T> aggregate) {
        super(aggregate);
    }

    @Override
    public boolean hasNext() {
        return current < super.aggregate.size()-1;
    }

    @Override
    public T next() {
        if(hasNext()){
            return super.aggregate.get(++current);
        }else {
            return null;
        }
    }

    @Override
    public T first() {
        return super.aggregate.get(0);
    }

    @Override
    public int current() {
        return this.current;
    }
}
