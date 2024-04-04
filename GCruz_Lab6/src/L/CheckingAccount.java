package L;

public class CheckingAccount extends BankAccount{

	final static double FEE = 0.15;
	
	public CheckingAccount(String name, int initialB){
		super(name, initialB);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		double totalAmount = amount + FEE;
		return super.withdraw(totalAmount);
	}
	
}
