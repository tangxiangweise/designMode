package com.design.patterns.structural.proxy.dynamicproxy;

import com.design.patterns.structural.proxy.IOrderService;
import com.design.patterns.structural.proxy.OrderInfo;
import com.design.patterns.structural.proxy.OrderServiceImpl;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class Test {

    public static void main(String[] args) {
        OrderInfo order = new OrderInfo();
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);

    }
}
