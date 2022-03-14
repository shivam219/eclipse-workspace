package java_data2;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

public class Oracle_con {
	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new OracleDriver()); // This is for loading the odbc driver
			System.out.println("Driver loaded Successfully");
			DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "c##scott", "tiger"); // connecting
																											// to the
			// database
			System.out.println("Connection Successful");
		} catch (SQLException e) {
			System.out.println("Some problem in connection");

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
