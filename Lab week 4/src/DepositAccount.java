
public class DepositAccount extends Account
{
	public double interestRate;



	public DepositAccount(String accountName, int accountNumber, boolean inCredit, double acctBalance,
			double interestRate) 
	{
		super(accountName, accountNumber, inCredit, acctBalance);
		this.interestRate = interestRate;
	}

	@Override
	public void Withdraw(double witAmount)
	{
		System.out.println("You cannot withdraw from a deposit account!");
	}

	@Override
	public String toString() {
		return super.toString() + "\nInterest Rate: " + interestRate;
	}

	

}
