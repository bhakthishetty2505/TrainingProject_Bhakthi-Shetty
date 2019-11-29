package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;



public class MyFirstJDBCWithProperties {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; 
		FileReader reader = null;

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url = prop.getProperty("url"); 
			conn = DriverManager.getConnection(url , prop);
			
			String sql = prop.getProperty("select-query");
			stmt = conn.createStatement(); 
			rs = stmt.executeQuery(sql); 
			
			while(rs.next()) { 
				int id = rs.getInt("id"); 
				String name = rs.getString("name");
				int sal = rs.getInt("salary");
				String gender = rs.getString("gender");
				System.out.println("ID is " +id);
				System.out.println("Name is " +name);
				System.out.println("Salary is " +sal);
				System.out.println("Gender is " +gender);
				System.out.println("******************");
			}

		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
				if(reader != null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
