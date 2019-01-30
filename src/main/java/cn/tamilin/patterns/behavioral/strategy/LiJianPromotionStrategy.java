package cn.tamilin.patterns.behavioral.strategy;

/**
 * @ClassName LiJianPromotionStrategy
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 17:28
 */
public class LiJianPromotionStrategy implements PromotionStrategy{
	@Override
	public void doPromotion() {
		System.out.println("立减促销，课程的价格直接减去配置的价格");
	}
}
