package com.java.Hackathon;

import java.util.Scanner;

public class LowerUpperSubsequenceSplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine().toLowerCase();
		System.out.println(str);

		String str1 = sc.next().toUpperCase();
		System.out.println(str1);

		String str3 = "JavaHackathon";
		String[] arrOfStr = str3.split(" ", 3);
		for (String a : arrOfStr) {
			System.out.println(a);
		}

		String str4 = "Java Hackathon";
		str4.subSequence(0, 3);
		System.out.println(str4);

	}

}
