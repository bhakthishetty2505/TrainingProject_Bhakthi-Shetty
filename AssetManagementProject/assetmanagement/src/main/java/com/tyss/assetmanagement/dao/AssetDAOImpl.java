package com.tyss.assetmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.security.auth.login.LoginException;

import org.springframework.stereotype.Repository;

import com.tyss.assetmanagement.dto.AssetStatusBean;
import com.tyss.assetmanagement.dto.AddAssetsBean;
import com.tyss.assetmanagement.dto.UserBean;
import com.tyss.assetmanagement.dto.ManagerAdminBean;

@Repository
public class AssetDAOImpl implements AssetDAO {

	@PersistenceUnit
	EntityManagerFactory factory = null;


	@Override
	public ManagerAdminBean login(Integer userId, String password) {
		EntityManager entityManager = factory.createEntityManager();
		ManagerAdminBean bean = null;
		try {

			String jpql = "from ManagerAdminBean where userId=:uId and userPassword=:pwd";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("uId", userId);
			query.setParameter("pwd", password);
			bean = (ManagerAdminBean) query.getSingleResult();
			if (bean == null) {
				throw new LoginException();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return bean;
	}
	
	public boolean register(ManagerAdminBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public AddAssetsBean addAsset(AddAssetsBean asset) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(asset);
			transaction.commit();
			return asset;
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return null;
	}

	@Override
	public boolean removeAsset(Integer assetId) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
			factory = Persistence.createEntityManagerFactory("asset");
			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			AddAssetsBean bean = entityManager.find(AddAssetsBean.class, assetId);
			if(bean != null) {
				entityManager.remove(bean);
				transaction.commit();
				return true;
			}else {
				return false;
			}
	}

	@Override
	public boolean updateAsset(AddAssetsBean assets) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("asset");
			entityManager = factory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			AddAssetsBean asset = entityManager.find(AddAssetsBean.class, assets.getAssetId());
			asset.setAssetId(assets.getAssetId());
			asset.setAssetName(assets.getAssetName());
			asset.setAssetDes(assets.getAssetDes());
			asset.setQuantity(assets.getQuantity());
			asset.setStatus(assets.getStatus());
			entityManager.persist(asset);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<AddAssetsBean> getAllAsset() {
		EntityManager entityManager = null;
		try {
			factory = Persistence.createEntityManagerFactory("asset");
			entityManager = factory.createEntityManager();
			String jpql = "from AddAssetsBean";
			TypedQuery<AddAssetsBean> query = entityManager.createQuery(jpql, AddAssetsBean.class);
			List<AddAssetsBean> list = query.getResultList();
			if (!list.isEmpty()) {
				return list;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public UserBean addEmployee(UserBean employee) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("asset");
			entityManager = factory.createEntityManager();
			UserBean bean = new UserBean();
			if (bean != null) {
				String jpql = "select deptId from DepartmentBean";
				Query query = entityManager.createQuery(jpql);
				List<Integer> li = query.getResultList();
				for (Integer emp : li) {
					if (employee.getDeptId() == emp) {
						transaction = entityManager.getTransaction();
						transaction.begin();
						entityManager.persist(employee);
						transaction.commit();
						return employee;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean acceptDeclineAllocation(AddAssetsBean add) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			AddAssetsBean bean = manager.find(AddAssetsBean.class, add.getAssetId());
			bean.setStatus("Requested");
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			manager.close();
		}
	}

	@Override
	public AssetStatusBean setStatus(Integer allocId, String status) {
		EntityManager entityManager = null;
		AssetStatusBean status2 = new AssetStatusBean();
		EntityTransaction entityTransaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("asset");
			entityManager = factory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "UPDATE AssetStatusBean SET status=:sts WHERE allocation_ID=:allocid";

			Query query = entityManager.createQuery(jpql);
			query.setParameter("sts", status);
			query.setParameter("allocid", allocId);
			Integer i = query.executeUpdate();
			System.out.println(i);
			if (i > 0) {
				entityTransaction.commit();
				status2.setAllocationId(allocId);
				status2.setStatus(status);
				return status2;
			} else {

				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<AddAssetsBean> requestedAsset(){
		EntityManager manager = factory.createEntityManager();
		String jpql = "from AddAssetsBean where status = 'requested'";
		TypedQuery<AddAssetsBean> query = manager.createQuery(jpql, AddAssetsBean.class);
		List<AddAssetsBean> assets = query.getResultList();
		return assets;
}
	
	public boolean approveAsset(AddAssetsBean assets) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			AddAssetsBean bean = manager.find(AddAssetsBean.class, assets.getAssetId());
			bean.setStatus("approved");
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			manager.close();
		}
	}
	
	public boolean rejectAsset(AddAssetsBean assets) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			AddAssetsBean bean = manager.find(AddAssetsBean.class, assets.getAssetId());
			bean.setStatus("rejected");
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			manager.close();
		}
		
	}
}
