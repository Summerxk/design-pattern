package cn.tamilin.patterns.behavioral.state;

/**
 * @ClassName StopState
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 18:13
 */
public class StopState extends CourseVideoState {

	@Override
	public void play() {
		super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
	}

	@Override
	public void speed() {
		System.out.println("error 停止状态不能快进");
	}

	@Override
	public void pause() {
		System.out.println("error 听你状态不能暂停");
	}

	@Override
	public void stop() {
		System.out.println("停止播放课程视频状态");
	}
}
