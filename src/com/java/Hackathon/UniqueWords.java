package com.java.Hackathon;

import java.util.HashMap;

public class UniqueWords {

	public static void main(String[] args) {
		String str ="Java Code is very Difficult Code is very";
		String[] strArr = str.split(" ");
		int flag =0;
		HashMap<String,String> hmap = new HashMap<>();
		for(int i=0; i<strArr.length; i++)
		{
			if(!hmap.containsKey(strArr[i])) {
				hmap.put(strArr[i],"Unique");
	         }			
		}
		if(flag==0)
		{
		System.out.println(hmap);
		}

	}

}
