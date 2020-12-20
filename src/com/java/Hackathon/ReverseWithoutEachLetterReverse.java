package com.java.Hackathon;

import java.util.Scanner;

public class ReverseWithoutEachLetterReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Line :");
		String[] words = sc.nextLine().split(" ");
		String reverseString = "";		
			for (int i = words.length - 1; i >= 0; i--)
			{
				String word = words[i];
				reverseString = reverseString + word + " ";
			}
			System.out.println(reverseString);
		}
}
