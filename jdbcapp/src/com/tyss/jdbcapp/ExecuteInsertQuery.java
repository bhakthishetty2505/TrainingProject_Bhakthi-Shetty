package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			//Step 1 : Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2 : Get Connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			// Step 3 : Issue SQL Query
			String sql = "insert into employee_info values(7, 'Roy', 40000, 'M')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//Step 4 : Read the Result
			System.out.println(count + " Row(s) inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				
				// Step 5 : Close all JDBC objects in order to avoid the NullPointerException
				if(conn != null) {
					conn.close();
				}if(stmt != null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
