package cn.tamilin.patterns.structural.bridge;

/**
 * @ClassName Test
 * @Desciption TODO
 * @Author summer
 * @Date 2019/1/29 15:28
 */
public class Test {
	public static void main(String[] args) {
		Bank icbcBank = new ICBCBank(new DepositAccount());
		Account icbcAccount = icbcBank.openAccount();
		icbcAccount.showAccountType();

		Bank aBCBank = new ABCBank(new SavingAccount());
		Account aBCAccount = aBCBank.openAccount();
		aBCAccount.showAccountType();
	}
}
