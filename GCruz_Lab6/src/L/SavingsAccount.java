package L;


public class SavingsAccount extends BankAccount {
	private static double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double initialB) {
		super(name, initialB);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {
		double interest = getBalance() * rate / 12;
		deposit(interest);
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount originalAccount,double initialB) {
		super(originalAccount, initialB);
		savingsNumber = originalAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
}
