package com.tyss.assetmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tyss.assetmanagement.dao.AssetDAO;
import com.tyss.assetmanagement.dto.AssetStatusBean;
import com.tyss.assetmanagement.dto.AddAssetsBean;
import com.tyss.assetmanagement.dto.UserBean;
import com.tyss.assetmanagement.dto.ManagerAdminBean;

@org.springframework.stereotype.Service
public class AssetServiceImpl implements AssetService {

	@Autowired
	private AssetDAO dao;

	@Override
	public ManagerAdminBean login(Integer userId, String password) {
		return dao.login(userId, password);
	}

	public boolean register(ManagerAdminBean bean) {
		return dao.register(bean);
	}
	
	@Override
	public AddAssetsBean addAsset(AddAssetsBean asset) {
		return dao.addAsset(asset);
	}

	@Override
	public boolean removeAsset(Integer allocationId) {
		return dao.removeAsset(allocationId);
	}

	@Override
	public boolean updateAssetName(AddAssetsBean assets) {
		return dao.updateAsset(assets);
	}

	@Override
	public List<AddAssetsBean> getAllAsset() {
		return dao.getAllAsset();
	}

	@Override
	public UserBean addEmployee(UserBean employee) {
		return dao.addEmployee(employee);
	}

	@Override
	public boolean acceptDeclineAllocation(AddAssetsBean add) {
		return dao.acceptDeclineAllocation(add);
	}

	@Override
	public AssetStatusBean setStatus(Integer allocationId, String status) {
		return dao.setStatus(allocationId, status);
	}

	@Override
	public boolean rejectAsset(AddAssetsBean assets) {
		return dao.rejectAsset(assets);
	}

	@Override
	public boolean approveAsset(AddAssetsBean assets) {
		return dao.approveAsset(assets);
	}

	@Override
	public List<AddAssetsBean> requestedAsset() {
		return dao.requestedAsset();
	}
}
