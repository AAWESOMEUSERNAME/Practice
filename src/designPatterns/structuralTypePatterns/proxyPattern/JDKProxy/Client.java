package designPatterns.structuralTypePatterns.proxyPattern.JDKProxy;

import designPatterns.structuralTypePatterns.proxyPattern.Target;
import designPatterns.structuralTypePatterns.proxyPattern.TargetInterface;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        TargetInterface target = new Target();
        TargetInterface proxy1 = new TargetProxy1().getProxyInstance(target);
        TargetInterface proxy2 = new TargetProxy2().getProxyInstance(target);

        // 业务简单时，更简洁的形式，不需要单独写代理类
//      TargetInterface prox = (TargetInterface)Proxy.newProxyInstance(
//              target.getClass().getClassLoader(),
//              target.getClass().getInterfaces(),
//              (Object proxy, Method method, Object[] params)->{
//                System.out.println("代理对象方法 before");
//                Object returnValue = method.invoke(target, params);
//                System.out.println("代理对象方法 after");
//                return returnValue;
//        });

        proxy1.method01();
        System.out.println("-------------------");
        proxy1.method02();


//        proxy2.method01();
//        System.out.println("-------------------");
//        proxy2.method02();

    }
}
