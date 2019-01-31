package cn.tamilin.patterns.behavioral.interpreter;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/30 18:18
 */
public class Test {
	public static void main(String[] args) {
		String summerInputStr = "6 100 11 + *";
		SummerExpressionParser expressionParser = new SummerExpressionParser();
		int result = expressionParser.parse(summerInputStr);
		System.out.println("解释器计算结果：" + result);
	}
}
