package com.tyss.ehub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tyss.ehub.dto.PackageBillable;

@Repository
public class PackageDaoImpl implements PackageDao {

	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public boolean addPackage(PackageBillable pakg) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(pakg);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean removePackage(int pakgId) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		PackageBillable pakg = manager.find(PackageBillable.class, pakgId);
		if (pakg == null) {
			return false;
		}
		transaction.begin();
		manager.remove(pakg);
		transaction.commit();
		return true;
	}

	@Override
	public List<PackageBillable> getAllPackage() {
		EntityManager manager = emf.createEntityManager();
		String get = "from PackageBillable";
		Query query = (Query) manager.createQuery(get);
		List<PackageBillable> list = query.getResultList();
		if (list == null) {
			return null;
		}
		return list;
	}



	@Override
	public boolean updatePackage(PackageBillable pakg) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		PackageBillable pakBillable = manager.find(PackageBillable.class, pakg.getEId());
		if(pakBillable!=null) {
			transaction.begin();
			pakBillable.setEId(pakg.getEId());
			pakBillable.setDopByClient(pakg.getDopByClient());
			pakBillable.setDopByTy(pakg.getDopByTy());
			pakBillable.setPaymentByClient(pakg.getPaymentByClient());
			pakBillable.setPaymentByTy(pakg.getPaymentByTy());
			transaction.commit();
			return true;
		}
		return false;
	}
}
