package com.yash.ems.main;

import java.util.*;

import com.yash.ems.model.Employee;
import com.yash.ems.serviceimpl.EmployeeServicelmpl;
import com.yash.ems.serviceimpl.InvalidEmployeeId;
import com.yash.ems.serviceimpl.InvalidSalary;

public class EmsApp {

	public static void main(String[] args)
	{


		EmployeeServicelmpl ser=new EmployeeServicelmpl();
		Scanner s =new Scanner(System.in);
		int ch;
		do {
			System.out.println("___________________________________");
			System.out.println("1.Display All Employee Detail..");
			System.out.println("2.Display Employee Detail by ID.");
			System.out.println("3.Display Employee Detail by Name");
			System.out.println("4.Display Employee Detail by Salary");
			System.out.println("5.Display Employee Detail by Department");

			System.out.println("___________________________________");
			System.out.println("Enter your Choice:");

			ch=s.nextInt();
			switch(ch) {
			case 1:
				ser.getAllEmployee();
				break;

			case 2:
				try {
					ser.getEmployeeId();
				} catch (InvalidEmployeeId e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 3:
				ser.getEmployeeName();
				break;

			case 4:
				ser.getEmployeeSalary();
				break;
			case 5:
				ser.getEmployeeDept();
				break;
			}
		}while(ch!=0);

	}


}

