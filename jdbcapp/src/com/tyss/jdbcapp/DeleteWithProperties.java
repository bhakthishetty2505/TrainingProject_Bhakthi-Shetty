package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;


public class DeleteWithProperties {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {

			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			// Step 1 : Load the driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			
			Class.forName(prop.getProperty("driver-class-name"));

			//Class.forName("com.mysql.jdbc.Driver");  JDBC 3
			// JDBC 4, only give URL.

			String url  =  prop.getProperty("url"); 
			conn = DriverManager.getConnection(url, prop);

			// Step 3 : Issue the SQL Query
			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);

			//String empid = args[0];
			//int id = Integer.parseInt(empid);
			pstmt.setInt(1,Integer.parseInt(args[0]));
			
			//String name = args[1];
			//pstmt.setString(1, name);
			//			
			//String esalary = args[2];
			//int salary = Integer.parseInt(esalary);
			//pstmt.setInt(2, salary);
			//			
			//String gender = args[3];
			//pstmt.setString(3, gender);

			// Step 4 : Read the Result
			int count = pstmt.executeUpdate();
			System.out.println(count + " Row(s) deleted");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {

				// Step 5 : Close all JDBC objects in order to avoid the NullPointerException
				if(conn != null) {
					conn.close();
				}if(pstmt != null) {
					pstmt.close();
				}if(reader != null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}                                       
		}
	}
}
