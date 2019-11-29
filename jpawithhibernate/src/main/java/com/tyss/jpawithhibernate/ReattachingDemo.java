package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.DTO.ProductInfo;

public class ReattachingDemo {

	public static void main(String[] args) {
		
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		try {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			ProductInfo info = manager.find(ProductInfo.class, 101);
			System.out.println(manager.contains(info));
			manager.detach(info);
			System.out.println(manager.contains(info));
			ProductInfo info2 = manager.merge(info);
			info2.setPname("Vintage");
			System.out.println("Record Updated");
			transaction.commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
