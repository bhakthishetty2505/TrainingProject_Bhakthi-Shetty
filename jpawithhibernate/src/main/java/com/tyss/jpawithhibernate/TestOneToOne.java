package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.onetoone.Person;
import com.tyss.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {
	
	public static void main(String[] args) {
		VoterCard vc = new VoterCard();
		vc.setVid(20);
		vc.setVname("Pluto");
		
		Person person = new Person();
		person.setPid(2);
		person.setPname("Sasha");
		person.setVoterCard(vc);
		
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			VoterCard vCard = manager.find(VoterCard.class, 10);
			System.out.println(vCard.getPerson().getPid());
			//manager.persist(person); unidirectional
			System.out.println("Record Inserted");
			transaction.commit();
			
			

		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
	}
}
