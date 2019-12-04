package com.tyss.springrest.dao;

import java.util.List;

import com.tyss.springrest.dto.EmployeeBean;

public interface EmployeeDAO {

	public boolean addEmployee(EmployeeBean bean);
	
	public boolean modifyEmployee(EmployeeBean bean);
	
	public boolean deleteEmployee(int id);
	
	public EmployeeBean getEmployee(int id);
	
	public List<EmployeeBean> getAllEmployee();
} // end of EmployeeDAO
