package com.tyss.stockmanagement.response;

import java.util.List;

import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsInfoBean;

public class ProductsInfoResponse {

	int statusCode;
	String description;
	String message;
	private List<ProductsInfoBean> bean;
	private OrderInfoBean order;
	private List<ProductsInfoBean> getAllProducts;

	public List<ProductsInfoBean> getGetAllProducts() {
		return getAllProducts;
	}

	public void setGetAllProducts(List<ProductsInfoBean> getAllProducts) {
		this.getAllProducts = getAllProducts;
	}

	// public List<OrderHistoryInfoBean> getOrderHistory() {
//		return orderHistory;
//	}
//	public void setOrderHistory(List<OrderHistoryInfoBean> orderHistory) {
//		this.orderHistory = orderHistory;
//	}
	public OrderInfoBean getOrder() {
		return order;
	}

	public void setOrder(OrderInfoBean order) {
		this.order = order;
	}

	public List<ProductsInfoBean> getBean() {
		return bean;
	}

	public void setBean(List<ProductsInfoBean> bean) {
		this.bean = bean;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
