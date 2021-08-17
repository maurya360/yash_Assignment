package com.yash.assignment_day5;

public class Author {
	private String Book_name;
	private double Book_price;
	private String Book_type;
	
	static int number_author;
	
	void getDetail(String Book_name, double Book_price, String Book_type) {
		this.Book_name=Book_name;
		this.Book_price=Book_price;
		this.Book_type=Book_type;	
		number_author++;
		
	}
	
	void display() {
		System.out.println("Author Book name: "+Book_name+
							"\nAuthor Book price: "+Book_price+
							"\nAuthor Book type: "+Book_type);
	}
	
	void Number_of_Books_Written_By_The_Author() {
		System.out.println("number of books written by the author: "+number_author);
	}
	

}
