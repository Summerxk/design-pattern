package cn.tamilin.patterns.behavioral.observer;

import java.util.Observable;

/**
 * @ClassName Course
 * @Desciption 继承 Observable 作为被观察对象
 * @Author summer
 * @Date 2019/1/31 14:21
 */
public class Course extends Observable {
	private String courseNamne;

	public Course(String courseNamne) {
		this.courseNamne = courseNamne;
	}

	public String getCourseNamne() {
		return courseNamne;
	}

	public void priduceQuestion(Course course, Question question) {
		System.out.println(question.getUserName() + " 在 " + course.courseNamne + "提交了问题");
		setChanged();

		notifyObservers(question);

	}
}
