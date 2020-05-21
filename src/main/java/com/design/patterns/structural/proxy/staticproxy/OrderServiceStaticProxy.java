package com.design.patterns.structural.proxy.staticproxy;

import com.design.patterns.structural.proxy.IOrderService;
import com.design.patterns.structural.proxy.OrderInfo;
import com.design.patterns.structural.proxy.OrderServiceImpl;
import com.design.patterns.structural.proxy.db.DataSourceContextHolder;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class OrderServiceStaticProxy {

    private IOrderService orderService = new OrderServiceImpl();

    public int saveOrder(OrderInfo order) {
        beforeMethod(order);
        int result = orderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(OrderInfo order) {
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到｛db" + dbRouter + "｝处理数据");
        // todo 设置dateSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
