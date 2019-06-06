package designPatterns.behaviorTypePatterns.iteratorPattern;

public class Client {
    public static void main(String[] args) {
        Aggregate<String> concreteAggregate = new ConcreteAggregate<>();

        concreteAggregate.add("张三");
        concreteAggregate.add("李四");
        concreteAggregate.add("王五");
        concreteAggregate.add("赵六");

        Iterator<String> iterator = concreteAggregate.getIterator();
        for(String item = iterator.next();
            iterator.hasNext();
            item = iterator.next()){
            System.out.println(iterator.current());
            System.out.println(item);
        }
    }
}
