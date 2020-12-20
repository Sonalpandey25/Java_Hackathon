package com.java.Hackathon;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String input = "reverse";
		char[] str1 = input.toCharArray();
		System.out.println("Duplicate Character in strings are :-");
		for (int i = 0; i <= str1.length; i++) {
			int count = 1;
			for (int j = i + 1; j <= str1.length - 1; j++) {
				if (str1[i] == str1[j] && str1[i] != ' ') {
					count = count + 1;
					str1[j] = '0';
				}
			}
			if (count > 1 && str1[i] != '0') {
				System.out.println(str1[i] + " Count is: " + count);
			}
		}
	}
}
