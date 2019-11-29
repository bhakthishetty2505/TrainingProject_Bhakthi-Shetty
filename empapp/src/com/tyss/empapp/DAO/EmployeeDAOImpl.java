package com.tyss.empapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tyss.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {

	public List<EmployeeBean> getAllEmployeeDAOImpl() {

		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
			while (rs.next()) {
				EmployeeBean bean = new EmployeeBean();

				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("salary"));
				bean.setGender(rs.getString("gender"));

				result.add(bean);
			}
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	} // End of getAllEmployeeDAOImpl

	public EmployeeBean searchEmployeeData(int id) {

		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("conn.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("salary"));
				bean.setGender(rs.getString("gender"));
				return bean;

			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

	}// end of searchEmployeeData()
	// public void

	
	public int insertEmployeeData(EmployeeBean bean) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(7, 'Roy', 40000, 'M')";

		Connection conn = null;
		PreparedStatement pstmt = null;
			
		try {
			Class.forName("conn.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			int count = pstmt.executeUpdate(sql);
			System.out.println(count);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
		return 0;
	}

	
	public int updateEmployeeData(EmployeeBean bean) {
		return 0;
	}

	
	public int deleteEmployeeData(int id) {
		return 0;
	}
}