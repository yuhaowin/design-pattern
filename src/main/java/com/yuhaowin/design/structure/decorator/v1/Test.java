package com.yuhaowin.design.structure.decorator.v1;

public class Test {
    public static void main(String[] args){

        Battercake battercake = new Battercake();

        Battercake battercakeWithEgg = new BattercakeWithEgg();

        Battercake battercakeWithEggsausage = new BattercakeWithEggsausage();

        System.out.println(battercake.getDesc() + ":" + battercake.cost());
        System.out.println(battercakeWithEgg.getDesc() + ":" + battercakeWithEgg.cost());
        System.out.println(battercakeWithEggsausage.getDesc() + ":" + battercakeWithEggsausage.cost());


    }
}
