package cn.tamilin.patterns.behavioral.command;

/**
 * @ClassName CloseCourseVideo
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 16:07
 */
public class CloseCourseVideoCommand implements Command{

	private CourseVideo courseVideo;

	public CloseCourseVideoCommand(CourseVideo courseVideo) {
		this.courseVideo = courseVideo;
	}

	@Override
	public void execute() {
		courseVideo.close();
	}
}
