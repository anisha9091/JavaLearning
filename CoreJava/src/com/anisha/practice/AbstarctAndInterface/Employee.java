package com.anisha.practice.AbstarctAndInterface;

public abstract class Employee {
	public int Id;
	public String firstName;
	public String lastName;
	
	public String getFullName()
	{
		return this.firstName + " " +this.lastName;
	}
	public abstract double monthlySalary();
}
