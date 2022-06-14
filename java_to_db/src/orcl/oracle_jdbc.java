package orcl;
import java.sql.*;
//import 
public class oracle_jdbc {
	private static final String CITY_SELECT_QUERY = "SELECT * FROM CITY";

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			//register jdbc driver
			Class.forName("jdbc:oracle:thin:@localhost:1521:orcl");
			//creating connection4
			con = DriverManager.getConnection("oracle","","");
			
		} catch (Exception e) {
		
		}
	}
}
