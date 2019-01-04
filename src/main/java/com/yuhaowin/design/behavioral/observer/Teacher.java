package com.yuhaowin.design.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {

        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName+"老师的"+course.getCourseName()+"接受了"+question.getUserName()+"同学提交的"+question.getQuestionContent()+"问题");
    }
}
