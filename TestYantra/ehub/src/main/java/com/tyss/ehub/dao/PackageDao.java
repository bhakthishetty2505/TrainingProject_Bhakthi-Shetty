package com.tyss.ehub.dao;

import java.util.List;

import com.tyss.ehub.dto.PackageBillable;

public interface PackageDao {

	public boolean addPackage(PackageBillable pakg);

	public boolean updatePackage(PackageBillable pakg);

	public List<PackageBillable> getAllPackage();

	public boolean removePackage(int eId);

}