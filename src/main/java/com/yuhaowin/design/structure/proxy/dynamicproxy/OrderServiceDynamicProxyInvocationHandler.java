package com.yuhaowin.design.structure.proxy.dynamicproxy;

import com.yuhaowin.design.structure.proxy.Order;
import com.yuhaowin.design.structure.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的目标对象 这里是 OrderServiceImpl
     */
    private Object target;

    public OrderServiceDynamicProxyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 返回被代理的目标对象 这里是 OrderServiceImpl
     *
     * @return
     */
    public Object bind() {
        Class cls = target.getClass();
        //动态代理的核心
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    /**
     * @param proxy  代理类 一般自己实现invoke方法是很少使用该参数
     * @param method 要被增强的目标对象的方法对象
     * @param args   具体的method的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在该case 中 argObject 就是 Order
        Object argObject = args[0];
        beforeMethod(argObject);
        Object resultObject = method.invoke(target, args);
        afterMethod();
        System.out.println(proxy.getClass().getName());
        return resultObject;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        if (obj instanceof Order) {
            userId = ((Order) obj).getUserId();
        }
        Integer dbRouter = userId % 2;
        System.out.println("动态代理分配到 [db" + dbRouter + "] 处理数据");
        //设置dataSource
        DataSourceContextHolder.setDBType("db" + dbRouter);
        System.out.println("动态代理before code");
    }

    private void afterMethod() {
        System.out.println("动态代理after code");
    }
}
