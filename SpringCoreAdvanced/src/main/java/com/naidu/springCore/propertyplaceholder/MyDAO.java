package com.naidu.springCore.propertyplaceholder;

public class MyDAO {
	private String dbserver;
	private String dbPort;
	
	MyDAO(String dbserver, String dbPort){
		this.dbserver=dbserver;
		this.dbPort=dbPort;
		
	}

	@Override
	public String toString() {
		return "MyDAO [dbserver=" + dbserver +"dbPort "+dbPort+"]";
	}
	

}
