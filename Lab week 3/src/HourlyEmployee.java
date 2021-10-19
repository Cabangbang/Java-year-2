
/*
 *  Author Raphael Bien Cabangbang
 *  Date 11/2/21
 * 
 */
class HourlyEmployee extends Employee
{

	public double hoursWorked;
	public double hourlyRate;
	
	
	public HourlyEmployee(String firstName, String surName, int staffNumber, double annualSalary, double hoursWorked, double hourlyRate) 
	{
		super(firstName, surName, staffNumber, annualSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	
	@Override
	public String toString()
	{
		return super.toString() + "\nHours Worked: " + this.hoursWorked
								+ " hours\nHourly Rate: $" + this.hourlyRate;
	}


	@Override
	public void calculatePay() //calculate hourly pay
	{
		System.out.println("Hourly Pay: $" + this.hoursWorked*this.hourlyRate);
	}
	
}

