package com.week1.oo;


/************************************************************
*  Author: Susan McKeever
*  class: Control   - used to illustrate use of arraylists
*  date : March 2021
*
************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ControlCollection {

	public static void main(String[] args) 
	{
	

		StringScreen3 myScreen = new StringScreen3("Lab week 9");
		ArrayList<Person> people = new ArrayList<Person>();
		Person p1 = new Person("James", "Whelan", "Dublin");
		Person p2 = new Person("Johny", "Smith", "Cork");
		Person p3 = new Person("Sinead", "OFlynn", "Belfast");
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
	   // get each Persopn object in the arraylist called people to print itself out	
		for (Person element:  people)
		 System.out.println("element is " + element.toString());

		ArrayList<Person> otherPeopleList  = (ArrayList) people.clone();	

        System.out.println("let's see if the clone worked");

 	   // get each Person object in the cloned arraylist to print itself out	

		for (Person element:  otherPeopleList)
			 System.out.println("element is " + element.toString());
		
		
	}
}
