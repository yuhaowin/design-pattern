package com.yuhaowin.design.behavioral.templatemethod;

public class FECourse extends ACourse {
    private Boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供前端课程源代码");
        System.out.println("提供前端课程多媒体素材");
    }

    public void setNeedWriteArticleFlag(Boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    //由于前端课程的不同,有的需要提供手记有的不需要提供,所以将是否提供的权限开放给客户端
    @Override
    protected Boolean needWriteArticle() {
        return needWriteArticleFlag;
    }
}
