package designPatterns.createTypePatterns.simpleFactoryPattern;

public class Main {
    public static void main(String[] args){
        String operate = "-";
        Operator operator = SimpleFactory.createOperate(operate);
        operator.setNumberA(1);
        operator.setNumberB(2);
        System.out.println(operator.calculate());
    }
}
