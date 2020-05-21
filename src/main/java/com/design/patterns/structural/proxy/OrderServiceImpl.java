package com.design.patterns.structural.proxy;

/**
 * @author tangxiangwei
 * @date 20/2/25
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao orderDao = new OrderDaoImpl();

    public int saveOrder(OrderInfo order) {
        System.out.println("Service层调用dao层成功");
        return orderDao.insert(order);
    }

}
