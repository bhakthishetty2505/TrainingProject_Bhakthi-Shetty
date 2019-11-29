package com.tyss.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCSelect {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // Used only when executing select query. Otherwise no need of ResultSet

		try {
			// Step 1 : Loading the driver
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			// Step 2 : Get the Connection
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db"; //"//localhost:3306/ust_ty_db?user=root&password=root"
			conn = DriverManager.getConnection(url, "root", "root");
			
			// Step 3 : Issue SQL Query
			
			String sql = "select * from employee_info";
			stmt = conn.createStatement(); //public abstract Statement creatStatement() throws SQLException
			rs = stmt.executeQuery(sql); //public abstract ResultSet executeQuery(String) throws SQLException
			
			// Step 4 : Read the Result
			
			while(rs.next()) { //public abstract booleans next() throws SQLException
				int id = rs.getInt("id"); // X = rs.getX();
				String name = rs.getString("name");
				int sal = rs.getInt("salary");
				String gender = rs.getString("gender");
				System.out.println("ID is " +id);
				System.out.println("Name is " +name);
				System.out.println("Salary is " +sal);
				System.out.println("Gender is " +gender);
				System.out.println("******************");
			}

		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			// Step 5 : Close all JDBC objects in order to avoid the NullPointerException
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
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}