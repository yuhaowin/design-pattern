package com.yuhaowin.design.creational.simplefactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 可以看出应用层依赖具体的产品类
 * <p>
 * 可以把整个生产过程放在一个专门的类里,使得应用层代码不依赖具体的产品类.
 * 这便是简单工厂的由来.
 */
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        //v1
        Video javaVideo = new JavaVideo();
        javaVideo.produce();

        Video pythonVideo = new PythonVideo();
        pythonVideo.produce();


        /**
         * v2版本无需依赖具体的产品类,就可以返回具体的产品类的对象
         * 但是假设现在要新增一个课程,就必须修改VideoFactory类,无形中会增加风险.
         */
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.produce();

        /**
         * v3利用反射
         */
        Video video1 = videoFactory.getVideo(JavaVideo.class);
        video1.produce();
    }

}
