package com.java.Hackathon;

import java.util.Scanner;

public class PalindromeStringandNumber {

	public static void main(String[] args) {
		String str;
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for number or Enter 2 for String");
		int num = sc.nextInt();
		if (num == 1) {
			str1 = "54325";
			if (palindromenum(str1)) {
				System.out.println("yes The number is Palindrome");
			} else {
				System.out.println("No the number is not palindrome");
			}
		} else {
			str = "MalayalaM";
			if (palindrome(str)) {
				System.out.println("yes the string is Palindrome");
			} else {
				System.out.println("No the string is not Palindrome");
			}
		}
	}

	static boolean palindromenum(String str1) {
		int i = 0, j = str1.length() - 1;
		while (i < j) {
			if (str1.charAt(i) != str1.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	static boolean palindrome(String str) {
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
