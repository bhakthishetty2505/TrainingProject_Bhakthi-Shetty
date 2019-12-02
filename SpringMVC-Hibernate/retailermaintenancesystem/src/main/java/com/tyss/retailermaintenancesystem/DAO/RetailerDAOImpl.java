package com.tyss.retailermaintenancesystem.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.retailermaintenancesystem.DTO.ProductBean;
import com.tyss.retailermaintenancesystem.DTO.RetailerBean;

@Repository
public class RetailerDAOImpl implements RetailerDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public RetailerBean login(int id, String password) {
		
		String jpql = "from RetailerBean where id =:id and password =:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<RetailerBean> query = manager.createQuery(jpql, RetailerBean.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			RetailerBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int createProfile(RetailerBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
			
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public boolean updatePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		RetailerBean bean = manager.find(RetailerBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return false;
	}

	@Override
	public ProductBean searchProduct(int id) {

		EntityManager manager = factory.createEntityManager();
		return manager.find(ProductBean.class, id);
	}
}
