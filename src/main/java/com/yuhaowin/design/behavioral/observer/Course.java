package com.yuhaowin.design.behavioral.observer;

import java.util.Observable;

public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName() + "在" + course.getCourseName()+"课程提交了:" + question.getQuestionContent());
        setChanged();
        notifyObservers(question);
    }
}
