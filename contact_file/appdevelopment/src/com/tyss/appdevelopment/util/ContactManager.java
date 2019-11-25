package com.tyss.appdevelopment.util;

import com.tyss.appdevelopment.DAO.ContactDAOImpl;
import com.tyss.appdevelopment.DAO.ContactIDAO;

public class ContactManager {

	private ContactManager() {
		// TODO Auto-generated constructor stub
	}

	public static ContactIDAO getEmployeeDAO() {
		return new ContactDAOImpl();
	}
}


