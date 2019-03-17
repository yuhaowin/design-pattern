package com.yuhaowin.design.behavioral.chainofresponsibility;

/**
 * 课程的批准者
 *
 * 所有的批准者都需要继承这个批准者
 */
public  abstract class Approver {

    //这个类的核心是需要包含一个与自己相同类型的对象
    protected Approver approver;

    /**
     * 设置下一个批准者
     *
     * @param approver
     */
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 发布课程,由子类实现.
     *
     * @param course
     */
    public abstract void deployCourse(Course course);
}