package com.busyqa.tools;

public class Calculator {

	public static void main(String[] args) {
		
		add(5,10);
		add(5,10,10);
		subtract(10,5);
		mulitply(10,5);
		divide(10,5);
	}
	
	//method overloading
	public static void add(int x, int y) {

		System.out.println(x + y);
	}
	
	public static void add(double x, int y) {

		System.out.println(x + y);
	}
	
	public static void add(int x, int y,int z) {

		System.out.println(x + y + z);
	}
	
	
	public static void subtract(int x, int y) {

		System.out.println(x - y);
	}

	public static void mulitply(int x, int y) {

		System.out.println(x * y);
	}
	
	
	public static void divide(int x, int y) {

		System.out.println(x / y);
	}
}
