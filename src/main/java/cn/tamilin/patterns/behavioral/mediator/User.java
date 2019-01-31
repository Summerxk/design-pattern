package cn.tamilin.patterns.behavioral.mediator;

/**
 * @ClassName User
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 16:31
 */
public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sendMessage(String message) {
		StudyGroup.showMessage(this, message);
	}
}
