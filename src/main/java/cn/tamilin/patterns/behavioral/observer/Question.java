package cn.tamilin.patterns.behavioral.observer;

/**
 * @ClassName Question
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 14:22
 */
public class Question {
	private String userName;
	private String questionContent;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
}
