package com.tyss.jpawithhibernate.JPQL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpawithhibernate.DTO.ProductInfo;

public class RetriveDemo {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		String jpql = "from ProductInfo";
		Query query = manager.createQuery(jpql);
		List<ProductInfo> result = query.getResultList();
		for (ProductInfo results : result) {
			//System.out.println("Result is " +results.getPid());
			System.out.println("Result is " +results.getPname());
			//System.out.println("Result is " +results.getQuantity());
		}
		manager.close();




	}
}
