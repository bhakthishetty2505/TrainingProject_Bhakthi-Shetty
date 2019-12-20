package com.tyss.stockmanagement.service;

import java.util.List;

import com.tyss.stockmanagement.dto.OrderHistoryInfoBean;
import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsInfoBean;

public interface StockService {

	public boolean addProduct(ProductsInfoBean bean);

	public boolean updateProduct(ProductsInfoBean bean);

	public ProductsInfoBean searchByName(String name);

	public List<ProductsInfoBean> searchByCompany(String company);

	public List<ProductsInfoBean> searchByCategory(String category);
	
	public List<ProductsInfoBean> getAllProducts();
	
	public OrderInfoBean showBill(int id);
	
	public List<OrderHistoryInfoBean> showHistory();
}
