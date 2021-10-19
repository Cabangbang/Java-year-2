import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TestHashSet {
	
	String array[] = {"Albania", "Andorra", "Austria", "Belarus", "Belgium","Bosnia Herzegovina", "Bulgaria",
			  "Croatia", "Cyprus", "Czech Republic",  "Denmark", "Estonia",    "Hungary",  "Iceland",
			  "Ireland",  "Italy",  "Kosovo",  "Latvia",  "Liechtenstein", "Lithuania",  "Luxemburg",
			  "Macedonia",  "Malta",  "Moldova",  "Monaco",  "Montenegro",  "Norway",  "Poland", "Portugal",
			  "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland",
			  "the Netherlands", "the United Kingdom", "Turkey", "Ukraine"};

	Set<String> Countries = new HashSet<>(Arrays.asList(array));

	public void printSet() 
	{
		Iterator<String> itr = Countries.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}	
	
	@SuppressWarnings("resource")
	public void addEntry() {
		Scanner addCountry = new Scanner(System.in);
		System.out.println("Enter a Country: ");
		
		String addedCountry = addCountry.nextLine();
		Countries.add(addedCountry);
	}
	
	@SuppressWarnings("resource")
	public void matchEntry() {
		Scanner checkCountry = new Scanner(System.in);
		System.out.println("Enter a Country: ");
		
		String containsCountry = checkCountry.nextLine();
		System.out.println(containsCountry+" exits in the Set?: "+ Countries.contains(containsCountry));

		}
	public void clearSet() {
		Countries.clear();
	}
	
	public void sortSet() {
		System.out.println("/////Sorted Set//////");
		List<String> SortedList = new ArrayList<>(Countries);
		Collections.sort(SortedList);
		Iterator<String> itr = SortedList.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		System.out.println("\n/////Reverse Set//////");
		Collections.sort(SortedList, Collections.reverseOrder());
		Iterator<String> itr1 = SortedList.iterator();
		while(itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}
		System.out.println("\n/////Shuffled Set//////");
	
		Collections.shuffle(SortedList);
		Iterator<String> itr11 = SortedList.iterator();
		while(itr11.hasNext()) 
		{
			System.out.println(itr11.next());
		}
		
		
	}
		
		
}