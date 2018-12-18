package com.yuhaowin.design.structure.decorator.v1;



public class BattercakeWithEgg extends Battercake {
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋🥚";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
