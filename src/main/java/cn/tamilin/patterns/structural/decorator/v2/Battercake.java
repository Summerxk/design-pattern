package cn.tamilin.patterns.structural.decorator.v2;

/**
 * @ClassName Battercake
 * @Desciption 确定的实体类
 * @Author summer
 * @Date 2019/1/24 14:40
 */
public class Battercake extends ABattercake{

	@Override
	protected String getDesc() {
		return "煎饼";
	}

	@Override
	protected int cost() {
		return 8;
	}
}
