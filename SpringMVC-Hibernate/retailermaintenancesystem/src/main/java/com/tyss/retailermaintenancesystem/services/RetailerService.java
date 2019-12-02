package com.tyss.retailermaintenancesystem.services;

import com.tyss.retailermaintenancesystem.DTO.ProductBean;
import com.tyss.retailermaintenancesystem.DTO.RetailerBean;

public interface RetailerService {

public RetailerBean login(int id, String password);
	
	public int createProfile(RetailerBean bean);

	public boolean updatePassword(int id, String password);

	public ProductBean searchProduct(int id);
}
