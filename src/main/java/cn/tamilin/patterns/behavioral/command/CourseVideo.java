package cn.tamilin.patterns.behavioral.command;

/**
 * @ClassName CourseVideo
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 16:05
 */
public class CourseVideo {
	private String name;

	public CourseVideo(String name) {
		this.name = name;
	}

	public void open() {
		System.out.println(this.name + "课程的视频开放");
	}

	public void close() {
		System.out.println(this.name + "课程的视频关闭");
	}
}
