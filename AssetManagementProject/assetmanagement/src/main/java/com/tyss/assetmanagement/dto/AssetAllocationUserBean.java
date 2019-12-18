package com.tyss.assetmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset_allocation")
public class AssetAllocationUserBean {

	@Id
	@Column(name = "Allocation_ID")
	private Integer allocationId;
	@Column(name = "AssetId")
	private Integer assetId;
	@Column(name= "Empno")
	private Integer empNo;
	@Column(name = "Allocation_Date")
	private String allocationDate;
	@Column(name = "Release_Date")
	private String releaseDate;
	@Column(name = "Quantity")
	private Integer quantity;

	// Getters and Setters
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(Integer allocationId) {
		this.allocationId = allocationId;
	}

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getAllocationDate() {
		return allocationDate;
	}

	public void setAllocationDate(String allocationDate) {
		this.allocationDate = allocationDate;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "AssetAllocation [allocationId=" + allocationId + ", assetId=" + assetId + ", empNo=" + empNo
				+ ", allocationDate=" + allocationDate + ", releaseDate=" + releaseDate
				+ ", quantity=" + quantity + "]";
	}// End of ToString


}// End of CLass
