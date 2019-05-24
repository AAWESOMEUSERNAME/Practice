package designPatterns.structuralTypePatterns.compositePattern;

import java.util.HashSet;
import java.util.Set;

public class Branch implements Component {
    private String name;
    private Set<Component> children = new HashSet<>();

    public Branch(String name) {
        this.name = name;
    }

    @Override
    public void showLeafName() {
        children.forEach((item)->item.showLeafName());
//        children.forEach(new Leaf("")::showLeafName);
    }

    @Override
    public void show(int deepth) {
        for (int i=0;i<deepth;i++){
            System.out.print('-');
        }
        System.out.println(name);
        for (Component child: children) {
            child.show(deepth + 2);
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void delete(Component component) {
        children.remove(component);
    }
}
