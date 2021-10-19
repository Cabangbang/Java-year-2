
import java.util.List;

public class Job
{
	private double salary;
	private String role;
	private int jobID;
	
	public Job(double salary, String role, int jobID)
	{
		this.salary = salary;
		this.role = role;
		this.jobID = jobID;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getJobID() {
		return jobID;
	}
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	@Override
	public String toString() {
		return "Job: salary:" + salary + ", role:" + role + ", jobID:" + jobID;
	}
	
	public void JobValidation()
	{
		FileProcessor rolesFile = new FileProcessor("roles.txt");
		rolesFile.openFile();
		List <String> jobRoles= rolesFile.readFile();
		boolean isValid = false;
		
		 for(int i=0;i<jobRoles.size(); i++)
		 {
			if(getRole().equals(jobRoles.get(i)))
			{
				isValid = true;
			}
		}
		
		if(isValid)
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println("Valid");
		}
	}

}
