package com.naidu.spring.jdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.naidu.spring.jdbc.employee.dao.Employeedao;
import com.naidu.spring.jdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/naidu/spring/jdbc/employee/test/config.xml");
		Employeedao dao = (Employeedao) context.getBean("employeedao");
		/*Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstname("Naidu");
		emp.setLastname("Bevara");*/
		//int result=dao.create(emp);
		//int result=dao.update(emp);
		// int result=dao.delete(1);
	//	 Employee employ = dao.read(2);
		 List<Employee> employ = dao.read();
		System.out.println("Employee record is"+employ);

	}

}
