package com.yuhaowin.design.behavioral.strategy;

public class FanxianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现到余额中....");
    }
}
