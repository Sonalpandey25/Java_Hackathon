package com.java.Hackathon;

public class TotalIntUpperLowerCase {

	public static void main(String[] args) {
		int cUpper = 0;
		int cLower = 0;
		int icount = 0;
		String str = "JavaProgram123";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				cUpper++;
			} else if (ch >= 'a' && ch <= 'z') {
				cLower++;
			} else if (ch >= '0' && ch <= '9') {
				icount++;
			}
		}
		System.out.println(
				"The total count of Uppercase is " + cUpper + " Lowercase is " + cLower + " IntegerCount " + icount);
	}
}
