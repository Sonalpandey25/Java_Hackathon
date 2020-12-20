package com.java.Hackathon;

public class Palindrome {

	public static void main(String[] args) {
		String str = "3445443";
		if (palindromenum(str))
			System.out.println("yes");
		else
			System.out.println("No");
		
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
