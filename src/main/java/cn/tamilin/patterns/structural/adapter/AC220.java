package cn.tamilin.patterns.structural.adapter;

/**
 * @ClassName AC220
 * @Desciption 220V 交流电
 * @Author summer
 * @Date 2019/1/24 18:28
 */
public class AC220 {
	public int outputAC220V() {
		int output = 220;
		System.out.println("输出交流电" + output + "V");
		return output;
	}
}
