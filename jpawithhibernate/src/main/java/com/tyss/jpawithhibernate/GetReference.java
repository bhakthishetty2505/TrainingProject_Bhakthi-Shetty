package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.DTO.ProductInfo;

public class GetReference {

	public static void main(String[] args) {
	
		EntityManager manager = null;
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		manager = factory.createEntityManager();
		//ProductInfo info = manager.getReference(ProductInfo.class, 101);
		ProductInfo productInfo = manager.find(ProductInfo.class, 101);
		System.out.println(productInfo.getClass());
		
//		System.out.println("Id is " +info.getPid());
//		System.out.println("Name is " +info.getPname());
//		System.out.println("Quantity is " +info.getQuantity());
		
		manager.close();
		
	}
}
