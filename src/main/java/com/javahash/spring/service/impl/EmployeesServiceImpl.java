package com.javahash.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.javahash.spring.dao.EmployeeRepository;
import com.javahash.spring.model.Employee;
import com.javahash.spring.service.IEmployeesService;

public class EmployeesServiceImpl implements IEmployeesService{
	
	
	@Autowired
	private EmployeeRepository repository;
	
	
	public Iterable<Employee> findAll(){
		return repository.findAll();
	}
}
