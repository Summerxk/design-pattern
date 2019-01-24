package cn.tamilin.patterns.structural.adapter.objectadapter;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 18:16
 */
public class Test {
	public static void main(String[] args) {
		Target target = new ConcreteTarget();
		target.request();

		Target target1 = new Adapter();
		target1.request();//这里实际上调用了 adaptee的方法
	}
}
