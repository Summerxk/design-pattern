package cn.tamilin.patterns.behavioral.chainofresponsibility;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 17:05
 */
public class Test {
	public static void main(String[] args) {
		Approver articleApprover = new ArticleApprover();
		Approver videoApprover = new VideoApprover();

		Course course = new Course();
		course.setName("name");
		course.setArticle("article");
		course.setVideo("video");

		articleApprover.setNextApprover(videoApprover);

		articleApprover.deploy(course);
	}
}
