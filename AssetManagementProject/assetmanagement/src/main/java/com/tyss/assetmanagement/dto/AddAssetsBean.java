package com.tyss.assetmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "asset")
public class AddAssetsBean {

	@Id
	@GeneratedValue
	@Column(name = "AssetId")
	private Integer assetId;
	@Column(name = "AssetName")
	private String assetName;
	@Column(name = "Quantity")
	private Integer quantity;
	@Column(name = "AssetDes")
	private String assetDes;
	@Column(name = "Status")
	private String status;
	public Integer getAssetId() {
		return assetId;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getAssetDes() {
		return assetDes;
	}
	public void setAssetDes(String assetDes) {
		this.assetDes = assetDes;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Assets [assetId=" + assetId + ", assetName=" + assetName + ", quantity=" + quantity + ", assetDes="
				+ assetDes + ", status=" + status + "]";
	}
	
	
	

	
}
