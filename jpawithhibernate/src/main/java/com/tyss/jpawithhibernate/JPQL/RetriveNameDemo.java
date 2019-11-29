package com.tyss.jpawithhibernate.JPQL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RetriveNameDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select pname from ProductInfo";
		Query query = manager.createQuery(jpql);
		List<String> result = query.getResultList();
		for (String results : result) {
			//System.out.println("Result is " +results.getPid());
			System.out.println("Result is " +results);
			//System.out.println("Result is " +results.getQuantity());
		}
		manager.close();
	}
}
