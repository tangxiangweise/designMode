package com.design.patterns.behavioral.strategy;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class Test {

    public static void main(String[] args) {
        PromotionActivity activity = new PromotionActivity(new LiJianPromotionStrategy());
        activity.execute();

    }
}
