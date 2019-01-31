package cn.tamilin.patterns.behavioral.visitor;

/**
 * @ClassName Visitor
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 17:30
 */
public class Visitor implements IVisitor{

	@Override
	public void visit(FreeCourse freeCourse) {
		System.out.println("免费课程：" + freeCourse.getName());
	}

	@Override
	public void visit(CodingCourse codingCourse) {
		System.out.println("实战课程" + codingCourse.getName());

	}
}
