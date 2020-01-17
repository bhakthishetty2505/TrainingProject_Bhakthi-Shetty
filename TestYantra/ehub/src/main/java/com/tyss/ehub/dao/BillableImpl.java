package com.tyss.ehub.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.tyss.ehub.dto.Billable;
import com.tyss.ehub.dto.ClientsInfo;

@Repository
public class BillableImpl implements Billabledao {

	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public boolean insert(Billable bill) {
		System.out.println("client id::"+bill.getCompId());
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bill);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Billable empBill) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Billable empBill1 = manager.find(Billable.class, empBill.getEmployeeId());
		if (empBill1 == null) {
			return false;
		}
		transaction.begin();
		empBill1.setEmployeeId(empBill.getEmployeeId());
		empBill1.setContractEndDate(empBill.getContractEndDate());
		empBill1.setDeployementDate(empBill.getDeployementDate());
		empBill1.setRateCardPerMonth(empBill.getRateCardPerMonth());
		empBill1.setStack(empBill.getStack());
		empBill1.setYoe(empBill.getYoe());
		transaction.commit();
		return true;
	}

	@Override
	public List<Billable> getAllBillable() {
		EntityManager manager = emf.createEntityManager();
		String get = "from Billable";
		Query query = (Query) manager.createQuery(get);
		List<Billable> list = query.getResultList();
		if (list == null) {
			return null;
		}
		return list;
	}

	@Override
	public boolean delete(int bId) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Billable bill1 = manager.find(Billable.class, bId);
		if (bill1 == null) {
			return false;
		}
		transaction.begin();
		manager.remove(bill1);
		transaction.commit();
		return true;
	}
	
	public HashSet<String> getBillable() {	
		
		EntityManager manager = emf.createEntityManager();

		String get = "select stack from Billable";
		Query query = (Query) manager.createQuery(get);
		List<String> list = query.getResultList();
		HashSet<String> hs = new HashSet<String>(list);
		System.out.println(hs);
		if (hs == null) {
			return null;
		}
		return hs;
		/*
		 * EntityManager manager = emf.createEntityManager(); EntityTransaction
		 * transaction = manager.getTransaction(); //String
		 * jpql="select count(*) from RequirementBean group by month (openingdate)";
		 * String
		 * jpql="select count(*), month(deployementDate) from Billable group by month (deployementDate)"
		 * ; // String jpql ="SELECT COUNT(u.opening_date) AS total, m.month" + //
		 * "     from (" + // "           SELECT 'Jan' AS MONTH" + //
		 * "           UNION SELECT 'Feb' AS MONTH" + //
		 * "           UNION SELECT 'Mar' AS MONTH" + //
		 * "           UNION SELECT 'Apr' AS MONTH" + //
		 * "           UNION SELECT 'May' AS MONTH" + //
		 * "           UNION SELECT 'Jun' AS MONTH" + //
		 * "           UNION SELECT 'Jul' AS MONTH" + //
		 * "           UNION SELECT 'Aug' AS MONTH" + //
		 * "           UNION SELECT 'Sep' AS MONTH" + //
		 * "           UNION SELECT 'Oct' AS MONTH" + //
		 * "           UNION SELECT 'Nov' AS MONTH" + //
		 * "           UNION SELECT 'Dec' AS MONTH" + // "          ) AS m" + //
		 * "LEFT JOIN add_requirements u " + //
		 * "ON MONTH(STR_TO_DATE(CONCAT(m.month, ' 2013'),'%M %Y')) = MONTH(u.opening_date)"
		 * + // "GROUP BY m.month" + // "ORDER BY 1+1"; Query query = (Query)
		 * manager.createQuery(jpql); List<Billable> list = query.getResultList();
		 * System.out.println("Guru::::"+list); if(list==null) { return null; } return
		 * list;
		 */
	
	}

	@Override
	public Map<String, Integer> getCountStack() {
		Query queryObject = null;
		List<Object> commonlist = null;
		Iterator<Object> invItr = null;
		Object[] commonArray = null;
		Map<String, Integer> map = null;
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		String queryString="select stack, count(employeeId) from Billable group by stack";
		queryObject = (Query) manager.createQuery(queryString);
		commonlist = queryObject.list();
		invItr = commonlist.iterator();
		map = new HashMap<String, Integer>();
		while (invItr.hasNext()) {
			commonArray = (Object[]) invItr.next();
			if (commonArray[0] != null && commonArray[1] != null)
				map.put(commonArray[0].toString(),
						Integer.parseInt(commonArray[1].toString()));
		}
		System.out.println("map of count::"+map);
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(map==null) {		
			return null;	
			}
		return map;
	}
	
}