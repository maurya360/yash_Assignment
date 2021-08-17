package com.yash.assignment_day5;

public class Employees {

	private String Emp_name;
	private String Emp_Designation;
	private int Emp_id;
	
	
	static int number;
	
	void getDetail(String Emp_name, String Emp_Designation, int Emp_id) {
		this. Emp_name=Emp_name;
		this.Emp_Designation=Emp_Designation;
		this.Emp_id=Emp_id;	
		number++;
		
	}
	
	void display() {
		System.out.println("Author Book name: "+Emp_name+
							"\nAuthor Book price: "+Emp_Designation+
							"\nAuthor Book type: "+Emp_id);
	}
	
	void Number_of_Emp_Work() {
		System.out.println("number of books written by the author: "+number);
	}
	
}
