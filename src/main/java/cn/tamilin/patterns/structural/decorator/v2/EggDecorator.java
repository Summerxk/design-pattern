package cn.tamilin.patterns.structural.decorator.v2;

/**
 * @ClassName EggDecorator
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 14:56
 */
public class EggDecorator extends AbstractDecorator{

	@Override
	protected void doSomethin() {

	}

	public EggDecorator(ABattercake aBattercake) {
		super(aBattercake);
	}

	@Override
	protected String getDesc() {
		return super.getDesc() + " 加一个鸡蛋";
	}

	@Override
	protected int cost() {
		return super.cost() + 1;
	}
}
