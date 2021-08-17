package com.category;

public class Category {
	private int id;
	private String name;
	private String createdDate;

	
	Category (int id,String name, String createdDate)
	{
		this.id=id;
		this.name=name;
		this.createdDate=createdDate;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCreatedDate() {
		return createdDate;
	}
	
	public static void main(String[] args)
	{
		Category s= new Category(101,"javabasics","31-01-017");
		int id= s.getId();
		String name=s.getName();
		String createdDate=s. getCreatedDate();
		System.out.println("id:" +  id + " name:"+ name + " createdate:" +createdDate);

		
	}
	
}
