package com.yuhaowin.design.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("2332").build();

        System.out.println(course);
    }
}
