package com.design.patterns.structural.proxy.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CglibInterceptor 用于对方法调用拦截以及回调
 */
public class CglibInterceptor implements MethodInterceptor {

    /**
     * CGLIB 增强类对象，代理类对象由Enhancer类创建的，
     * Enhancer 是CGLIB 的字节码增强器，可以很方便的对类进行扩展
     */
    private Enhancer enhancer = new Enhancer();

    /**
     * @param obj         被代理对象
     * @param method      代理的方法
     * @param args        方法参数
     * @param methodProxy CGLIB方法代理对象
     * @return cglib生成用来代替Method对象的对象，使用MethodProxy比调用JDK自身的Method直接执行方法效率会有提升
     * @throws Throwable
     */
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法调用之前。。。。");
        Object o = methodProxy.invokeSuper(obj, args);
        System.out.println("方法调用之后。。。。");
        return o;
    }

    public Object newProxyInstance(Class<?> clazz) {
        // 设置产生的代理对象的父类，增强类型
        enhancer.setSuperclass(clazz);
        // 定义代理逻辑对象为当前对象，要求当前对象实现 MethodInterceptor 接口
        enhancer.setCallback(this);
        // 默认使用无参构造函数构造对象，这是一个前提，被代理的类要提供无参构造方法
        return enhancer.create();
    }
}
