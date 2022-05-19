package com.yuhaowin.design.structure.proxy;

public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        System.out.println("Service层调用DAO层添加Order");
        return orderDao.insert(order);
    }

    @Override
    public String echo(String text) {
        System.out.println("echo: " + text);
        return text;
    }
}
