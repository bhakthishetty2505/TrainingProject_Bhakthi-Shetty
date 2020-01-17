package com.tyss.ehub.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.tyss.ehub.dto.Billable;
import com.tyss.ehub.dto.ClientsInfo;
import com.tyss.ehub.dto.ClientsInfoStatusCode;

public interface ClientService {

	public boolean insert(ClientsInfo clientinfo);

	public boolean delete(int bid);

	public boolean update(ClientsInfo clientinfo);

	public List<ClientsInfo> getAllClients();

	public ClientsInfo getComp();
	
	public Map<Integer, Integer> getCountBillable();
	
	public ClientsInfoStatusCode getClientDeatils(int id);

	public Map<String, Integer> getStackCount(int clientId);
}
