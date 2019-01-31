package cn.tamilin.patterns.behavioral.chainofresponsibility;

/**
 * @ClassName Course
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 16:53
 */
public class Course {
	private String name;
	private String article;
	private String video;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	@Override
	public String toString() {
		return "Course{" +
				"name='" + name + '\'' +
				", article='" + article + '\'' +
				", video='" + video + '\'' +
				'}';
	}
}
