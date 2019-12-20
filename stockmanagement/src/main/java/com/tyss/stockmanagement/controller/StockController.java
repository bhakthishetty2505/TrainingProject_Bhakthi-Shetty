package com.tyss.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.stockmanagement.dto.OrderHistoryInfoBean;
import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsInfoBean;
import com.tyss.stockmanagement.response.ProductsInfoResponse;
import com.tyss.stockmanagement.service.StockService;

@RestController
@RequestMapping("/stockmanagement")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockController {

	@Autowired
	private StockService service;
	
	@PostMapping(path = "/addProduct", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductsInfoResponse addProduct (@RequestBody ProductsInfoBean bean) {
		ProductsInfoResponse response = new ProductsInfoResponse();
		if(service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data added to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data is not added to the DB");
		}
		return response;
	}
	
	@PutMapping(path = "/updateProduct", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductsInfoResponse updateProduct(@RequestBody ProductsInfoBean bean)	{
		ProductsInfoResponse response = new ProductsInfoResponse();
		if(service.updateProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Product has been updated successfully");
			response.setDescription("Successful");
		} else {
			response.setStatusCode(401);
			response.setMessage("Product has not been updated successfully");
			response.setDescription("Unsuccessful");
		}
		return response;
	}
	
	
	@GetMapping(path = "/searchByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductsInfoResponse searchByName(@PathVariable("name")String name) {
		ProductsInfoResponse response = new ProductsInfoResponse();
		ProductsInfoBean bean = service.searchByName(name);
		if(bean != null) {
			response.setStatusCode(201);
			response.setMessage("The product name you searched for was foundd");
			response.setDescription("Successful");
			response.setBean(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("The product name you searched for wasn't found");
			response.setDescription("Unsuccessful");
		}
		return response;
	}
	
	@GetMapping(path = "/searchByCategory/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductsInfoResponse searchByCategory(@PathVariable("category")String category) {
		ProductsInfoResponse response = new ProductsInfoResponse();
		List<ProductsInfoBean> bean = service.searchByCategory(category);
		if(!bean.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("The product category you searched for was foundd");
			response.setDescription("Successful");
			response.setList(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("The product category you searched for wasn't found");
			response.setDescription("Unsuccessful");
		}
		return response;
	}
	
	@GetMapping(path = "/searchByCompany/{company}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductsInfoResponse searchByCompany(@PathVariable("company")String company) {
		ProductsInfoResponse response = new ProductsInfoResponse();
		List<ProductsInfoBean> bean = service.searchByCompany(company);
		if(!bean.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("The product category you searched for was foundd");
			response.setDescription("Successful");
			response.setList(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("The product category you searched for wasn't found");
			response.setDescription("Unsuccessful");
		}
		return response;
	}
	
	@GetMapping(path = "/getAllProducts", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductsInfoResponse getAllProducts() {
		ProductsInfoResponse response = new ProductsInfoResponse();
		List<ProductsInfoBean> list = service.getAllProducts();
		if(!list.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Here are the list of Products");
			response.setDescription("Successful");
			response.setList(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Couldn't find the list of Products");
			response.setDescription("Unsuccessful");
		}
		return null;
	}
	
	@GetMapping(path ="/showbill/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductsInfoResponse showBill(@PathVariable int id)
	{

		ProductsInfoResponse response =  new ProductsInfoResponse();
		OrderInfoBean order= service.showBill(id);
		if(order != null)
		{
			response.setStatusCode(201);
			response.setDescription("Bill displayed Succesfull");
			response.setMessage("Success");
			response.setOrder(order);
			return response;
		}
		else
		{
			response.setStatusCode(401);
			response.setDescription("Bill  failed");
			response.setMessage("fail");
			response.setOrder(order);
			return response;
		}
	}
	
	@GetMapping(path = "/showhistory", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductsInfoResponse orderHistory() {
		
		ProductsInfoResponse response = new ProductsInfoResponse();
		List<OrderHistoryInfoBean> list = service.showHistory();
		if(list.isEmpty())
		{
			response.setStatusCode(401);
			response.setMessage("Fail");
			response.setDescription("history displayed");
			response.setOrderHistory(list);;
			return response;
		}else
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("history Not displayed");
			response.setOrderHistory(list);
			return response;
		}
	}
}
