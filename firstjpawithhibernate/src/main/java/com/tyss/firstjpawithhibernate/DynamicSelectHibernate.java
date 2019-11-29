package com.tyss.firstjpawithhibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicSelectHibernate {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id = ?";

		try {

			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(args[0]));

			rs = pstmt.executeQuery();

			if(rs.next()) { 
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
