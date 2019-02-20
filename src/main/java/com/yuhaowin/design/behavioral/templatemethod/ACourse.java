package com.yuhaowin.design.behavioral.templatemethod;

public abstract class ACourse {
    //该方法是算法的骨架,使用final修饰是不希望子类破坏算法的结构;
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作ppt");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.out.println("编写手记");
    }

    //钩子方法,并提供了一个默认的实现,不使用final修饰,子类可以根据需要重新该方法
    protected Boolean needWriteArticle(){
        return false;
    }

    // 算法中不确定的部分,只定义结构,具体实现交由各子类实现
    abstract void packageCourse();
}
