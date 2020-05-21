package com.design.patterns.structural.proxy.staticproxy;

import com.design.patterns.structural.proxy.OrderInfo;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class Test {

    public static void main(String[] args) {
        OrderInfo order = new OrderInfo();
        order.setUserId(1);
        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
        proxy.saveOrder(order);
    }
}
