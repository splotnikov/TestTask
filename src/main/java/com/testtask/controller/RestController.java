package com.testtask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testtask.dao.DepartmentDAO;
import com.testtask.model.Department;

@Controller
public class RestController {

	@Autowired
	private DepartmentDAO departmentDao;

	@RequestMapping(value = "/")
	public String getMainPage() {
		return "index";
	}

	@RequestMapping(value = "/department")
	public @ResponseBody Department getDepartment() {
		return departmentDao.getDepartment(1);
	}

}
