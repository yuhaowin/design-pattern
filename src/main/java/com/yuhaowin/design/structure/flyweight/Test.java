package com.yuhaowin.design.structure.flyweight;

public class Test {

    private static final String[] departments = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            ManagerFactory managerFactory = new ManagerFactory();
            Employee manger = managerFactory.getManger(department);
            manger.report();
        }
    }
}
