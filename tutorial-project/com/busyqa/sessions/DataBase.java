package com.busyqa.sessions;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// USER TABLE
		// username|password|email|phone|income|address

		// select * from user;

		// select username from user;

		// select username from user where income =(select max(income) from user);

		// select * from user order by asc
		//Connection string
		String query = "select username from user where email = 'girish@gmail.com'";
		String dbUrl = "localhost/8080"; // host/portnumber
		String dbUser = "user1";
		String dbPassword = "password";
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			String dbUserName = rs.getString(1);
			if(dbUserName.equalsIgnoreCase("Girish")) {
				//report.pass(db validation success)
			}else {
				//report.pass(db validation fail)			
			}
		}
		
	}

}
