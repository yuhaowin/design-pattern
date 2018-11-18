package com.yuhaowin.design.creational.builder.v1;

public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("123", "ppt", "video", "art", "qa");
        System.out.println(course);


    }
}
