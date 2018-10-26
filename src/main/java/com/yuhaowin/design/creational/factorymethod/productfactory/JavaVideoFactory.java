package com.yuhaowin.design.creational.factorymethod.productfactory;

import com.yuhaowin.design.creational.factorymethod.product.JavaVideo;
import com.yuhaowin.design.creational.factorymethod.product.Video;

public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
