package com.yuhaowin.design.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供java课程源代码");
    }
    //该课程需要提供手记,但是ACourse中默认是不提供手记,需要重写该钩子方法
    @Override
    protected Boolean needWriteArticle() {
        return true;
    }
}
