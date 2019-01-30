package cn.tamilin.patterns.behavioral.templatemethod;

/**
 * @ClassName FECourse
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 14:11
 */
public class FECourse extends ACourse{

	private boolean neddWriteArticleFalg = false;

	public FECourse(boolean neddWriteArticleFalg) {
		this.neddWriteArticleFalg = neddWriteArticleFalg;
	}

	@Override
	void packageCourse() {
		System.out.println("提供课程的前端代码");
		System.out.println("提供课程的图片等多媒体");
	}

	@Override
	protected boolean needWriteArticle() {
		return this.neddWriteArticleFalg;
	}
}
