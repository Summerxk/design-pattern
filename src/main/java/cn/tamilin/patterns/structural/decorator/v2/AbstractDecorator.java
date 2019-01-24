package cn.tamilin.patterns.structural.decorator.v2;

/**
 * @ClassName AbstractDecorator
 * @Desciption  抽象的装饰者类
 * @Author summer
 * @Date 2019/1/24 14:43
 */
public abstract class AbstractDecorator extends ABattercake{

	private ABattercake aBattercake;

	protected abstract void doSomethin();

	public AbstractDecorator(ABattercake aBattercake) {
		this.aBattercake = aBattercake;
	}

	@Override
	protected String getDesc() {
		return this.aBattercake.getDesc();
	}

	@Override
	protected int cost() {
		return this.aBattercake.cost();
	}
}
