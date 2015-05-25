package com.testtask.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.testtask.dao.DepartmentDAO;

public class Service {
	@Autowired
	private DepartmentDAO dao;
		
	public String getDep(int i){
		return dao.getDepartment(i).getName();
	}
}