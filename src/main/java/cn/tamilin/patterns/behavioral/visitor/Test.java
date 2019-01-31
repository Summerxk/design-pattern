package cn.tamilin.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 17:50
 */
public class Test {
	public static void main(String[] args) {
		List<Course> courseList = new ArrayList<>();
		FreeCourse freeCourse = new FreeCourse();
		freeCourse.setName("free");

		CodingCourse codingCourse = new CodingCourse();
		codingCourse.setName("coding");
		codingCourse.setPrice(11);

		courseList.add(freeCourse);
		courseList.add(codingCourse);

		courseList.forEach(o -> {
			o.accept(new Visitor());
		});
	}
}
