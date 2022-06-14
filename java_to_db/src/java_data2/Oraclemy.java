package java_data2;

//import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.OracleDriver;

public class Oraclemy {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection(null, null, null))
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
