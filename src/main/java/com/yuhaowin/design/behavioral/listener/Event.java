package com.yuhaowin.design.behavioral.listener;

import java.util.EventObject;

/**
 * 事件对象
 **/
public class Event extends EventObject {
    /**
     * 构造方法
     *
     * @param obj
     */
    public Event(Object obj) {
        super(obj);
    }
}
