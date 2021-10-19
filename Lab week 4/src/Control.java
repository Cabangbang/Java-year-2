
public class Control {
	public static void main(String[] args) {
		Account a1 = new Account("Raphael", 12321, true, 100);
		a1.Deposit(90); // demonstrating deposit
		a1.Withdraw(200);
		a1.getDetails();
		a1.valuableAccount();
		System.out.println(a1+"\n");
		
		DepositAccount d1 = new DepositAccount("john", 8902, true, 50, 6);
		d1.Deposit(10); // demonstrating deposit
		d1.Withdraw(200);
		d1.getDetails();
		d1.valuableAccount();
		System.out.println(d1+"\n");
		 
		  
		CurrentAccount c1 = new CurrentAccount("Steven", 4123, true, 100, 0);
		c1.Deposit(0); // demonstrating deposit
		c1.Withdraw(90);
		c1.getDetails();
		c1.valuableAccount();
		c1.checkCredit();
		c1.checkCredit("Your balance is less than €100");
		System.out.println(c1+"\n");
		 
	}

}
