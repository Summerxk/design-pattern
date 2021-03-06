package cn.tamilin.patterns.behavioral.iterator;

import java.util.List;

/**
 * @ClassName CourseIteratorImpl
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 15:06
 */
public class CourseIteratorImpl implements CourseIterator{

	private List courseList;
	int position;
	Course course;

	public CourseIteratorImpl(List courseList) {
		this.courseList = courseList;
	}

	@Override
	public Course nextCourse() {
		System.out.println("返回课程，位置是：" + position);
		course = (Course) courseList.get(position);
		position++;
		return course;
	}

	@Override
	public boolean isLastCourse() {
		if(position < courseList.size()) {
			return false;
		}
		return true;
	}
}
