package orcl;

import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class youtuebe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DriverManager.registerDriver(new OracleDriver()); // This is for loading the odbc driver
			System.out.println("Driver loaded Successfully");
			DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "c##scott", "tiger"); // connecting
																											// to the
			// database
			System.out.println("Connection Successful");
		} catch (SQLException e) {
			System.out.println("Some problem in connection");

			e.printStackTrace();
		}

	}

}