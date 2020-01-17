package com.tyss.ehub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ehub.dao.ClientContDao;
import com.tyss.ehub.dto.ClientContactInfo;

@Service
public class CLientContServiceImpli implements ClientContService {

	@Autowired
	private ClientContDao condao;

	@Override
	public boolean addClientCont(ClientContactInfo cInfo) {
		return condao.addClientCont(cInfo);
	}

	@Override
	public boolean updateClientCont(ClientContactInfo cInfo) {
		return condao.updateClientCont(cInfo);
	}

	@Override
	public boolean deleteClientCont(int cInfoId) {
		return condao.deleteClientCont(cInfoId);
	}

	@Override
	public List<ClientContactInfo> getClientCont() {
		return condao.getClientCont();
	}

}
