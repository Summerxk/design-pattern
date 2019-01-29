package cn.tamilin.patterns.structural.proxy;

/**
 * @ClassName OrderServiceImpl
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 16:27
 */
public class OrderServiceImpl implements IOrderService{

	private IOrderDao iOrderDao;

	@Override
	public int saveOrder(Order order) {
		//spring 会自己注入 这里直接new了
		iOrderDao = new OrderDaoImpl();
		System.out.println("service 调用Dao层添加order");
		return iOrderDao.insert(order);
	}
}
