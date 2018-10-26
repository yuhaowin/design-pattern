package com.yuhaowin.design.creational.simplefactory;


/**
 * 简单工厂:由一个工厂对象创建出哪一种产品类的实例
 * 类型:创建型,不属于GOF23种设计模式之一
 * 抽象工厂和工厂方法均由简单工厂演进而来
 * <p>
 * 适用场景:由工厂负责创建的产品类实例数量比较少的情况
 * 客户端只负责(只知道)传入工厂类所需的参数,而不关心创建对象的过程和逻辑
 * <p>
 * 优点:只需要客户端传入工厂类所需参数,无需知道创建细节,就可以获取所需的对象
 * 缺点:工厂类的职责过大,在新增产品类型时需要修改工厂类的判断逻辑,违背开闭原则
 */
public class VideoFactory {

    /**
     * 也有将getVideo方法设置为static方法的
     * 如果是静态方法,好处是客户端无需创建VideoFactory对象,直接调用getVideo方法.
     * 缺点是无法被继承,被重写.
     *
     * @param type
     * @return
     */
    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        //没有命中返回null;
        return null;
    }


    /**
     * 使用反射,弥补简单工厂的不足
     * 使其满足开闭原则,只需要传入对应产品的类名,就可以返回改产品类的对象
     * 而无需修改简单工厂类
     */
    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    //jdk calendar类的getInstance方法使用的简单工厂方法;

    //logback LoggerFactory类的getLogger方法使用了简单工厂方法;

}