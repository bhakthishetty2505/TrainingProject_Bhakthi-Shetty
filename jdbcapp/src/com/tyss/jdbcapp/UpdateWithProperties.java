package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateWithProperties {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;

		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//DriverManager.registerDriver(driver);

			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);

			String sql = prop.getProperty("update-query");
			pstmt = conn.prepareStatement(sql);

			//String empid = args[0];
			//int id = Integer.parseInt(empid);
			pstmt.setInt(4, Integer.parseInt(args[0]));

			//String name = args[1];
			pstmt.setString(1, args[1]);

			//String esalary = args[2];
			//int salary = Integer.parseInt(esalary);
			pstmt.setInt(2, Integer.parseInt(args[2]));

			//String gender = args[3];
			pstmt.setString(3, args[3]);

			int count = pstmt.executeUpdate();
			System.out.println(count + " Row(s) updated");
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
