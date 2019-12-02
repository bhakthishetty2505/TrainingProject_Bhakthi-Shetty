package com.tyss.retailermaintenancesystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.retailermaintenancesystem.DAO.RetailerDAO;
import com.tyss.retailermaintenancesystem.DTO.ProductBean;
import com.tyss.retailermaintenancesystem.DTO.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService{

	@Autowired
	private RetailerDAO dao;

	@Override
	public RetailerBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int createProfile(RetailerBean bean) {
		return dao.createProfile(bean);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		return dao.updatePassword(id, password);
	}

	@Override
	public ProductBean searchProduct(int id) {
		return dao.searchProduct(id);
	}
}
