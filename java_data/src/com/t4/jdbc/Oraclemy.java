package com.t4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Oraclemy {
	private static final String CITY = "SELECT * FROM CITY";

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "c##scott", "tiger");

			if (con != null) {
				st = con.createStatement();
			}

			if (st != null) {
				rs = st.executeQuery(CITY);
			}

			if (rs != null) {
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "  " + rs.getString(2));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ee) {
			ee.printStackTrace();
		} catch (Exception g) {
			g.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

			try {
				if (st != null)
					st.close();
			} catch (SQLException ste) {
				ste.printStackTrace();
			}

			try {
				if (con != null)
					con.close();
			} catch (SQLException c) {
				c.printStackTrace();
			}

		}
	}
}
