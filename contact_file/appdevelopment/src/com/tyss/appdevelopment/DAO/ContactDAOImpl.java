package com.tyss.appdevelopment.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tyss.appdevelopment.DTO.ContactBean;

public class ContactDAOImpl implements ContactIDAO{

	public List<ContactBean> showAllContacts() {

		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "select * from contact";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<ContactBean> result = new ArrayList<ContactBean>();
			while (rs.next()) {
				ContactBean bean = new ContactBean();

				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setContactGroup(rs.getString("contact_group"));

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
	}

	public ContactBean searchContact(String name) {
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "select * from contact where name = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				ContactBean bean = new ContactBean();
				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setContactGroup(rs.getString("contact_group"));
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

	}

	@Override
	public int operarteContact(ContactBean bean) throws ClassNotFoundException
	{
			Connection conn = null;
			PreparedStatement pstmt = null;
			String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
			int count = 0;

			try {

				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url);

				String sql = "update contact set number = ?, contact_group = ? where name = ?";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1,bean.getName());
				pstmt.setInt(1,bean.getNumber());
				pstmt.setString(1,bean.getContactGroup());

				 count = pstmt.executeUpdate();
				System.out.println(count + " Row(s) inserted");
			}catch(SQLException e) {
				e.printStackTrace();
				return 0;
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
			return count;
		}
	

	public int insertContact(ContactBean bean) throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "insert into contact values(?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setInt(2, bean.getNumber());
			pstmt.setString(3, bean.getContactGroup());
			
			int i = pstmt.executeUpdate();
			return i;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	
	
	public int deleteContact(String name) throws ClassNotFoundException {
		
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "delete from contact where name = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			int i = pstmt.executeUpdate();
			return i;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
}



