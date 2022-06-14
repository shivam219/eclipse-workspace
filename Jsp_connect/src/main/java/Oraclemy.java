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
		Statement st2 = null;
		ResultSet rs = null;
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 2 either 1
//			Class.forName("com.mysql.jdbc.Driver");// ; dont we this line
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Shivam@219@");
			if (con != null) {
				st = con.createStatement();
				
			}

			if (st != null) {
				rs = st.executeQuery("SELECT * FROM CITY");
				
			}
			int count = 1;
			if (rs != null) {
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "  " + rs.getString(2));
					if(count==10) {
						break;
					}
					count++;
				}
			}
		} 
		catch (Exception g) {
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
