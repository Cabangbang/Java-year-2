import java.util.ArrayList;

public class Control 
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Steven", "Stone", "Galway");
		Person p2 = new Person("Raphael", "Cabangbang", "Dublin");
		Person p3 = new Person("Peter", "Low", "Wicklow");
		
		
		ArrayList<Person> people = new ArrayList<Person>();
		ArrayList<Person> people2 = new ArrayList<Person>(people);
	
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		System.out.println(people.size());
		
		for (int i = 0; i < people.size(); i++) 
		{
		      System.out.println(people.get(i));
		}
		
		System.out.println(people2.size());
		
		for (int i = 0; i < people2.size(); i++) 
		{
		      System.out.println(people2.get(i));
		}
	}
}
