package com.yuhaowin.design.structure.facade;

public class PointPaymentService {

    public boolean pay(PointGift pointGift){
        System.out.println("支付" + pointGift.getName() + "成功!!!");
        return true;
    }
}
