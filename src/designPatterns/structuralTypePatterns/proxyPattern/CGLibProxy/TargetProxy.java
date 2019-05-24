package designPatterns.structuralTypePatterns.proxyPattern.CGLibProxy;

import designPatterns.structuralTypePatterns.proxyPattern.TargetInterface;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 目标对象代理对象
 */
public class TargetProxy implements MethodInterceptor {
    private Object target;

    public TargetProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        Enhancer en = new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        beforeMethod();
        Object returnValue = method.invoke(target);
        afterMethod();
        return returnValue;
    }

    private void beforeMethod(){
        System.out.println("代理对象方法 before");
    }

    private void afterMethod(){
        System.out.println("代理对象方法 after");
    }
}
