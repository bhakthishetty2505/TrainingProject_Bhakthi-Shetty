package com.tyss.assetmanagement.dto;

import java.util.List;

public class AssetResponse {

	private int statusCode;
	private String message;
	private String description;
	private String role;
	private List<AddAssetsBean> getAllDetails;
	private List<AssetAllocationUserBean> getManager;
	public List<AssetAllocationUserBean> getGetManager() {
		return getManager;
	}
	public void setGetManager(List<AssetAllocationUserBean> getManager) {
		this.getManager = getManager;
	}
	public List<AddAssetsBean> getGetAllDetails() {
		return getAllDetails;
	}
	public void setGetAllDetails(List<AddAssetsBean> getAllDetails) {
		this.getAllDetails = getAllDetails;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
