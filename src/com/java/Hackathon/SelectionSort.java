package com.java.Hackathon;

public class SelectionSort {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int min, temp = 0;
		for (int i = 0; i < num.length; i++) {
			min = i;
			for (int j = i + 1; j < num.length; j++)// Resource
			{
				if (num[j] < num[min]) {
					min = j;
				}
			}
			temp = num[i];
			num[i] = num[min];
			num[min] = temp;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}


