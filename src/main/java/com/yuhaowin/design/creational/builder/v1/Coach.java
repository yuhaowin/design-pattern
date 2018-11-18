package com.yuhaowin.design.creational.builder.v1;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,
                             String courseVideo,String courseArticle,
                             String courseQA){
        this.courseBuilder.builderCourseName(courseName);
        this.courseBuilder.builderCoursePPT(coursePPT);
        this.courseBuilder.builderCourseVideo(courseVideo);
        this.courseBuilder.builderCourseArticle(courseArticle);
        this.courseBuilder.builderCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}
