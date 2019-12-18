package com.tyss.assetmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class UserBean {

	@Id
	@Column(name = "Empno")
	private Integer empId;
	@Column(name = "Ename")
	private String empName;
	@Column(name = "Job")
	private String job;
	@Column(name="Dept_ID")
	private Integer deptId;
	@Column(name = "mgr")
	private Integer mgrNo;
	@Column
	private String hiredate;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getMgrNo() {
		return mgrNo;
	}

	public void setMgrNo(Integer mgrNo) {
		this.mgrNo = mgrNo;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", job=" + job
				+ ", deptId=" + deptId + ", mgrNo=" + mgrNo + ", hiredate=" + hiredate + "]";
	}

}
