package com.tyss.empapp.util;

import com.tyss.empapp.DAO.EmployeeDAO;
import com.tyss.empapp.DAO.EmployeeDAOImpl;

public class EmployeeManager {
	
	private EmployeeManager() {}

	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}
