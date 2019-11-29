package com.tyss.firstjpawithhibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicUpdateHibernate {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			String sql = "update employee_info set name = ?, salary = ?, gender = ? where id = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(4, Integer.parseInt(args[0]));

			pstmt.setString(1, args[1]);

			pstmt.setInt(2, Integer.parseInt(args[2]));

			pstmt.setString(3, args[3]);

			int count = pstmt.executeUpdate();
			System.out.println(count + " Row(s) inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {

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
