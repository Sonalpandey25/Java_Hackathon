package com.java.Hackathon;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter Choices between +,-,*,/");
		String op = sc.next();
		Operation(op, num1, num2);
	}

	public static void Operation(String op, int num1, int num2) {
		int result=0;
		if (op.equals("+")) {
			result = num1 + num2;
		} else if (op.equals("-")) {
			result = num1 - num2;
		} else if (op.equals("*")) {
			result = num1 * num2;
		} else if (op.equals("/")) {
			result = num1 / num2;
		}
		System.out.println(result);
	}

}
