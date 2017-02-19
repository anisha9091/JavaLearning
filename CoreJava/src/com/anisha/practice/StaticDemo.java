package com.anisha.practice;

public class StaticDemo {
		static String x =  "Gourav";
		
		String name;
		int age;
		
		public StaticDemo(String name,int age)
		{
			this.name=name;
			this.age=age;
		}
		static{
			System.out.println("Static method belong to whole class not just an instance");
			System.out.println("Each object share the same copy of static variable");
		}
		static void display()
		{
			System.out.println("Static method can change the value of static variable");
			x="Anny";
			System.out.println("value of x changed to " +x);
		}
		void displayInstance()
		{
			System.out.println(name + " " + age);
		}
		public static void main(String[] args) {
			StaticDemo.display();
			
			StaticDemo sd=new StaticDemo("Anisha",26);
			StaticDemo sd2=new StaticDemo("Gourav",25);
			
			sd.displayInstance();
			sd2.displayInstance();
		}
}
