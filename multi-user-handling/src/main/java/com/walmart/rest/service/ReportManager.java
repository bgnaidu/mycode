package com.walmart.rest.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReportManager {
	String htmlContent="";
	String filepath="C:\\Oxygen-eclipse\\Workspace\\multi-user-handling\\target\\citrus-reports\\";
	String readHTMLFile(String file_Name) throws IOException 
	{
		String content = new String(Files.readAllBytes(Paths.get(filepath+file_Name)));
	
	return content;		
	}

}
