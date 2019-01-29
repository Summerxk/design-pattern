package cn.tamilin.patterns.structural.bridge;

/**
 * @ClassName ABCBank
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 15:04
 */
public class ABCBank extends Bank {

	public ABCBank(Account account) {
		super(account);
	}

	@Override
	Account openAccount() {
		System.out.println("打开中国农业银行账号");
		account.openAccount();
		return account;
	}
}
