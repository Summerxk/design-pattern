package cn.tamilin.patterns.structural.facade;

/**
 * @ClassName PointsPaymentService
 * @Desciption 支付系统
 * @Author summer
 * @Date 2019/1/24 13:06
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("扣减" + pointsGift.getName() + "积分成功");
        return true;
    }
}
