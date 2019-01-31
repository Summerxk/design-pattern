package cn.tamilin.patterns.behavioral.observer;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 14:33
 */
public class Test {
	public static void main(String[] args) {
		Course course = new Course("course1");
		Teacher teacher = new Teacher("summer");

		course.addObserver(teacher);

		//业务逻辑代码
		Question question = new Question();
		question.setUserName("xiakai");
		question.setQuestionContent("xiao ou");

		course.priduceQuestion(course,question);
	}
}
