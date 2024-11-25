package com.service;

import com.dao.StudentDAO;

public class StudentService {

	StudentDAO sd = new StudentDAO();
	
	public void createTable() throws Exception
	{
		sd.createTable();
	}
	
	public void insertData() throws Exception
	{
		sd.insertData();
	}
	
	public void updateData() throws Exception
	{
		sd.updateData();
	}
	
	public void deleteData() throws Exception
	{
		sd.deleteData();
	}
	
	public void fetchAllData() throws Exception
	{
		sd.fetchAllData();
	}
}
