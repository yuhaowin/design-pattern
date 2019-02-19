package com.yuhaowin.design.structure.proxy.staticproxy;

import com.yuhaowin.design.structure.proxy.Order;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(0);
        OrderServiceStaticProxy staticProxy = new OrderServiceStaticProxy();
        staticProxy.saveOrder(order);
    }
}
