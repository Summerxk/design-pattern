package cn.tamilin.patterns.behavioral.strategy.v2;

/**
 * @ClassName PromotionActivity
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 17:32
 */
public class PromotionActivity {

	private PromotionStrategy promotionStrategy;

	public PromotionActivity(PromotionStrategy promotionStrategy) {
		this.promotionStrategy = promotionStrategy;
	}

	public void executePromotionStrategy() {
		promotionStrategy.doPromotion();
	}
}
