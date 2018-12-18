package com.yuhaowin.design.structure.decorator.v2;

public class Test {

    public static void main(String[] args) {
        ABattercake battercake;

        battercake = new Battercake();
        battercake = new SausageDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        battercake = new EggDecorator(battercake);

        System.out.println(battercake.getDesc() + battercake.cost());
    }
}
