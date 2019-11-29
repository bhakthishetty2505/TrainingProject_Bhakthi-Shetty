package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.DTO.ProductInfo;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProductInfo productDetail = entityManager.find(ProductInfo.class, 101);
		System.out.println("Product ID is " +productDetail.getPid());
		System.out.println("Product Name is " +productDetail.getPname());
		System.out.println("Available quantity of the product is " +productDetail.getQuantity());
		entityManager.close();
	}
}
