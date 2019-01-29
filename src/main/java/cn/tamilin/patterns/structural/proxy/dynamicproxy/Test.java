package cn.tamilin.patterns.structural.proxy.dynamicproxy;

import cn.tamilin.patterns.structural.proxy.IOrderService;
import cn.tamilin.patterns.structural.proxy.Order;
import cn.tamilin.patterns.structural.proxy.OrderServiceImpl;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 17:52
 */
public class Test {
	public static void main(String[] args) {
		Order order = new Order();
		order.setUserId(2);

		IOrderService orderServiceDynamicProxy = (IOrderService)new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
		orderServiceDynamicProxy.saveOrder(order);

	}
}
