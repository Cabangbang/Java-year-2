
/*
 *  Author Raphael Bien Cabangbang
 *  Date 4/2/21
 * 
 */

public class Control
{
	
	public static void main(String[] args)
	{
		Animal a1 = new Animal("Spot", "dog", "True");
		Animal a2 = new Animal("Leo", "duck", "False");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		System.out.println(a1.name);
		System.out.println(a1.domesticAnimal);
		
		a1.setName("Sam");
		System.out.println(a1.getName());
		
		a1.makeNoise();
		a2.makeNoise();
	}
	
	
	
}