package com.tyss.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {

	public static void main(String[] args) {

		try(FileReader in  = new FileReader("csv.txt");BufferedReader reader = new BufferedReader(in)){

			//System.out.println(reader.readLine());  Reads one line at a time and prints the output because of the syso

			while(reader.ready()) { // Executes until it's false
				String line = reader.readLine();
				String[] words = line.split(",");
				System.out.println("ID is " +words[0]);
				System.out.println("Name is " +words[1]);
				System.out.println("Salary is " +words[2]);
				System.out.println("Gender is " +words[3]);
				System.out.println("*****************");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
