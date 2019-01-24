package cn.tamilin.patterns.structural.adapter;

/**
 * @ClassName PowerAdapter
 * @Desciption 通过适配器 将220V交流电 转换成 5V直流电 进行输出
 * @Author summer
 * @Date 2019/1/24 18:31
 */
public class PowerAdapter implements DC5{

	private AC220 ac220 = new AC220();
	@Override
	public int outputDC5V() {
		int adapterInput = ac220.outputAC220V();
		// 变压器
		int adapterOutput = adapterInput/44;
		System.out.println("适用PowerAdapter输入AC：" + adapterInput + "V" + "输出DC：" + adapterOutput + "V" );
		return adapterOutput;
	}
}
