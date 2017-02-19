package com.anisha.practice;

public class Car {
		String name;
		Engine engine;
		
		Car(String name)
		{
			this.name=name;
		}
		public void Demo()
		{
			Engine en=new Engine();
			en.start();
		}
}
