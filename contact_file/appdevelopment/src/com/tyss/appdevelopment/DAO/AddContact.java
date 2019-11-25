package com.tyss.appdevelopment.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddContact {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {

			String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
			conn = DriverManager.getConnection(url);

			String sql = "insert into contact values(?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, args[0]);

			pstmt.setInt(2, Integer.parseInt(args[1]));

			pstmt.setString(3, args[2]);

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
