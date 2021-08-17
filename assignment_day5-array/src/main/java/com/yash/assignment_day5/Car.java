package com.yash.assignment_day5;

/**
 * Creating car  to display the properties of class
 * @author Abhishek
 *
 */

public class Car {
	
	private int car_speed;
	private String car_owner;
	private String car_type;
	
	static int sold_car;
	
//	void getDetail(int speed,String owner,String type)
//	{
//		car_speed=speed;
//		car_owner=owner;
//		car_type=type;
//	}
	
	//getter
//	public int getSpeed() {
//		return car_speed;
//	}
//	public String getOwner() {
//		return car_owner;
//	}
//	public String gettype() {
//		return car_type;
//	}
	
	
	
	//setter	
	void setDetail(int speed,String owner, String type)
	{
		car_speed=speed;
		car_owner=owner;
		car_type=type;
		sold_car++;
	}
	
	 void NumberOfSoldcar() {
		System.out.println("Number of car sold:"+sold_car);
		//return sold_car;
		
	}
	
	
	void display()
	{
		System.out.println(car_speed+" "+car_owner+" "+car_type);
		
	}
	

}
