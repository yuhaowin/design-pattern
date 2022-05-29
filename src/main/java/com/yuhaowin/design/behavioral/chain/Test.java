package com.yuhaowin.design.behavioral.chain;

public class Test {

    public static void main(String[] args) {
        ConcreteSimpleChain<String> chain = new ConcreteSimpleChain<>();
        chain.registerChainNode(EmptyValidateNode.SINGLETON);

        System.out.println(chain.doValidate(""));
        System.out.println(chain.doValidate("test"));
    }
}
