package com.yuhaowin.design.structure.proxy.dynamicproxy;

import com.yuhaowin.design.structure.proxy.OrderService;
import com.yuhaowin.design.structure.proxy.Order;
import com.yuhaowin.design.structure.proxy.OrderServiceImpl;

public class Test {

    public static void main(String[] args) {
        /* 设置此系统属性,让JVM生成的Proxy类写入文件.保存路径为：com/sun/proxy(如果不存在请手工创建) */
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        Order order = new Order();
        order.setUserId(1);
        OrderService dynamicProxy = (OrderService) new OrderServiceDynamicProxyInvocationHandler(new OrderServiceImpl()).bind();
        dynamicProxy.saveOrder(order);
        dynamicProxy.echo("order");
    }
}
