package com.tyss.springboot.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.tyss.springboot.dto.EmployeeBean;

public interface EmployeeRepo extends JpaRepository<EmployeeBean, Integer>{

	@Transactional
	@Modifying
	@Query("update EmployeeBean set name=:name, password=:password, doj=:doj, gender=:gender where id=:id")
	public void update(String name, String password, Date doj, String gender, int id);

}
