package com.design.patterns.behavioral.strategy;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class LiJianPromotionStrategy implements  PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("立减促销");
    }
}
