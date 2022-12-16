package com.busyqa.tutorial;

public class DataTypeVarOperators {

	public static void main(String[] args) {
		
		int i=10; 
		int j=20;
		
		//arithmetic
		System.out.println("****SubModule-Arithmetic****");
		System.out.println(i);
		System.out.println(j);
		System.out.println("Addition");
		System.out.println(i+j);
		System.out.println("Subtraction");
		System.out.println(i-j);
		System.out.println("Multiplication");
		System.out.println(i*j);
		System.out.println("Division");
		System.out.println(i/j);
		System.out.println("Modulo");
		System.out.println(i%j);
		System.out.println("***********");
		System.out.println("Increment");
		System.out.println(i++);
		System.out.println(++i);
		System.out.println("Decrement");
		System.out.println(i--);
		System.out.println(--i);
		
		//logical & comparison
		System.out.println("****SubModule-Logical/Comparators****");
		// && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false	

	}

}
