package com.design.patterns.structural.proxy;

/**
 * @author tangxiangwei
 * @date 20/2/25
 */
public class OrderInfo {

    private Object orderInfo;

    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
