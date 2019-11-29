package com.tyss.jpawithhibernate.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeleteDemo {

	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String jpql = "delete from ProductInfo where pid = :id";
			Query query = manager.createQuery(jpql);
			query.setParameter("id",104);
			System.out.println(query.executeUpdate());
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
	}
}
