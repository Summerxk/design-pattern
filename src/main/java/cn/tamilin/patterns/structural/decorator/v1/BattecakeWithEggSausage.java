package cn.tamilin.patterns.structural.decorator.v1;

/**
 * @ClassName BattecakeWithEggSausage
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 14:27
 */
public class BattecakeWithEggSausage extends BattercakeWithEgg{

	@Override
	public String getDesc() {
		return super.getDesc() + "加一根香肠";
	}

	@Override
	public int cost() {
		return super.cost() + 2;
	}
}
