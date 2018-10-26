package com.yuhaowin.design.creational.factorymethod;


import com.yuhaowin.design.creational.factorymethod.product.Video;
import com.yuhaowin.design.creational.factorymethod.productfactory.JavaVideoFactory;
import com.yuhaowin.design.creational.factorymethod.productfactory.PythonVideoFactory;
import com.yuhaowin.design.creational.factorymethod.productfactory.VideoFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 客户端只需知道产品对应的产品工厂,无需知道具体的产品和创建产品实例的过程
 * <p>
 * 在新增一个产品的时候,只需要添加一个产品,和对应该产品的工厂,该过程无需修改已有的产品和工厂
 * 对扩展是开放的,符合开闭原则.
 */
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {

        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        //只需要跟换产生具体产品的工厂即可;
        VideoFactory videoFactory1 = new JavaVideoFactory();
        Video video1 = videoFactory1.getVideo();
        video1.produce();

    }

}
