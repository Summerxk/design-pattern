package cn.tamilin.patterns.structural.facade;

/**
 * @ClassName GiftExchageService
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 13:11
 */
public class GiftExchageService {
    //假设这里spring 已经创建好了
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void gitExchange(PointsGift pointsGift) {
        if(qualifyService.isAvailable(pointsGift)) {
            //资格库存符合
            if(pointsPaymentService.pay(pointsGift)) {
                //如果支付积分成功
                String shippingOrderNO = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功 订单号是" + shippingOrderNO);
            }
        }
    }
}
