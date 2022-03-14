package com.t4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Type4 {
	private static final String EMP_SELECT_QUERY = "SELECT * FROM STUDENT";
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// register jdnvc driver
			Class.forName("com.mysql.cj.jdbc.Driver"); // don't need this line but it is recomment to use
			/// establish connnection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Mysql111");
			// driver load in jvm and static blok execute ;  search for meta info -->service --> driver --> load require driver 
			if (con != null)
				st = con.createStatement();
			// send and execute sql equary/

			if (st != null)
				rs = st.executeQuery(EMP_SELECT_QUERY);

			if (rs != null) {
				while (rs.next()) {
					System.out.println();
					System.out.print(rs.getString(1) +" "+rs.getInt(2)+" "+rs.getString(3));
				}

			}

		} catch (SQLException se) {
			se.printStackTrace();
		}
		catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
	}
}
/*

a)orcale oci or type 2 driver
java -> driverManager->vendor ---> oracle
=>driver 
drive class name : oracle.jdbc.driver.OracleDriver
				 or
				 oracle.jdbc.OracleDriver
		
		jdbc:oracle:oci@:@<>
		// express edition get :: xe
		//	enterprise edition :: orcl
		
		jar file :: ojdbc8.java-->19c

b)Oracle thin jdbc driver or type 4
*/

