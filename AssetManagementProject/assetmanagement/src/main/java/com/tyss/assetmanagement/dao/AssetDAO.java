package com.tyss.assetmanagement.dao;

import java.util.List;

import com.tyss.assetmanagement.dto.AssetStatusBean;
import com.tyss.assetmanagement.dto.AddAssetsBean;
import com.tyss.assetmanagement.dto.UserBean;
import com.tyss.assetmanagement.dto.ManagerAdminBean;

public interface AssetDAO {

	ManagerAdminBean login(Integer userId, String password);
	
	public boolean register(ManagerAdminBean bean);

	AddAssetsBean addAsset(AddAssetsBean asset);

	public boolean removeAsset(Integer allocId);

	public boolean updateAsset(AddAssetsBean assets);

	List<AddAssetsBean> getAllAsset();

	UserBean addEmployee(UserBean employee);

	public boolean acceptDeclineAllocation(AddAssetsBean add);

	AssetStatusBean setStatus(Integer allocationId, String status);
	
	public boolean rejectAsset(AddAssetsBean assets);
	
	public boolean approveAsset(AddAssetsBean assets);
	
	public List<AddAssetsBean> requestedAsset();

}
