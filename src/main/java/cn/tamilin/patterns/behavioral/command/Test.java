package cn.tamilin.patterns.behavioral.command;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 16:15
 */
public class Test {

	public static void main(String[] args) {
		CourseVideo courseVideo = new CourseVideo("course1");
		OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
		CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

		Staff staff = new Staff();
		staff.addCommand(openCourseVideoCommand);
		staff.executeCommands();
		staff.addCommand(closeCourseVideoCommand);
		staff.executeCommands();
	}
}
