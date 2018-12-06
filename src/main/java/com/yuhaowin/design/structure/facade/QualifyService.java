package com.yuhaowin.design.structure.facade;

public class QualifyService {
    public boolean isAvaiable(PointGift pointGift){
        System.out.println("校验" + pointGift.getName() + "积分通过");

        return true;
    }

}
