package com.java.Hackathon;

import java.util.Scanner;

public class differentiateInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Input");
		try {
			boolean bool = input.nextBoolean();
			System.out.println("Its a Boolean");
		} catch (Exception a) {
			try {
				int num = input.nextInt();
				System.out.println("Its is a Integer");			
			} catch (Exception b) {
				String string = input.next();
				System.out.println("Its a String");
			}
		}
	}
}
