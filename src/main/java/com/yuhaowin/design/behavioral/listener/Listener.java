package com.yuhaowin.design.behavioral.listener;

import java.util.EventListener;

/**
 * 监听器接口
 *
 * @author: gq
 * @date: 2020-4-27 17:31
 **/
public interface Listener extends EventListener {
    /**
     * 监听器回调方法
     *
     * @param event
     * @return
     */
    void handleEvent(Event event);
}
