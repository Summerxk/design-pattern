package cn.tamilin.patterns.structural.bridge;

/**
 * @ClassName Bank
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 15:01
 */
public abstract class Bank {

	protected Account account;

	public Bank(Account account) {
		this.account = account;
	}

	abstract Account openAccount();
}
