package com.yuhaowin.design.behavioral.chain;

/**
 * 简单责任链
 */
public interface SimpleChain<T> {

    /**
     * 注册简单链节点
     *
     * @param chainNode 简单链节点
     * @return 简单链
     */
    SimpleChain<T> registerChainNode(ChainNode<T> chainNode);

    /**
     * 移除简单链节点
     *
     * @param chainNode 简单链节点
     * @return 简单链
     */
    SimpleChain<T> removeChainNode(ChainNode<T> chainNode);

    /**
     * 是否包含简单链节点
     *
     * @param chainNode 简单链节点
     * @return true：是，false：否
     */
    boolean containsChainNode(ChainNode<T> chainNode);

    /**
     * 校验源数据并返回处理结果
     *
     * @param data 源数据
     * @return true：符合要求；false：不符合要求
     */
    boolean doValidate(T data);

    /**
     * 简单链节点
     */
    interface ChainNode<T> {

        /**
         * 数据是否符合要求
         *
         * @param data 源数据
         * @return true：是，false：否
         */
        boolean isValid(T data);
    }
}
