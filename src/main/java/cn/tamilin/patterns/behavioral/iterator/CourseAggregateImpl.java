package cn.tamilin.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseAggregateImpl
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 15:00
 */
public class CourseAggregateImpl implements CourseAggregate{

	private List courseList;

	public CourseAggregateImpl() {
		this.courseList = new ArrayList();
	}

	@Override
	public void addCourse(Course course) {
		courseList.add(course);
	}

	@Override
	public void removeCourse(Course course) {
		courseList.remove(course);
	}

	@Override
	public CourseIterator getCourseIterator() {
		return new CourseIteratorImpl(courseList);
	}
}
