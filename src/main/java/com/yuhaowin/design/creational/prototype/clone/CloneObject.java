package com.yuhaowin.design.creational.prototype.clone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 演示复杂对象的克隆
 */
public class CloneObject implements Cloneable {

    private List<String> nameList;

    private List<Date> dateList;


    public CloneObject() {
        this.nameList = new ArrayList<>();
        this.dateList = new ArrayList<>();

        this.nameList.add("yuhao");
        this.dateList.add(new Date(0l));
    }

    public List<String> getNameList() {
        return nameList;
    }

    public List<Date> getDateList() {
        return dateList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CloneObject clone = (CloneObject) super.clone();
        clone.nameList = new ArrayList<>(nameList);
        clone.dateList = new ArrayList<>(dateList);
        return clone;
    }
}
