package com.tyss.ehub.dao;

import java.util.List;

import com.tyss.ehub.dto.ClientContactInfo;

public interface ClientContDao {

	public boolean addClientCont(ClientContactInfo cInfo);

	public boolean updateClientCont(ClientContactInfo cInfo);

	public boolean deleteClientCont(int cInfoId);

	public List<ClientContactInfo> getClientCont();

}
