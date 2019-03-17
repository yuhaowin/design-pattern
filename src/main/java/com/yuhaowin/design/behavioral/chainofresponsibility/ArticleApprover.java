package com.yuhaowin.design.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * 手记审批
 */
public class ArticleApprover extends Approver {

    @Override
    public void deployCourse(Course course) {
        if (StringUtils.isNoneEmpty(course.getArticle())){
            System.out.println(course.getName() + "包含手记, 审批通过");
            if (approver != null){
                approver.deployCourse(course);
            }
        }else{
            System.out.println(course.getName() + "不包含手记, 审批不通过");
            return;
        }

   }
}
