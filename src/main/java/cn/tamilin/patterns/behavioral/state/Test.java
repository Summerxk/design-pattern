package cn.tamilin.patterns.behavioral.state;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/2/2 16:36
 */
public class Test {
	public static void main(String[] args) {
		CourseVideoContext courseVideoContext = new CourseVideoContext();
		courseVideoContext.setCourseVideoState(new PlayState());

		System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

		courseVideoContext.pause();
		System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

		courseVideoContext.speed();
		System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

		courseVideoContext.stop();
		System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
	}
}
