package cn.tamilin.patterns.behavioral.strategy;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 17:36
 */
public class Test {
	public static void main(String[] args) {
		PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
		PromotionActivity promotionActivity1111 = new PromotionActivity(new ManJianPromotionStrategy());

		promotionActivity618.executePromotionStrategy();
		promotionActivity1111.executePromotionStrategy();
	}
}
