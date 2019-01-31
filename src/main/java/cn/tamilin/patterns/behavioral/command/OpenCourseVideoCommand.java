package cn.tamilin.patterns.behavioral.command;

/**
 * @ClassName OpenCourseVideo
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 16:06
 */
public class OpenCourseVideoCommand implements Command{

	private CourseVideo courseVideo;

	public OpenCourseVideoCommand(CourseVideo courseVideo) {
		this.courseVideo = courseVideo;
	}

	@Override
	public void execute() {
		courseVideo.open();
	}
}
