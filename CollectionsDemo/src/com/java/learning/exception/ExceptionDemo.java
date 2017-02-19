package com.java.learning.exception;
// try, cath,finally, throw, throws
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			String a = null;
			System.out.println(a.length());
			int b = 10 / 0;
			System.out.println(b);

		} catch (ArithmeticException | NullPointerException e) {
			if (e instanceof ArithmeticException)
				System.out.println("Number cant be divided by zero");

			else
				System.out.println("Lenght of null cant be determined");
		} finally {
			System.out.println("Finally");
		}

	}
}
