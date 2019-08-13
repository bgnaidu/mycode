package com.naidu.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/naidu/spring/jdbc/config.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbctemplate");
		String sql="insert into employee values(?,?,?)";
		int result = template.update(sql, new Integer(1), "Jahnavi", "Bevara");
		System.out.println(" number of inserted records are :"+result);
	}

}
