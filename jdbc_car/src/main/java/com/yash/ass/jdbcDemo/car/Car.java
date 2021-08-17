package com.yash.ass.jdbcDemo.car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Car {

	public final Logger LOGGER = Logger.getAnonymousLogger();
	
	
	private static Connection connection = null;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//LOGGER.info("Database connected succ...");

	}
	
	public static Connection getconnection() {
		return connection;
		
	}
}
