package com.javahash.spring.service;

import com.javahash.spring.model.Employee;

public interface IEmployeesService {
	
	public Iterable<Employee> findAll();

}
