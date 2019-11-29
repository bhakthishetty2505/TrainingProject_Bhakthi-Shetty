package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id = ?";

		try {

			// Step 1 : Load the Driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			//			
			// Step 2 : Get the Connection
			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			//String empid = args[0];
			//int id = Integer.parseInt(empid);
			pstmt.setInt(1, Integer.parseInt(args[0]));

			rs = pstmt.executeQuery();

			if(rs.next()) { //public abstract booleans next() throws SQLException
				int eid = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("salary");
				String gender = rs.getString("gender");

				System.out.println("ID is " +eid);
				System.out.println("Name is " +name);
				System.out.println("Salary is " +sal);
				System.out.println("Gender is " +gender);

			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}if(pstmt != null) {
					pstmt.close();
				}if(rs != null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
