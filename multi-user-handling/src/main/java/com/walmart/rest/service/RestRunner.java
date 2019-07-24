package com.walmart.rest.service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import java.io.*;
@RestController
public class RestRunner {
	static  String namePattern="";
	
	@RequestMapping(value="runurtest", method=RequestMethod.GET)
	@ResponseBody
	public String rest(@RequestParam String xmlName,@RequestParam String report_name) throws Exception
	
	{
	
		new TestExecutor().exec(xmlName,report_name);
		
	  
		return new ReportManager().readHTMLFile(report_name);
	}

  
 
	}