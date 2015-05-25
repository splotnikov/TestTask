package com.testtask.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.testtask.model.Department;

@Component
public class DepartmentDAO extends AbstractDAO{

	@Transactional
	public Department getDepartment(int id) {
		Department result = (Department) getSession().get(Department.class, id);
		
		return result;
	}

	@Transactional
	public List<Department> getDepartments() {
		@SuppressWarnings("unchecked")
		List<Department> result = (List<Department>) getSession().createCriteria(Department.class).list();
		
		return result;
	}
}