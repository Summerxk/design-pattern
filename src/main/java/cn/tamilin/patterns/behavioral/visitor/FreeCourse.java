package cn.tamilin.patterns.behavioral.visitor;

/**
 * @ClassName FreeCourse
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 17:30
 */
public class FreeCourse extends Course{

	@Override
	public void accept(IVisitor iVisitor) {
		iVisitor.visit(this);
	}
}
