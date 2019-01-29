package cn.tamilin.patterns.structural.proxy;

/**
 * @ClassName OrderDaoImpl
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 16:26
 */
public class OrderDaoImpl implements IOrderDao{

	@Override
	public int insert(Order order) {
		System.out.println("Dao层添加order成功");
		return 1;
	}
}
