package com.yuhaowin.design.behavioral.strategy;

public class LijianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减");
    }
}
