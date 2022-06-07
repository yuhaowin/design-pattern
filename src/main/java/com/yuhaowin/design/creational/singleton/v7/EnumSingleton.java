package com.yuhaowin.design.creational.singleton.v7;

public enum EnumSingleton {

    INSTANCE {
        protected void test() {
            System.out.println("测试");
        }
    };

    protected abstract void test();

    private static Object data;

    public static Object getData() {
        return data;
    }

    public static void setData(Object data) {
        EnumSingleton.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
