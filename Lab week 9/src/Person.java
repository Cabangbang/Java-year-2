
public class Person 
{

	private String fname;
	private String sname;
	private String city;
	
	public Person(String fname, String sname, String city) {
		this.fname = fname;
		this.sname = sname;
		this.city = city;
	}
	
	
	
	@Override
	public String toString() {
		return "This person is called " + fname + " " + sname + " and lives in city " + city;
	}



	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
