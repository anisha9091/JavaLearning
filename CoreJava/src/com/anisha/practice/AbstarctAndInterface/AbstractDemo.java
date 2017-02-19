package com.anisha.practice.AbstarctAndInterface;

public class AbstractDemo {
	public static void main(String[] args) {
		
		FullTimeEmployee e1=new FullTimeEmployee();
		e1.Id = 101;
		e1.firstName = "Anisha";
		e1.lastName = "Dhiman";
		e1.salary = 60280;
		
		ContractEmployee e2=new ContractEmployee();
		e2.Id = 102;
		e2.firstName = "Manisha";
		e2.lastName = "Agarwal";
		e2.hourlyPay = 900;
		e2.totalHours = 10;
		
		e1.getFullName();
		e1.monthlySalary();
		
		e2.getFullName();
		e2.monthlySalary();
		
	}
}
