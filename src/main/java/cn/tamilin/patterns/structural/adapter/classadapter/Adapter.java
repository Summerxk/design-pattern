package cn.tamilin.patterns.structural.adapter.classadapter;

/**
 * @ClassName Adapter
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 18:10
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.adapteeRequest();
	}
}
