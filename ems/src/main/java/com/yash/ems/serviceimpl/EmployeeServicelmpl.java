package com.yash.ems.serviceimpl;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

public class EmployeeServicelmpl implements EmployeeService  {
	public static List<Employee> CreateListOfEmp(){
		ArrayList<Employee> e=new ArrayList<Employee>();
		

		e.add(new Employee(1,"Abhishek",22000,"Developer","IT engineer","Mumbai"));
		e.add(new Employee(2,"Akshay",32000,"Tester","IT engineer","UP"));
		e.add(new Employee(3,"Shailesh",44000,"Module","IT engineer","MP"));
		e.add(new Employee(4,"Anuj",555000,"Developer","IT engineer","Pune"));
		e.add(new Employee(5,"usha",22000,"Developer","IT engineer","Nagpur"));
		return e;
	}



	@Override
	public void getAllEmployee() {
		List<Employee> list=CreateListOfEmp();
		Iterator<Employee> i=list.iterator();
		while(i.hasNext()) {
			Employee e1=i.next();
			System.out.println(e1);

		}	
	}

	public void getEmployeeId()throws InvalidEmployeeId {
		List<Employee> list=CreateListOfEmp();
		boolean found =false;
		System.out.println("Enter employee id:");
		Scanner s1 =new Scanner(System.in);
		int empid=s1.nextInt();
		Iterator<Employee> i=list.iterator();
		while(i.hasNext()) {
			Employee e1=i.next();
			if(e1.getId()==empid) {
				System.out.println(e1);
				found = true;
			}
		}
		if(!found) {
			throw new InvalidEmployeeId("Not valid");
			//System.out.println("record not found");

		}

	}



	@Override
	public void getEmployeeName() {
		List<Employee> list=CreateListOfEmp();
		//boolean found =false;
		System.out.println("Enter Employee Name..");
		Scanner s1 =new Scanner(System.in);
        String name=s1.next();
        System.out.println(list.stream()
        		.filter(e->e.getName().equals(name))
        		.collect(Collectors.toList()));
        	      
	}
			

	

	@Override
	public void getEmployeeSalary() {
		List<Employee> list=CreateListOfEmp();
		boolean found =false;
		System.out.println("Enter Employee Salary:");
		Scanner s1 =new Scanner(System.in);
		double emps=s1.nextInt();
		Iterator<Employee> i=list.iterator();
		while(i.hasNext()) {
			Employee e1=i.next();
			if(e1. getSalary()==emps) {
				System.out.println(e1);
				found = true;
			}
		}
		if(!found) {
			
			System.out.println("record not found");

		}
		
	}



	@Override
	public void getEmployeeDept() {
		List<Employee> list=CreateListOfEmp();
		System.out.println("Enter Employee Department:");
		Scanner s2 =new Scanner(System.in);
        String dname=s2.next();
        System.out.println(list.stream()
        		.filter(e->e.getDepartment().equals(dname))
        		.map(e->e.toString())
        		.collect(Collectors.toList()));
			
	}





}
