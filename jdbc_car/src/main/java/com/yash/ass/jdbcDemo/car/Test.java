package com.yash.ass.jdbcDemo.car;

import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Test {
	static Logger logger = Logger.getLogger(Test.class.getName());

	public static void main(String[] args) {
		
		InsertValue();
		UpdateValue();

	}

	private static void UpdateValue() {
		try(Connection connection = (Connection) Car.getconnection();Statement st=(Statement) connection.createStatement();)
		{
			String sql="update car set ";
			String sql1="insert into engine values('2045-07-24','wash',108)";
			int car1 =st.executeUpdate(sql);
			int engin1 =st.executeUpdate(sql1);
			if((car1 & engin1)==1)
			{
				logger.info("Update recored");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void InsertValue() {
		try(Connection connection = (Connection) Car.getconnection();Statement st=(Statement) connection.createStatement();)
		{
			String sql="insert into car values(110,'Abhishek','brownWhite','ku6')";
			String sql1="insert into engine values('2045-07-24','wash',108)";
			int car1 =st.executeUpdate(sql);
			int engin1 =st.executeUpdate(sql1);
			if((car1 & engin1)==1)
			{
				logger.info("Insert recored");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
