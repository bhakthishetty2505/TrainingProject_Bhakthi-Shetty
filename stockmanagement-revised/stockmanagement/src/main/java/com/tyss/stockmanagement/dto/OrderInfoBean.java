package com.tyss.stockmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "order_info")
public class OrderInfoBean {

	@Id
	@GeneratedValue
	@Column
	int id;
	@Column
	double totalPrice;
	@Column
	double totalPriceWithGST;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "info")
	List<ProductsInfoBean> info;

	public List<ProductsInfoBean> getInfo() {
		return info;
	}

	public void setInfo(List<ProductsInfoBean> info) {
		this.info = info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalPriceWithGST() {
		return totalPriceWithGST;
	}

	public void setTotalPriceWithGST(double totalPriceWithGST) {
		this.totalPriceWithGST = totalPriceWithGST;
	}
}
