package com.lab1.test;

/*
 *  Author Raphael Bien Cabangbang
 *  Date 28/01/21
 * 
 */

public class Control
{
	
	public static void main(String[] args)
	{
		System.out.println("helloworld");
		
		Vehicle v1 = new Vehicle("Joe", 2001);
		Vehicle v2 = new Vehicle("Steve", 2012, "140km/hr", "Red", "Manual", 4);
		
		System.out.println(v1.toString());
		System.out.println(v1.recentCar());
		System.out.println(v2.toString());
		System.out.println(v2.recentCar());
	}
	
	
	
}
