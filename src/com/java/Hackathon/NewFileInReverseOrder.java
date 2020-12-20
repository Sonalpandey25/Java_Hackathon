package com.java.Hackathon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class NewFileInReverseOrder {

	public static void main(String[] args) throws Exception {
		
		String sPath = System.getProperty("user.dir") + "/StringFile.txt";
		ArrayList<String> list = new ArrayList<>();
		ReadFile(sPath, list);
		String sFilePathToWrite ="C:\\Users\\LENOVO\\eclipse-workspace\\Java_Hackathon\\RevrseFile.txt";
		 Writefile(sFilePathToWrite,list);
	}

	public static void ReadFile(String sPath, ArrayList<String> list) throws Exception {
		String sLine;
		BufferedReader br = new BufferedReader(new FileReader(sPath));
		while ((sLine = br.readLine()) != null) {
			list.add(sLine);
		}
	}

	public static void Writefile(String sPath, ArrayList<String> list) throws Exception {
		try {
			FileWriter fr = new FileWriter(sPath);
			for(int i=list.size()-1; i>=0;i--)
			{
				fr.write(list.get(i)+"\n");
			}
			fr.close();
		} catch (Exception a) {
			System.out.println("Exception :" + a);
		}
	}
}
