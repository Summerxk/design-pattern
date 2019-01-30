package cn.tamilin.patterns.behavioral.iterator;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 15:13
 */
public class Test {
	public static void main(String[] args) {
		Course course1 = new Course("course1");
		Course course2 = new Course("course2");
		Course course3 = new Course("course3");
		Course course4 = new Course("course4");
		Course course5 = new Course("course5");
		Course course6 = new Course("course6");

		CourseAggregate courseAggregate = new CourseAggregateImpl();
		courseAggregate.addCourse(course1);
		courseAggregate.addCourse(course2);
		courseAggregate.addCourse(course3);
		courseAggregate.addCourse(course4);
		courseAggregate.addCourse(course5);
		courseAggregate.addCourse(course6);

		System.out.println("------ 课程列表------");
		printCourse(courseAggregate);

		courseAggregate.removeCourse(course1);
		courseAggregate.removeCourse(course2);

		System.out.println("---删除课程之后的课程列表----");
		printCourse(courseAggregate);
	}

	public static void printCourse(CourseAggregate courseAggregate) {
		CourseIterator courseIterator = courseAggregate.getCourseIterator();
		while (!courseIterator.isLastCourse()){
			Course course = courseIterator.nextCourse();
			System.out.println(course.getName());
		}
	}
}
