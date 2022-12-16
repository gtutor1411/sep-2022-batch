package com.busyqa.sessions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;

public class Session3 {

	public static void main(String[] args) {

		String s1 = "Canada";
		String s2 = "Canada";
		String s3 = new String("Canada");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//System.out.println(s3==s2);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		s1.equals(s3);
		

		int[] array;
		array = new int[5];
		array[0] = 10;
		array[1] = 10;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		// System.out.println(array.length);

		for (int k = 0; k < array.length; k++) {
			// System.out.println(array[k]);
		}

		int[][] multiArray;
		multiArray = new int[3][3];
		multiArray[0][0] = 10;
		multiArray[0][1] = 20;

		// System.out.println(multiArray[0][0]);

		// hashset
		HashSet<String> movies = new HashSet<String>();
		movies.add("GodFather");
		movies.add("ShawShank Redemption");
		movies.add("Usual Suspects");
		movies.add("Dark Knight");
		movies.add("Prestige");
		movies.add("Prestige");
		// System.out.println(movies.contains("Prestige"));
		// System.out.println(movies);

		HashMap<Integer, String> movieRanking = new HashMap<Integer, String>();
		movieRanking.put(3, "GodFather");
		movieRanking.put(4, "Shawshank Redemption");
		movieRanking.put(1, "Usual Suspects");
		movieRanking.put(2, "Prestige");
		movieRanking.put(8, "Usual Suspects");
		System.out.println(movieRanking);

		// System.out.println(movieRanking.get(2));

	}

}
