package com.tyss.exception.second;

import java.io.IOException;
import java.sql.SQLException;

public class TestB {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		FileTest ft = new FileTest();
		try {
			
			try {
				
				try {
					
					ft.open();
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		System.out.println("Main Ended");
	}
}
// Don't throw exception from the main method
// Throws keyword is only used for checked exception