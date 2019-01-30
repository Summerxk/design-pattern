package cn.tamilin.patterns.behavioral.templatemethod;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 14:16
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("后端设计模式课程start---");
		ACourse designPatternCourse = new DesignPatternCourse();
		designPatternCourse.makeCourse();
		System.out.println("后端设计模式课程end---");

		System.out.println("前端课程start---");
		ACourse feCourse = new FECourse(true);
		feCourse.makeCourse();
		System.out.println("前端课程end---");
	}
}
