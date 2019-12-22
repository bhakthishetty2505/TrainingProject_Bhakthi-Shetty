package com.tyss.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

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
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
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
	public List<ProductsInfoBean> searchByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductsInfoBean where name=:name";
			TypedQuery<ProductsInfoBean> query = manager.createQuery(jpql, ProductsInfoBean.class);
			query.setParameter("name", name);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductsInfoBean> searchByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
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
		EntityManager manager = factory.createEntityManager();
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
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("stock");
			manager = factory.createEntityManager();
			String jpql = "from ProductsInfoBean";
			TypedQuery<ProductsInfoBean> query = manager.createQuery(jpql, ProductsInfoBean.class);
			List<ProductsInfoBean> list = query.getResultList();
			if (!list.isEmpty()) {
				return list;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean generateBill(List<ProductsInfoBean> info, double totalPrice, double totalPriceWithGST) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			for (ProductsInfoBean productInfo : info) {
				ProductsInfoBean bean = manager.find(ProductsInfoBean.class, productInfo.getId());
				int quantity = bean.getQuantity();
				bean.setQuantity(quantity - 1);
				System.out.println(quantity);
			}
			OrderInfoBean orderBean = new OrderInfoBean();
			orderBean.setInfo(info);
			orderBean.setTotalPrice(totalPrice);
			orderBean.setTotalPriceWithGST(totalPriceWithGST);
			manager.persist(orderBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public OrderInfoBean addToCart(OrderInfoBean info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			manager = factory.createEntityManager();
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return info;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return null;
	}
}
