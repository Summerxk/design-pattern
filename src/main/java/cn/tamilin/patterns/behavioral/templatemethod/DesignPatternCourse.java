package cn.tamilin.patterns.behavioral.templatemethod;

/**
 * @ClassName DesignPatternCourse
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 14:10
 */
public class DesignPatternCourse extends ACourse {

	@Override
	void packageCourse() {
		System.out.println("提供课程的java源代码");
	}

	@Override
	protected boolean needWriteArticle() {
		return true;
	}
}
