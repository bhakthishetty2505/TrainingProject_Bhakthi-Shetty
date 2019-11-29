package com.tyss.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.manytomany.Course;
import com.tyss.jpawithhibernate.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {
		
		Course course = new Course();
		course.setCid(30);
		course.setCname("SQL");
		
		Course course1 = new Course();
		course1.setCid(40);
		course1.setCname("Hibernate");
		
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(course);
		al.add(course1);
		
		Student student = new Student();
		student.setSid(2);
		student.setSname("Coco");
		student.setCourse(al);
		
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(student);
			System.out.println("Record Inserted");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
