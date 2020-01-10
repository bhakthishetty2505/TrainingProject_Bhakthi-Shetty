package com.tyss.ehub.service;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ehub.dao.Billabledao;
import com.tyss.ehub.dto.Billable;

@Service
public class BillableServiceImpl implements BillableService {

	@Autowired
	private Billabledao dao;

	@Override
	public boolean insert(Billable bill) {
		return dao.insert(bill);
	}

	@Override
	public List<Billable> getAllBillable() {
		return dao.getAllBillable();
	}

	@Override
	public boolean delete(int bId) {
		return dao.delete(bId);
	}

	@Override
	public boolean update(Billable bill) {
		return dao.update(bill);
	}

	@Override
	public HashSet<String> getBillable() {
		return dao.getBillable();
	}

	@Override
	public Map<String, Integer> getStackCount() {
		
		return dao.getCountStack();
	}

}
