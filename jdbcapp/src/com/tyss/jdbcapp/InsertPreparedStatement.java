package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class InsertPreparedStatement {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			String sql = "insert into employee_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			//String empid = args[0];
			//int id = Integer.parseInt(empid);
			pstmt.setInt(1, Integer.parseInt(args[0]));

			//String name = args[1];
			pstmt.setString(2, args[1]);

			//String esalary = args[2];
			//int salary = Integer.parseInt(esalary);
			pstmt.setInt(3, Integer.parseInt(args[2]));

			//String gender = args[3];
			pstmt.setString(4, args[3]);

			int count = pstmt.executeUpdate();
			System.out.println(count + " Row(s) inserted");
		}catch(SQLException e) {
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
