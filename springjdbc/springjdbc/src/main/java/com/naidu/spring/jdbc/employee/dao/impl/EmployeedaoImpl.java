package com.naidu.spring.jdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.naidu.spring.jdbc.employee.dao.Employeedao;
import com.naidu.spring.jdbc.employee.dto.Employee;
import com.naidu.spring.jdbc.employee.rowmapper.EmployeerowMapper;

@Component("employeedao")
public class EmployeedaoImpl implements Employeedao {
  @Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbctemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result=jdbctemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getId());
		return result;
	}
	@Override
	public int delete(int id) {
		
		String sql = "delete from employee where id=?";
		int result=jdbctemplate.update(sql, id);
		return result;
	}


	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeerowMapper rowmapper=new EmployeerowMapper();
		Employee emp=jdbctemplate.queryForObject(sql, rowmapper, id);
		return emp;
	}

	@Override
	public List<Employee> read() {
		String sql="select * from employee";
		EmployeerowMapper mapper=new EmployeerowMapper();
	List<Employee> result=	jdbctemplate.query(sql, mapper);
		return result;
	}

	
}
