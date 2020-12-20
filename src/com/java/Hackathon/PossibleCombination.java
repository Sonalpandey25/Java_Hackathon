package com.java.Hackathon;

import java.util.Scanner;

public class PossibleCombination {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		num = input.nextInt();
		for (int i = 1; i < num; i++) {
			StringBuffer sb = new StringBuffer();
			int sum = i;
			sb.append(i).append(" ");
			for (int j = i + 1; sum < num; j++) {
				sb.append(j).append(" ");
				sum = sum + j;
				if (sum == num) {
				System.out.println(sb.toString());
				}
			}
		}

	}

}
