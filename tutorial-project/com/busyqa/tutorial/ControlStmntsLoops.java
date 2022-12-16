package com.busyqa.tutorial;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ControlStmntsLoops {

	public static void main(String[] args) {
//if else
		System.out.println("****SubModule-If-Else****");
		int x = 10;
		int y = 10;
		if (x + y > 20) {
			System.out.println("x + y is greater than 20");
		} else {
			System.out.println("x + y is NOT greater than 20");
		}

		// switch case
		System.out.println("****SubModule-Switch Case****");
		int num = 0;
		switch (num) {
		case 0:
			System.out.println("number is 0");
			break;
		case 1:
			System.out.println("number is 1");
			break;
		case 2:
			System.out.println("number is 2");
			break;
		default:
			System.out.println("I have no idea what to do " + num);
		}

		// do..while
		System.out.println("****SubModule-do-While****");
		int i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		do {
			System.out.println(i);
			i = i + 2;
		} while (i <= 10);

		// while
		System.out.println("****SubModule-While****");
		int j = 20;
		System.out.println("Printing the list of first 10 even numbers \n");
		while (j <= 10) {
			System.out.println(i);
			j = i + 2;
		}

		// For
		System.out.println("****SubModule-For****");
		for (int z = 0; z < 10; z++) {
			System.out.println(z);
		}

	}

}
