package com.tyss.retailermaintenancesystem.DAO;

import com.tyss.retailermaintenancesystem.DTO.ProductBean;
import com.tyss.retailermaintenancesystem.DTO.RetailerBean;

public interface RetailerDAO {

	public RetailerBean login(int id, String password);
	
	public int createProfile(RetailerBean bean);

	public boolean updatePassword(int id, String password);

	public ProductBean searchProduct(int id);
}
