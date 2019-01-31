package cn.tamilin.patterns.behavioral.visitor;

/**
 * @ClassName Course
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/31 17:30
 */
public abstract class Course {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void accept(IVisitor iVisitor);
}
