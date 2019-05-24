package designPatterns.structuralTypePatterns.compositePattern;

public class Main {
    public static void main(String[] args) {
        Component root = new Branch("root");
        root.add(new Leaf("leaf01"));
        root.add(new Leaf("leaf02"));
        Component branch01 = new Branch("branch01");
        root.add(branch01);
        branch01.add(new Leaf("leaf03"));
        Component leaf04 = new Leaf("leaf04");
        branch01.delete(leaf04);
        root.show(1);
        root.showLeafName();

    }
}
