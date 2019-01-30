package cn.tamilin.patterns.behavioral.strategy.v2;

/**
 * @ClassName EmptyPromotionStrategy
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 17:48
 */
public class EmptyPromotionStrategy implements PromotionStrategy{
	@Override
	public void doPromotion() {
		System.out.println("空促销");
	}
}
