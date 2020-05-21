package com.design.patterns.behavioral.strategy;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class ManJianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("满减促销");
    }

}
