package com.yash.ems.service;

import com.yash.ems.serviceimpl.InvalidEmployeeId;

public interface EmployeeService {
	public void getAllEmployee();
	public void getEmployeeId() throws InvalidEmployeeId;
	public void getEmployeeSalary();
	public void getEmployeeName();
	public void getEmployeeDept();
		
}
