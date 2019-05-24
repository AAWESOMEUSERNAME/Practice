package designPatterns.structuralTypePatterns.proxyPattern;

public class Target implements TargetInterface {
    @Override
    public void method01() {
        System.out.println("目标对象 方法1 执行");
    }

    @Override
    public void method02() {
        System.out.println("目标对象 方法2 执行");
    }
}
