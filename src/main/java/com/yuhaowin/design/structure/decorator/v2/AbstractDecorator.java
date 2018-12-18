package com.yuhaowin.design.structure.decorator.v2;


/**
 * 该装饰者不一定必须是abstract的,如果子类不一定需要实现doSomething方法
 * 就可以是非abstract的,具体实现看业务场景
 */
public abstract class AbstractDecorator extends ABattercake{

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    /**
     * 根据业务场景,不是必须的
     */
    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
