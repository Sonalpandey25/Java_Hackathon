package com.java.Hackathon;

import java.util.HashMap;
import java.util.Scanner;

public class OccurrenceOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string :");
		String str = sc.next();
		HashMap<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count.put(ch, count.getOrDefault(ch, 0) + 1);
		}
		System.out.println("Occurence of Character is "+ count);
	}
}
