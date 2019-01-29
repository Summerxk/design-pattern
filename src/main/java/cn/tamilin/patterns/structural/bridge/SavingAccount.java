package cn.tamilin.patterns.structural.bridge;

/**
 * @ClassName SavingAccount
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 14:56
 */
public class SavingAccount implements Account{

	@Override
	public Account openAccount() {
		System.out.println("打开活期账号");
		return new SavingAccount();
	}

	@Override
	public void showAccountType() {
		System.out.println("这是一个活期账号");
	}
}
