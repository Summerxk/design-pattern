package cn.tamilin.patterns.structural.bridge;

/**
 * @ClassName ICBCBank
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 15:06
 */
public class ICBCBank extends Bank{

	public ICBCBank(Account account) {
		super(account);
	}

	@Override
	Account openAccount() {
		System.out.println("打开ICBC银行账号");
		account.openAccount();
		return account;
	}
}
