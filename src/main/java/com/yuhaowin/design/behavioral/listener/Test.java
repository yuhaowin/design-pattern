package com.yuhaowin.design.behavioral.listener;

public class Test {

    public static void main(String[] args) {
        EventSource.instance.addListener(event -> System.out.println("处理的事件为: " + event.toString()));

        EventSource.instance.notifyListenerEvents(new Event("test event"));
    }
}
