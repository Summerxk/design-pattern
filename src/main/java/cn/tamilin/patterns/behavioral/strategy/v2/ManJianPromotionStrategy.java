package cn.tamilin.patterns.behavioral.strategy.v2;

/**
 * @ClassName ManJianPromotionStrategy
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 17:28
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
	@Override
	public void doPromotion() {
		System.out.println("满减促销，满200减20");
	}
}
