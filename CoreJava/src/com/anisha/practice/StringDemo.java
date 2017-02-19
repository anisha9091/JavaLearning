package com.anisha.practice;

public class StringDemo {
	public static void main(String[] args) {
		String string = new String(" abc ");
		System.out.println("HI"+string+"Hi");
		System.out.println("HI"+string.trim()+"Hi");
		StringBuffer buffer = new StringBuffer("abc");
		buffer.reverse();
		System.out.println(buffer);
		
	}
}
