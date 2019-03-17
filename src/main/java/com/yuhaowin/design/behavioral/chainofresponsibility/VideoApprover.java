package com.yuhaowin.design.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * 视频审批
 */
public class VideoApprover extends Approver {

    @Override
    public void deployCourse(Course course) {
        if (StringUtils.isNoneEmpty(course.getVideo())){
            System.out.println(course.getName() + "包含视频, 审批通过");
            if (approver != null){
                approver.deployCourse(course);
            }
        }else{
            System.out.println(course.getName() + "不包含视频, 审批不通过");
            return;
        }

   }
}
