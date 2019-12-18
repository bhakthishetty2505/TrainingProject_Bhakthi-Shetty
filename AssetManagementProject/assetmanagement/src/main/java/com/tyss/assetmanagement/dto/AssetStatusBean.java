package com.tyss.assetmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset_status")
public class AssetStatusBean {

	@Id
	@Column(name = "Allocation_ID")
	private Integer AllocationId;
	@Column(name = "Status")
	private String status;

	public Integer getAllocationId() {
		return AllocationId;
	}

	public void setAllocationId(Integer allocationId) {
		AllocationId = allocationId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AssetStatus [AllocationId=" + AllocationId + ", status=" + status + "]";
	}

}// End of Class
