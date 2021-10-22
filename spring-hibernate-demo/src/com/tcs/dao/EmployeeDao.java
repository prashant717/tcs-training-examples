package com.tcs.dao;

import java.util.List;

import com.tcs.beans.Employee;

public interface EmployeeDao {
	public int save(Employee employee);
	public Employee updateEmployee(int id, double salary);
	public Employee fetchEmployee(int id);
	public List<Employee> fetchEmployees();
	void updateEmployee(Employee employee, int id);
	Employee updateEmployee(int id, String name);
}