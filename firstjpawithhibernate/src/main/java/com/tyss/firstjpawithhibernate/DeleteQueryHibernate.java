package com.tyss.firstjpawithhibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQueryHibernate {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "delete from employee_info where id=? ";

		try {

			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " Row(s) deleted");
		}catch(Exception e) {
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
