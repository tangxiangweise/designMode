package com.design.patterns.structural.proxy.dynamicproxy;

import com.design.patterns.structural.proxy.OrderInfo;
import com.design.patterns.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;


    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object  bind() {
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = args[0];
        beforeMethod(object);
        Object invoke = method.invoke(target, args);
        afterMethod();
        return invoke;
    }

    private void beforeMethod(Object obj) {
        System.out.println("动态代理 before code");
        int userId = 0;
        if (obj instanceof OrderInfo) {
            OrderInfo order = (OrderInfo) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        // todo 设置dateSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        System.out.println("动态代理分配到｛db" + dbRouter + "｝处理数据");
    }

    private void afterMethod() {
        System.out.println("动态代理 after code");
    }

}
