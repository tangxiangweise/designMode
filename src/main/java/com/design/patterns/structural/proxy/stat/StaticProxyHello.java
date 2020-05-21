package com.design.patterns.structural.proxy.stat;

import com.design.patterns.structural.proxy.impl.HelloServiceImpl;
import com.design.patterns.structural.proxy.service.IHelloService;

public class StaticProxyHello implements IHelloService {

    private IHelloService helloService = new HelloServiceImpl();

    public String sayHello(String name) {
        // 代理对象可以在此处包装一下
        System.out.println("代理对象包装礼盒...");
        return helloService.sayHello(name);
    }

    public String sayByeBye(String name) {
        return null;
    }

}
