package designPatterns.behaviorTypePatterns.templateMethodPattern;

public abstract class AbstractClass {
    public void algorithmMethod(){
        System.out.println("公用算法实现");
        methodPart1();
        System.out.println("公用算法实现");
        methodPart2();
        System.out.println("公用算法实现");
    }

    protected abstract void methodPart1();
    protected abstract void methodPart2();

}
