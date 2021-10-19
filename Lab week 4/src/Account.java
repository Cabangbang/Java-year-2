
public class Account implements ValidatedAccount
{
	public String accountName;
	public int accountNumber;
	public boolean inCredit;
	public double acctBalance;
	static int CurrentNumber = 1000;
	
	
	public Account(String accountName, int accountNumber, boolean inCredit, double acctBalance)
	{
		this.accountName = accountName;
		this.accountNumber = CurrentNumber;
		this.inCredit = inCredit;
		this.acctBalance = acctBalance;
		CurrentNumber++;
	}
	
	
	
	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public boolean isInCredit() {
		return inCredit;
	}



	public void setInCredit(boolean inCredit) {
		this.inCredit = inCredit;
	}



	public double getAcctBalance() {
		return acctBalance;
	}



	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}



	public void Deposit(double depAmount)
	{
		this.acctBalance += depAmount;
		if(this.acctBalance>0)
		{
			this.inCredit = true;
		}
	}
	
	public void Withdraw(double witAmount)
	{
		this.acctBalance -= witAmount;
		
		if(this.acctBalance < 0)
		{
			this.inCredit = false;
		}
	}



	@Override
	public String toString() {
		return "Account Name: " + accountName + 
				"\nAccount Number: " + accountNumber +
				"\nIn Credit: " + inCredit +
				"\nBalance: " + acctBalance;
	}



	@Override
	public void getDetails() {
		System.out.println("Account: " +accountName + " has €"+acctBalance);
	}



	@Override
	public void valuableAccount() {
		System.out.println("Balance: €" +acctBalance);
	}

	
	
}
