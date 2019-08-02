package com.naidu.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.naidu.springmvc.dto.Employee;
@Controller
public class ListController {
	
	
	@RequestMapping("/sendList")
	public ModelAndView sendObject() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		Employee employee = new Employee();
		employee.setId(3431);
		employee.setName("Gowrunaidu Bevara");
		employee.setSalary(33500.00);
		
		Employee employee2 = new Employee();
		employee2.setId(3432);
		employee2.setName("pawan Kalyan");
		employee2.setSalary(30000.00);
		
		Employee employee3 = new Employee();
		employee3.setId(3433);
		employee3.setName("Chiranjeevi");
		employee3.setSalary(100000.00);

		
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

}
