package cn.tamilin.patterns.structural.proxy.staticproxy;

import cn.tamilin.patterns.structural.proxy.Order;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 17:09
 */
public class Test {
	public static void main(String[] args) {
		Order order = new Order();
		order.setUserId(1);

		OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
		orderServiceStaticProxy.saveOrder(order);

	}
}
