package com.yuhaowin.design.structure.adapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5() {

        int input = ac220.outputAC220();

        //变压器
        int output = input / 44;

        System.out.println("通过适配器将输入的: " + input + "V交流电,转换为: " + output + "V的直流电.");

        return output;
    }
}
