package cn.tamilin.patterns.structural.adapter.objectadapter;

/**
 * @ClassName Adapter
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 18:20
 */
public class Adapter implements Target{

	private Adaptee adaptee = new Adaptee();
	@Override
	public void request() {
		adaptee.adapteeRequest();
	}
}
