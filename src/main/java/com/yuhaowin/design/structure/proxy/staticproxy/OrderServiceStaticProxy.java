package com.yuhaowin.design.structure.proxy.staticproxy;

import com.yuhaowin.design.structure.proxy.OrderService;
import com.yuhaowin.design.structure.proxy.Order;
import com.yuhaowin.design.structure.proxy.OrderSercviceImpl;
import com.yuhaowin.design.structure.proxy.db.DataSourceContextHolder;

/**
 * 静态代理类
 */
public class OrderServiceStaticProxy {

    /**
     * 需要代理的目标对象,对该对象的一些方法进行增强,这里增强的是saveOrder方法
     */
    private OrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderSercviceImpl();

//        Integer userId = order.getUserId();
//        Integer dbRouter = userId % 2;
//        System.out.println("静态代理分配到 [db"+dbRouter+"] 处理数据");
//        //设置dataSource
//        DataSourceContextHolder.setDBType("db"+dbRouter);
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order){
        System.out.println("静态代理before code");
        Integer userId = order.getUserId();
        Integer dbRouter = userId % 2;
        System.out.println("静态代理分配到 [db"+dbRouter+"] 处理数据");
        //设置dataSource
        DataSourceContextHolder.setDBType("db"+dbRouter);
    }

    private void afterMethod(){
        System.out.println("静态代理after code");
    }
}
