package cn.tamilin.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Teacher
 * @Desciption 实现 Observer 接口 作为观察者
 * @Author summer
 * @Date 2019/1/31 14:23
 */
public class Teacher implements Observer {
	private String teacherName;

	public Teacher(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public void update(Observable o, Object arg) {
		Course course = (Course) o;
		Question question = (Question) arg;
		System.out.println(teacherName + "老师的" + course.getCourseNamne() + "课程接收到一个"
				+ question.getUserName() + "提交的" + question.getQuestionContent() + "问题");

	}
}
