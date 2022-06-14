package com.t4.jdbc;

import java.sql.*;

public class conn {

	Connection con;
	Statement st;

	public conn() {
		try {

			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "c##scott", "tiger");
			st = con.createStatement();
			System.out.println("sdfas");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new conn();
	}
}
