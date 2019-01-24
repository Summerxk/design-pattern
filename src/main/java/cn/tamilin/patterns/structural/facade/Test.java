package cn.tamilin.patterns.structural.facade;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 13:16
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("小鸥");
        GiftExchageService giftExchageService = new GiftExchageService();
        giftExchageService.gitExchange(pointsGift);
    }
}
