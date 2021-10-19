
public class Employee extends Person
{
	private Job job;
	private int PersonnelNumber;
	private Date startDate;
	private int nextNumber;
	
	
	public Employee(String firstName, String surName, Date dateOfBirth, String gender, Job job, int personnelNumber,
			Date startDate, int nextNumber) 
	{
		super(firstName, surName, dateOfBirth, gender);
		this.job = job;
		PersonnelNumber = personnelNumber;
		this.startDate = startDate;
		this.nextNumber = nextNumber;
	}


	public Job getJob() {
		return job;
	}


	public void setJob(Job job) {
		this.job = job;
	}


	public int getPersonnelNumber() {
		return PersonnelNumber;
	}


	public void setPersonnelNumber(int personnelNumber) {
		PersonnelNumber = personnelNumber;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public int getNextNumber() {
		return nextNumber;
	}


	public void setNextNumber(int nextNumber) {
		this.nextNumber = nextNumber;
	}


	@Override
	public String toString() {
		return  job + " PersonnelNumber:" + PersonnelNumber + ", Start " + startDate
				+ ", nextNumber:" + nextNumber + "]";
	}
	
	
	
}
