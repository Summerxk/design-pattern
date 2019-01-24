package cn.tamilin.patterns.structural.facade;

/**
 * @ClassName PointsGift
 * @Desciption 积分礼物
 * @Author summer
 * @Date 2019/1/24 13:03
 */
public class PointsGift {

    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
