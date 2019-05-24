package designPatterns.structuralTypePatterns.proxyPattern.StaticProxy;

import designPatterns.structuralTypePatterns.proxyPattern.TargetInterface;

/**
 * 目标对象代理对象
 */
public class TargetProxy implements TargetInterface {
    private TargetInterface target;

    public TargetProxy(TargetInterface target) {
        this.target = target;
    }

    @Override
    public void method01() {
        beforeMethod();
        target.method01();
    }

    @Override
    public void method02() {
        target.method02();
        afterMethod();
    }

    private void beforeMethod(){
        System.out.println("代理对象方法 before");
    }

    private void afterMethod(){
        System.out.println("代理对象方法 after");
    }
}
