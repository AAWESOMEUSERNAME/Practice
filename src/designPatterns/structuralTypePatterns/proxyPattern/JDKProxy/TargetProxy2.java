package designPatterns.structuralTypePatterns.proxyPattern.JDKProxy;

import designPatterns.structuralTypePatterns.proxyPattern.TargetInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 目标对象代理对象
 */
public class TargetProxy2{

    public TargetInterface getProxyInstance(TargetInterface target){
        Class<? extends TargetInterface> clazz = target.getClass();
        return (TargetInterface)Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object returnValue;
                if("method1".equals(method.getName())){// 此处可对方法进行筛选，否则全部方法都会被扩展
                    beforeMethod();
                    returnValue = method.invoke(target, args);
                    afterMethod();
                }else{
                    returnValue = method.invoke(target, args);
                }
                return returnValue;
            }
            private void beforeMethod(){
                System.out.println("代理对象方法 before");
            }
            private void afterMethod(){
                System.out.println("代理对象方法 after");
            }
        });
    }
}
