package cn.tamilin.patterns.behavioral.chainofresponsibility;

/**
 * @ClassName Approver
 * @Desciption 批准者
 * @Author summer
 * @Date 2019/1/31 16:55
 */
public abstract class Approver {
	protected  Approver approver;//责任链模式包含一个自己相同类型的对象

	public void setNextApprover(Approver approver) {
		this.approver = approver;// 下一个审批者
	}

	abstract void deploy(Course course);
}
