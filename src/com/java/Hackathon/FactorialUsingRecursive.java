package com.java.Hackathon;

import java.util.Scanner;

public class FactorialUsingRecursive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println(factorialtypetwo(num));
	}

	public static double factorialtypetwo(int num) {
		if (num == 1)
			return 1;
		else
			return num * factorialtypetwo(num - 1);
	}

}
