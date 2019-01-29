package cn.tamilin.patterns.structural.proxy;

/**
 * @ClassName Order
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 16:18
 */
public class Order {
	private Object orderInfo;
	private Integer userId;

	public Object getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(Object orderInfo) {
		this.orderInfo = orderInfo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
