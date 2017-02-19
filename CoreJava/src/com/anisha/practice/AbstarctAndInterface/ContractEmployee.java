package com.anisha.practice.AbstarctAndInterface;

public class ContractEmployee extends Employee{

	public int hourlyPay;
	public int totalHours;
	
	public double monthlySalary(){
		return this.hourlyPay * this.totalHours;
		
	}
}
