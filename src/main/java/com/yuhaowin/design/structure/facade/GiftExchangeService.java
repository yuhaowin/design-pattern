package com.yuhaowin.design.structure.facade;

public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PointPaymentService pointPaymentService = new PointPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointGift pointGift) {
        if (qualifyService.isAvaiable(pointGift)) {
            if (pointPaymentService.pay(pointGift)) {
                String shippingOrderNo = shippingService.shipGift(pointGift);
                System.out.println("物流系统下单成功,订单号为: " + shippingOrderNo);
            }
        }
    }
}
