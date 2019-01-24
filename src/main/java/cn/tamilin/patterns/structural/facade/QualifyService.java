package cn.tamilin.patterns.structural.facade;

/**
 * @ClassName QualifyService
 * @Desciption 积分校验 库存校验系统
 * @Author summer
 * @Date 2019/1/24 13:04
 */
public class QualifyService {
    public boolean isAvailable (PointsGift pointsGift) {
        System.out.println("检验" + pointsGift.getName() + "积分资格通过，库存数量通过");
        return true;
    }
}
