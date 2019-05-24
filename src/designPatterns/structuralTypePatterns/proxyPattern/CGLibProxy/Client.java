package designPatterns.structuralTypePatterns.proxyPattern.CGLibProxy;

import designPatterns.structuralTypePatterns.proxyPattern.Target;

public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        Target proxy = (Target)new TargetProxy(target).getProxyInstance();
        proxy.method01();
    }
}
