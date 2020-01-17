package com.tyss.ehub.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.tyss.ehub.dto.Billable;
import com.tyss.ehub.dto.ClientsInfo;
import com.tyss.ehub.dto.ClientsInfoStatusCode;

@Repository
public class ClientdaoImpl implements Clientdao {

	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public boolean insert(ClientsInfo clientinfo) {
		/*
		 * try { Byte[] bytes=new Byte[mfile.getBytes().length]; int i=0; for (Byte
		 * byte1 : mfile.getBytes()) { bytes[i++]=byte1; }
		 * clientinfo.setClientLogo(bytes); System.out.println(bytes); } catch
		 * (IOException e1) { e1.printStackTrace(); }
		 */
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(clientinfo);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(int clientId) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ClientsInfo clients = manager.find(ClientsInfo.class, clientId);
		if (clients == null) {
			return false;
		}
		transaction.begin();
		manager.remove(clients);
		transaction.commit();
		return true;
	}

	@Override
	public boolean update(ClientsInfo clientinfo) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ClientsInfo clients1 = manager.find(ClientsInfo.class, clientinfo.getClientId());
		if (clients1 == null) {
			return false;
		}
		transaction.begin();
		clients1.setClientId(clientinfo.getClientId());
		clients1.setClienShortName(clientinfo.getClienShortName());
		clients1.setAddressLine2(clientinfo.getAddressLine2());
		clients1.setClientEmail(clientinfo.getClientEmail());
		clients1.setClientName(clientinfo.getClientName());
		clients1.setClientNo(clientinfo.getClientNo());
		clients1.setClientLogo(clientinfo.getClientLogo());
		clients1.setState(clientinfo.getState());
		clients1.setCity(clientinfo.getCity());
		clients1.setDeptName(clientinfo.getDeptName());
		clients1.setCompWebSite(clientinfo.getCompWebSite());
		clients1.setCountry(clientinfo.getCountry());
		clients1.setStreetAddress(clientinfo.getStreetAddress());
		clients1.setZipCode(clientinfo.getZipCode());
		transaction.commit();
		return true;
	}

	@Override
	public List<ClientsInfo> getAllClients() {
		EntityManager manager = emf.createEntityManager();

		String get = "from ClientsInfo";
		Query query = (Query) manager.createQuery(get);
		List<ClientsInfo> list = query.getResultList();
		
		if (list == null) {
			return null;
		}
		return list;
	}

	@Override
	public ClientsInfo getAllComp() {
		EntityManager manager = emf.createEntityManager();
		String get = "from ClientsInfo";
		javax.persistence.Query query = (Query) manager.createQuery(get);
		ClientsInfo client = (ClientsInfo) query.getSingleResult();
		return client;
	}

	@Override
	public Map<Integer, Integer> getCountBillable() {
		Query queryObject = null;
		List<Object> commonlist = null;
		Iterator<Object> invItr = null;
		Object[] commonArray = null;
		Map<Integer, Integer> map = null;
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		String queryString="select compId, count(employeeId) from Billable group by compId";
		queryObject = (Query) manager.createQuery(queryString);
		commonlist = queryObject.list();
		invItr = commonlist.iterator();
		map = new HashMap<Integer, Integer>();
		while (invItr.hasNext()) {
			commonArray = (Object[]) invItr.next();
			if (commonArray[0] != null && commonArray[1] != null)
				map.put(Integer.parseInt(commonArray[0].toString()),
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
	
	public ClientsInfoStatusCode getClientDeatils(int id) {
		Query queryObject = null;
		List<Object> commonlist = null;
		Iterator<Object> invItr = null;
		Object[] commonArray = null;
		ClientsInfoStatusCode responce = null;
		List<Billable> billList =null;
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
	   String queryString="select employeeId,compId,contractEndDate,deployementDate,empName,rateCardPerMonth,stack,yoe from Billable where compId=:compId";
		queryObject = (Query) manager.createQuery(queryString);
		queryObject.setParameter("compId", id);
		commonlist = queryObject.list();
		invItr = commonlist.iterator();
		billList = new LinkedList<Billable>();
		 responce = new ClientsInfoStatusCode();
		while (invItr.hasNext()) {
			commonArray = (Object[]) invItr.next();
			Billable bill = new Billable();
			
			if (commonArray[0] != null)
				bill.setEmployeeId(Integer.parseInt(commonArray[0].toString()));
			if (commonArray[1] != null)
				bill.setCompId(Integer.parseInt(commonArray[1].toString()));
			if (commonArray[2] != null)
				bill.setContractEndDate((Date)(commonArray[2]));
			if (commonArray[3] != null)
				bill.setDeployementDate((Date)(commonArray[3]));
			if (commonArray[4] != null)
				bill.setEmpName(commonArray[4].toString());
			if (commonArray[5] != null)
				bill.setRateCardPerMonth(Double.parseDouble(commonArray[5].toString()));
			if (commonArray[6] != null)
				bill.setStack(commonArray[6].toString());
			if (commonArray[7] != null)
				bill.setYoe(Integer.parseInt(commonArray[7].toString()));
			billList.add(bill);
			
			
		}
		responce.setListBill(billList);
		transaction.commit();
		
		return responce;
		
	}

	@Override
	public Map<String, Integer> getStackCount(int clientId) {
		Query queryObject = null;
		List<Object> commonlist = null;
		Iterator<Object> invItr = null;
		Object[] commonArray = null;
		Map<String, Integer> map = null;
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		String queryString="select stack, count(employeeId) from Billable where compId=: compId group by stack";
		queryObject = (Query) manager.createQuery(queryString);
		queryObject.setParameter("compId", clientId);
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
