package designPatterns.behaviorTypePatterns.chainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {
        Handler concreteHandler1 = new ConcreteHandler1();
        Handler concreteHandler2 = new ConcreteHandler2();

        concreteHandler1.setSuccessor(concreteHandler2);
        concreteHandler2.setSuccessor(new DefaultHandler());

        int[] request = new int[]{1,20,11};
        for (int i : request){
            concreteHandler1.handlerRequest(i);
        }
        System.out.println("===========");
        for (int i : request){
            concreteHandler2.handlerRequest(i);
        }
    }
}
