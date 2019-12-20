package com.tyss.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.stockmanagement.dao.StockDAO;
import com.tyss.stockmanagement.dto.OrderHistoryInfoBean;
import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsInfoBean;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockDAO dao;

	@Override
	public boolean addProduct(ProductsInfoBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean updateProduct(ProductsInfoBean bean) {
		return dao.updateProduct(bean);
	}

	@Override
	public ProductsInfoBean searchByName(String name) {
		return dao.searchByName(name);
	}

	@Override
	public List<ProductsInfoBean> searchByCompany(String company) {
		return dao.searchByCompany(company);
	}

	@Override
	public List<ProductsInfoBean> searchByCategory(String category) {
		return dao.searchByCategory(category);
	}

	@Override
	public List<ProductsInfoBean> getAllProducts() {
		return dao.getAllProducts();
	}

	@Override
	public OrderInfoBean showBill(int id) {
		return dao.showBill(id);
	}

	@Override
	public List<OrderHistoryInfoBean> showHistory() {
		return dao.showHistory();
	}

}
