package cn.tamilin.patterns.behavioral.visitor;

/**
 * @ClassName IVisitor
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 17:30
 */
public interface IVisitor {
	void visit(FreeCourse freeCourse);
	void visit(CodingCourse codingCourse);
}
