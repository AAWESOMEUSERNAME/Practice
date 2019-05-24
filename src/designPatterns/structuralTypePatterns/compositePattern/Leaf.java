package designPatterns.structuralTypePatterns.compositePattern;

public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void showLeafName() {
        System.out.println(name);
    }

    @Override
    public void show(int deepth) {
        for (int i=0;i<deepth;i++){
            System.out.print('-');
        }
        System.out.println(name);
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public void delete(Component component) {
    }
}
