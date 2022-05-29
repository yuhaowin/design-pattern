package com.yuhaowin.design.behavioral.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的实现
 */
public class ConcreteSimpleChain<T> implements SimpleChain<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteSimpleChain.class);

    private final List<ChainNode<T>> CHAIN_LIST = new ArrayList<>();

    /**
     * 注册简单链节点
     *
     * @param chainNode 简单链节点
     * @return 简单链
     */
    @Override
    public SimpleChain<T> registerChainNode(ChainNode<T> chainNode) {
        if (CHAIN_LIST.contains(chainNode)) {
            return this;
        }
        CHAIN_LIST.add(chainNode);
        return this;
    }

    /**
     * 移除简单链节点
     *
     * @param chainNode 简单链节点
     * @return 简单链
     */
    @Override
    public SimpleChain<T> removeChainNode(ChainNode<T> chainNode) {
        if (chainNode == null) {
            LOGGER.warn("validation chain node is null，nothing will to be removed");
            return this;
        }
        CHAIN_LIST.remove(chainNode);
        return this;
    }

    /**
     * 是否包含简单链节点
     *
     * @param chainNode 简单链节点
     * @return true：是，false：否
     */
    @Override
    public boolean containsChainNode(ChainNode<T> chainNode) {
        if (chainNode == null) {
            LOGGER.warn("validation chain node is null，validation chain not contains this chain node");
        }
        return CHAIN_LIST.contains(chainNode);
    }

    /**
     * 过滤源数据并返回处理结果
     *
     * @param data 源数据
     * @return true：需要过滤；false：不需要过滤
     */
    @Override
    public boolean doValidate(T data) {
        for (ChainNode<T> chainNode : CHAIN_LIST) {
            if (!chainNode.isValid(data)) {
                return false;
            }
        }
        return true;
    }
}
