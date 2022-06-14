package orcl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Oracle_con {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##scott", "tiger");
			ResultSet rs = st.executeQuery("select * from city");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
