package cn.tamilin.patterns.behavioral.state;

/**
 * @ClassName CourseVideoState
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 18:11
 */
public abstract class CourseVideoState {
	protected CourseVideoContext courseVideoContext;

	public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
		this.courseVideoContext = courseVideoContext;
	}

	public abstract void play();
	public abstract void speed();
	public abstract void pause();
	public abstract void stop();
}
