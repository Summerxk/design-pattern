package cn.tamilin.patterns.structural.decorator.v1;

/**
 * @ClassName BattercakeWithEgg
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 14:25
 */
public class BattercakeWithEgg extends Battercake{

	@Override
	public String getDesc() {
		return super.getDesc() + "加一个鸡蛋";
	}

	@Override
	public int cost() {
		return super.cost() + 1;
	}
}
