package com.destination.JDBC_connection.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc_Connect {

	public static void main(String[] args) throws Exception {
		//Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish connetion
		String url = "jdbc:mysql://localhost:3306/student";
		String user = "root";
		String pwd = "Deekshith_31";
		Connection con = DriverManager.getConnection(url, user, pwd);
		if(con != null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("Connection failed");
		}
	}
}
