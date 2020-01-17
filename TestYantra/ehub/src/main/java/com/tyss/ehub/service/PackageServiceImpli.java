package com.tyss.ehub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ehub.dao.PackageDao;
import com.tyss.ehub.dto.PackageBillable;
@Service
public class PackageServiceImpli implements PackageBillableService{

	@Autowired
	private PackageDao dao;

	@Override
	public boolean addPackage(PackageBillable pakg) {
		return dao.addPackage(pakg);
	}

	@Override
	public boolean updatePackage(PackageBillable pakg) {
		return dao.updatePackage(pakg);
	}

	@Override
	public List<PackageBillable> getAllPackage() {
		return dao.getAllPackage();
	}

	@Override
	public boolean removePackage(int pakgId) {
		return dao.removePackage(pakgId);
	}

}
