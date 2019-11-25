package com.tyss.appdevelopment.DAO;

import java.util.List;

import com.tyss.appdevelopment.DTO.ContactBean;

public interface ContactIDAO {

	public List<ContactBean> showAllContacts();
	ContactBean searchContact(String name);
	public int operarteContact(ContactBean bean) throws ClassNotFoundException;
	public int deleteContact(String name) throws ClassNotFoundException;
	public int insertContact(ContactBean bean) throws ClassNotFoundException;
	
	
}
