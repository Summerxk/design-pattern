package cn.tamilin.patterns.structural.facade;

/**
 * @ClassName ShippingService
 * @Desciption 物流系统
 * @Author summer
 * @Date 2019/1/24 13:07
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNO = "666";
        return shippingOrderNO;
    }
}
