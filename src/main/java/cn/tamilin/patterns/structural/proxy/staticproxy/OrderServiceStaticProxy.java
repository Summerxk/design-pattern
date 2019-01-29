package cn.tamilin.patterns.structural.proxy.staticproxy;

import cn.tamilin.patterns.structural.proxy.IOrderService;
import cn.tamilin.patterns.structural.proxy.Order;
import cn.tamilin.patterns.structural.proxy.OrderServiceImpl;
import cn.tamilin.patterns.structural.proxy.db.DataSourceContextHolder;

/**
 * @ClassName OrderServiceStaticProxy
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 16:31
 */
public class OrderServiceStaticProxy {

	private IOrderService iOrderService;

	public int saveOrder(Order order) {
		beforeMethod(order);
		iOrderService = new OrderServiceImpl();
		int result = iOrderService.saveOrder(order);
		afterMethod();
		return result;
	}

	private void beforeMethod(Order order) {
		int userId = order.getUserId();
		int dbRouter = userId % 2;
		System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");

		// TODO 设置 datasource
		DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
		System.out.println("静态代理 before code");
	}

	private void afterMethod() {
		System.out.println("静态代理 after code");
	}

}
