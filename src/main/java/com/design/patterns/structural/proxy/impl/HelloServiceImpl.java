package com.design.patterns.structural.proxy.impl;

import com.design.patterns.structural.proxy.service.IHelloService;

/**
 * 委托类实现
 */
public class HelloServiceImpl implements IHelloService {

    public String sayHello(String name) {
        System.out.println(name + " hello");
        return name + " hello";
    }

    public String sayByeBye(String name) {
        System.out.println(name + " ByeBye");
        return name + " ByeBye";
    }
}
