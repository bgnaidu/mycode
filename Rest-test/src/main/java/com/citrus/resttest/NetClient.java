package com.citrus.resttest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class NetClient implements  Runnable{
	BufferedReader br ;

	public void run() {
		
		
        
		  try {
			  SimpleThreadPool.rl.lock();
			  SimpleThreadPool.rl.lock();
				SimpleThreadPool.k++;
				SimpleThreadPool.rl.unlock();
				SimpleThreadPool.rl.unlock();
			URL url = new URL("http://localhost:9000/runurtest?xmlName="+SimpleThreadPool.xmlPatterns.get(SimpleThreadPool.k)+"&"+"report_name="+SimpleThreadPool.reportName[SimpleThreadPool.k]);
			
			System.out.println(url);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			//conn.setRequestProperty("Accept", "ap");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			 br=new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));
			 SimpleThreadPool.al.add(br);
			String output;
			

			conn.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();
		  }

		   catch (IOException e) {

			e.printStackTrace();

		  }

		
		}
	
}

	



