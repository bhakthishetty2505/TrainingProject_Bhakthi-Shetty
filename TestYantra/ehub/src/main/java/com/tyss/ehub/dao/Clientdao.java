package com.tyss.ehub.dao;

import java.util.List;
import java.util.Map;

import com.tyss.ehub.dto.ClientsInfo;
import com.tyss.ehub.dto.ClientsInfoStatusCode;

public interface Clientdao {

	public boolean insert(ClientsInfo clientinfo);

	public boolean delete(int clientId);

	public boolean update(ClientsInfo clientinfo);

	public List<ClientsInfo> getAllClients();

	public ClientsInfo getAllComp();
	
	public Map<Integer, Integer> getCountBillable();
	
	public ClientsInfoStatusCode getClientDeatils(int id);

	public Map<String, Integer> getStackCount(int clientId);

}
