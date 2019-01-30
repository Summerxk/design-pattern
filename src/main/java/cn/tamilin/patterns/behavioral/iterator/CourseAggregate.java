package cn.tamilin.patterns.behavioral.iterator;

/**
 * @ClassName CourseAggregate
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 14:54
 */
public interface CourseAggregate {
	void addCourse(Course course);
	void removeCourse(Course course);

	CourseIterator getCourseIterator();
}
