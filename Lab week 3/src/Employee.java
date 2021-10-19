/*
 *  Author Raphael Bien Cabangbang
 *  Date 11/2/21
 * 
 */

public class Employee 
{
	public String firstName;
	public String surName;
	public int staffNumber;
	public double annualSalary;
	
	public Employee(String firstName, String surName, int staffNumber, double annualSalary) 
	{
		this.firstName = firstName;
		this.surName = surName;
		this.staffNumber = staffNumber;
		this.annualSalary = annualSalary;
	}
	

	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirsName(String firstName) 
	{
		this.firstName = firstName;
	}
	/*****************************************************/
	
	public String getSurName() 
	{
		return surName;
	}
	public void setSurName(String surName) 
	{
		this.surName = surName;
	}
	/*****************************************************/
	
	public int getStaffNumber() 
	{
		return staffNumber;
	}
	public void setStaffNumber(int staffNumber) 
	{
		this.staffNumber = staffNumber;
	}
	/****************************************************/
	
	public double getAnnualSalary() 
	{
		return annualSalary;
	}
	public void setAnnualSalaryl(double annualSalary) 
	{
		this.annualSalary = annualSalary;
	}
	/*****************************************************/
	
	public void calculatePay() //Calculate monthly pay
	{
		System.out.println("Monthly Pay: $" + this.annualSalary/12);
	}
	
	public String toString()
	{
		String Summary = "First name: " + this.firstName +
						 "\nSurname: " + this.surName +
						 "\nStaff Number: " + this.staffNumber +
						 "\nAnnual Salary: $" + this.annualSalary;		
		return Summary;
	}
	
}
