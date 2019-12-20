package com.tyss.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.stockmanagement.dto.OrderHistoryInfoBean;
import com.tyss.stockmanagement.dto.OrderInfoBean;
import com.tyss.stockmanagement.dto.ProductsInfoBean;

@Repository
public class StockDAOImpl implements StockDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductsInfoBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try{
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updateProduct(ProductsInfoBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductsInfoBean info = manager.find(ProductsInfoBean.class, bean.getId());
			info.setName(bean.getName());
			info.setCategory(bean.getCategory());
			info.setCompany(bean.getCompany());
			info.setPrice(bean.getPrice());
			info.setQuantity(bean.getQuantity());
			manager.persist(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ProductsInfoBean searchByName(String name) {
		EntityManager manager = factory.createEntityManager();;
		try {
			String jpql = "from ProductsInfoBean where name=:name";
			TypedQuery<ProductsInfoBean> query = manager.createQuery(jpql,ProductsInfoBean.class);
			query.setParameter("name", name);
			ProductsInfoBean product = query.getSingleResult();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductsInfoBean> searchByCompany(String company) {
		EntityManager manager = factory.createEntityManager();;
		try {
			String jpql = "from ProductsInfoBean where company=:company";
			TypedQuery<ProductsInfoBean> query = manager.createQuery(jpql, ProductsInfoBean.class);
			query.setParameter("company", company);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductsInfoBean> searchByCategory(String category) {
		EntityManager manager = factory.createEntityManager();;
		try {
			String jpql = "from ProductsInfoBean where category=:category";
			TypedQuery<ProductsInfoBean> query = manager.createQuery(jpql, ProductsInfoBean.class);
			query.setParameter("category", category);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductsInfoBean> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from ProductsInfoBean";
		TypedQuery<ProductsInfoBean> query = manager.createQuery(jpql, ProductsInfoBean.class);
		return query.getResultList();
	}

	@Override
	public List<OrderHistoryInfoBean> showHistory() {
			EntityManager manager = factory.createEntityManager();
			String jpql = "from OrderHistoryInfoBean";
			TypedQuery<OrderHistoryInfoBean> query = manager.createQuery(jpql, OrderHistoryInfoBean.class);
			List<OrderHistoryInfoBean> list = query.getResultList();
			return list;
	}

	@Override
	public boolean generateBill(OrderInfoBean order, int productId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(order);
			transaction.commit();
			OrderInfoBean or = manager.find(OrderInfoBean.class, order.getId());
			int id  = or.getId();
			addHistory(id, productId);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public void addHistory(int orderId, int productId) {
		OrderHistoryInfoBean history = new OrderHistoryInfoBean();
		history.setOrderId(orderId);
		history.setProductId(productId);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(history);
			transaction.commit();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	@Override
	public OrderInfoBean showBill(int id) {
		EntityManager manager = factory.createEntityManager();
		try
		{
			OrderInfoBean order = manager.find(OrderInfoBean.class, id);
			return order;
		}
		catch(Exception e)
		{
			return null;
		}
	}
}
