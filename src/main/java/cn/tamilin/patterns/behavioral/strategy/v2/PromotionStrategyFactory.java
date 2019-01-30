package cn.tamilin.patterns.behavioral.strategy.v2;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PromotionStrategyFactory
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 17:42
 */
public class PromotionStrategyFactory {

	private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

	static {
		PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
	}

	private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

	private PromotionStrategyFactory () {

	}

	public static PromotionStrategy getPromotionStrategy(String key) {
		PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(key);
		return promotionStrategy == NON_PROMOTION ? null : promotionStrategy;
	}

	private interface PromotionKey {
		String LIJIAN = "LIJIAN";
		String FANXIAN = "FANXIAN";
		String MANJIAN = "MANJIAN";
	}
}
