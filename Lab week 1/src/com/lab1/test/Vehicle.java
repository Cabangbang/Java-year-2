package com.lab1.test;

/*
 *  Author Raphael Bien Cabangbang
 *  Date 28/01/21
 * 
 */
public class Vehicle
{

	private String ownerName;
	private int regNum;
	private String maxSpeed;
	private String colour;
	private String automatic;
	private int noOfWheels;

	
	public Vehicle(String ownerName, int regNum)
	{
		this.ownerName 	= ownerName;
		this.regNum		= regNum;
	}
	

	public Vehicle(String ownerName, int regNum, String maxSpeed, String colour,
				   String automatic, int noOfWheels)
	{
		this.ownerName 		= ownerName;
		this.regNum			= regNum;
		this.maxSpeed 		= maxSpeed;
		this.colour			= colour;
		this.automatic 		= automatic;
		this.noOfWheels		= noOfWheels;
	}
	
	public String toString()
	{
		String Summary = "\nOwner name is " + this.ownerName + "\nRegistration Number is " + this.regNum + 
						"\nMax speed is " + this.maxSpeed + "\ncolour is " + this.colour + "\nAutomatic? " + this.automatic + 
						"\nNumber of wheels " + this.noOfWheels;
		return Summary;
	}
	

	Boolean recentCar()
	{
		if (this.regNum > 2002)
		{
			return true;
			
		}
		else
		{
			return false;
		}			
	
	}


}
