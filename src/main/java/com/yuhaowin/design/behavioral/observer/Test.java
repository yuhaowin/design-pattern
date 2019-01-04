package com.yuhaowin.design.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("coding");
        Teacher teacher1 = new Teacher("余浩1");
        Teacher teacher2 = new Teacher("余浩2");
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //.....
        Question question = new Question();
        question.setUserName("张三");
        question.setQuestionContent("java类和对象");

        course.produceQuestion(course,question);
    }
}
