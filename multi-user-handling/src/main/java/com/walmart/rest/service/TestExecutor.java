package com.walmart.rest.service;

import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

public class TestExecutor {
	public void exec(String xmlName, String report_name) throws IOException, InterruptedException {
		String[] command = new String[3];
		command[0] = "cmd";
		command[1] = "/c";
		command[2] = "mvn surefire:test -Dtest=SampleXmlIT -Dfilename.pattern=**/*" + xmlName + " " + "-Dhtmlreport.name="
				+ report_name;
		System.out.println(command[2]);

		Process p = Runtime.getRuntime().exec(command);
		// p.waitFor();
		String theString= IOUtils.toString(p.getInputStream(), "UTF-8");
		String theStringerror= IOUtils.toString(p.getErrorStream(), "UTF-8");
		Scanner s = new Scanner(p.getInputStream()).useDelimiter("\\A");
		Scanner s1 = new Scanner(p.getErrorStream()).useDelimiter("\\A");

		String result = s.hasNext() ? s.next() : "";
		String error = s.hasNext() ? s.next() : "";
		if (error != null)
			System.out.println(theStringerror);
		System.out.println(theString);
	}

	public static void main(String args[]) throws Exception, InterruptedException {
		for (int i = 0; i < 5; i++) {
			// TestExecutor.exec("Rest.xml", "reportx.html"+Integer.toString(i));
		}
	}

}
