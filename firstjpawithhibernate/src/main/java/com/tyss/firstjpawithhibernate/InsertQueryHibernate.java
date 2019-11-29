package com.tyss.firstjpawithhibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertQueryHibernate {

public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "insert into employee_info values(7, 'Roy', 40000, 'M')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count + " Row(s) inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				
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
