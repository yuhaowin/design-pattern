package com.yuhaowin.design.creational.factorymethod.productfactory;

import com.yuhaowin.design.creational.factorymethod.product.PythonVideo;
import com.yuhaowin.design.creational.factorymethod.product.Video;

public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
