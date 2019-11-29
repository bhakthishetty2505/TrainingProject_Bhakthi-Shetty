package com.tyss.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\VINCENT\\Desktop\\text.txt.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			/* Returns only one character
			 * int i1 = reader.read(); char ch1 = (char) i1; System.out.println(ch1);
			 */
			
			int i;
			while((i = reader.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
