package com.yuhaowin.design.behavioral.chain;

/**
 * 空校验节点
 */
public enum EmptyValidateNode implements SimpleChain.ChainNode<String> {

    SINGLETON;

    /**
     * 数据是否符合要求
     *
     * @param data 源数据
     * @return true：符合要求，false：不符合要求
     */
    @Override
    public boolean isValid(String data) {
        return !(data == null || data.length() == 0);
    }
}
