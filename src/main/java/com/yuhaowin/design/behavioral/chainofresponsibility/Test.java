package com.yuhaowin.design.behavioral.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("java课程");
        course.setArticle("java课程手记");
        course.setVideo("java课程视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deployCourse(course);

        //注意只有一个审核员发布
        // 回循环调用,造成内存溢出
        //videoApprover.setNextApprover(articleApprover);
        //videoApprover.deployCourse(course);
    }
}
