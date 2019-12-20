package com.tyss.stockmanagement.dao;

import java.util.List;

import com.tyss.stockmanagement.dto.OrderHistoryInfoBean;
import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsInfoBean;

public interface StockDAO {

	public boolean addProduct(ProductsInfoBean bean);

	public boolean updateProduct(ProductsInfoBean bean);

	public ProductsInfoBean searchByName(String name);

	public List<ProductsInfoBean> searchByCompany(String company);

	public List<ProductsInfoBean> searchByCategory(String category);
	
	public List<ProductsInfoBean> getAllProducts();
	
	public List<OrderHistoryInfoBean> showHistory();
	
	public boolean generateBill(OrderInfoBean order,int productId);
	
	public void addHistory(int  orderId, int productId);
	
	public OrderInfoBean showBill(int id);
}
