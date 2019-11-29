package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.onetomany.Pencil;
import com.tyss.jpawithhibernate.onetomany.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {
		
		PencilBox box = new PencilBox();
		box.setBoxid(1);
		box.setBoxname("Natraj");
		
		Pencil pencil = new Pencil();
		pencil.setColor("Black");
		pencil.setPid(11);
		pencil.setPencilBox(box);
		
		Pencil pencil1 = new Pencil();
		pencil1.setColor("Blue");
		pencil1.setPid(12);
		pencil1.setPencilBox(box);
		
		
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			System.out.println("Record Inserted");
			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	
	}
}
