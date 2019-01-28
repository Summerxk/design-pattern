package cn.tamilin.patterns.structural.flyweight;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/28 11:12
 */
public class Test {
	private static final String departments[] = {"RD","QA","PM","PD"};

	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			String department = departments[(int)(Math.random() * departments.length)];
//			Manager manger = (Manager) EmployeeFactory.getManager(department);
//			manger.report();
//		}
		Integer a = Integer.valueOf(100);
		Integer b = 100;

		Integer c = Integer.valueOf(1000);
		Integer d = 1000;

		System.out.println(a == b);// true
		System.out.println(c == d);// false
	}
}
