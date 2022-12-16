package com.busyqa.sessions;

import java.util.HashMap;

public class Session4_ReturnClass {

	public static void main(String[] args) {

		int sumOfTwoNumbers;

		// add(10, 5);

		sumOfTwoNumbers = addReturn(10, 5);
		System.out.println(sumOfTwoNumbers);

		String movie;

		movie = whatIsTheMovie(4);
		System.out.println(movie);
		
		System.out.println(isOddNumber(5));

	}

	public static void add(int i, int j) {
		int sum;
		sum = i + j;
	}

	public static int addReturn(int i, int j) {

		int sum;
		sum = i + j;
		return sum;

	}

	public static String whatIsTheMovie(int i) {

		HashMap<Integer, String> movieRanking = new HashMap<Integer, String>();
		movieRanking.put(3, "GodFather");
		movieRanking.put(4, "Shawshank Redemption");
		movieRanking.put(1, "Usual Suspects");
		movieRanking.put(2, "Prestige");
		movieRanking.put(8, "Usual Suspects");
		String movie = movieRanking.get(i);
		return movie;

	}

	public static boolean isOddNumber(int i) {
		boolean result;

		if (i % 2 > 0) {
			result = true;
		} else {
			result = false;
		}

		return result;

	}

}
