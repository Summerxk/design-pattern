package cn.tamilin.patterns.structural.decorator.v1;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 14:28
 */
public class Test {
	public static void main(String[] args) {
		Battercake battercake = new Battercake();
		System.out.println(battercake.getDesc() + "销售价格：" + battercake.cost());

		Battercake battercakeWithEgg = new BattercakeWithEgg();
		System.out.println(battercakeWithEgg.getDesc() + "销售价格：" + battercakeWithEgg.cost());

		Battercake battercakeWithEggSau = new BattecakeWithEggSausage();
		System.out.println(battercakeWithEggSau.getDesc() + "销售价格：" + battercakeWithEggSau.cost());
	}
}
