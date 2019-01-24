package cn.tamilin.patterns.structural.adapter;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/24 18:35
 */
public class Test {
	public static void main(String[] args) {
		DC5 dc5 = new PowerAdapter();
		dc5.outputDC5V();
	}
}
