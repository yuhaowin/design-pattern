package com.yuhaowin.design.structure.proxy;

public class OrderDaoImpl implements OrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("DAO层添加order成功了");
        return 1;
    }
}
