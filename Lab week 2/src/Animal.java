/*
 *  Author Raphael Bien Cabangbang
 *  Date 4/2/21
 * 
 */

public class Animal 
{
	public String name;
	public String breed;
	public String domesticAnimal;
	
	public void name(String name)
	{
		this.name = name;
	}
	
	public Animal(String name, String breed, String domesticAnimal)
	{
		this.name = name;
		this.breed = breed;
		this.domesticAnimal = domesticAnimal;
	}
	
	public String toString()
	{
		String Summary = "This animal is called " + this.name +", is a " + this.breed + 
						 " and it is " + this.domesticAnimal + " that it is a domestic animal.";
		
		return Summary;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void makeNoise()
	{
		if(breed == "dog")
		{
			System.out.println("Bark");
		}
		else if(breed == "cat") {
			System.out.println("Miaow");
		}
		else if(breed == "duck") {
			System.out.println("Quack");
		}
		else {
			System.out.println("Unknown noise");
		}
	}
}
