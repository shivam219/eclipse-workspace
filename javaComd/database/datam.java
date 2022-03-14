
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.*;

public class datam {
	private static final String EMP_SELECT_QUERY = "SELECT * FROM STUDENT";

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// register jdnvc driver
			Class.forName("com.mysql.jdbc.Driver"); // don't need this line but it is recomment to use
			/// establish connnection
			System.out.println(rs);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "1111");
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
			System.out.println(rs);

		} catch (SQLException se) {
			se.printStackTrace();
		}
		catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
	}
}