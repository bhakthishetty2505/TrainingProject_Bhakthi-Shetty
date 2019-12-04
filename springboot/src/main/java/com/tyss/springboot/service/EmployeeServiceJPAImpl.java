package com.tyss.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.springboot.dto.EmployeeBean;
import com.tyss.springboot.repo.EmployeeRepo;

@Service
public class EmployeeServiceJPAImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	@Override
	public boolean addEmployee(EmployeeBean bean) {
		
		repo.save(bean);
		return true;
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		repo.update(bean.getName(), bean.getPassword(), bean.getDoj(), bean.getGender(), bean.getId());
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		//EmployeeBean bean = repo.findById(id).get();
		//repo.delete(bean);
		repo.deleteById(id);
		return false;
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		
		return repo.findAll();
	}

	
}
