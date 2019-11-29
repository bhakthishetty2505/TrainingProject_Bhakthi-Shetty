package com.tyss.empapp.DAO;

import java.util.List;

import com.tyss.empapp.dto.EmployeeBean;

public interface EmployeeDAO {

	public List<EmployeeBean> getAllEmployeeDAOImpl();
	public EmployeeBean searchEmployeeData(int id);
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);
}
