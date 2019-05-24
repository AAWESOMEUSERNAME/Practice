package designPatterns.structuralTypePatterns.proxyPattern.StaticProxy;

import designPatterns.structuralTypePatterns.proxyPattern.Target;
import designPatterns.structuralTypePatterns.proxyPattern.TargetInterface;

public class Client {
    public static void main(String[] args) {
        TargetInterface target = new Target();
        TargetInterface proxy = new TargetProxy(target);
        proxy.method01();
        System.out.println("-----------");
        proxy.method02();
    }
}
