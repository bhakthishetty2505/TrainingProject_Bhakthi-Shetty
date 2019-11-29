package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "delete from employee_info where id=? ";

		try {

			// Step 1 : Load the driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);

			//Class.forName("com.mysql.jdbc.Driver");  JDBC 3
			// JDBC 4, only give URL.

			// Step 2 : Get connection
			conn = DriverManager.getConnection(url);

			// Step 3 : Issue the SQL Query
			pstmt = conn.prepareStatement(sql);

			//String empid = args[0];
			//int id = Integer.parseInt(empid);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
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
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}                                       
		}
	}
}
