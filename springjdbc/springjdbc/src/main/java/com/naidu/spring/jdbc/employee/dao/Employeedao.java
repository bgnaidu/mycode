package com.naidu.spring.jdbc.employee.dao;

import java.util.List;

import com.naidu.spring.jdbc.employee.dto.Employee;

public interface Employeedao {
	int create(Employee employee);

	int update(Employee employee);

	int delete(int id);

	Employee read(int id);
	List<Employee> read();
}
