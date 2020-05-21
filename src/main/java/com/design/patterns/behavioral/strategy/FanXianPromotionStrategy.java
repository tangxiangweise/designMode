package com.design.patterns.behavioral.strategy;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class FanXianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销");
    }
}
