package com.yuhaowin.design.behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        ACourse designPattern = new DesignPatternCourse();
        designPattern.makeCourse();

        System.out.println();

        ACourse fecourse = new FECourse();
        ((FECourse) fecourse).setNeedWriteArticleFlag(true);
        fecourse.makeCourse();
    }
}
