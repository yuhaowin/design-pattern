package com.yuhaowin.design.structure.proxy;

public class OrderSercviceImpl  implements OrderService {

    private OrderDao iOrderDao;


    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用DAO层添加Order");
        return iOrderDao.insert(order);
    }

//    @Override
//    public String test(Order order) {
//        System.out.println("这是hello方法");
//        return "hello";
//    }
}
