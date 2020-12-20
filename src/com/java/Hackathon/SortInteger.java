package com.java.Hackathon;

import java.util.LinkedList;

public class SortInteger {

	public static void main(String[] args) {

		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2 };
		for (int i = 0; i < arr.length - 1; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
