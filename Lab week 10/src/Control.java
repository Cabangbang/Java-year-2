
public class Control {
	public static void main(String[] args)
	{
		TestHashSet t1 = new TestHashSet();
		t1.printSet();
		t1.addEntry();
		t1.printSet();
		t1.matchEntry();
		t1.matchEntry();
		t1.clearSet();
		System.out.println("HashSet Cleared");
		t1.addEntry();
		t1.printSet();
		TestHashSet t2 =new TestHashSet();
		t2.sortSet();

	}



}