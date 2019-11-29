package com.tyss.empwebapp.util;

import com.tyss.empwebapp.dao.EmployeeDAO;
import com.tyss.empwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDAOManager {

	private EmployeeDAOManager() {}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}
}
