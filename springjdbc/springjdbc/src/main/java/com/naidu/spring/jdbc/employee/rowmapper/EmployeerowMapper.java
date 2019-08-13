package com.naidu.spring.jdbc.employee.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.naidu.spring.jdbc.employee.dto.Employee;

public class EmployeerowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setId(rs.getInt(1));
		emp.setFirstname(rs.getString(2));
		emp.setLastname(rs.getString(3));
		return emp;
	}

}
