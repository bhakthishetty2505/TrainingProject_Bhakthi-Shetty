package com.tyss.ehub.service;

import java.util.List;

import com.tyss.ehub.dto.PackageBillable;

public interface PackageBillableService {

	public boolean addPackage(PackageBillable pakg);

	public boolean updatePackage(PackageBillable pakg);

	public List<PackageBillable> getAllPackage();

	public boolean removePackage(int pakgId);
}
