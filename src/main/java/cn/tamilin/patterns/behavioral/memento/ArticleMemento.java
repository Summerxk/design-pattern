package cn.tamilin.patterns.behavioral.memento;

/**
 * @ClassName ArticleMemento
 * @Desciption 可以理解为快照
 * @Author summer
 * @Date 2019/1/31 15:39
 */
public class ArticleMemento {
	private String title;
	private String content;
	private String imgs;

	public ArticleMemento(String title, String content, String imgs) {
		this.title = title;
		this.content = content;
		this.imgs = imgs;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}


	public String getImgs() {
		return imgs;
	}

	@Override
	public String toString() {
		return "ArticleMemento{" +
				"title='" + title + '\'' +
				", content='" + content + '\'' +
				", imgs='" + imgs + '\'' +
				'}';
	}
}
