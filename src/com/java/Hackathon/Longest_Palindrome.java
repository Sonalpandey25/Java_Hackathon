package com.java.Hackathon;

import java.util.Scanner;

public class Longest_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter lonngest Palindrome");
		String str = sc.next();
		if (palindromenum(str))
			System.out.println("Yes its longest Palindrome");
		else
			System.out.println("No Its not palindrome");

	}

	static boolean palindromenum(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
