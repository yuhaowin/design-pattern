package com.yuhaowin.design.creational.factorymethod.productfactory;


import com.yuhaowin.design.creational.factorymethod.product.Video;

/**
 * 工厂方法
 * <p>
 * 定义:定义一个创建对象的接口,但是让实现这个接口的类来决定创建哪个类的实例.
 * 工厂方法让类的实例化过程推迟到子类中进行
 * 创建型
 * <p>
 * 四个名称:产品和具体的产品    工厂和具体产品的工厂
 * <p>
 * 适应场景:
 * 创建对象需要大量的重复代码,
 * 客户端无需依赖产品类实例如何创建,实现等细节
 * 一个类通过其子类来指定创建哪个对象
 * <p>
 * 客户端只需要知道,产品在哪个工厂里,无需知道具体的产品名称
 * <p>
 * 子类将会覆盖父类的方法,系统更容易扩展
 * <p>
 * <p>
 * 优点:客户端只需关心所需产品对应的工厂,无需知道创建的细节
 * 加入新的产品时,是符合开闭原则的,提高了系统的扩展性
 * <p>
 * 缺点:类的个数容易过多,增加复杂度,增加系统的抽象性
 * <p>
 * <p>
 * 产品族和产品等级
 * <p>
 * 产品族:一个家电公司生产的多个家电(如:格力空调,格力冰箱,格力手机)是一个产品族;
 * 产品等级:格力手机,苹果手机,小米手机 他们是一个产品等级.
 */
//一般而言只有抽象方法时也可以使用interface代替抽象类
//实际业务中类中可能不仅仅有抽象方法还有实现方法,此时使用抽象类比较合适
public abstract class VideoFactory {

    //该方法只是定义一个规范
    public abstract Video getVideo();


    /**
     *conllection 中的iterator() 是一个工厂方法
     *
     * 很多子类实现iterator这个方法.如在:ArrayList,返回的是具体的iterator的对象
     */

}
