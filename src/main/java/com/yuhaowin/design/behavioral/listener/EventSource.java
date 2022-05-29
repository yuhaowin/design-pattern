package com.yuhaowin.design.behavioral.listener;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 事件源是是事件对象的入口，包含监听器的注册、撤销、通知
 **/
public enum EventSource {

    instance;

    /**
     * 监听器列表，如果监听事件源的事件，注册监听器可以加入此列表
     */
    private List<Listener> listenerList = new CopyOnWriteArrayList<>();

    /**
     * 注册监听器
     */
    public void addListener(Listener listener) {
        listenerList.add(listener);
    }

    /**
     * 删除监听器
     */
    public void removeListener(Listener listener) {
        int i = listenerList.indexOf(listener);
        if (i >= 0) {
            listenerList.remove(listener);
        }
    }

    /**
     * 接受外部事件，通知所有的监听器
     */
    public void notifyListenerEvents(Event event) {
        for (Listener listener : listenerList) {
            handleEvent(listener, event);
        }
    }

    /**
     * 执行通知操作
     * 可以实现为一个线程池异步执行
     */
    private void handleEvent(Listener listener, Event event) {
        listener.handleEvent(event);
    }
}
