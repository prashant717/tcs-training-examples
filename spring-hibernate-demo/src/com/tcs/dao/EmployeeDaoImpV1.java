package com.tcs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.tcs.beans.Employee;

@Repository
public class EmployeeDaoImpV1 implements EmployeeDao {

	@Autowired
	private HibernateTemplate template;
	
	@Override
	public int save(Employee employee) {
		int key = (Integer)template.save(employee);
		return key;
	}

	// Assignment
	@Override
	public void updateEmployee(Employee employee, int id) {
		
	}

	@Override
	public Employee fetchEmployee(int id) {
		return template.get(Employee.class, id);
	}

	@Override
	public List<Employee> fetchEmployees() {
		return template.loadAll(Employee.class);
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}