package com.tyss.assetmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manageradmin")
public class ManagerAdminBean {

	@Id
	@Column(name = "UserId")
	private Integer userId;
	@Column(name = "UserName")
	private String userName;
	@Column(name = "UserPassword")
	private String userPassword;
	@Column(name = "role")
	private String role;

	// Getters and Setters
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "ManagerAdminBean [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", role=" + role + "]";
	}// end of ToString()

}// end of class
