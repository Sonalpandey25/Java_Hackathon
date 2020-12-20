package com.java.Hackathon;

import java.util.Scanner;

public class ThreeBoolean {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = true;
		boolean c = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b or c");
		boolean choice = sc.hasNext();

		if (choice == a) {
			System.out.print(a);
		}
		else if (choice ==b) {
			System.out.print(b);
		}
		else if(c) {
			System.out.print(c);
		}
	}
}


