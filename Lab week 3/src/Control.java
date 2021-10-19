
/*
 *  Author Raphael Bien Cabangbang
 *  Date 11/2/21
 * 
 */

public class Control 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Raphael", "Cabangbang", 13943, 72000);
		System.out.println(e1.toString());
		e1.calculatePay();	//monthly pay
		System.out.println();
		
		Employee e2 = new HourlyEmployee("John", "Winters", 32534, 0, 6, 34);
		System.out.println(e2.toString());
		e2.calculatePay(); //hourly pay
		System.out.println();
		
		Employee e3 = new SalesEmployee("Steve", "White", 23213, 6000, 25);
		System.out.println(e3.toString());
		e3.calculatePay(); //commission sales
	}
}
