package com.java.Hackathon;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String word = sc.nextLine();
		char[] str2 = word.toCharArray();
		for (int i = str2.length - 1; i >= 0; i--) {
			System.out.print(str2[i]);
		}
	}

}
