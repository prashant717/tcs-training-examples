package com.tcs.dao;



public class MyDao {
	DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public void connect()
	{
		System.out.println("---------Connected to database--------");
		System.out.println("User :"+ datasource.getUserName());
		System.out.println("Password :"+ datasource.getPassword());
		System.out.println("Url"+datasource.getUrl());
	}

	
	
}
