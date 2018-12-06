package com.yuhaowin.design.structure.facade;

public class Test {

    public static void main(String[] args) {
        PointGift gift = new PointGift("Mac book Pro");

        GiftExchangeService exchangeService = new GiftExchangeService();
        exchangeService.giftExchange(gift);
    }
}
