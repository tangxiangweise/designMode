package com.design.patterns.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JavaProxyInvocationHandler implements InvocationHandler {

    /**
     * 中间类持有委托类对象的引用，这里会构成一种静态代理关系
     */
    private Object obj;

    /**
     * 有参数构造器，传入委托类的对象
     *
     * @param obj 委托类的对象
     */
    public JavaProxyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    /**
     * 动态生成代理类对象，Proxy.newProxyInstance
     *
     * @return 返回代理类的实例
     */
    public Object newProxyInstance() {
        // 指定代理对象的类加载器
        ClassLoader loader = obj.getClass().getClassLoader();
        // 代理对象需要实现的接口，可以同时指定多个接口
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        // this 指方法调用的实际处理者，代理对象的方法调用都会转发到这里
        return Proxy.newProxyInstance(loader, interfaces, this);
    }

    /**
     * 调用处理
     *
     * @param proxy  代理对象类
     * @param method 标识具体调用的是代理类的那个方法
     * @param args   代理类方法的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke before");
        Object result = method.invoke(obj, args);
        System.out.println("invoke after");
        return result;
    }

}
