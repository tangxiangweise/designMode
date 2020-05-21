package com.design.patterns.structural.proxy;

import com.design.patterns.structural.proxy.dynamic.CglibInterceptor;
import com.design.patterns.structural.proxy.dynamic.JavaProxyInvocationHandler;
import com.design.patterns.structural.proxy.impl.HelloServiceImpl;
import com.design.patterns.structural.proxy.service.IHelloService;
import com.design.patterns.structural.proxy.stat.StaticProxyHello;

public class Client {

    public static void main(String[] args) {
        jdkProxy();
        cglibProxy();
    }

    public static void staticTest() {
        StaticProxyHello proxyHello = new StaticProxyHello();
        proxyHello.sayHello("txw");
    }

    public static void jdkProxy() {
        JavaProxyInvocationHandler proxyHello = new JavaProxyInvocationHandler(new HelloServiceImpl());
        IHelloService helloService = (IHelloService) proxyHello.newProxyInstance();
        helloService.sayHello("txw");
        helloService.sayByeBye("txw");
    }

    public static void cglibProxy() {
        CglibInterceptor proxyHello = new CglibInterceptor();
        IHelloService helloService = (IHelloService) proxyHello.newProxyInstance(HelloServiceImpl.class);
        helloService.sayHello("txw");
        helloService.sayByeBye("txw");
    }


}
