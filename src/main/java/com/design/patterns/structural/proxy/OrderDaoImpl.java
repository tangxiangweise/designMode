package com.design.patterns.structural.proxy;

/**
 * @author tangxiangwei
 * @date 20/2/25
 */
public class OrderDaoImpl implements IOrderDao {

    public int insert(OrderInfo order) {
        System.out.println("dao层插入order成功");
        return 1;
    }
}
