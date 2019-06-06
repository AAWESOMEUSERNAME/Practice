package designPatterns.behaviorTypePatterns.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> extends Aggregate<T> {
    @Override
    public Iterator<T> getIterator() {
        return new ConcreteIterator<>(this);
    }
    private List<T> itemList = new ArrayList<>();
    public void add(T item){
        itemList.add(item);
    }
    public int size(){
        return itemList.size();
    }

    @Override
    public T get(int i) {
        return itemList.get(i);
    }
}
