package com.yuhaowin.design.structure.decorator.v1;

public class BattercakeWithEggsausage extends BattercakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc() +" 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
