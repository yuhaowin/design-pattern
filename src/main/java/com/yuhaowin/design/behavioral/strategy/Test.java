package com.yuhaowin.design.behavioral.strategy;

public class Test {
    public static void main(String[] args) {

        // v1
        PromotionActivity activity618 = new PromotionActivity(new LijianPromotionStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new FanxianPromotionStrategy());
        activity618.excutePromotionStrategy();
        activity1111.excutePromotionStrategy();


        // v2
        PromotionActivity activity = null;
        String key = "MANJIAN";
        if ("LIJIAN".equals(key)){
            activity = new PromotionActivity(new LijianPromotionStrategy());
        }else if ("MANJIAN".equals(key)){
            activity = new PromotionActivity(new ManjianPromotionStrategy());
        }
        activity.excutePromotionStrategy();


        //v3
        String key1 = "LIJIAN";
        PromotionActivity activity1 = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(key1));
        activity1.excutePromotionStrategy();

    }
}
