
public class control {
	

	public static void main(String[] args)
	{
		FileProcessor f1 = new FileProcessor("roles.txt");
		f1.readFile();
		
		Date d1 = new Date(05, 10, 2000);
		Date d2 = new Date(11, 03, 2021);
		System.out.println(d1.toString());
		
		Job j1 = new Job(100.99, "Doctor", 13943);
		j1.setRole("Doctor");
		j1.setJobID(200);
		j1.setSalary(111.11);
		System.out.println(j1.toString());
		
		Person p1 = new Person("Raphael", "Cabangbang", d1, "Male");
		System.out.println(p1.toString());
		
		Employee e1 = new Employee("Raphael", "Cabangbang", d1, "Male", j1, 13123, d2, 123);
		System.out.println(e1.toString());
		
		j1.JobValidation();
	}
}