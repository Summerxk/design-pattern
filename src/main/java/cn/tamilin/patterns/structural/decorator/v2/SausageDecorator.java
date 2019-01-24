package cn.tamilin.patterns.structural.decorator.v2;

/**
 * @ClassName SausageDecorator
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 14:56
 */
public class SausageDecorator extends AbstractDecorator{

	@Override
	protected void doSomethin() {

	}

	public SausageDecorator(ABattercake aBattercake) {
		super(aBattercake);
	}

	@Override
	protected String getDesc() {
		return super.getDesc() + " 加一根香肠";
	}

	@Override
	protected int cost() {
		return super.cost() + 2;
	}
}
