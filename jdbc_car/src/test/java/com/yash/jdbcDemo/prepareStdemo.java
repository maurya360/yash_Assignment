package com.yash.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.PreparedStatement;

public class prepareStdemo {
	static final Logger LOGGER = Logger.getAnonymousLogger();

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		LOGGER.info("Database connected");
		//insert
		/*String sql="insert into student(name,phone) values(?,?)";
		PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
		pst.setString(1,"Abhishek");
		pst.setString(2, "9224185173");
		pst.addBatch();

		pst.setString(1,"Abhi");
		pst.setString(2, "9267185173");
		pst.addBatch();

		pst.setString(1,"anuj");
		pst.setString(2, "2124185173");
		pst.addBatch();

		pst.setString(1,"Abhishek");
		pst.setString(2, "9224185173");
		pst.addBatch();

		pst.executeBatch();
		//pst.execute();*/

		/*	//update
		String up="update student set name= ? where phone= ?";
		PreparedStatement up1=(PreparedStatement) con.prepareStatement(up);
		up1.setString(1, "aman");
		up1.setString(2, "rahul");

		up1.executeUpdate();*/

		//delete
		String de="delete from student where name= ?";
		PreparedStatement de1=(PreparedStatement) con.prepareStatement(de);
		de1.setString(1, "Abhishek");
		de1.executeUpdate();
		
		

	}

}
