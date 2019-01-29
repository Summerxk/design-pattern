package cn.tamilin.patterns.structural.bridge;

/**
 * @ClassName DepositAccount
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 14:55
 */
public class DepositAccount implements Account {

	@Override
	public Account openAccount() {
		System.out.println("打开定期账号");
		return new DepositAccount();
	}

	@Override
	public void showAccountType() {
		System.out.println("这是一个定期账号");
	}
}
