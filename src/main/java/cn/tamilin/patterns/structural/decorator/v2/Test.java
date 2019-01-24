package cn.tamilin.patterns.structural.decorator.v2;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 15:16
 */
public class Test {
	public static void main(String[] args) {
		ABattercake aBattercake;
		aBattercake = new Battercake();
		aBattercake = new EggDecorator(aBattercake);
		aBattercake = new EggDecorator(aBattercake);
		aBattercake = new SausageDecorator(aBattercake);
		System.out.println(aBattercake.getDesc() + "销售价格：" + aBattercake.cost());
	}
}
