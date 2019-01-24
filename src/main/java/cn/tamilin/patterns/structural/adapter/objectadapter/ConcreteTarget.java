package cn.tamilin.patterns.structural.adapter.objectadapter;

/**
 * @ClassName ConcreteTarget
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 18:06
 */
public class ConcreteTarget implements Target{
	@Override
	public void request() {
		System.out.println("concreteTarger目标方法");
	}
}
