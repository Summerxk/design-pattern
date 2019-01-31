package cn.tamilin.patterns.behavioral.visitor;

/**
 * @ClassName CodingCourse
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 17:29
 */
public class CodingCourse extends Course{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void accept(IVisitor iVisitor) {
		iVisitor.visit(this);
	}
}
