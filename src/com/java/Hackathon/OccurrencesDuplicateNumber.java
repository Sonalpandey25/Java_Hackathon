package com.java.Hackathon;

import java.util.HashMap;

public class OccurrencesDuplicateNumber {

	public static void main(String[] args) {
		int arr[] = {2,3,2,4,5,3,7,6,4};
		HashMap<Integer,Integer> count = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			int num = arr[i];
			count.put(num,count.getOrDefault(num, 0)+1);			
		}
		System.out.println(count);
	}

}
