package com.tyss.assetmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class DepartmentBean {

	@Id
	@Column
	private Integer deptId;
	@Column
	private String deptName;

	// Getters and Setters
	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "DepartmentBean [deptId=" + deptId + ", deptName=" + deptName + "]";
	}// End of ToString()

}// End of Class
