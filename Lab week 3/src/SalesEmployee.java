/*
 *  Author Raphael Bien Cabangbang
 *  Date 11/2/21
 * 
 */

public class SalesEmployee extends Employee
{
	public double commissionEarned;

	public SalesEmployee(String firstName, String surName, int staffNumber, double annualSalary, double commissionEarned) 
	{
		super(firstName, surName, staffNumber, annualSalary);
		this.commissionEarned = commissionEarned;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nCommissions Earned: $" + this.commissionEarned;
	}


	@Override
	public void calculatePay() //calculate monthly pay + commissions
	{
		System.out.println("Monthly Pay(+commissions): $" + ((this.annualSalary/12)+this.commissionEarned));
	}
}