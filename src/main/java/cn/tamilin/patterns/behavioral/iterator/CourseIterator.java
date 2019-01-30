package cn.tamilin.patterns.behavioral.iterator;

/**
 * @ClassName CourseItetator
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 14:56
 */
public interface CourseIterator {
	Course nextCourse();
	boolean isLastCourse();
}
