package com.citrus.resttest;


import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleThreadPool {
static	ReentrantLock rl=new  ReentrantLock();
static	ArrayList<BufferedReader> al=new ArrayList<BufferedReader>();
 static String[] reportName= {"report1.html","report2.html","report3.html","report4.html","report5.html.\"report6.html\",\"report7.html\",\"report8.html\",\"report9.html\",\"report10.html"};
 static ArrayList<String> xmlPatterns=new ArrayList<String>();
static int k=-1;  //"report6.html","report7.html","report8.html","report9.html","report10.html
    public static void main(String[] args) {
    	for(int j=0;j<15;j++)
    	{
    		if(j%2==0)
    		{
    			xmlPatterns.add("Test.xml");
    			//System.out.println("added Test");
    		}
    		else {
    			xmlPatterns.add("Rest.xml");
    			//System.out.println("added Rest");
    		}
    		
    	}
    	
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i <10; i++) {
        	
        	
            Runnable worker = new NetClient();
            executor.execute(worker);
            
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
        System.out.println(al.size());
    }
}