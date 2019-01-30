package cn.tamilin.patterns.behavioral.strategy;

/**
 * @ClassName FanXianPromotionStrategy
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 17:29
 */
public class FanXianPromotionStrategy implements PromotionStrategy{
	@Override
	public void doPromotion() {
		System.out.println("返现促销，返回的金额放到用户的余额中");
	}
}
