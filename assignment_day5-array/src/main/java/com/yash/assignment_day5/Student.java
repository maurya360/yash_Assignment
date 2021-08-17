package com.yash.assignment_day5;

public class Student {

	private int Student_id;
	private String Student_name;
	private String Student_class;
	
	 static int number;
	
	void setDetail(int Student_id,String Student_name,String Student_class)
	{
		this.Student_id=Student_id;
		this.Student_name=Student_name;
		this.Student_class=Student_class;
		number++;
	}
	
	void display()
	{
		System.out.println("Student id: "+Student_id+
							"\nStudent name: "+Student_name+
							"\nStudent class: "+Student_class);
	}
	
	void Number_of_Student_RegisterInHostal() {
		System.out.println("number of students registered in the hostel: "+number);
	}
	
}
