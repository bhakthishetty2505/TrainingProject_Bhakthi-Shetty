package com.tyss.ehub.service;

import java.util.List;

import com.tyss.ehub.dto.ClientContactInfo;

public interface ClientContService {

	public boolean addClientCont(ClientContactInfo cInfo);

	public boolean updateClientCont(ClientContactInfo cInfo);

	public boolean deleteClientCont(int cInfoId);

	public List<ClientContactInfo> getClientCont();

}
