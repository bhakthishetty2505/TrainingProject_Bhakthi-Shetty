package com.tyss.stockmanagement.dao;

import java.util.List;

import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsInfoBean;

public interface StockDAO {

	public boolean addProduct(ProductsInfoBean bean);

	public boolean updateProduct(ProductsInfoBean bean);

	public List<ProductsInfoBean> searchByName(String name);

	public List<ProductsInfoBean> searchByCompany(String company);

	public List<ProductsInfoBean> searchByCategory(String category);

	public List<ProductsInfoBean> getAllProducts();

	public boolean generateBill(List<ProductsInfoBean> info, double totalPrice, double totalPriceWithGST);

	public OrderInfoBean addToCart(OrderInfoBean info);

}
