package com.tyss.ehub.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ehub.dao.Clientdao;
import com.tyss.ehub.dto.ClientsInfo;
import com.tyss.ehub.dto.ClientsInfoStatusCode;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private Clientdao dao;

	@Override
	public boolean insert(ClientsInfo clientinfo) {
		return dao.insert(clientinfo);
	}

	@Override
	public boolean delete(int bid) {
		return dao.delete(bid);
	}

	@Override
	public boolean update(ClientsInfo clientinfo) {
		return dao.update(clientinfo);
	}

	@Override
	public List<ClientsInfo> getAllClients() {
		return dao.getAllClients();
	}

	@Override
	public ClientsInfo getComp() {
		return dao.getAllComp();
	}

	@Override
	public Map<Integer, Integer> getCountBillable() {
		return dao.getCountBillable();
	}

	@Override
	public ClientsInfoStatusCode getClientDeatils(int id) {
		System.out.println("in service imp::"+dao.getClientDeatils(id));
		return dao.getClientDeatils(id);
	}

	@Override
	public Map<String, Integer> getStackCount(int clientId) {
		
		return dao.getStackCount(clientId);
	}

}
