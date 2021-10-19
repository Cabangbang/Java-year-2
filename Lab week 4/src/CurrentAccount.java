
public class CurrentAccount extends Account
{
	public double penaltyAmount;

	public CurrentAccount(String accountName, int accountNumber, boolean inCredit, double acctBalance,
			double penaltyAmount) 
	{
		super(accountName, accountNumber, inCredit, acctBalance);
		this.penaltyAmount = penaltyAmount;
	}

	@Override
	public void Withdraw(double witAmount) 
	{
		super.Withdraw(witAmount);
		this.penaltyAmount += 10;
	}
	
	public void checkCredit()
	{
		if(this.acctBalance<0)
		{
			System.out.println("Account Balance is in credit");
		}
		else
		{
			System.out.println("Account Balance is not in credit");
		}
	}
	
	public void checkCredit(String warningMessage)
	{
		if(acctBalance<100)
		{
			System.out.println(warningMessage);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nPenalty Amount: " + penaltyAmount;
	}

	
	
}
